package com.rudyvissers.springrecipes.sequence;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.atomic.AtomicInteger;

/*
** nothing special here, but it is NOT annotated by Component!
** the creation is part of SequenceGeneratorConfiguration
 */
public class SequenceGenerator {

    private static Logger logger = LoggerFactory.getLogger(SequenceGenerator.class);
    private final AtomicInteger counter = new AtomicInteger();
    private String prefix;
    private String suffix;
    private int initial;

    public SequenceGenerator() {
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public void setInitial(int initial) {
        this.initial = initial;
    }

    public String getSequence() {
        logger.info("generation of a sequence");
        StringBuilder builder = new StringBuilder();
        builder.append(prefix)
                .append(initial)
                .append(counter.getAndIncrement())
                .append(suffix);
        return builder.toString();
    }
}
