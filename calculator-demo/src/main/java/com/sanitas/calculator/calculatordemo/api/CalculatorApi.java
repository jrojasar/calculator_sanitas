package com.sanitas.calculator.calculatordemo.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sanitas.calculator.calculatordemo.dto.CalculatorRequest;
import com.sanitas.calculator.calculatordemo.dto.CalculatorResponse;
import com.sanitas.calculator.calculatordemo.service.CalculatorService;


@RestController
@EnableAutoConfiguration
@RequestMapping("calculator")
public class CalculatorApi {
	
	@Autowired
	private CalculatorService calculatorService;

	@RequestMapping(value = "/addition", method = RequestMethod.POST)
	public CalculatorResponse postAddition(@RequestBody CalculatorRequest calculatorRequest)  {
				
		return calculatorService.addition(calculatorRequest);
	}

}
