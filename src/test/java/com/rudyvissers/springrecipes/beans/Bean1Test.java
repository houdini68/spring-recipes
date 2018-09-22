package com.rudyvissers.springrecipes.beans;

import com.rudyvissers.springrecipes.javaconfiguration.beans.Bean1;
import com.rudyvissers.springrecipes.javaconfiguration.configuration.JavaConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {JavaConfiguration.class})
public class Bean1Test {

    @Autowired
    Bean1 bean1;

    @Test
    public void contextLoads() {
        assertThat(bean1).isNotNull();
        assertThat(bean1.getAttribute1()).isEqualTo("value1");
        assertThat(bean1.getAttribute2()).isEqualTo(0);
    }


}
