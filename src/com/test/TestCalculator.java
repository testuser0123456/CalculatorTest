package com.test;

import org.junit.Test;

import com.progress.Calculator;

import junit.framework.Assert;

public class TestCalculator {
	
	private static Calculator calculator = new Calculator();
	
	@Test
	public void testAddition() {
		Assert.assertEquals(13, calculator.addition(10, 3));
	}
	
	@Test
	public void testSubstraction() {
		Assert.assertEquals(2, calculator.substraction(5, 3));
	}
	
	@Test
	public void testMultiplication() {
		Assert.assertEquals(15, calculator.multiplication(5, 3));
	}

}
