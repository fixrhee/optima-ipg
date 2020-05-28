package com.jpa.optima.ipg.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Ticket implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2754898992480527455L;
	private String merchantID;
	private String invoiceID;
	private BigDecimal amount;
	private String name;
	private String email;
	private String msisdn;
	private String description;
	private String ipAddress;
	private String callback;
	private String sessionID;
	private String currency;
	private Integer paymentChannel;
	private String eventID;
	private String status;
	private String words;
	private Date localDateTime;

	public String getInvoiceID() {
		return invoiceID;
	}

	public void setInvoiceID(String invoiceID) {
		this.invoiceID = invoiceID;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getMerchantID() {
		return merchantID;
	}

	public void setMerchantID(String merchantID) {
		this.merchantID = merchantID;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getMsisdn() {
		return msisdn;
	}

	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}

	public String getCallback() {
		return callback;
	}

	public void setCallback(String callback) {
		this.callback = callback;
	}

	public String getSessionID() {
		return sessionID;
	}

	public void setSessionID(String sessionID) {
		this.sessionID = sessionID;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Integer getPaymentChannel() {
		return paymentChannel;
	}

	public void setPaymentChannel(Integer paymentChannel) {
		this.paymentChannel = paymentChannel;
	}

	public String getWords() {
		return words;
	}

	public void setWords(String words) {
		this.words = words;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getLocalDateTime() {
		return localDateTime;
	}

	public void setLocalDateTime(Date localDateTime) {
		this.localDateTime = localDateTime;
	}

	public String getEventID() {
		return eventID;
	}

	public void setEventID(String eventID) {
		this.eventID = eventID;
	}

}
