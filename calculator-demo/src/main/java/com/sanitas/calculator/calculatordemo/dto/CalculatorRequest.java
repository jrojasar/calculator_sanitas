package com.sanitas.calculator.calculatordemo.dto;

import java.io.Serializable;
import java.util.List;

public class CalculatorRequest implements Serializable {

	private static final long serialVersionUID = 1L;
	
	List<String> numbers;

	public List<String> getNumbers() {
		return numbers;
	}

	public void setNumbers(List<String> numbers) {
		this.numbers = numbers;
	}
}
