package com.jpa.optima.ipg.controller;

import java.io.IOException;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.xml.datatype.DatatypeConfigurationException;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.log4j.Logger;
import org.bellatrix.services.ws.access.CredentialResponse;
import org.bellatrix.services.ws.members.LoadMembersResponse;
import org.bellatrix.services.ws.payments.PaymentResponse;
import org.bellatrix.services.ws.virtualaccount.LoadVAByIDResponse;
import org.bellatrix.services.ws.virtualaccount.VaRegisterResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;
import com.jpa.optima.ipg.model.CreditCardParam;
import com.jpa.optima.ipg.model.Ticket;
import com.jpa.optima.ipg.model.Transfer;

@Controller
public class IPGController {

	@Autowired
	private PaymentPageProcessor paymentPageProcessor;
	@Autowired
	private HazelcastInstance instance;
	@Autowired
	private ContextLoader contextLoader;
	private Logger logger = Logger.getLogger(this.getClass());

	@RequestMapping(value = "/paymentRequest", method = RequestMethod.POST)
	public String payment(@RequestParam(value = "merchantID", required = true) String mid,
			@RequestParam(value = "invoiceID", required = true) String invoiceID,
			@RequestParam(value = "paymentChannel", required = false) Integer channel,
			@RequestParam(value = "amount", required = true) String amount,
			@RequestParam(value = "name", required = true) String name,
			@RequestParam(value = "email", required = true) String email,
			@RequestParam(value = "msisdn", required = false) String msisdn,
			@RequestParam(value = "description", required = false) String description,
			@RequestParam(value = "callback", required = true) String callback,
			@RequestParam(value = "localDateTime", required = true) String localDateTime,
			@RequestParam(value = "sessionID", required = true) String sessionID,
			@RequestParam(value = "eventID", required = false) String eventID,
			@RequestParam(value = "currency", required = false) String currency,
			@RequestParam(value = "words", required = true) String words, Model model, HttpServletRequest req)
			throws MalformedURLException {

		if (mid == "") {
			model.addAttribute("httpResponseCode", "400");
			model.addAttribute("status", "Bad Request");
			model.addAttribute("description", "Insufficient Mandatory Parameter : merchantID");
			return "page_exception";
		}

		if (invoiceID == "") {
			model.addAttribute("httpResponseCode", "400");
			model.addAttribute("status", "Bad Request");
			model.addAttribute("description", "Insufficient Mandatory Parameter : invoiceID");
			return "page_exception";
		}

		if (amount == "") {
			model.addAttribute("httpResponseCode", "400");
			model.addAttribute("status", "Bad Request");
			model.addAttribute("description", "Insufficient Mandatory Parameter : amount");
			return "page_exception";
		}

		if (email == "") {
			model.addAttribute("httpResponseCode", "400");
			model.addAttribute("status", "Bad Request");
			model.addAttribute("description", "Insufficient Mandatory Parameter : email");
			return "page_exception";
		}

		if (callback == "") {
			model.addAttribute("httpResponseCode", "400");
			model.addAttribute("status", "Bad Request");
			model.addAttribute("description", "Insufficient Mandatory Parameter : callback");
			return "page_exception";
		}

		if (localDateTime == "") {
			model.addAttribute("httpResponseCode", "400");
			model.addAttribute("status", "Bad Request");
			model.addAttribute("description", "Insufficient Mandatory Parameter : localDateTime");
			return "page_exception";
		}

		if (sessionID == "") {
			model.addAttribute("httpResponseCode", "400");
			model.addAttribute("status", "Bad Request");
			model.addAttribute("description", "Insufficient Mandatory Parameter : sessionID");
			return "page_exception";
		}

		if (words == "") {
			model.addAttribute("httpResponseCode", "400");
			model.addAttribute("status", "Bad Request");
			model.addAttribute("description", "Insufficient Mandatory Parameter : words");
			return "page_exception";
		}

		Integer paymentChannel = channel == null ? 0 : channel;

		try {
			LoadMembersResponse lmr = paymentPageProcessor.loadMember(mid);
			if (lmr.getMembers().size() == 0) {
				logger.error("[MID Not Found : " + mid + "]");
				model.addAttribute("httpResponseCode", "404");
				model.addAttribute("status", "Bad Request");
				model.addAttribute("description", "Merchant Not Found");
				return "page_exception";
			}

			CredentialResponse cr = paymentPageProcessor.loadCredential(mid, 2);
			String rawhashing = "";
			rawhashing = mid + invoiceID + amount + callback + cr.getCredential();

			String sha256hex = DigestUtils.sha256Hex(rawhashing);
			logger.info("[Request WORDS : " + words + ", Before Hash : " + rawhashing + ", Hashed WORDS : " + sha256hex
					+ "]");
			if (sha256hex.compareTo(words) != 0) {
				logger.info("[INVALID Words = [Request :" + words + "] [Calculated :" + sha256hex + "]");
				model.addAttribute("httpResponseCode", "401");
				model.addAttribute("status", "Unauthorized");
				model.addAttribute("description", "You have invalid WORDS");

				return "page_exception";
			}

			String refNo = msisdn == null
					? String.valueOf(getRandomNumberInRange(1111, 9999))
							+ String.valueOf(getRandomNumberInRange(11111111, 99999999))
					: msisdn;

			String eventId = eventID == null ? "NA" : eventID;
			String descVal = description == null ? "Payment to " + lmr.getMembers().get(0).getName() : description;
			String currencyVal = currency == null ? "360" : currency;
			SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddhhmmss");

			logger.info("[Request IP Address : " + req.getRemoteAddr() + "]");
			logger.info("[EventID : " + eventId + " SessionID : " + sessionID + "]");
			IMap<String, Ticket> tMap = instance.getMap("PaymentRequestMap");
			String ticket = java.util.UUID.randomUUID().toString();
			Ticket t = new Ticket();
			t.setAmount(new BigDecimal(amount));
			t.setDescription(descVal);
			t.setEmail(email);
			t.setInvoiceID(invoiceID);
			t.setName(name);
			t.setMerchantID(mid);
			t.setIpAddress(req.getRemoteAddr());
			t.setMsisdn(refNo);
			t.setPaymentChannel(paymentChannel);
			t.setCallback(callback);
			t.setSessionID(sessionID);
			t.setEventID(eventId);
			t.setCurrency(currencyVal);
			t.setWords(words);
			t.setLocalDateTime(formatter.parse(localDateTime));
			tMap.put(ticket, t);

			String sID = mid + invoiceID + sessionID;
			IMap<String, Ticket> sMap = instance.getMap("PaymentSessionMap");
			sMap.put(sID, t);

			model.addAttribute("ticketID", ticket);
			model.addAttribute("paymentPageURL", contextLoader.getPaymentPageURL());
			return "paymentRequest";
		} catch (Exception ex) {
			ex.printStackTrace();
			logger.error("[" + ex.getCause() + "]");
			model.addAttribute("httpResponseCode", "500");
			model.addAttribute("status", "Oops !");
			model.addAttribute("description",
					"We are experiencing some trouble here, but don't worry our team are OTW to solve this");
			return "page_exception";
		}
	}

	@RequestMapping(value = "/paymentPage", method = RequestMethod.POST)
	public String paymentOption(@RequestParam(value = "ticketID", required = true) String ticketID, Model model,
			HttpServletRequest req) throws MalformedURLException {
		try {
			IMap<String, Ticket> tMap = instance.getMap("PaymentRequestMap");
			Ticket t = tMap.get(ticketID);

			logger.info("[Payment IP Address : " + req.getRemoteAddr() + "]");
			if (!t.getIpAddress().equalsIgnoreCase(req.getRemoteAddr())) {
				logger.error("[IP Address Violation]");
				model.addAttribute("httpResponseCode", "403");
				model.addAttribute("status", "Forbidden");
				model.addAttribute("description", "Invalid RemoteAddress");
				return "page_exception";
			}

			LoadMembersResponse lmr = paymentPageProcessor.loadMember(t.getMerchantID());
			CreditCardParam response = paymentPageProcessor.forwardCreditCardPayment(ticketID, t.getInvoiceID(),
					t.getName(), t.getEmail(), t.getAmount(), t.getDescription());
			model.addAttribute("eventName", lmr.getMembers().get(0).getName());
			model.addAttribute("username", lmr.getMembers().get(0).getUsername());
			model.addAttribute("description", t.getDescription());
			model.addAttribute("mallID", response.getMallID());
			model.addAttribute("chainMerchant", response.getChainMerchant());
			model.addAttribute("amount", response.getAmount());
			model.addAttribute("formattedAmount",
					formatAmount(response.getAmount(), ".", ",", "#,##0.00", "Rp.", ",-"));
			model.addAttribute("transID", response.getTransID());
			model.addAttribute("words", response.getWords());
			model.addAttribute("requestDate", response.getRequestDate());
			model.addAttribute("sessionID", response.getSessionID());
			model.addAttribute("email", response.getEmail());
			model.addAttribute("msisdn", t.getMsisdn());
			model.addAttribute("name", response.getName());
			model.addAttribute("currency", response.getCurrency());
			model.addAttribute("basket", response.getBasket());
			model.addAttribute("receiveURL", contextLoader.getReceiveURL());
			model.addAttribute("ticketID", ticketID);

			if (t.getPaymentChannel() == 1) {
				return "creditCardRedirect";
			} else if (t.getPaymentChannel() == 2) {
				return "bankTransferRedirect";
			} else {
				return "paymentPage";
			}
		} catch (NullPointerException ex) {
			logger.error("[Ticket Not Found/Expired]");
			model.addAttribute("httpResponseCode", "404");
			model.addAttribute("status", "TicketID Not Found");
			model.addAttribute("description", "Expired/Invalid TicketID");
			return "page_exception";
		} catch (IOException ex) {
			ex.printStackTrace();
			logger.error("[" + ex.getCause() + "]");
			model.addAttribute("httpResponseCode", "500");
			model.addAttribute("status", "Oops !");
			model.addAttribute("description",
					"We are experiencing some trouble here, but don't worry our team are OTW to solve this");
			return "page_exception";
		}
	}

	@RequestMapping(value = "/bankTransfer", method = RequestMethod.POST)
	public String submitTransferForm(@Valid @ModelAttribute("transfer") Transfer transfer, BindingResult result,
			ModelMap model) {
		try {
			if (result.hasErrors()) {
				return "page_500";
			}

			IMap<String, Ticket> tMap = instance.getMap("PaymentRequestMap");
			Ticket t = tMap.get(transfer.getTicketID());

			VaRegisterResponse vaRegisterResponse = paymentPageProcessor.registerVABilling(t.getMerchantID(),
					transfer.getName(), transfer.getMsisdn(), transfer.getEmail(), transfer.getDescription(),
					transfer.getAmount(), 1, t.getEventID(), t.getCallback());

			if (vaRegisterResponse.getStatus().getMessage().equalsIgnoreCase("PROCESSED")) {
				model.addAttribute("ticketID", transfer.getTicketID());
				model.addAttribute("ticketVA", vaRegisterResponse.getTicketID());
				return "redirect:/bankTransferPayment";
			} else if (vaRegisterResponse.getStatus().getMessage().equalsIgnoreCase("DUPLICATE_TRANSACTION")) {
				logger.error("[Ticket Not Found/Expired]");
				model.addAttribute("httpResponseCode", "404");
				model.addAttribute("status", "Duplicate Billing");
				model.addAttribute("description", "Your billing already exist with the same billing ID");
				return "page_exception";
			} else {
				model.addAttribute("status", vaRegisterResponse.getStatus().getDescription());
				model.addAttribute("httpResponseCode", "404");
				model.addAttribute("status", vaRegisterResponse.getStatus().getMessage());
				model.addAttribute("description", vaRegisterResponse.getStatus().getDescription());
				return "page_exception";
			}
		} catch (NullPointerException ex) {
			logger.error("[Ticket Not Found/Expired]");
			model.addAttribute("httpResponseCode", "404");
			model.addAttribute("status", "TicketID Not Found");
			model.addAttribute("description", "Expired/Invalid TicketID");
			return "page_exception";
		} catch (MalformedURLException | DatatypeConfigurationException | ParseException ex) {
			ex.printStackTrace();
			logger.error("[" + ex.getCause() + "]");
			model.addAttribute("httpResponseCode", "500");
			model.addAttribute("status", "Oops !");
			model.addAttribute("description",
					"We are experiencing some trouble here, but don't worry our team are OTW to solve this");
			return "page_exception";
		}
	}

	@RequestMapping(value = "/bankTransferPayment", method = RequestMethod.GET)
	public String transferFormRedirection(ModelMap model,
			@RequestParam(value = "ticketID", required = true) String ticketID,
			@RequestParam(value = "ticketVA", required = true) String ticketVA) {
		try {
			IMap<String, Ticket> tMap = instance.getMap("PaymentRequestMap");
			Ticket t = tMap.get(ticketID);
			t.setPaymentChannel(2);
			LoadVAByIDResponse loadVAByIDResponse = paymentPageProcessor.loadVAByID(ticketVA);
			if (loadVAByIDResponse.getVaRecord().size() == 0) {
				return "page_404";
			}

			IMap<String, Ticket> vaMap = instance.getMap("PaymentVAMap");
			vaMap.put(loadVAByIDResponse.getVaRecord().get(0).getId(), t);
			LoadMembersResponse lmr = paymentPageProcessor
					.loadMember(loadVAByIDResponse.getVaRecord().get(0).getParentUsername());
			model.addAttribute("paymentCode", loadVAByIDResponse.getVaRecord().get(0).getId());
			model.addAttribute("amount", loadVAByIDResponse.getVaRecord().get(0).getFormattedAmount());
			model.addAttribute("expiredAt", loadVAByIDResponse.getVaRecord().get(0).getFormattedExpiredAt());
			model.addAttribute("eventName", lmr.getMembers().get(0).getName());
			model.addAttribute("username", lmr.getMembers().get(0).getUsername());
			model.addAttribute("description", loadVAByIDResponse.getVaRecord().get(0).getDescription());
			tMap.delete(ticketID);
			return "bankTransferPayment";
		} catch (NullPointerException ex) {
			ex.printStackTrace();
			logger.error("[Ticket Not Found/Expired]");
			model.addAttribute("httpResponseCode", "404");
			model.addAttribute("status", "TicketID Not Found");
			model.addAttribute("description", "Expired/Invalid TicketID");
			return "page_exception";
		} catch (Exception ex) {
			ex.printStackTrace();
			logger.error("[" + ex.getCause() + "]");
			model.addAttribute("httpResponseCode", "500");
			model.addAttribute("status", "Oops !");
			model.addAttribute("description",
					"We are experiencing some trouble here, but don't worry our team are OTW to solve this");
			return "page_exception";
		}
	}

	@RequestMapping(value = "/paymentVANotification", method = RequestMethod.POST)
	public String paymentVANotification(@RequestParam(value = "paymentCode", required = true) String paymentCode,
			@RequestParam(value = "amount", required = true) String amount,
			@RequestParam(value = "transactionNumber", required = true) String transactionNumber,
			@RequestParam(value = "notificationDate", required = true) String notificationDate, ModelMap model) {
		try {
			IMap<String, Ticket> vaMap = instance.getMap("PaymentVAMap");
			Ticket t = vaMap.get(paymentCode);
			String res = paymentPageProcessor.sendVANotification(t);
			logger.info("[VA Notification Response : " + res + "]");
			vaMap.delete(paymentCode);
			return "OK";
		} catch (Exception ex) {
			ex.printStackTrace();
			model.addAttribute("httpResponseCode", "500");
			model.addAttribute("status", "Oops !");
			model.addAttribute("description",
					"We are experiencing some trouble here, but don't worry our team are OTW to solve this");
			return "page_exception";
		}
	}

	@RequestMapping(value = "/paymentNotification", method = RequestMethod.POST)
	public String paymentNotification(@RequestParam(value = "MALLID", required = true) String mallID,
			@RequestParam(value = "AMOUNT", required = true) String amount,
			@RequestParam(value = "TRANSIDMERCHANT", required = true) String transid,
			@RequestParam(value = "SESSIONID", required = true) String sessionID, ModelMap model) {
		try {
			logger.info("[NOTIFY : MallID : " + mallID + "Amount : " + amount + "TransID : " + transid + "SessionID : "
					+ sessionID + "]");
			return "OK";
		} catch (Exception ex) {
			logger.error("[" + ex.getCause() + "]");
			model.addAttribute("httpResponseCode", "500");
			model.addAttribute("status", "Oops !");
			model.addAttribute("description",
					"We are experiencing some trouble here, but don't worry our team are OTW to solve this");
			return "page_exception";
		}
	}

	@ResponseBody
	@RequestMapping(value = "/checkStatus", method = RequestMethod.POST)
	public String paymentCheckStatus(@RequestParam(value = "merchantID", required = true) String merchantID,
			@RequestParam(value = "invoiceID", required = true) String invoiceID,
			@RequestParam(value = "amount", required = true) String amount,
			@RequestParam(value = "callback", required = true) String callback,
			@RequestParam(value = "words", required = true) String words,
			@RequestParam(value = "sessionID", required = true) String sessionID, HttpServletRequest req) {
		logger.info("[Check Status : MID : " + merchantID + " InvoiceID : " + invoiceID + " SessionID : " + sessionID
				+ "]");
		String sID = merchantID + invoiceID + sessionID;
		try {
			IMap<String, Ticket> sMap = instance.getMap("PaymentSessionMap");
			Ticket t = sMap.get(sID);
			if (!req.getRemoteAddr().equalsIgnoreCase(t.getIpAddress())) {
				return "FORBIDDEN";
			}
			if (t.getWords().equalsIgnoreCase(words)) {
				if (t.getStatus() == null) {
					return "PENDING";
				} else {
					return t.getStatus();
				}
			}
			return "INVALID_WORDS";

		} catch (NullPointerException ex) {
			return "TICKET_NOT_FOUND";
		}
	}

	@RequestMapping(value = "/paymentRedirection", method = RequestMethod.POST)
	public String paymentRedirection(@RequestParam(value = "AMOUNT", required = true) String amount,
			@RequestParam(value = "TRANSIDMERCHANT", required = true) String transID,
			@RequestParam(value = "SESSIONID", required = true) String sessionID,
			@RequestParam(value = "WORDS", required = true) String words,
			@RequestParam(value = "PAYMENTCHANNEL", required = true) String paymentChannel,
			@RequestParam(value = "STATUSCODE", required = true) String status, ModelMap model) throws IOException {
		try {
			logger.info("[REDIRECT Status : " + status + "]");
			String calculateWords = DigestUtils.sha1Hex(amount + contextLoader.getDokuSharedKey() + transID + status);
			if (calculateWords.compareTo(words) != 0) {
				logger.error("[Invalid Redirect Words]");
				model.addAttribute("httpResponseCode", "403");
				model.addAttribute("status", "FORBIDDEN ACCESS");
				model.addAttribute("description", "Security Violation");
				return "page_exception";
			}

			IMap<String, Ticket> tMap = instance.getMap("PaymentRequestMap");
			Ticket t = tMap.get(sessionID);
			if (t.getMerchantID() == null) {
				logger.error("[Ticket Not Found/Expired]");
				model.addAttribute("httpResponseCode", "404");
				model.addAttribute("status", "TicketID Not Found");
				model.addAttribute("description", "Expired/Invalid TicketID");
				return "page_exception";
			}

			String sessionMap = t.getMerchantID() + t.getInvoiceID() + t.getSessionID();
			if (status.equalsIgnoreCase("0000")) {
				PaymentResponse pr = paymentPageProcessor.doPayment(sessionID, t.getMerchantID(), t.getInvoiceID(),
						t.getDescription(), t.getAmount());
				if (pr.getStatus().getMessage().equalsIgnoreCase("PROCESSED")) {
					t.setPaymentChannel(1);
					t.setStatus(pr.getStatus().getMessage());
					model.addAttribute("merchantID", t.getMerchantID());
					model.addAttribute("invoiceID", t.getInvoiceID());
					model.addAttribute("amount", t.getAmount());
					model.addAttribute("sessionID", t.getSessionID());
					model.addAttribute("currency", t.getCurrency());
					model.addAttribute("transactionNumber", pr.getTransactionNumber());
					model.addAttribute("name", t.getName());
					model.addAttribute("email", t.getEmail());
					model.addAttribute("msisdn", t.getMsisdn());
					model.addAttribute("description", t.getDescription());
					model.addAttribute("paymentChannel", t.getPaymentChannel());
					model.addAttribute("ticketID", sessionID);
					model.addAttribute("words", t.getWords());
					model.addAttribute("status", pr.getStatus().getMessage());
					paymentPageProcessor.sendToSettlement(pr);
					paymentPageProcessor.sendMessage(pr.getFromMember().getUsername(), pr.getToMember().getUsername(),
							"Payment Received " + t.getDescription(),
							"You have received a payment "
									+ formatAmount(pr.getAmount(), ".", ",", "#,##0.00", "Rp.", ",-")
									+ " using Credit Card from " + t.getName() + " (" + t.getEmail()
									+ ") with Invoice ID " + t.getInvoiceID());
				} else {
					logger.info("[Credit to Merchant Failed, VOIDING Transaction For MID : " + t.getMerchantID()
							+ " With Invoice : " + transID + "]");
					String responseVoid = paymentPageProcessor.sendVoid(transID, sessionID);
					logger.info("[VOID Status ResponseCode : " + responseVoid + "]");
					t.setStatus("FAILED");
					model.addAttribute("merchantID", t.getMerchantID());
					model.addAttribute("invoiceID", t.getInvoiceID());
					model.addAttribute("amount", t.getAmount());
					model.addAttribute("sessionID", t.getSessionID());
					model.addAttribute("currency", t.getCurrency());
					model.addAttribute("paymentChannel", t.getPaymentChannel());
					model.addAttribute("ticketID", sessionID);
					model.addAttribute("words", t.getWords());
					model.addAttribute("status", "FAILED");
					model.addAttribute("description", "Something isn't quite right, We were reversing your payment...");
				}
			} else {
				logger.info("[Debit to Customer Failed, VOIDING Transaction For MID : " + t.getMerchantID()
						+ " With Invoice : " + transID + "]");
				String responseVoid = paymentPageProcessor.sendVoid(transID, sessionID);
				logger.info("[VOID Status ResponseCode : " + responseVoid + "]");
				t.setStatus("FAILED");
				model.addAttribute("merchantID", t.getMerchantID());
				model.addAttribute("invoiceID", t.getInvoiceID());
				model.addAttribute("amount", t.getAmount());
				model.addAttribute("sessionID", t.getSessionID());
				model.addAttribute("eventID", t.getEventID());
				model.addAttribute("currency", t.getCurrency());
				model.addAttribute("paymentChannel", t.getPaymentChannel());
				model.addAttribute("ticketID", sessionID);
				model.addAttribute("words", t.getWords());
				model.addAttribute("status", "FAILED");
				model.addAttribute("description",
						"Oops! Your payment was failed, please consult with your bank and try again");
			}
			IMap<String, Ticket> sMap = instance.getMap("PaymentSessionMap");
			sMap.put(sessionMap, t);
			return "merchantRedirect";
		} catch (NullPointerException ex) {
			ex.printStackTrace();
			logger.error("[Ticket Not Found/Expired]");
			model.addAttribute("httpResponseCode", "404");
			model.addAttribute("status", "TicketID Not Found");
			model.addAttribute("description", "Expired/Invalid TicketID");
			return "page_exception";
		} catch (Exception ex) {
			ex.printStackTrace();
			logger.info("[Payment Failed, VOIDING Transaction For SESSIONID : " + sessionID + " With Invoice : "
					+ transID + "]");
			String responseVoid = paymentPageProcessor.sendVoid(transID, sessionID);
			logger.info("[VOID Status ResponseCode : " + responseVoid + "]");
			model.addAttribute("status", "FAILED");
			model.addAttribute("httpResponseCode", "500");
			model.addAttribute("description", "Something isn't quite right, We were reversing your payment...");
			return "page_exception";
		}
	}

	@RequestMapping(value = "/merchantRedirection", method = RequestMethod.POST)
	public ResponseEntity<Object> redirectToExternalUrl(
			@RequestParam(value = "ticketID", required = true) String ticketID,
			@RequestParam(value = "merchantID", required = true) String merchantID,
			@RequestParam(value = "invoiceID", required = true) String invoiceID,
			@RequestParam(value = "amount", required = true) String amount,
			@RequestParam(value = "sessionID", required = false) String sessionID,
			@RequestParam(value = "eventID", required = false) String eventID,
			@RequestParam(value = "currency", required = false) String currency,
			@RequestParam(value = "paymentChannel", required = false) String paymentChannel,
			@RequestParam(value = "words", required = true) String words,
			@RequestParam(value = "status", required = true) String status) throws URISyntaxException {
		try {
			IMap<String, Ticket> tMap = instance.getMap("PaymentRequestMap");
			Ticket t = tMap.get(ticketID);
			logger.info("[Processing Notification On MID : " + t.getMerchantID() + "]");
			logger.info("[CALLBACK URL : " + t.getCallback() + "]");
			URI url = new URI(t.getCallback());
			HttpHeaders httpHeaders = new HttpHeaders();
			httpHeaders.setLocation(url);
			return new ResponseEntity<>(httpHeaders, HttpStatus.TEMPORARY_REDIRECT);

		} catch (NullPointerException ex) {
			logger.error("[Ticket Not Found/Expired]");
			URI url = new URI("/payment/page_exception");
			HttpHeaders httpHeaders = new HttpHeaders();
			httpHeaders.setLocation(url);
			return new ResponseEntity<>(httpHeaders, HttpStatus.NOT_FOUND);
		}
	}

	@RequestMapping(value = "/redirectedPostToPost", method = RequestMethod.POST)
	public ModelAndView redirectedPostToPost(@RequestParam(value = "ticketID", required = true) String ticketID,
			@RequestParam(value = "merchantID", required = true) String merchantID,
			@RequestParam(value = "invoiceID", required = true) String invoiceID,
			@RequestParam(value = "amount", required = true) String amount,
			@RequestParam(value = "sessionID", required = false) String sessionID,
			@RequestParam(value = "currency", required = false) String currency,
			@RequestParam(value = "paymentChannel", required = false) String paymentChannel,
			@RequestParam(value = "words", required = true) String words,
			@RequestParam(value = "status", required = true) String status, Model model) {

		model.addAttribute("merchantID", merchantID);
		model.addAttribute("invoiceID", invoiceID);
		model.addAttribute("amount", amount);
		model.addAttribute("sessionID", sessionID);
		model.addAttribute("currency", currency);
		model.addAttribute("paymentChannel", paymentChannel);
		model.addAttribute("ticketID", ticketID);
		model.addAttribute("words", words);
		model.addAttribute("status", status);

		return new ModelAndView("testRedirection");
	}

	public static String formatAmount(BigDecimal amount, String grouping, String decimal, String format, String prefix,
			String trailer) {
		DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.getDefault());
		symbols.setGroupingSeparator(grouping.charAt(0));
		symbols.setDecimalSeparator(decimal.charAt(0));
		DecimalFormat df = new DecimalFormat(format, symbols);
		if (prefix == null) {
			prefix = "";
		}
		if (trailer == null) {
			trailer = "";
		}
		return prefix + df.format(amount) + " " + trailer;
	}

	public static int getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}
}