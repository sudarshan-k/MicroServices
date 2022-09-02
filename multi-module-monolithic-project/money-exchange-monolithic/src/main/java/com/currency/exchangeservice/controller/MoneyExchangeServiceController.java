package com.currency.exchangeservice.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.currency.conversion.model.MoneyConvertor;
import com.currency.exchangeservice.dto.MoneyConvertorDto;
import com.currency.exchangeservice.services.MoneyExchangeService;

@RestController
@RequestMapping("/api/")
public class MoneyExchangeServiceController {

	@Autowired
	private MoneyExchangeService moneyExchangeService;

	@Autowired
	Environment environment;

	@RequestMapping(value = "/currencyexchangesevice", params = { "from", "to", "qty" }, method = RequestMethod.GET)
	public @ResponseBody MoneyConvertorDto getCurreneyConversionDetailByFromAndToForGivenAmount(
			@RequestParam("from") String from, @RequestParam("to") String to, @RequestParam("qty") int qty)
			throws Exception {

		MoneyConvertor moneyConvertor = moneyExchangeService.getMoneyConversionDetailByFromAndTo(from, to);
		

		MoneyConvertorDto moneyConvertorDto = new MoneyConvertorDto();

		String port = environment.getProperty("local.server.port");
		if (moneyConvertor == null) {
			throw new RuntimeException("Could not find conversion detail");
		}
		moneyConvertorDto.setConversionAmount(moneyConvertor.getConversionAmount());
		moneyConvertorDto.setEnvironment(port);
		moneyConvertorDto.setFrom(from);
		moneyConvertorDto.setTo(to);
		BigDecimal totalAmount = moneyConvertor.getConversionAmount().multiply(BigDecimal.valueOf(qty));
		moneyConvertorDto.setTotalAmount(totalAmount);
		moneyConvertorDto.setConversionQty(BigDecimal.valueOf(qty));

		return moneyConvertorDto;

	}

}
