package com.ramkumar;

import java.time.LocalTime;

public class PriceEstimator {

	/**
	 * Calculating the total fare price without GST for given cab type.
	 * @param cabTypeFarePrice
	 * @param kilometer
	 * @return Returns the total fare price.
	 */
	public static int calculateTotalFarePriceWithoutGST(int cabTypeFarePrice, int kilometer) {
		int totalFarePrice = cabTypeFarePrice * kilometer;
		return totalFarePrice;
	}

	/**
	 * Calculates total fare price at peak time.
	 * @param pickUpTime
	 * @param totalFarePriceWithGST
	 * @return
	 */
	public static double calculateTotalFareAtPeakTime(LocalTime pickUpTime, double totalFarePriceWithGST, int kilometer) {
		int hour = pickUpTime.getHour();
		double peakTimeFarePercentagePerKilometer = 1.25;
		double farePriceAtPeakTime;
		double totalFarePriceAtPeakTime;
		if(hour >= 5 && hour <= 7) {
			farePriceAtPeakTime = (totalFarePriceWithGST * (peakTimeFarePercentagePerKilometer * kilometer)) / 100.0;
			totalFarePriceAtPeakTime = totalFarePriceWithGST + farePriceAtPeakTime;
			return totalFarePriceAtPeakTime;
		}else {
			return totalFarePriceWithGST;			
		}
	}

}
