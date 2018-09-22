package com.rudyvissers.springrecipes.javaconfiguration.components;

import org.springframework.stereotype.Component;

@Component
public class Bean9RefBean8Father {

    private final Bean8Father bean8Father;

    public Bean9RefBean8Father(Bean8Father bean8Father) {
        this.bean8Father = bean8Father;
    }

    public Bean8Father getBean8Father() {
        return bean8Father;
    }
}