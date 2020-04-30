package com.acme.mytrader.impl;

import com.acme.mytrader.price.PriceListener;
import com.acme.mytrader.price.PriceSource;

public class PriceSourceImpl implements PriceSource {

	ExecutionServiceImpl executionServiceImpl = null;

	@Override
	public int addPriceListener(String security, int[] prices, int minPrice, int volume) {
		int stockpurchased = 0;
		try
		{
			executionServiceImpl = new ExecutionServiceImpl();
			if(security.equalsIgnoreCase("IBM"))
			{	
			    for(int i=1; i<prices.length; i++){
				   minPrice = Math.min(minPrice, prices[i]);
				}
			    if(minPrice>0)
			    {
			    	stockpurchased = executionServiceImpl.buy(security, minPrice, volume);
			    }
			   
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return stockpurchased;
	}

	@Override
	public void removePriceListener(PriceListener listener) {
		// TODO Auto-generated method stub
		
	}
}
