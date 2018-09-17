package com.rudyvissers.springrecipes.configuration;

import com.rudyvissers.springrecipes.shopByConfiguration.Battery;
import com.rudyvissers.springrecipes.shopByConfiguration.Disc;
import com.rudyvissers.springrecipes.shopByConfiguration.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
** A Spring Configuration class.
** The wiring is made in using Java (type safe wiring vs XML wiring).
** Problems should be detected at compile time and not at run time (XML).
 */
@Configuration
public class ShopConfigurationInvokingConstructor {

    @Bean
    public Product aaa() {
        return new Battery("AAA", 2.5, true);
    }

    @Bean
    public Product cdrw() {
        return new Disc("CD-RW", 1.5, 700);
    }

}
