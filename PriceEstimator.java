package com.ramkumar;

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

}
