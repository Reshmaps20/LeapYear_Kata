package com.katalearn.leapyearkata;

public class LeapYear {

	public boolean isLeapYear(int year) {

		return isDivisibleBy(year, 400) || (!isDivisibleBy(year, 100) && isDivisibleBy(year, 4));
	}

	private boolean isDivisibleBy(int year, int divisor) {
		return year % divisor == 0;
	}

}
