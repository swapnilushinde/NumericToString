package com.org.test;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.org.code.NumberConversion;

public class NumberConversionTest {

	NumberConversion testObject = null;
	
	@Before
	public void beforeClass(){
		testObject = new NumberConversion();
	}
	
	@Test
	// Single digit number test
	public void testSingleDigit() {
		int num = 1;
		String ret = testObject.ConvertNumber(Integer.toString(num), "");
		Assert.assertEquals("One", ret);
		num = 0;
		ret = testObject.ConvertNumber(Integer.toString(num), "");
		Assert.assertEquals("Zero", ret);
	}
	@Test
	// Double digit number test
	public void testDoubleDigit() {
		int num = 13;
		String ret = testObject.ConvertNumber(Integer.toString(num), "");
		Assert.assertEquals("Thirteen", ret);
	}
	@Test
	// Three digit number test
	public void testThreeDigit() {
		int num = 137;
		String ret = testObject.ConvertNumber(Integer.toString(num), "");
		Assert.assertEquals("One Hundreds Thirty Seven", ret);
	}
	@Test
	// Test with multiple zeros in number
	public void testNumbersWithZeros() {
		int num = 700081;
		String ret = testObject.ConvertNumber(Integer.toString(num), "");
		System.out.println(ret);
		Assert.assertEquals("Seven Hundreds  Thousands Eighty One", ret);
	}
	@Test
	// Test with million number
	public void testMillion() {
		int num = 78700081;
		String ret = testObject.ConvertNumber(Integer.toString(num), "");
		System.out.println(ret);
		Assert.assertEquals("Seventy Eight Millions Seven Hundreds  Thousands Eighty One", ret);
	}
	@Test
	// Test with trillion number
	public void testTrillion() {
		int num = 1978700081;
		String ret = testObject.ConvertNumber(Integer.toString(num), "");
		System.out.println(ret);
		Assert.assertEquals("One Trillions Nine Hundreds Seventy Eight Millions Seven Hundreds  Thousands Eighty One", ret);
	}
	
	@After
	public void afterClass(){
		testObject = null;
	}

}
