package com.money.exchangewebflux.model;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

@Component
public class MoneyConvertor {

	private String from;

	private String to;

	private BigDecimal conversionAmount;

	private String environment;

	private BigDecimal qty;

	private BigDecimal totalAmount;

	public BigDecimal getQty() {
		return qty;
	}

	public void setQty(BigDecimal qty) {
		this.qty = qty;
	}

	public BigDecimal getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

	/**
	 * @return the from
	 */
	public String getFrom() {
		return from;
	}

	/**
	 * @param from the from to set
	 */
	public void setFrom(String from) {
		this.from = from;
	}

	/**
	 * @return the to
	 */
	public String getTo() {
		return to;
	}

	/**
	 * @param to the to to set
	 */
	public void setTo(String to) {
		this.to = to;
	}

	/**
	 * @return the conversionAmount
	 */
	public BigDecimal getConversionAmount() {
		return conversionAmount;
	}

	/**
	 * @param conversionAmount the conversionAmount to set
	 */
	public void setConversionAmount(BigDecimal conversionAmount) {
		this.conversionAmount = conversionAmount;
	}

	/**
	 * @return the environment
	 */
	public String getEnvironment() {
		return environment;
	}

	/**
	 * @param environment the environment to set
	 */
	public void setEnvironment(String environment) {
		this.environment = environment;
	}

	public MoneyConvertor(String from, String to, BigDecimal conversionAmount, BigDecimal qty, BigDecimal totalAmount) {
		super();

		this.from = from;
		this.to = to;
		this.conversionAmount = conversionAmount;
		this.qty = qty;
		this.totalAmount = totalAmount;
	}

	public MoneyConvertor() {
		super();
		// TODO Auto-generated constructor stub
	}

}
