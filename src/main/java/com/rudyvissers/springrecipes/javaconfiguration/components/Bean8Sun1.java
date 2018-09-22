package com.rudyvissers.springrecipes.javaconfiguration.components;

import org.springframework.stereotype.Component;

@Component
public class Bean8Sun1 extends Bean8Father{

    public final String name = "I am a Bean8 sun1!";

    public Bean8Sun1() {
        super();
    }

    @Override
    public String someFunctionnality() {
        return super.someFunctionnality() + " and some func. in Bean8Sun1" ;
    }

}
