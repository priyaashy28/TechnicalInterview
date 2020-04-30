package com.acme.mytrader.price;

public interface PriceListener {
    public int priceUpdate(String security, int[] prices, int minPrice, int volume);
}
