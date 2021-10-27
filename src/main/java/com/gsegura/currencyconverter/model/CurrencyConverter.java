package com.gsegura.currencyconverter.model;

public abstract class CurrencyConverter {
	protected Currency source;
	protected Currency target;
	
	public CurrencyConverter(Currency source, Currency target) {
		this.source = source;
		this.target = target;
	}
	
	public abstract void RunPairConversion();
	
	public Currency returnPairConversion() {
		return this.target;		
	}


}
