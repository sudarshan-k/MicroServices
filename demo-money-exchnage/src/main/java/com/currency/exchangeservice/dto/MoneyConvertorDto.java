package com.currency.exchangeservice.dto;

import java.math.BigDecimal;

public class MoneyConvertorDto {

	private Integer id;
	private String from;
	private String to;
	private BigDecimal conversionAmount;
	private BigDecimal conversionQty;
	private BigDecimal totalAmount;
	private String environment;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
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

	/**
	 * @return the conversionQty
	 */
	public BigDecimal getConversionQty() {
		return conversionQty;
	}

	/**
	 * @param conversionQty the conversionQty to set
	 */
	public void setConversionQty(BigDecimal conversionQty) {
		this.conversionQty = conversionQty;
	}

	/**
	 * @return the totalAmount
	 */
	public BigDecimal getTotalAmount() {
		return totalAmount;
	}

	/**
	 * @param totalAmount the totalAmount to set
	 */
	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

	public MoneyConvertorDto(Integer id, String from, String to, BigDecimal conversionAmount,
			BigDecimal conversionQty, BigDecimal totalAmount, String environment) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionAmount = conversionAmount;
		this.conversionQty = conversionQty;
		this.totalAmount = totalAmount;
		this.environment = environment;
	}

	public MoneyConvertorDto() {
		super();

	}

}
