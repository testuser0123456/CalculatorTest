package com.test;

import com.progress.Calculator;

import junit.framework.Assert;

public class UnrecognizedCases {
	
	private static Calculator calculator = new Calculator();
	
	public void testAddition() {
		System.out.println("##teamcity[testStarted name='testAddition']");
		Assert.assertEquals(13, calculator.addition(10, 3));
		System.out.println("##teamcity[testFinished name='testAddition']");
	}
	
	public void testSubstraction() {
		System.out.println("##teamcity[testStarted name='testSubstraction']");
		Assert.assertEquals(2, calculator.substraction(5, 3));
		System.out.println("##teamcity[testFinished name='testSubstraction']");
	}
	
	public void testMultiplication() {
		System.out.println("##teamcity[testStarted name='testMultiplication']");
		Assert.assertEquals(15, calculator.multiplication(5, 3));
		System.out.println("##teamcity[testFinished name='testSubstraction']");
	}
	
	public static void main(String args[]) {
		UnrecognizedCases tests = new UnrecognizedCases();
		tests.testAddition();
		tests.testSubstraction();
		tests.testMultiplication();
	}
}
