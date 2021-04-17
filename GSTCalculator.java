package com.ramkumar;

public class GSTCalculator {
	
	/**
	 * Calculates the GST for the given fare price.
	 * @param totalFarePriceWithoutGST
	 * @return
	 */
	public static double calculateTotalFarePriceWithGST(int totalFarePriceWithoutGST) {
		double totalFarePriceWithGST;
		double GSTPercentage = 7;
		double gstFarePrice;
		gstFarePrice = totalFarePriceWithoutGST * (GSTPercentage / 100.0);
		totalFarePriceWithGST = totalFarePriceWithoutGST + gstFarePrice;
		return totalFarePriceWithGST;
	}
}
