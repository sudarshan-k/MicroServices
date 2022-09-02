package com.money.exchangewebflux.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.money.exchangewebflux.model.MoneyConvertor;
import com.money.exchangewebflux.service.MoneyConvertorWebFluxService;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/")
public class MoneyExchangeServiceController {

	@Autowired
	MoneyConvertorWebFluxService moneyConvertorProxy;

	@RequestMapping(value = "/currencyexchangesevicewebflux", params = { "from", "to",
			"qty" }, method = RequestMethod.GET)
	public @ResponseBody Mono<MoneyConvertor> getCurreneyConversionDetailByFromAndToForGivenAmountFeign(
			@RequestParam("from") String from, @RequestParam("to") String to, @RequestParam("qty") int qty)
			throws Exception {

		Mono<MoneyConvertor> moneyConvertorObj = moneyConvertorProxy.getMoneyConversionDetailByFromAndTo(from, to);
		moneyConvertorObj = moneyConvertorObj.map(obj -> {
			obj.setTotalAmount(obj.getConversionAmount().multiply(BigDecimal.valueOf(qty)));
			obj.setQty(BigDecimal.valueOf(qty));
			return obj;
		});

		return moneyConvertorObj;

	}

}
