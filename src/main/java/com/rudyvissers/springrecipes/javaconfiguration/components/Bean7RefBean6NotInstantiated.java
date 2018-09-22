package com.rudyvissers.springrecipes.javaconfiguration.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bean7RefBean6NotInstantiated {

    private final Bean6NotInstantiated bean6NotInstantiated;

    public Bean7RefBean6NotInstantiated(@Autowired(required = false) Bean6NotInstantiated bean6NotInstantiated1) {
        this.bean6NotInstantiated = bean6NotInstantiated1;
    }

}
