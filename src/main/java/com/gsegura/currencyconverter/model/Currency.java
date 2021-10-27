package com.gsegura.currencyconverter.model;

import org.springframework.stereotype.Component;

@Component
public class Currency {
	private String currency;
	private Double amount;
	
	public Currency() {
		this.currency = null;
		this.amount = 0.00;
	}
	
	public Currency(String currency) {
		this.currency = currency;
		this.amount = 0.00;
	}
	
	public Currency(String currency, Double amount) {
		this.currency = currency;
		this.amount = amount;
	}
	
	public String getCurrency() {
		return currency;
	}
	
	public double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return "Currency [currency=" + currency + ", amount=" + amount + "]";
	}	
}
