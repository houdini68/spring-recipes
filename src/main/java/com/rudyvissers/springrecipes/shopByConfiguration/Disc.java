package com.rudyvissers.springrecipes.shopByConfiguration;

public class Disc extends Product {

    private final int capacity;

    public Disc(String name, double price, int capacity) {
        super(name, price);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}
