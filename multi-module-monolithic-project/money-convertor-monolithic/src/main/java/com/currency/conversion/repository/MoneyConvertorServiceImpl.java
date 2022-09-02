/**
 * 
 */
package com.currency.conversion.repository;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.currency.conversion.model.MoneyConvertor;

@Service
public class MoneyConvertorServiceImpl implements MoneyConvertorService {
	private static Logger logger = LoggerFactory.getLogger(MoneyConvertorServiceImpl.class);

	public MoneyConvertor getMoneyConversionDetailByFromAndTo(String from, String to) throws Exception {

		if (logger.isDebugEnabled()) {
			logger.debug(MoneyConvertorServiceImpl.class + "getMoneyConversionDetailByFromAndTo");
		}

		MoneyConvertor moneyConvertor = new MoneyConvertor();
		moneyConvertor.setConversionAmount(new BigDecimal(1.60));
		moneyConvertor.setFrom(from);
		moneyConvertor.setTo(to);

		return moneyConvertor;

	}

}
