package com.acme.mytrader.price;

public interface PriceSource {
    public int addPriceListener(String security, int[] prices, int minPrice, int volume);
    void removePriceListener(PriceListener listener);
}
