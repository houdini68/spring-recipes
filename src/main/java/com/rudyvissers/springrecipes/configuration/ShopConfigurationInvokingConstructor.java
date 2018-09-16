package com.rudyvissers.springrecipes.configuration;

import com.rudyvissers.springrecipes.shop.Battery;
import com.rudyvissers.springrecipes.shop.Disc;
import com.rudyvissers.springrecipes.shop.Product;
import com.rudyvissers.springrecipes.shop.ProductAdmin;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
