package com.katalearn.leapyearkata;

public class LeapYear {

	public boolean isLeapYear(int year) {

		if (year % 400 == 0)
			return true;
		else
			return false;
	}

}
