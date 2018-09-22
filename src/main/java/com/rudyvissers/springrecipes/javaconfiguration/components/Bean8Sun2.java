package com.rudyvissers.springrecipes.javaconfiguration.components;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Bean8Sun2 extends Bean8Father {

    public final String name = "I am a Bean8 sun2!";

    public Bean8Sun2() {
        super();
    }

    @Override
    public String someFunctionnality() {
        return super.someFunctionnality() + " and some func. in Bean8Sun2" ;
    }
}
