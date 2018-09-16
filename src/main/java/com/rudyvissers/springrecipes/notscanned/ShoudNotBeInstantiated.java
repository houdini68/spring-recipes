package com.rudyvissers.springrecipes.notscanned;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicInteger;

/*
** the following classes should not be instantiated because in the classSpringRecipesApplication
** @ComponentScan(basePackageClasses = SequenceGeneratorConfiguration.class) is used
** it means that ONLY the components under the package of the class SequenceGeneratorConfigurationare scanned
 */
@Component
public class ShoudNotBeInstantiated {

    private static Logger logger = LoggerFactory.getLogger(ShoudNotBeInstantiated.class);

    public String shouldNotBeExecuted() {
        return "do not use me";
    }
}
