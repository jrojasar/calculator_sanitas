package com.sanitas.calculator.calculatordemo.service;


import com.sanitas.calculator.calculatordemo.dto.CalculatorRequest;
import com.sanitas.calculator.calculatordemo.dto.CalculatorResponse;


public interface CalculatorService {

	public CalculatorResponse addition(CalculatorRequest calculatorRequest);
	public CalculatorResponse substraction(CalculatorRequest calculatorRequest);

}
