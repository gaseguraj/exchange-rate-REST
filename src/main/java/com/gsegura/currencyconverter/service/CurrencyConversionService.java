package com.gsegura.currencyconverter.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.gsegura.currencyconverter.extapi.ConvertCurrencyExtApi;
import com.gsegura.currencyconverter.model.Currency;
import com.gsegura.currencyconverter.model.CurrencyConverter;

@Component
public class CurrencyConversionService {
	
	Logger logger = LoggerFactory.getLogger(CurrencyConversionService.class);
	
	public Currency getPairConversion(String source, String target, Double amount) {
		Currency currencySource = new Currency(source, amount);
		Currency currencyTarget = new Currency(target);
		logger.debug("Source:  " + currencySource);
		logger.debug("Target:  " + currencyTarget);
		CurrencyConverter converterPairAPi = new ConvertCurrencyExtApi(currencySource, currencyTarget);
		converterPairAPi.RunPairConversion();
		return converterPairAPi.returnPairConversion();
	}

}
