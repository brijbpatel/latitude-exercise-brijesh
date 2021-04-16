package com.latitude.exercise;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
	StockMarketCalculatorIntTest.class,
	StockMarketCalculatorBigDecimalTest.class
})

public class JunitTestSuite {   
}
