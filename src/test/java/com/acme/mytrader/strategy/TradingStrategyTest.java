package com.acme.mytrader.strategy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TradingStrategyTest {
    @Test
    public void testStockPurchased() {
    	int[] prices = {60,100,140,50};
    	TradingStrategy tradingStrategy = new TradingStrategy("IBM", prices, 60, 100);
    	assertEquals(5000, tradingStrategy.stockPurchased());
    }
}
