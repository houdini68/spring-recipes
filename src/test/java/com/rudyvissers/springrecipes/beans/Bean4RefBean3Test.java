package com.rudyvissers.springrecipes.beans;

import com.rudyvissers.springrecipes.javaconfiguration.beans.Bean2;
import com.rudyvissers.springrecipes.javaconfiguration.beans.Bean4RefBean3;
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
public class Bean4RefBean3Test {

    @Autowired
    Bean4RefBean3 bean4RefBean3;

    @Test
    public void contextLoads() {
        assertThat(bean4RefBean3).isNotNull();
        assertThat(bean4RefBean3.getAttribute1()).isEqualTo("value4");
        assertThat(bean4RefBean3.getAttribute2()).isEqualTo(0);
        assertThat(bean4RefBean3.getBean3().getAttribute1()).isEqualTo("value3");
        assertThat(bean4RefBean3.getBean3().getAttribute1()).isEqualTo("value3");
    }


}
