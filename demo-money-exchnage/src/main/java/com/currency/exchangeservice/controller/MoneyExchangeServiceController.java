package com.currency.exchangeservice.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.currency.exchangeservice.dto.MoneyConvertorDto;
import com.currency.exchangeservice.dto.MoneyConvertorProxy;

@RestController
@RequestMapping("/api/")
public class MoneyExchangeServiceController {

	@Autowired
	MoneyConvertorProxy moneyConvertorProxy;

	@RequestMapping(value = "/currencyexchangesevicefeign", params = { "from", "to",
			"qty" }, method = RequestMethod.GET)
	public @ResponseBody MoneyConvertorDto getCurreneyConversionDetailByFromAndToForGivenAmountFeign(
			@RequestParam("from") String from, @RequestParam("to") String to, @RequestParam("qty") int qty) {

		MoneyConvertorDto moneyConvertorDto = moneyConvertorProxy
				.getCurreneyConversionDetailByFromAndToForGivenAmountFeign(from, to);

		if (moneyConvertorDto == null) {

			throw new RuntimeException("Could not find conversion detail");
		}

		BigDecimal totalAmount = moneyConvertorDto.getConversionAmount().multiply(BigDecimal.valueOf(qty));
		moneyConvertorDto.setTotalAmount(totalAmount);
		moneyConvertorDto.setConversionQty(BigDecimal.valueOf(qty));

		return moneyConvertorDto;

	}

}
