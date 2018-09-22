package com.rudyvissers.springrecipes.beans;

import com.rudyvissers.springrecipes.javaconfiguration.beans.Bean1;
import com.rudyvissers.springrecipes.javaconfiguration.beans.Bean2;
import com.rudyvissers.springrecipes.javaconfiguration.configuration.JavaConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {JavaConfiguration.class})
public class Bean2Test {

    @Autowired
    @Qualifier("bean21")
    Bean2 bean21;

    @Autowired
    @Qualifier("bean22")
    Bean2 bean22;

    @Autowired
    @Qualifier("bean23")
    Bean2 bean23;

    @Test
    public void contextLoads() {
        assertThat(bean21).isNotNull();
        assertThat(bean21.getAttribute1()).isEqualTo("value21bean2");
        assertThat(bean21.getAttribute2()).isEqualTo(0);
        assertThat(bean22).isNotNull();
        assertThat(bean22.getAttribute1()).isEqualTo("value22bean2");
        assertThat(bean22.getAttribute2()).isEqualTo(0);
        assertThat(bean23).isNotNull();
        assertThat(bean23.getAttribute1()).isEqualTo("value23bean2");
        assertThat(bean23.getAttribute2()).isEqualTo(0);
    }


}
