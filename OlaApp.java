package com.ramkumar;

import java.time.LocalDate;
import java.time.LocalTime;

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
		
		int kilometer = 10;
		int totalFarePriceWithoutGST = PriceEstimator.calculateTotalFarePriceWithoutGST(cabTypeFarePrice, kilometer);
		System.out.println("Total Fare Price Without GST : " + totalFarePriceWithoutGST);

		double totalFarePriceWithGST = GSTCalculator.calculateTotalFarePriceWithGST(totalFarePriceWithoutGST);
		System.out.println("Total Fare Price With GST : " + totalFarePriceWithGST);
			
		String journeyDateString = "2021-04-20";
		boolean isValidDate = DateTimeValidation.validateDate(journeyDateString);
		System.out.println("Is Valid Date : " + isValidDate);
		String pickUpTimeString = "05:22";
		boolean isValidTime = DateTimeValidation.validateTime(pickUpTimeString);
		System.out.println("Is Valid Time : " + isValidTime);

		String cardExpiryDate = "2021-06-20";
		if (isValidDate && isValidTime) {
			boolean isBooked = BookingCab.bookCab(cardExpiryDate, journeyDateString, pickUpTimeString);
			if (isBooked) {
				System.out.println("🛺🛺🛺 Your Ride is booked ✔✔✔");
				System.out.println("Journey Date : " + journeyDateString);
				System.out.println("PickUp Time : " + pickUpTimeString);				
			}else {
				System.out.println("Not a valid card");
			}
		}
		
		if (isValidTime) {
			LocalTime pickUpTime = LocalTime.parse(pickUpTimeString);
			double totalFarePriceAtPeakTime = PriceEstimator.calculateTotalFareAtPeakTime(pickUpTime, totalFarePriceWithGST, kilometer);
			System.out.println("Total Fare Price at peak time : " + totalFarePriceAtPeakTime);
		}

		String dateOfBirthString = "1900-04-17";
		boolean isValidDateOfBirth = DateTimeValidation.validateDateOfBirth(dateOfBirthString);
		System.out.println("Is Valid DoB : " + isValidDateOfBirth);
		if (isValidDateOfBirth) {
			byte age = DateTimeValidation.calculateAge(dateOfBirthString);
			System.out.println("Age : " + age);
			if (age > 60) {
				double totalFareForSeniorCitizen = PriceEstimator.calculateTotalFareForSeniorCitizen(totalFarePriceWithGST);
				System.out.println("Total Fare for Senior Citizen : " + totalFareForSeniorCitizen);
			}
		}
	}
}
