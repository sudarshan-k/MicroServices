package com.currency.conversion.repository;

import com.currency.conversion.model.MoneyConvertor;

public interface MoneyConvertorService  {

	public MoneyConvertor getMoneyConversionDetailByFromAndTo(String from, String to) throws Exception;
}