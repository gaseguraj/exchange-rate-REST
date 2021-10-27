package com.gsegura.currencyconverter.controller;


import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Size;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gsegura.currencyconverter.model.Currency;
import com.gsegura.currencyconverter.service.CurrencyConversionService;

@RestController
@Validated
@RequestMapping("exchangerate")
public class ConverterController {

	@Autowired
	private CurrencyConversionService currencyConversionService;

	@GetMapping("pair/{source}/{target}/{amount}")
	public Currency getPairConversion(@PathVariable @Size(min = 3, max = 3) String source, 
			@PathVariable @Size(min = 3, max = 3) String target,
			@PathVariable @DecimalMin("0.0") Double amount)  {
			return currencyConversionService.getPairConversion(source, target, amount);
	
	}

	
}
