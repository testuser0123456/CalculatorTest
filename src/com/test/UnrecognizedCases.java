package com.test;

import com.progress.Calculator;

import junit.framework.Assert;

public class UnrecognizedCases {
	
	private static Calculator calculator = new Calculator();
	
	public void testAddition() {
		Assert.assertEquals(13, calculator.addition(10, 3));
	}
	
	public void testSubstraction() {
		Assert.assertEquals(2, calculator.substraction(5, 3));
	}
	
	public void testMultiplication() {
		Assert.assertEquals(15, calculator.multiplication(5, 3));
	}
	
	public static void main(String args[]) {
		UnrecognizedCases tests = new UnrecognizedCases();
		tests.testAddition();
		tests.testSubstraction();
		tests.testMultiplication();
	}
}
