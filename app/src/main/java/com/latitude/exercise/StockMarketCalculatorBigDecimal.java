package com.latitude.exercise;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * This class calculates profit of the day in stock market
 * @author Brijesh Patel
 */
public class StockMarketCalculatorBigDecimal {

	private static final int roundingScale = 2;
	private static final BigDecimal zero = new BigDecimal(0).setScale(roundingScale, RoundingMode.HALF_UP);

	/**
	 * Calculate best profit (or minimum loss) from buy and sell trade during the day
	 * 
	 * @param stockPrices[] Stock prices during the day in array
	 * @throws InputValidationExcetion when data input validation fails
	 */
	public static BigDecimal calculateMaxProfit(BigDecimal[] stockPrices)
			throws InputValidationExcetion {
		validateStockPrices(stockPrices);

		// start with lowest negative number to
		// calculate minimum loss if stock prices
		// only reduces from trade opening time.
		BigDecimal profit = new BigDecimal(Integer.MIN_VALUE).setScale(roundingScale, RoundingMode.HALF_UP);
		for (int i = 0; i < stockPrices.length - 1; i++) {
			for (int j = i + 1; j < stockPrices.length; j++) {
				BigDecimal diff = stockPrices[j].subtract(stockPrices[i]);
				if (diff.compareTo(profit) > 0) {
					profit = diff;
				}
			}
		}
		return profit.setScale(roundingScale, RoundingMode.HALF_UP);
	}

	/**
	 * Validates data input against for: null, empty, too many indices, negative value
	 * 
	 * @param stockPrices[] Stock prices during the day in array
	 * @throws InputValidationExcetion when validation fails
	 */
	private static void validateStockPrices(BigDecimal[] stockPrices)
			throws InputValidationExcetion {
		// Check for null or empty value
		if (stockPrices == null || stockPrices.length == 0) {
			throw new InputValidationExcetion("Null of empty data");
		}
		
		// Check for too many indices
		// Assumption: stock market trading hours between 10:00 to 16:00
		// 6 hours = 360 minutes
		if (stockPrices.length > 360) {
			throw new InputValidationExcetion("Too many indices");
		}
		
		// Check for negative value
		for (BigDecimal stockPrice : stockPrices) {
			if (stockPrice.compareTo(zero) < 0) {
				throw new InputValidationExcetion("Negative value");
			}
		}
	}
}
