package com.ramkumar;

public class CabTypeManager {

	/**
	 * Validates the given cab types.
	 * Returns true if the specified cab type is valid.
	 * Otherwise returns false. 
	 * @param cabType
	 * @return
	 */
	public static boolean validateCabType(String cabType) {
		String cabTypes[] = {"Micro", "Mini", "Prime"};
		boolean validCabType = false;
		try {
			for (String cab : cabTypes) {
				validCabType = cab.equalsIgnoreCase(cabType.trim());
				if (validCabType) {
					break;
				}
			}
		} catch (Exception e) {
			validCabType = false;
		}
		return validCabType;
	}

	/**
	 * Returns the fare price for given cab type.
	 * @param cabType
	 * @return
	 */
	public static int cabTypeFarePrice(String cabType) {
		cabType = convertToLowerCase(cabType.trim());
		int farePriceForMicroCabPerKilometer = 10;
		int farePriceForMiniCabPerKilometer = 15;
		int farePriceForPrimeCabPerKilometer = 20;
		int farePrice = 0;
			switch (cabType) {
				case "micro":
					farePrice = farePriceForMicroCabPerKilometer;
					break;
				case "mini":
					farePrice = farePriceForMiniCabPerKilometer;
					break;
				case "prime":
					farePrice = farePriceForPrimeCabPerKilometer;
					break;
				default:
					break;
				}
		return farePrice;
	}

	/**
	 * Returns the given cab type to lower case.
	 * @param cabType
	 * @return
	 */
	private static String convertToLowerCase(String cabType) {
		return cabType.toLowerCase();
	}
}