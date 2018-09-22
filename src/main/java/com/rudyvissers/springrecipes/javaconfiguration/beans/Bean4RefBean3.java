package com.rudyvissers.springrecipes.javaconfiguration.beans;

public class Bean4RefBean3 {

    private final String attribute1;
    private final Integer attribute2;
    private final Bean3 bean3;

    public Bean4RefBean3(String attribute1, Integer attribute2, Bean3 bean3) {
        this.attribute1 = attribute1;
        this.attribute2 = attribute2;
        this.bean3 = bean3;
    }

    public String getAttribute1() {
        return attribute1;
    }

    public Integer getAttribute2() {
        return attribute2;
    }

    public Bean3 getBean3() {
        return bean3;
    }

    @Override
    public String toString() {
        return "Bean4{" +
                "attribute1='" + attribute1 + '\'' +
                ", attribute2=" + attribute2 +
                '}';
    }
}
