package com.rudyvissers.springrecipes.javaconfiguration.components;

import org.springframework.stereotype.Component;

@Component
public class Bean8RefBean8Father {

    private final Bean8Father bean8Father;

    public Bean8RefBean8Father(Bean8Father bean8Father) {
        this.bean8Father = bean8Father;
    }

    public Bean8Father getBean8Father() {
        return bean8Father;
    }
}