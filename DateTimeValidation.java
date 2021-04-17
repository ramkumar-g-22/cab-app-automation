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

	/**
	 * Checks the date of birth.
	 * Returns true if the given date of birth is before current date.
	 * Otherwise returns false.
	 * @param dateOfBirthString
	 * @return
	 */
	public static boolean validateDateOfBirth(String dateOfBirthString) {
		boolean validDateOfBirth = false;
		try {
			LocalDate currentDate = LocalDate.now();
			LocalDate dateOfBirth = LocalDate.parse(dateOfBirthString);
			if (dateOfBirth.isBefore(currentDate)) {
				validDateOfBirth = true;
			}
		} catch (DateTimeParseException e) {
			validDateOfBirth = false;
		}
		return validDateOfBirth;
	}
	
	/**
	 * Calculates the age for the given date of birth.
	 * @param dateOfBirthString
	 * @return
	 */
	public static byte calculateAge(String dateOfBirthString) {
		LocalDate currentDate = LocalDate.now();
		LocalDate dateOfBirth = LocalDate.parse(dateOfBirthString);
		byte age = (byte) (currentDate.getYear() - dateOfBirth.getYear() );
		return age;
	}


}
