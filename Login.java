package com.ramkumar;

public class Login {
	
	/**
	 * Validates the given mobile number.
	 * Returns true, if the given mobile number is 10 digits.
	 * Otherwise returns false.
	 * @param mobileNumberString
	 * @return 
	 */
	public static boolean validateMobileNumber(String mobileNumberString) {
		boolean validMobileNumber = false;
		try {
			Long mobileNumber = Long.valueOf(mobileNumberString);
			int mobileNumberLength = mobileNumber.toString().trim().length();
			int numberOfDigitsForMobileNumber = 10;
			if(mobileNumberLength == numberOfDigitsForMobileNumber) {
				validMobileNumber = true;
			}
		} catch (NumberFormatException e) {
			validMobileNumber = false;
		}
		return validMobileNumber;
	}

	/**
	 * Validates the given password.
	 * Returns true, if the given password is 8 characters.
	 * Otherwise returns false.
	 * @param password
	 * @return
	 */

	public static boolean validatePassword(String password) {
		boolean validPassword;
		int passwordLength = password.trim().length();
		int numberOfCharactersForPassword = 8;
		if(numberOfCharactersForPassword == passwordLength) {
			validPassword = true;
		}else {
			validPassword = false;			
		}
		return validPassword;
	}

	/**
	 * Validates the given mobile number and password.
	 * Returns true if the given mobile number and password is valid.
	 * Otherwise returns false.
	 * @param mobileNumber
	 * @param password
	 * @return
	 */

	public static boolean login(String mobileNumber, String password) {
		boolean validUser;
		boolean isValidMobileNumber = validateMobileNumber(mobileNumber);
		boolean isValidPassword = validatePassword(password);
		
		if (isValidMobileNumber && isValidPassword) {
			System.out.println("Mobile Number : " + mobileNumber);
			System.out.println("Password : " + password);
			validUser = true;			
		}else {
			validUser = false;
		}
		return validUser;
	}
	
}
