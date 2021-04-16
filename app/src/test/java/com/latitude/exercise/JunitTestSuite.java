package com.latitude.exercise;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
	TestStockMarketCalculatorInt.class,
	TestStockMarketCalculatorBigDecimal.class
})

public class JunitTestSuite {   
}
