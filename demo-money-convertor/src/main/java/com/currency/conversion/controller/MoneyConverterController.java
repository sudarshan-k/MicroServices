package com.currency.conversion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.currency.conversion.model.MoneyConvertor;
import com.currency.conversion.repository.MoneyConvertorDao;


@RestController
@RequestMapping("/api/")
public class MoneyConverterController {

	@Autowired
	MoneyConvertorDao moneyConvertorDao;

	@Autowired
	Environment environment;

	@RequestMapping(value = "/currencyconversiondetail", params = { "from", "to" }, method = RequestMethod.GET)
	public @ResponseBody MoneyConvertor getCurreneyConversionDetailByFromAndTo(@RequestParam("from") String from,
			@RequestParam("to") String to) {

		MoneyConvertor moneyConvertor = moneyConvertorDao.getMoneyConversionDetailByFromAndTo(from, to);

		String port = environment.getProperty("local.server.port");
		if (moneyConvertor == null) {

			throw new RuntimeException("Could not find conversion detail");
		}
		moneyConvertor.setEnvironment(port);
		return moneyConvertor;

	}

}
