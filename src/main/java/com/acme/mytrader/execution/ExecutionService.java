package com.acme.mytrader.execution;

public interface ExecutionService {
    public int buy(String security, int price, int volume);
    void sell(String security, double price, int volume);
}
