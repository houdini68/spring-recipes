package com.rudyvissers.springrecipes.javaconfiguration.components;

import org.springframework.stereotype.Component;

//@Component
public class Bean6NotInstantiated {

    private final String attribute1;
    private final Integer attribute2;

    public Bean6NotInstantiated(String attribute1, Integer attribute2) {
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
        return "Bean6NotInstantiated{" +
                "attribute1='" + attribute1 + '\'' +
                ", attribute2=" + attribute2 +
                '}';
    }
}
