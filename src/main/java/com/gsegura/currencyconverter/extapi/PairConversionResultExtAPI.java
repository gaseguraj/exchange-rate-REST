package com.gsegura.currencyconverter.extapi;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.gsegura.currencyconverter.model.AbstractPairConversionResult;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PairConversionResultExtAPI extends AbstractPairConversionResult {
	@JsonProperty("base_code")
	private String source;
	
	@JsonProperty("target_code")
	private String target;
	
	@JsonProperty("conversion_rate")
	private double conversionRate;
	
	@JsonProperty("conversion_result")
	private double conversionResult;
	
	@JsonProperty("result")
	private String result;
	
	@JsonProperty("error-type")
	private String error;


	@Override
	public String getConversionResult() {
		return this.result;
	}


	public String getSource() {
		return source;
	}


	public void setSource(String source) {
		this.source = source;
	}


	public String getTarget() {
		return target;
	}


	public void setTarget(String target) {
		this.target = target;
	}


	public double getConversionRate() {
		return conversionRate;
	}


	public void setConversionRate(double conversionRate) {
		this.conversionRate = conversionRate;
	}


	public String getResult() {
		return result;
	}


	public void setResult(String result) {
		this.result = result;
	}


	public String getError() {
		return error;
	}


	public void setError(String error) {
		this.error = error;
	}


	public void setConversionResult(double conversionResult) {
		this.conversionResult = conversionResult;
	}
	
	

}
