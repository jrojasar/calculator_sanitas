package com.sanitas.calculator.calculatordemo.service.impl;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.sanitas.calculator.calculatordemo.dto.CalculatorRequest;
import com.sanitas.calculator.calculatordemo.dto.CalculatorResponse;
import com.sanitas.calculator.calculatordemo.service.CalculatorService;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class CalculatorServiceImplTest {

	@Autowired
	private CalculatorService calculatorService;

	private CalculatorRequest request = new CalculatorRequest();
	private CalculatorResponse response = new CalculatorResponse();

	private List<String> numberspositives = Arrays.asList("20", "58");
	private List<String> numbersnegatives = Arrays.asList("-20", "-58");
	private List<String> numbersposandnega = Arrays.asList("20", "-58");
	private List<String> numbersnegaandpos = Arrays.asList("-20", "58");

	@BeforeAll
	static void setUp() {
		System.out.println("--------------------");
		System.out.println("calculator SETUP");
	}

	@AfterAll
	static void tearDown() {
		System.out.println("calculator TEAR DOWN");
		System.out.println("--------------------");
	}

	@Test
	@DisplayName("Addition Positives")
	void AdditionPositives() throws Exception {

		request.setNumbers(numberspositives);
		response = calculatorService.addition(request);
		assertNotNull(response);
		assertTrue(78 == Integer.valueOf(response.getResult()));
	}

	@Test
	@DisplayName("Addition Negatives")
	public void AdditionNegatives() throws Exception {

		request.setNumbers(numbersnegatives);
		response = calculatorService.addition(request);
		assertNotNull(response);
		assertTrue(-78 == Integer.valueOf(response.getResult()));
	}

	@Test
	@DisplayName("Addition Positives + Negatives")
	void AdditionPositivesNegatives() throws Exception {

		request.setNumbers(numbersposandnega);
		response = calculatorService.addition(request);
		assertNotNull(response);
		assertTrue(-38 == Integer.valueOf(response.getResult()));
	}

	@Test
	@DisplayName("Addition Negatives + Positives")
	void AdditionNegativesPositives() throws Exception {

		request.setNumbers(numbersnegaandpos);
		response = calculatorService.addition(request);
		assertNotNull(response);
		assertTrue(38 == Integer.valueOf(response.getResult()));
	}

	@Test
	@DisplayName("Substraction Positives")
	void SubstractionPositives() throws Exception {

		request.setNumbers(numberspositives);
		response = calculatorService.substraction(request);
		assertNotNull(response);
		assertTrue(-38 == Integer.valueOf(response.getResult()));
	}

	@Test
	@DisplayName("Substraction Negatives")
	void SubstractionNegatives() throws Exception {

		request.setNumbers(numbersnegatives);
		response = calculatorService.substraction(request);
		assertNotNull(response);
		assertTrue(38 == Integer.valueOf(response.getResult()));
	}

	@Test
	@DisplayName("Substraction Positives - Negatives")
	void SubstractionPositivesNegatives() throws Exception {

		request.setNumbers(numbersposandnega);
		response = calculatorService.substraction(request);
		assertNotNull(response);
		assertTrue(78 == Integer.valueOf(response.getResult()));
	}

	@Test
	@DisplayName("Substraction Negatives - Positives")
	void SubstractionNegativesPositives() throws Exception {

		request.setNumbers(numbersnegaandpos);
		response = calculatorService.substraction(request);
		assertNotNull(response);
		assertTrue(-78 == Integer.valueOf(response.getResult()));
	}

}
