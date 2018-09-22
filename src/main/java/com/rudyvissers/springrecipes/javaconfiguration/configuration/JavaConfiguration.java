package com.rudyvissers.springrecipes.javaconfiguration.configuration;

import com.rudyvissers.springrecipes.javaconfiguration.beans.Bean1;
import com.rudyvissers.springrecipes.javaconfiguration.beans.Bean2;
import com.rudyvissers.springrecipes.javaconfiguration.beans.Bean3;
import com.rudyvissers.springrecipes.javaconfiguration.beans.Bean4RefBean3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfiguration {

    @Bean
    public Bean1 bean1() {
        return new Bean1("value1", 1);
    }

    @Bean
    public Bean2 bean21() {
        return new Bean2("value21bean2", 2);
    }

    @Bean
    public Bean2 bean22() {
        return new Bean2("value22bean2", 3);
    }

    @Bean
    public Bean2 bean23() {
        return new Bean2("value23bean2", 4);
    }

    @Bean
    public Bean3 bean3() {
        return new Bean3("value3", 5);
    }

    @Bean
    public Bean4RefBean3 bean4() {
        return new Bean4RefBean3("value4", 6, bean3());
    }
}
