package com.sanitas.calculator.calculatordemo.service.impl;

import org.springframework.stereotype.Service;

import com.sanitas.calculator.calculatordemo.dto.CalculatorRequest;
import com.sanitas.calculator.calculatordemo.dto.CalculatorResponse;
import com.sanitas.calculator.calculatordemo.service.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService {

	@Override
	public CalculatorResponse addition(CalculatorRequest calculatorRequest) {

		int total = 0;
		for (String number : calculatorRequest.getNumbers()) {
			if (total == 0) {
				total = Integer.valueOf(number);
			} else {
				total += Integer.valueOf(number);
			}
		}
		CalculatorResponse result = new CalculatorResponse(Integer.toString(total));
		return result;

	}

	@Override
	public CalculatorResponse substraction(CalculatorRequest calculatorRequest) {
		int total = 0;
		for (String number : calculatorRequest.getNumbers()) {
			if (total == 0) {
				total = Integer.valueOf(number);
			} else {
				total -= Integer.valueOf(number);
			}
		}
		CalculatorResponse result = new CalculatorResponse(Integer.toString(total));
		return result;
	}

}
