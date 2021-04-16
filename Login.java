package com.ramkumar;

public class Login {
	public static boolean validateMobileNumber(String mobileNumberString) {
		boolean validMobileNumber = false;
		try {
			Long mobileNumber = Long.valueOf(mobileNumberString);
			int mobileNumberLength = mobileNumber.toString().trim().length();
			int noOfDigitsForMobileNumber = 10;
			if(mobileNumberLength == noOfDigitsForMobileNumber) {
				validMobileNumber = true;
			}
		} catch (NumberFormatException e) {
			validMobileNumber = false;
		}
		return validMobileNumber;
	}

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
