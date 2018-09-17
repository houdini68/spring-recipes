package com.rudyvissers.springrecipes.configuration;

import com.rudyvissers.springrecipes.sequence.SequenceGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SequenceGeneratorConfiguration {

    /*
    ** A bean is added to the Spring IoC (inversion of control).
     */
    @Bean
    public SequenceGenerator sequenceGenerator() {
        SequenceGenerator seqgen = new SequenceGenerator();
        seqgen.setPrefix("prefix");
        seqgen.setSuffix("suffix");
        seqgen.setInitial(10000);
        return seqgen;
    }
}
