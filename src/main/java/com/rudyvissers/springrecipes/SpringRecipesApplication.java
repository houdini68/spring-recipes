package com.rudyvissers.springrecipes; // root of the packages

import com.rudyvissers.springrecipes.configuration.SequenceGeneratorConfiguration;
import com.rudyvissers.springrecipes.notscanned.ShoudNotBeInstantiated;
import com.rudyvissers.springrecipes.sequence.SequenceGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
// the scanning must happen in a class above ALL the others
@ComponentScan(basePackageClasses = SequenceGeneratorConfiguration.class) // safe
//@ComponentScan(basePackages = {"com.rudyvissers.springrecipes.sequence"}) // not safe
public class SpringRecipesApplication {

    private static Logger logger = LoggerFactory.getLogger(SequenceGenerator.class); // slf4j

    public static void main(String[] args) {
//        SpringApplication.run(SpringRecipesApplication.class, args);
        ApplicationContext context = SpringApplication.run(SpringRecipesApplication.class, args);
        logger.info("Contains sequenceGenerator " + context.containsBeanDefinition("sequenceGenerator"));
        SequenceGenerator sequenceGenerator = context.getBean(SequenceGenerator.class,"sequenceGenerator");
        logger.info("sequence : " + sequenceGenerator.getSequence());
        logger.info("sequence : " + sequenceGenerator.getSequence());
        logger.info("Contains shoudNotBeInstantiated " + context.containsBeanDefinition("shoudNotBeInstantiated"));
    }
}
