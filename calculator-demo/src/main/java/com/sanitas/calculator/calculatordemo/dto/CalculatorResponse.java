package com.sanitas.calculator.calculatordemo.dto;

public class CalculatorResponse {
	String result;

	
	public CalculatorResponse() {
		super();
	}

	public CalculatorResponse(String result) {
		super();
		this.result = result;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
	
	public void setResult(int result) {
		this.result = Integer.toString(result);
	}
}
