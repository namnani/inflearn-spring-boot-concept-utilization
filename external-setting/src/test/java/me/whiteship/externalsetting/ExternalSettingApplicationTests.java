package me.whiteship.externalsetting;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.*;

@RunWith(SpringRunner.class)
@TestPropertySource(locations = "classpath:/test.properties")
//@TestPropertySource(properties = {"keesun.name=namnani3", "keesun.name=nani2"})
@SpringBootTest
//@SpringBootTest(properties = "keesun.name=namnani1" )
public class ExternalSettingApplicationTests {

    @Autowired
    Environment environment;

    @Test
    public void contextLoads() {
        assertThat(environment.getProperty("keesun.name"))
                .isEqualTo("nani2");
    }

}
