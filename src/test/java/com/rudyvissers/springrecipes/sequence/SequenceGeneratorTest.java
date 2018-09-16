package com.rudyvissers.springrecipes.sequence;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SequenceGeneratorTest {

    @Autowired
    SequenceGenerator sequenceGenerator;

    @Test
    public void getSequence() {
        sequenceGenerator.setInitial(1234);
        sequenceGenerator.setPrefix("prefix");
        sequenceGenerator.setSuffix("suffix");
        String sequence = sequenceGenerator.getSequence();
        Assert.assertTrue(sequence.contains("1234"));
        Assert.assertTrue(sequence.contains("prefix"));
        Assert.assertTrue(sequence.contains("suffix"));
    }
}
