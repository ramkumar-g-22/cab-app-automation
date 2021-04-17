package com.ramkumar;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;

public class DateTimeValidation {

	/**
	 * Validates the given date.
	 * @param journeyDate
	 * @return
	 */
	public static boolean validateDate(String journeyDate) {
		boolean validDate;
		try {
			LocalDate.parse(journeyDate);
			validDate = true;
		} catch (DateTimeParseException e) {
			System.out.println(e);
			validDate = false;
		}
		return validDate;
	}

	/**
	 * Validates the given time.
	 * @param pickUpTime
	 * @return
	 */
	public static boolean validateTime(String pickUpTime) {
		boolean validTime;
		try {
			LocalTime.parse(pickUpTime);
			validTime = true;
		} catch (DateTimeParseException e) {
			validTime = false;
		}
		return validTime;
	}

}
