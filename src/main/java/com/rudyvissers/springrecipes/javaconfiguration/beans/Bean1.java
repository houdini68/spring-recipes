package com.rudyvissers.springrecipes.javaconfiguration.beans;

public class Bean1 {

    private final String attribute1;
    private final Integer attribute2;

    public Bean1(String attribute1, Integer attribute2) {
        this.attribute1 = attribute1;
        this.attribute2 = attribute2;
    }

    public String getAttribute1() {
        return attribute1;
    }

    public Integer getAttribute2() {
        return attribute2;
    }

    @Override
    public String toString() {
        return "Bean1{" +
                "attribute1='" + attribute1 + '\'' +
                ", attribute2=" + attribute2 +
                '}';
    }
}
