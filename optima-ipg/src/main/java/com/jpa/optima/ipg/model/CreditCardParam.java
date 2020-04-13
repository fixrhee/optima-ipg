package com.jpa.optima.ipg.model;

import java.math.BigDecimal;

public class CreditCardParam {

	private String mallID;
	private String chainMerchant;
	private BigDecimal amount;
	private String transID;
	private String words;
	private String requestDate;
	private String sessionID;
	private String currency;
	private String email;
	private String name;
	private String url;
	private String basket;

	public String getMallID() {
		return mallID;
	}

	public void setMallID(String mallID) {
		this.mallID = mallID;
	}

	public String getChainMerchant() {
		return chainMerchant;
	}

	public void setChainMerchant(String chainMerchant) {
		this.chainMerchant = chainMerchant;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getTransID() {
		return transID;
	}

	public void setTransID(String transID) {
		this.transID = transID;
	}

	public String getWords() {
		return words;
	}

	public void setWords(String words) {
		this.words = words;
	}

	public String getRequestDate() {
		return requestDate;
	}

	public void setRequestDate(String requestDate) {
		this.requestDate = requestDate;
	}

	public String getSessionID() {
		return sessionID;
	}

	public void setSessionID(String sessionID) {
		this.sessionID = sessionID;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getBasket() {
		return basket;
	}

	public void setBasket(String basket) {
		this.basket = basket;
	}

}
