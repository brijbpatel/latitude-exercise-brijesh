/**
 * 
 */
package com.latitude.exercise;

/**
 * This class calculates profit (or loss) of the day in stock market
 * 
 * @author Brijesh Patel
 */
public class StockMarketCalculatorInt {

	/**
	 * Calculate best profit (or minimum loss) from buy and sell trade during the day
	 * 
	 * @param stockPrices[] Stock prices during the day in array
	 * @throws InputValidationExcetion when data input validation fails
	 */
	public static int calculateMaxProfit(int[] stockPrices)
			throws InputValidationExcetion {
		validateStockPrices(stockPrices);

		int profit = Integer.MIN_VALUE; // start with lowest negative number to
										// calculate minimum loss if stock prices
										// only reduces from trade opening time.
		for (int i = 0; i < stockPrices.length - 1; i++) {
			for (int j = i + 1; j < stockPrices.length; j++) {
				int diff = stockPrices[j] - stockPrices[i];
				if (diff > profit) {
					profit = diff;
				}
			}
		}
		return profit;
	}

	/**
	 * Validates data input against for: null, empty, too many indices, negative value
	 * 
	 * @param stockPrices[] Stock prices during the day in array
	 * @throws InputValidationExcetion when validation fails
	 */
	private static void validateStockPrices(int[] stockPrices)
			throws InputValidationExcetion {
		// Check for null or empty value
		if (stockPrices == null || stockPrices.length == 0) {
			throw new InputValidationExcetion("Null of empty data");
		}

		// Check for too less indices
		if (stockPrices.length < 2) {
			throw new InputValidationExcetion("Too less indices");
		}

		// Check for too many indices
		// Assumption: stock market trading hours between 10:00 to 16:00
		// 6 hours = 360 minutes
		if (stockPrices.length > 360) {
			throw new InputValidationExcetion("Too many indices");
		}

		// Check for negative value
		for (int stockPrice : stockPrices) {
			if (stockPrice < 0) {
				throw new InputValidationExcetion("Negative value");
			}
		}
	}
}
