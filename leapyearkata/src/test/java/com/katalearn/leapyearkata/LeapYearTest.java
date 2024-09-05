package com.katalearn.leapyearkata;

import static org.junit.Assert.*;
import org.junit.Test;

public class LeapYearTest {

	LeapYear leapyear = new LeapYear();

	@Test
	public void testIsLeapYear_check400IsALeapYear_returnTrue() {
		boolean result = leapyear.isLeapYear(400);
		assertTrue(result);
	}

	@Test
	public void testIsLeapYear_check2000IsALeapYear_returnTrue() {
		boolean result = leapyear.isLeapYear(2000);
		assertTrue(result);
	}

	@Test
	public void testIsLeapYear_check1001IsALeapYear_returnFalse() {
		boolean result = leapyear.isLeapYear(1001);
		assertFalse(result);
	}

	@Test
	public void testIsLeapYear_check2100IsALeapYear_returnFalse() {
		LeapYear leapyear = new LeapYear();
		boolean result = leapyear.isLeapYear(2100);
		assertFalse(result);
	}

	@Test
	public void testIsLeapYear_check2005IsALeapYear_returnFalse() {
		boolean result = leapyear.isLeapYear(2005);
		assertFalse(result);
	}

	@Test
	public void testIsLeapYear_check2008IsALeapYear_returnTrue() {
		boolean result = leapyear.isLeapYear(2008);
		assertTrue(result);
	}

	@Test
	public void testIsLeapYear_check2017IsALeapYear_returnFale() {
		boolean result = leapyear.isLeapYear(2017);
		assertFalse(result);
	}
}
