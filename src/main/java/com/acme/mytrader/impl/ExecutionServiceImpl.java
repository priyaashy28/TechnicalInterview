package com.acme.mytrader.impl;

import com.acme.mytrader.execution.ExecutionService;

public class ExecutionServiceImpl implements ExecutionService{

	@Override
	public int buy(String security, int price, int volume) {
		int stockPurchased = 0;
		try
		{
			if(price>0 && volume >0)
			{
				stockPurchased = price * volume;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return stockPurchased;
	}

	@Override
	public void sell(String security, double price, int volume) {
		// TODO Auto-generated method stub
		
	}

}
