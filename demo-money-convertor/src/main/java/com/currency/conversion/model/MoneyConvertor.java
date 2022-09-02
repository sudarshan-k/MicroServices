package com.currency.conversion.model;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

@Component
public class MoneyConvertor {

	private String from;

	private String to;

	private BigDecimal conversionAmount;

	private String environment;

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

	public MoneyConvertor(String from, String to, BigDecimal conversionAmount) {
		super();

		this.from = from;
		this.to = to;
		this.conversionAmount = conversionAmount;
	}

	public MoneyConvertor() {
		super();
		// TODO Auto-generated constructor stub
	}

}
