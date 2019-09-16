package com.sanitas.calculator.calculatordemo;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sanitas.calculator.calculatordemo.dto.CalculatorRequest;
import com.sanitas.calculator.calculatordemo.dto.CalculatorResponse;
import com.sanitas.calculator.calculatordemo.service.CalculatorService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorDemoApplicationTests {

	@Autowired
	private CalculatorService calculatorService;

	private CalculatorRequest request = new CalculatorRequest();
	private CalculatorResponse response = new CalculatorResponse();

	private List<String> numberspositives = Arrays.asList("20", "58");
	private List<String> numbersnegatives = Arrays.asList("-20", "-58");
	private List<String> numbersposandnega = Arrays.asList("20", "-58");
	private List<String> numbersnegaandpos = Arrays.asList("-20", "58");
	
	@Before
	public void setUp() {
		System.out.println("calculator SETUP");
	}

	@Test
	public void AdditionPositives() throws Exception {

		request.setNumbers(numberspositives);
		response = calculatorService.addition(request);
		assertNotNull(response);
		assertTrue(78 == Integer.valueOf(response.getResult()));
	}
	
	@Test
	public void AdditionNegatives() throws Exception {

		request.setNumbers(numbersnegatives);
		response = calculatorService.addition(request);
		assertNotNull(response);
		assertTrue(-78 == Integer.valueOf(response.getResult()));
	}
	
	@Test
	public void AdditionPositivesNegatives() throws Exception {

		request.setNumbers(numbersposandnega);
		response = calculatorService.addition(request);
		assertNotNull(response);
		assertTrue(-38 == Integer.valueOf(response.getResult()));
	}
	@Test
	public void AdditionNegativesPositives() throws Exception {

		request.setNumbers(numbersnegaandpos);
		response = calculatorService.addition(request);
		assertNotNull(response);
		assertTrue(38 == Integer.valueOf(response.getResult()));
	}
	@Test
	public void SubstractionPositives() throws Exception {

		request.setNumbers(numberspositives);
		response = calculatorService.substraction(request);
		assertNotNull(response);
		assertTrue(-38 == Integer.valueOf(response.getResult()));
	}
	
	@Test
	public void SubstractionNegatives() throws Exception {

		request.setNumbers(numbersnegatives);
		response = calculatorService.substraction(request);
		assertNotNull(response);
		assertTrue(38 == Integer.valueOf(response.getResult()));
	}
	
	@Test
	public void SubstractionPositivesNegatives() throws Exception {

		request.setNumbers(numbersposandnega);
		response = calculatorService.substraction(request);
		assertNotNull(response);
		assertTrue(78 == Integer.valueOf(response.getResult()));
	}
	@Test
	public void SubstractionNegativesPositives() throws Exception {

		request.setNumbers(numbersnegaandpos);
		response = calculatorService.substraction(request);
		assertNotNull(response);
		assertTrue(-78 == Integer.valueOf(response.getResult()));
	}
}