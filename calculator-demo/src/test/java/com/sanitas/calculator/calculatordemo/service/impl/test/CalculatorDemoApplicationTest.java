package com.sanitas.calculator.calculatordemo.service.impl.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.sanitas.calculator.calculatordemo.dto.CalculatorRequest;
import com.sanitas.calculator.calculatordemo.dto.CalculatorResponse;
import com.sanitas.calculator.calculatordemo.service.CalculatorService;

class CalculatorDemoApplicationTest {

	public class CalculatorTests {

		@Autowired
		CalculatorService calculatorService;

		CalculatorRequest request = new CalculatorRequest();
		CalculatorResponse response = new CalculatorResponse();

		List<String> numberspositives = Arrays.asList("20", "58");
		List<String> numbersnegatives = Arrays.asList("-20", "-58");
		List<String> numbersposandnega = Arrays.asList("20", "-58");
		List<String> numbersnegaandpos = Arrays.asList("-20", "58");

		@BeforeAll
		void setUp() {
			System.out.println("calculator SETUP");
		}

		@AfterAll
		void tearDown() {
			System.out.println("calculator TEAR DOWN");
			System.out.println("--------------------");
		}

		@Test
		void AdditionPositives() throws Exception {

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
		void AdditionPositivesNegatives() throws Exception {

			request.setNumbers(numbersposandnega);
			response = calculatorService.addition(request);
			assertNotNull(response);
			assertTrue(-38 == Integer.valueOf(response.getResult()));
		}

		@Test
		void AdditionNegativesPositives() throws Exception {

			request.setNumbers(numbersnegaandpos);
			response = calculatorService.addition(request);
			assertNotNull(response);
			assertTrue(38 == Integer.valueOf(response.getResult()));
		}

		@Test
		void SubstractionPositives() throws Exception {

			request.setNumbers(numberspositives);
			response = calculatorService.substraction(request);
			assertNotNull(response);
			assertTrue(-38 == Integer.valueOf(response.getResult()));
		}

		@Test
		void SubstractionNegatives() throws Exception {

			request.setNumbers(numbersnegatives);
			response = calculatorService.substraction(request);
			assertNotNull(response);
			assertTrue(38 == Integer.valueOf(response.getResult()));
		}

		@Test
		void SubstractionPositivesNegatives() throws Exception {

			request.setNumbers(numbersposandnega);
			response = calculatorService.substraction(request);
			assertNotNull(response);
			assertTrue(78 == Integer.valueOf(response.getResult()));
		}

		@Test
		void SubstractionNegativesPositives() throws Exception {

			request.setNumbers(numbersnegaandpos);
			response = calculatorService.substraction(request);
			assertNotNull(response);
			assertTrue(-78 == Integer.valueOf(response.getResult()));
		}

	}

}
