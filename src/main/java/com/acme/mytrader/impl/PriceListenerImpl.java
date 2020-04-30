package com.acme.mytrader.impl;

import com.acme.mytrader.price.PriceListener;

public class PriceListenerImpl implements PriceListener{

	PriceSourceImpl priceSourceImpl = null;
	
	@Override
	public int priceUpdate(String security, int[] prices, int minPrice, int volume) {
		int stockPurchased = 0;
		try
		{
			priceSourceImpl  = new PriceSourceImpl();
			stockPurchased = priceSourceImpl.addPriceListener(security, prices, minPrice, volume);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return stockPurchased;
		
	}

	
	

}
