package com.ramkumar;

public class OlaApp {

	public static void main(String[] args) {
		
		String mobileNumber = "@#12345678";
		boolean isValidMobileNumber = Login.validateMobileNumber(mobileNumber);
		System.out.println("Is Valid Mobile Number : " + isValidMobileNumber);

		String password = "ramkumar";
		boolean isValidPassword = Login.validatePassword(password);
		System.out.println("Is Valid Password : " + isValidPassword);
		
		boolean isValidUser = Login.login(mobileNumber, password);
		System.out.println("Is Valid User : " + isValidUser);

		String cabType = " micro ";
		boolean isValidCabType = CabTypeManager.validateCabType(cabType);
		System.out.println("Is Valid Cab Type : " + isValidCabType);
		int farePrice;
		if (isValidCabType) {
			farePrice = CabTypeManager.cabTypeFarePrice(cabType);
			System.out.println("Fare Price for " + cabType.trim() + " cab is : " + farePrice);			
		}
		
	}
}
