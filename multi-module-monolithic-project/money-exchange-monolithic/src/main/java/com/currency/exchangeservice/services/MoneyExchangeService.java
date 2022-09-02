package com.currency.exchangeservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.currency.conversion.model.MoneyConvertor;
import com.currency.conversion.repository.MoneyConvertorService;

@Component
public class MoneyExchangeService {

	@Autowired
	MoneyConvertorService moneyConvertorService;

	public MoneyConvertor getMoneyConversionDetailByFromAndTo(String from, String to) throws Exception {
		return moneyConvertorService.getMoneyConversionDetailByFromAndTo(from, to);
	}

}
