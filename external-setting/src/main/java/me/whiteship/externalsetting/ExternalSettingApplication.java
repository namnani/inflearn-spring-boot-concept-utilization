package me.whiteship.externalsetting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
// 자동으로 등록이 되어 있다고 한다.
//@EnableConfigurationProperties(KeesunProperties.class)
public class ExternalSettingApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExternalSettingApplication.class, args);
    }

}
