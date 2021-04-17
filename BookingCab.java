package com.ramkumar;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class BookingCab {

	/**
	 * Validates the given card expire date.
	 * @param cardExpiryDate
	 * @param journeyDate
	 * @param pickUpTime
	 * @return
	 */
	public static boolean bookCab(String cardExpiryDate, String journeyDate, String pickUpTime) {
		boolean isValidCard = validateCardExpiryDate(cardExpiryDate);
		return isValidCard;
	}

	/**
	 * Returns true, if the given card expire date is after the current date.
	 * Otherwise returns false.
	 * @param cardExpiryDateString
	 * @return
	 */
	private static boolean validateCardExpiryDate(String cardExpiryDateString) {
		// TODO Auto-generated method stub
		boolean validCard = false;
		try {
			LocalDate cardExpiryDate = LocalDate.parse(cardExpiryDateString);
			LocalDate currentDate = LocalDate.now();
			if (cardExpiryDate.isAfter(currentDate)) {
				validCard = true;
			}
		} catch (DateTimeParseException e) {
			validCard = false;
		}
		return validCard;
	}
	
}
