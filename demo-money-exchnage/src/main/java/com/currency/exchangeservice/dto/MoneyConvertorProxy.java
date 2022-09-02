package com.currency.exchangeservice.dto;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "money-conversion")
public interface MoneyConvertorProxy {

	@RequestMapping(value = "/api/currencyconversiondetail", params = { "from", "to" })
	public MoneyConvertorDto getCurreneyConversionDetailByFromAndToForGivenAmountFeign(
			@RequestParam("from") String from, @RequestParam("to") String to);

}
