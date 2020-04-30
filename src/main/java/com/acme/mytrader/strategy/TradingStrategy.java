package com.acme.mytrader.strategy;

import com.acme.mytrader.impl.PriceListenerImpl;

/**
 * <pre>
 * User Story: As a trader I want to be able to monitor stock prices such
 * that when they breach a trigger level orders can be executed automatically
 * </pre>
 */
public class TradingStrategy {
	private String security;
	private int[] prices; 
	private int minPrice;
	private int volume;
	
	PriceListenerImpl priceListernerImpl = null;
	
	public TradingStrategy(String security, int[] prices, int minPrice, int volume)
	{
		this.security = security;
		this.prices = prices;
		this.minPrice = minPrice;
		this.volume = volume;
	}
	
	public int stockPurchased()
	{
		int stockPurchased = 0;
		try
		{
			priceListernerImpl = new PriceListenerImpl();
			stockPurchased = priceListernerImpl.priceUpdate(security, prices, minPrice,volume);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return stockPurchased;
	}

	public String getSecurity() {
		return security;
	}

	public void setSecurity(String security) {
		this.security = security;
	}

	public int[] getPrices() {
		return prices;
	}

	public void setPrices(int[] prices) {
		this.prices = prices;
	}

	public int getMinPrice() {
		return minPrice;
	}

	public void setMinPrice(int minPrice) {
		this.minPrice = minPrice;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	
}
