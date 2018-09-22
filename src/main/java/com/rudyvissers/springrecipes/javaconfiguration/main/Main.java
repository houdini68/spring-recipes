package com.rudyvissers.springrecipes.javaconfiguration.main;

import com.rudyvissers.springrecipes.javaconfiguration.components.Bean8RefBean8Father;
import com.rudyvissers.springrecipes.javaconfiguration.configuration.JavaConfiguration;
import com.rudyvissers.springrecipes.javaconfiguration.components.Bean5RefBean2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = {JavaConfiguration.class, Bean5RefBean2.class})
public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class); // slf4j

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Main.class, args); // the context is extracted from the SpringBoot application
        logger.info("Contains bean1: " + context.containsBeanDefinition("bean1")); // by Java configuration
        logger.info("Contains bean21: " + context.containsBeanDefinition("bean21")); // by Java configuration
        logger.info("Contains bean22: " + context.containsBeanDefinition("bean22")); // by Java configuration
        logger.info("Contains bean23: " + context.containsBeanDefinition("bean23")); // by Java configuration
        logger.info("Contains bean3: " + context.containsBeanDefinition("bean3")); // by Java configuration~
        logger.info("Contains bean4: " + context.containsBeanDefinition("bean4")); // by Java configuration
        logger.info("Contains bean5RefBean2: " + context.containsBeanDefinition("bean5RefBean2")); // by annotations
        Bean5RefBean2 bean5RefBean2 = context.getBean(Bean5RefBean2.class);
        logger.info("Bean5RefBean2: " + bean5RefBean2);
        logger.info("Contains bean6: " + context.containsBeanDefinition("bean6"));
//        Parameter 0 of constructor in Bean7RefBean6NotInstantiated required a bean of type 'Bean6NotInstantiated' that could not be found.
//                Action:
//        Consider defining a bean of type 'Bean6NotInstantiated' in your configuration.
        logger.info("Contains bean8RefBean8Father: " + context.containsBeanDefinition("bean8RefBean8Father"));
        Bean8RefBean8Father bean8RefBean8Father = context.getBean(Bean8RefBean8Father.class);
        logger.info("The sun name of bean8RefBean8Father is: " + bean8RefBean8Father.getBean8Father().someFunctionnality());
    }
}