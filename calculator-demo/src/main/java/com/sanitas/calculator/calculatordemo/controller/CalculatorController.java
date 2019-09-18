package com.sanitas.calculator.calculatordemo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sanitas.calculator.calculatordemo.dto.CalculatorRequest;
import com.sanitas.calculator.calculatordemo.dto.CalculatorResponse;
import com.sanitas.calculator.calculatordemo.service.CalculatorService;


@RestController
@EnableAutoConfiguration
@RequestMapping("calculator")
public class CalculatorController {
	
	@Autowired
	private CalculatorService calculatorService;

	@PostMapping(value = "/addition")
	public CalculatorResponse postAddition(@RequestBody CalculatorRequest calculatorRequest)  {
				
		return calculatorService.addition(calculatorRequest);
	}

	@GetMapping(value = "/substraction")
	public CalculatorResponse postSubstraction(@RequestBody CalculatorRequest calculatorRequest)  {
				
		return calculatorService.substraction(calculatorRequest);
	}
}
