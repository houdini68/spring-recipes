package com.rudyvissers.springrecipes.shop;

public class Battery extends Product {

    private final boolean rechargeable;

    public Battery(String name, double price, boolean rechargeable) {
        super(name, price);
        this.rechargeable = rechargeable;
    }
}
