package com.jpa.optima.ipg.controller;

import java.io.IOException;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import javax.xml.ws.Holder;

import org.bellatrix.services.ws.members.MemberService;
import org.bellatrix.services.ws.message.Message;
import org.bellatrix.services.ws.message.MessageService;
import org.bellatrix.services.ws.message.SendMessageRequest;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang.time.DateUtils;
import org.bellatrix.services.ws.access.Access;
import org.bellatrix.services.ws.access.AccessService;
import org.bellatrix.services.ws.access.CredentialRequest;
import org.bellatrix.services.ws.access.CredentialResponse;
import org.bellatrix.services.ws.access.Exception_Exception;
import org.bellatrix.services.ws.members.LoadMembersByUsernameRequest;
import org.bellatrix.services.ws.members.LoadMembersResponse;
import org.bellatrix.services.ws.members.Member;
import org.bellatrix.services.ws.payments.GeneratePaymentTicketRequest;
import org.bellatrix.services.ws.payments.GeneratePaymentTicketResponse;
import org.bellatrix.services.ws.payments.Payment;
import org.bellatrix.services.ws.payments.PaymentRequest;
import org.bellatrix.services.ws.payments.PaymentResponse;
import org.bellatrix.services.ws.payments.PaymentService;
import org.bellatrix.services.ws.payments.ValidatePaymentTicketRequest;
import org.bellatrix.services.ws.payments.ValidatePaymentTicketResponse;
import org.bellatrix.services.ws.virtualaccount.BankVA;
import org.bellatrix.services.ws.virtualaccount.LoadVAByIDRequest;
import org.bellatrix.services.ws.virtualaccount.LoadVAByIDResponse;
import org.bellatrix.services.ws.virtualaccount.LoadVAEventRequest;
import org.bellatrix.services.ws.virtualaccount.LoadVAEventResponse;
import org.bellatrix.services.ws.virtualaccount.VaBankRequest;
import org.bellatrix.services.ws.virtualaccount.VaBankResponse;
import org.bellatrix.services.ws.virtualaccount.VaRegisterRequest;
import org.bellatrix.services.ws.virtualaccount.VaRegisterResponse;
import org.bellatrix.services.ws.virtualaccount.VirtualAccount;
import org.bellatrix.services.ws.virtualaccount.VirtualAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import com.jpa.optima.ipg.model.CreditCardParam;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

@Component
public class PaymentPageProcessor {

	@Autowired
	private ContextLoader contextLoader;
	@Autowired
	private JmsTemplate jmsTemplate;

	public void sendToSettlement(PaymentResponse response) {
		Map<String, Object> obj = new HashMap<String, Object>();
		obj.put("transferID", response.getId());
		obj.put("transferTypeID", response.getTransferType().getId());
		obj.put("transactionNumber", response.getTransactionNumber());
		obj.put("traceNumber", response.getTraceNumber());
		obj.put("fromUsername", response.getFromMember().getUsername());
		obj.put("toUsername", response.getToMember().getUsername());
		obj.put("amount", response.getAmount().toPlainString());
		jmsTemplate.convertAndSend(obj);
	}

	public void sendMessage(String fromUsername, String toUsername, String subject, String body) throws Exception {
		URL url = new URL(contextLoader.getHostWSUrl() + "message?wsdl");
		QName qName = new QName(contextLoader.getHostWSPort(), "MessageService");
		MessageService service = new MessageService(url, qName);
		Message client = service.getMessagePort();

		org.bellatrix.services.ws.message.Header headerPayment = new org.bellatrix.services.ws.message.Header();
		headerPayment.setToken(contextLoader.getHeaderToken());
		Holder<org.bellatrix.services.ws.message.Header> headerAuth = new Holder<org.bellatrix.services.ws.message.Header>();
		headerAuth.value = headerPayment;

		SendMessageRequest messageRequest = new SendMessageRequest();
		messageRequest.setFromUsername(fromUsername);
		messageRequest.setToUsername(toUsername);
		messageRequest.setBody(body);
		messageRequest.setSubject(subject);
		client.sendMessage(headerAuth, messageRequest);
	}

	public PaymentResponse doPayment(String ticketID, String to, String invoiceID, String description,
			BigDecimal amount) throws Exception {
		URL url = new URL(contextLoader.getHostWSUrl() + "payments?wsdl");
		QName qName = new QName(contextLoader.getHostWSPort(), "PaymentService");
		PaymentService service = new PaymentService(url, qName);
		Payment client = service.getPaymentPort();

		org.bellatrix.services.ws.payments.Header headerPayment = new org.bellatrix.services.ws.payments.Header();
		headerPayment.setToken(contextLoader.getHeaderToken());
		Holder<org.bellatrix.services.ws.payments.Header> headerAuth = new Holder<org.bellatrix.services.ws.payments.Header>();
		headerAuth.value = headerPayment;

		PaymentRequest paymentRequest = new PaymentRequest();
		paymentRequest.setFromMember(contextLoader.getDokuUsername());
		paymentRequest.setToMember(to);
		paymentRequest.setTraceNumber(contextLoader.getWebserviceID() + ticketID);
		paymentRequest.setDescription("Invoice ID : " + invoiceID + " - " + description);
		paymentRequest.setTransferTypeID(contextLoader.getIPGTransferType());
		paymentRequest.setAmount(amount);
		paymentRequest.setStatus("PENDING");

		PaymentResponse paymentResponse = client.doPayment(headerAuth, paymentRequest);
		return paymentResponse;
	}

	public LoadVAEventResponse loadVAEvent(String ticketID) throws Exception {
		URL url = new URL(contextLoader.getHostWSUrl() + "virtualaccounts?wsdl");
		QName qName = new QName(contextLoader.getHostWSPort(), "VirtualAccountService");
		VirtualAccountService service = new VirtualAccountService(url, qName);
		VirtualAccount client = service.getVirtualAccountPort();

		org.bellatrix.services.ws.virtualaccount.Header headerVA = new org.bellatrix.services.ws.virtualaccount.Header();
		headerVA.setToken(contextLoader.getHeaderToken());
		Holder<org.bellatrix.services.ws.virtualaccount.Header> vaHeaderAuth = new Holder<org.bellatrix.services.ws.virtualaccount.Header>();
		vaHeaderAuth.value = headerVA;

		LoadVAEventRequest loadVAEventRequest = new LoadVAEventRequest();
		loadVAEventRequest.setTicketID(ticketID);
		LoadVAEventResponse loadVAEventResponse = client.loadVAEventByID(vaHeaderAuth, loadVAEventRequest);
		return loadVAEventResponse;
	}

	public VaRegisterResponse registerVABilling(String username, String billName, String msisdn, String email,
			String description, BigDecimal amount, Integer bankID)
			throws MalformedURLException, DatatypeConfigurationException, ParseException {
		URL url = new URL(contextLoader.getHostWSUrl() + "virtualaccounts?wsdl");
		QName qName = new QName(contextLoader.getHostWSPort(), "VirtualAccountService");
		VirtualAccountService service = new VirtualAccountService(url, qName);
		VirtualAccount client = service.getVirtualAccountPort();

		org.bellatrix.services.ws.virtualaccount.Header headerVA = new org.bellatrix.services.ws.virtualaccount.Header();
		headerVA.setToken(contextLoader.getHeaderToken());
		Holder<org.bellatrix.services.ws.virtualaccount.Header> vaHeaderAuth = new Holder<org.bellatrix.services.ws.virtualaccount.Header>();
		vaHeaderAuth.value = headerVA;

		VaRegisterRequest vaRegisterRequest = new VaRegisterRequest();
		vaRegisterRequest.setBankID(bankID);
		vaRegisterRequest.setExpiredDateTime(stringToXMLGregorianCalendar(DateUtils.addDays(new Date(), 1)));
		vaRegisterRequest.setName(billName);
		vaRegisterRequest.setPersistent(false);
		vaRegisterRequest.setReferenceNumber(msisdn);
		vaRegisterRequest.setUsername(username);
		// vaRegisterRequest.setEventID(billing.getEvent().get(0).getTicketID());
		vaRegisterRequest.setMinimumPayment(BigDecimal.ZERO);
		vaRegisterRequest.setEmail(email);
		vaRegisterRequest.setFullPayment(true);
		vaRegisterRequest.setAmount(amount);
		vaRegisterRequest.setDescription(description);
		VaRegisterResponse vaRegisterResponse = client.registerVA(vaHeaderAuth, vaRegisterRequest);
		return vaRegisterResponse;
	}

	public LoadVAByIDResponse loadVAByID(String ticketID) throws MalformedURLException {
		URL url = new URL(contextLoader.getHostWSUrl() + "virtualaccounts?wsdl");
		QName qName = new QName(contextLoader.getHostWSPort(), "VirtualAccountService");
		VirtualAccountService service = new VirtualAccountService(url, qName);
		VirtualAccount client = service.getVirtualAccountPort();

		org.bellatrix.services.ws.virtualaccount.Header headerVA = new org.bellatrix.services.ws.virtualaccount.Header();
		headerVA.setToken(contextLoader.getHeaderToken());
		Holder<org.bellatrix.services.ws.virtualaccount.Header> vaHeaderAuth = new Holder<org.bellatrix.services.ws.virtualaccount.Header>();
		vaHeaderAuth.value = headerVA;
		LoadVAByIDRequest loadVAByIDRequest = new LoadVAByIDRequest();
		loadVAByIDRequest.setTicketID(ticketID);
		LoadVAByIDResponse loadVaByIDResponse = client.loadVAByID(vaHeaderAuth, loadVAByIDRequest);

		return loadVaByIDResponse;
	}

	public List<BankVA> listBankVA(String username) throws MalformedURLException {
		URL url = new URL(contextLoader.getHostWSUrl() + "virtualaccounts?wsdl");
		QName qName = new QName(contextLoader.getHostWSPort(), "VirtualAccountService");
		VirtualAccountService service = new VirtualAccountService(url, qName);
		VirtualAccount client = service.getVirtualAccountPort();

		org.bellatrix.services.ws.virtualaccount.Header headerVA = new org.bellatrix.services.ws.virtualaccount.Header();
		headerVA.setToken(contextLoader.getHeaderToken());
		Holder<org.bellatrix.services.ws.virtualaccount.Header> vaHeaderAuth = new Holder<org.bellatrix.services.ws.virtualaccount.Header>();
		vaHeaderAuth.value = headerVA;

		VaBankRequest vaBankRequest = new VaBankRequest();
		vaBankRequest.setUsername(username);

		VaBankResponse vaBankResponse = client.listBankVA(vaHeaderAuth, vaBankRequest);

		List<BankVA> trxList = new ArrayList<>();
		if (vaBankResponse.getBank().size() > 0) {
			BankVA bank;
			for (BankVA va : vaBankResponse.getBank()) {
				bank = new BankVA();
				bank.setId(va.getId());
				bank.setBankCode(va.getBankCode());
				bank.setBankName(va.getBankName());
				trxList.add(va);
			}
		}
		return trxList;
	}

	public GeneratePaymentTicketResponse generatePaymentTicket(String username, String invoiceID, String name,
			String email, String description, BigDecimal amount) throws MalformedURLException {
		URL url = new URL(contextLoader.getHostWSUrl() + "payments?wsdl");
		QName qName = new QName(contextLoader.getHostWSPort(), "PaymentService");
		PaymentService service = new PaymentService(url, qName);
		Payment client = service.getPaymentPort();

		org.bellatrix.services.ws.payments.Header headerPayment = new org.bellatrix.services.ws.payments.Header();
		headerPayment.setToken(contextLoader.getHeaderToken());
		Holder<org.bellatrix.services.ws.payments.Header> payHeaderAuth = new Holder<org.bellatrix.services.ws.payments.Header>();
		payHeaderAuth.value = headerPayment;

		GeneratePaymentTicketRequest gpt = new GeneratePaymentTicketRequest();
		gpt.setAmount(amount);
		gpt.setDescription(description);
		gpt.setInvoiceNumber(invoiceID);
		gpt.setEmail(email);
		gpt.setName(name);
		gpt.setToMember(username);
		gpt.setTransferTypeID(contextLoader.getIPGTransferType());
		GeneratePaymentTicketResponse gptr = client.generatePaymentTicket(payHeaderAuth, gpt);
		return gptr;
	}

	public ValidatePaymentTicketResponse validatePaymentTicket(String ticketID) throws MalformedURLException {
		URL url = new URL(contextLoader.getHostWSUrl() + "payments?wsdl");
		QName qName = new QName(contextLoader.getHostWSPort(), "PaymentService");
		PaymentService service = new PaymentService(url, qName);
		Payment client = service.getPaymentPort();

		org.bellatrix.services.ws.payments.Header headerPayment = new org.bellatrix.services.ws.payments.Header();
		headerPayment.setToken(contextLoader.getHeaderToken());
		Holder<org.bellatrix.services.ws.payments.Header> payHeaderAuth = new Holder<org.bellatrix.services.ws.payments.Header>();
		payHeaderAuth.value = headerPayment;

		ValidatePaymentTicketRequest vpt = new ValidatePaymentTicketRequest();
		vpt.setTicket(ticketID);
		ValidatePaymentTicketResponse vptr = client.validatePaymentTicket(payHeaderAuth, vpt);
		return vptr;
	}

	public LoadMembersResponse loadMember(String username) throws MalformedURLException {
		URL url = new URL(contextLoader.getHostWSUrl() + "members?wsdl");
		QName qName = new QName(contextLoader.getHostWSPort(), "MemberService");
		MemberService service = new MemberService(url, qName);
		Member client = service.getMemberPort();

		org.bellatrix.services.ws.members.Header headerMember = new org.bellatrix.services.ws.members.Header();
		headerMember.setToken(contextLoader.getHeaderToken());
		Holder<org.bellatrix.services.ws.members.Header> memberHeaderAuth = new Holder<org.bellatrix.services.ws.members.Header>();
		memberHeaderAuth.value = headerMember;

		LoadMembersByUsernameRequest lm = new LoadMembersByUsernameRequest();
		lm.setUsername(username);
		LoadMembersResponse lmr = client.loadMembersByUsername(memberHeaderAuth, lm);
		return lmr;
	}

	public CredentialResponse loadCredential(String username, Integer accessTypeID)
			throws Exception_Exception, MalformedURLException {
		URL url = new URL(contextLoader.getHostWSUrl() + "access?wsdl");
		QName qName = new QName(contextLoader.getHostWSPort(), "AccessService");
		AccessService service = new AccessService(url, qName);
		Access client = service.getAccessPort();

		org.bellatrix.services.ws.access.Header headerMember = new org.bellatrix.services.ws.access.Header();
		headerMember.setToken(contextLoader.getHeaderToken());
		Holder<org.bellatrix.services.ws.access.Header> accessHeaderAuth = new Holder<org.bellatrix.services.ws.access.Header>();
		accessHeaderAuth.value = headerMember;

		CredentialRequest cr = new CredentialRequest();
		cr.setUsername(username);
		cr.setAccessTypeID(accessTypeID);
		CredentialResponse lmr = client.getCredential(accessHeaderAuth, cr);
		return lmr;
	}

	public CreditCardParam forwardCreditCardPayment(String ticketID, String invoiceID, String name, String email,
			BigDecimal amount, String description) throws IOException {
		String words = DigestUtils
				.sha1Hex(amount + ".00" + contextLoader.getDokuMallID() + contextLoader.getDokuSharedKey() + invoiceID);
		CreditCardParam param = new CreditCardParam();
		param.setMallID(contextLoader.getDokuMallID());
		param.setChainMerchant("NA");
		param.setAmount(amount);
		param.setTransID(invoiceID);
		param.setRequestDate(GetDate("yyyyMMddhhmmss"));
		param.setSessionID(ticketID);
		param.setCurrency("360");
		param.setEmail(email);
		param.setName(name);
		param.setWords(words);
		param.setBasket(description + "," + amount + ",1," + amount);
		return param;
	}

	public static String GetDate(String form) {
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat(form);
		return format.format(date);
	}

	public XMLGregorianCalendar stringToXMLGregorianCalendar(Date s)
			throws ParseException, DatatypeConfigurationException {
		XMLGregorianCalendar result = null;
		GregorianCalendar gregorianCalendar;
		gregorianCalendar = (GregorianCalendar) GregorianCalendar.getInstance();
		gregorianCalendar.setTime(s);
		result = DatatypeFactory.newInstance().newXMLGregorianCalendar(gregorianCalendar);
		return result;
	}

	public String sendCheckStatus(String transID, String sessionID) throws IOException {

		String result = "";
		HttpPost post = new HttpPost(contextLoader.getCheckStatusURL());
		String words = DigestUtils.sha1Hex(contextLoader.getDokuMallID() + contextLoader.getDokuSharedKey() + transID);

		List<NameValuePair> urlParameters = new ArrayList<>();
		urlParameters.add(new BasicNameValuePair("MALLID", contextLoader.getDokuMallID()));
		urlParameters.add(new BasicNameValuePair("CHAINMERCHANT", "NA"));
		urlParameters.add(new BasicNameValuePair("TRANSIDMERCHANT", transID));
		urlParameters.add(new BasicNameValuePair("SESSIONID", sessionID));
		urlParameters.add(new BasicNameValuePair("WORDS", words));

		post.setEntity(new UrlEncodedFormEntity(urlParameters));

		try (CloseableHttpClient httpClient = HttpClients.createDefault();
				CloseableHttpResponse response = httpClient.execute(post)) {
			result = EntityUtils.toString(response.getEntity());
		}

		return result;
	}

	public String sendVoid(String transID, String sessionID) throws IOException {

		String result = "";
		HttpPost post = new HttpPost(contextLoader.getVoidURL());
		String words = DigestUtils.sha1Hex(contextLoader.getDokuMallID() + contextLoader.getDokuSharedKey() + transID);

		List<NameValuePair> urlParameters = new ArrayList<>();
		urlParameters.add(new BasicNameValuePair("MALLID", contextLoader.getDokuMallID()));
		urlParameters.add(new BasicNameValuePair("CHAINMERCHANT", "NA"));
		urlParameters.add(new BasicNameValuePair("TRANSIDMERCHANT", transID));
		urlParameters.add(new BasicNameValuePair("SESSIONID", sessionID));
		urlParameters.add(new BasicNameValuePair("WORDS", words));

		post.setEntity(new UrlEncodedFormEntity(urlParameters));

		try (CloseableHttpClient httpClient = HttpClients.createDefault();
				CloseableHttpResponse response = httpClient.execute(post)) {
			result = EntityUtils.toString(response.getEntity());
		}

		return result;
	}

	public JmsTemplate getJmsTemplate() {
		return jmsTemplate;
	}

	public void setJmsTemplate(JmsTemplate jmsTemplate) {
		this.jmsTemplate = jmsTemplate;
	}
}