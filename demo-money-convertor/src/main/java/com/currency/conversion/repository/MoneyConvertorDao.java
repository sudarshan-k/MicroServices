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
public class MoneyConvertorDao {
	private static Logger logger = LoggerFactory.getLogger(MoneyConvertorDao.class);

	public MoneyConvertor getMoneyConversionDetailByFromAndTo(String from, String to) {

		if (logger.isDebugEnabled()) {
			logger.debug(MoneyConvertorDao.class + "getMoneyConversionDetailByFromAndTo");
		}

		MoneyConvertor moneyConvertor = new MoneyConvertor();
		moneyConvertor.setConversionAmount(new BigDecimal(1.60));
		moneyConvertor.setFrom(from);
		moneyConvertor.setTo(to);

		return moneyConvertor;

	}

}
