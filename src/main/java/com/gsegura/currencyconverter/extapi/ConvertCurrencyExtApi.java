package com.gsegura.currencyconverter.extapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.gsegura.currencyconverter.model.Currency;
import com.gsegura.currencyconverter.model.CurrencyConverter;

@Component
public class ConvertCurrencyExtApi extends CurrencyConverter {

	@Autowired
	private RestTemplate restTemplate;
	
	public ConvertCurrencyExtApi(Currency source, Currency target) {
		super(source, target);
	}
	
	@Override
	public void RunPairConversion() {
		restTemplate = new RestTemplate();

		String url = "https://v6.exchangerate-api.com/v6/cfef5f5c6bdd6411b9da7fb8/pair/" + 
				this.source.getCurrency() + "/" + 
				this.target.getCurrency() + "/" + 
				this.source.getAmount();
		
		PairConversionResultExtAPI resultPairConversoom = restTemplate.getForObject(url, 
				PairConversionResultExtAPI.class);
		
		this.target.setAmount(resultPairConversoom.getConversionRate());
	}
	
	

}
