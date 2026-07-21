package com.local.service.provider.communication.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
	
	assertEquals(10, Calculator.add(2, 3));
	}
}
