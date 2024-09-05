package com.katalearn.leapyearkata;

import static org.junit.Assert.*;
import org.junit.Test;

public class LeapYearTest {

	@Test
	public void testIsLeapYear_check400IsALeapYear_returnTrue() {
		LeapYear leapyear = new LeapYear();
		boolean result = leapyear.isLeapYear(400);
		assertTrue(result);
	}

}
