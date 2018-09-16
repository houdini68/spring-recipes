package com.rudyvissers.springrecipes; // root of the packages

import com.rudyvissers.springrecipes.configuration.SequenceGeneratorConfiguration;
import com.rudyvissers.springrecipes.notscanned.ShoudNotBeInstantiated;
import com.rudyvissers.springrecipes.sequence.SequenceGenerator;
import com.rudyvissers.springrecipes.shop.Product;
import com.rudyvissers.springrecipes.shop.ProductAdmin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
// the scanning must happen in a class above ALL the others
@ComponentScan(basePackageClasses
        = { SequenceGeneratorConfiguration.class, ProductAdmin.class }
        ) // safe
//@ComponentScan(basePackages = {"com.rudyvissers.springrecipes.sequence"}) // not safe
public class SpringRecipesApplication {

    private static Logger logger = LoggerFactory.getLogger(SequenceGenerator.class); // slf4j

    public static void main(String[] args) {

//        SpringApplication.run(SpringRecipesApplication.class, args);

        ApplicationContext context = SpringApplication.run(SpringRecipesApplication.class, args); // the context is extracted from the SpringBoot application

        logger.info("Contains sequenceGenerator " + context.containsBeanDefinition("sequenceGenerator"));
        SequenceGenerator sequenceGenerator = context.getBean("sequenceGenerator",SequenceGenerator.class);
        logger.info("sequence : " + sequenceGenerator.getSequence());
        logger.info("sequence : " + sequenceGenerator.getSequence());

        logger.info("Contains shoudNotBeInstantiated " + context.containsBeanDefinition("shoudNotBeInstantiated"));

        Product aaa = context.getBean("aaa", Product.class);
        logger.info(aaa.toString());

        Product cdrw = context.getBean("cdrw", Product.class);
        logger.info(cdrw.toString());

        ProductAdmin productAdmin = context.getBean("productAdmin", ProductAdmin.class);
        logger.info(productAdmin.toString());
    }
}
