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
		int cabTypeFarePrice = 0;
		if (isValidCabType) {
			cabTypeFarePrice = CabTypeManager.cabTypeFarePrice(cabType);
			System.out.println("Fare Price for " + cabType.trim() + " cab per kilometer is : " + cabTypeFarePrice);			
		}
		
		int kilometer = 8;
		int totalFarePriceWithoutGST = PriceEstimator.calculateTotalFarePriceWithoutGST(cabTypeFarePrice, kilometer);
		System.out.println("Total Fare Price Without GST : " + totalFarePriceWithoutGST);

		double totalFarePriceWithGST = GSTCalculator.calculateTotalFarePriceWithGST(totalFarePriceWithoutGST);
		System.out.println("Total Fare Price With GST : " + totalFarePriceWithGST);
			
		String journeyDate = "2021-04-20";
		boolean isValidDate = DateTimeValidation.validateDate(journeyDate);
		System.out.println("Is Valid Date : " + isValidDate);
		String pickUpTime = "22:22";
		boolean isValidTime = DateTimeValidation.validateTime(pickUpTime);
		System.out.println("Is Valid Time : " + isValidTime);

		String cardExpiryDate = "2021-06-20";
		if (isValidDate && isValidTime) {
			boolean isBooked = BookingCab.bookCab(cardExpiryDate, journeyDate, pickUpTime);
			if (isBooked) {
				System.out.println("🛺🛺🛺 Your Ride is booked ✔✔✔");
				System.out.println("Journey Date : " + journeyDate);
				System.out.println("PickUp Time : " + pickUpTime);				
			}else {
				System.out.println("Not a valid card");
			}
		}
	}
}
