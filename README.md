# latitude-exercise-brijesh

## Scenario
Suppose we could access yesterday's stock prices as a list, where:

The indices are the time in minutes past trade opening time, which was 10:00am local time.
The values are the price in dollars of the Latitude Financial stock at that time.
So if the stock cost $5 at 11:00am, stock_prices_yesterday[60] = 5.
Write an efficient function that takes an array of stock prices and returns the best profit I could have made from 1 purchase and 1 sale of 1 Latitude Financial stock yesterday.

For example:
```
var stock_prices_yesterday = [10, 7, 5, 8, 11, 9];
get_max_profit(stock_prices_yesterday)
//returns 6 (buying for $5 and selling for $11)
```
You must buy before you sell. You may not buy and sell in the same time step (at least 1 minute must pass).

Expectations
implement a solution in any language
provide code that runs and prove it works (i.e. show something that can be run / or automated tests)
include any comments that you think will be relevant to provide any context around the approach taken / solution developed

## Solution
This repo presents a solution of the above scenario in Java 8. I have developed it using Gradle and Eclipse.

### Folder structure
The source code resides under *app/src* folder.
*app/src/main/java/com/latitude/exercise* folder has 3 classes:
- `InputValidationExcetion.java` is a custom excetion type for input data (stock prices) validation.
- `StockMarketCalculatorInt.java` has a method `calculateMaxProfit()`, which accepts an array of stock prices in integer data type. The method checks input data and throws an `InputValidationExcetion` with appropriate message if the input data is invalid. For valid data, it calculates and returns maximum profit in integer data type. For the ever falling prices, it also calculates and returns the minimum loss (negative number).
- `StockMarketCalculatorBigDecimal.java` does similar to `StockMarketCalculatorInt.java` but using stock prices with 2 decimal points.

*app/src/test/java/com/latitude/exercise* folder has 3 classes:
- `TestStockMarketCalculatorInt.java` tests `StockMarketCalculatorInt.java` class
- `TestStockMarketCalculatorBigDecimal.java` tests `StockMarketCalculatorBigDecimal.java` class
- `JunitTestSuite.java` makes a test suite of the above two test classes.

### How to compile and run/test functions
The best thing to compile and run/test functions is using a Java IDE (e.g. Eclipse or IntelliJ IDEA). The source code has been developed using Java 8 but should also run in Java 11. Import the source code in IDE as Gradle project and IDE will automatically download required libraries (e.g. JUnit). Run `JunitTestSuite.java` as JUnit Test and it will run total 14 tests (7 + 7). All tests should pass.
