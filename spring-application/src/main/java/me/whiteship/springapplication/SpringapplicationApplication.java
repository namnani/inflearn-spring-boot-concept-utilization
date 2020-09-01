package me.whiteship.springapplication;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringapplicationApplication {

    public static void main(String[] args) {

        // SpringApplication을 customizing 하기 위해서는
        // 1. StringApplication 인스턴스를 만들거나,
        // 2. StringApplicationBuilder를 이용하여야 한다.

        SpringApplication application = new SpringApplication(SpringapplicationApplication.class);
        application.setWebApplicationType(WebApplicationType.NONE);
//        application.addListeners(new SampleListner());
        application.run(args);


//        new SpringApplicationBuilder()
//                .sources(SpringapplicationApplication.class)
//                .listeners(new SampleListner())
//                .run(args);

//        SpringApplication springApplication = new SpringApplication(SpringapplicationApplication.class);
//
//        // 코드로 배너 설정과, txt로 배너설정이 공존하면 txt파일이 우선순위가 더 높아서 이긴다.
//        springApplication.setBanner((environment, sourceClass, out) -> {
//          out.println("=============");
//          out.println("namnani");
//          out.println("=============");
//        });
////        springApplication.setBannerMode(Banner.Mode.OFF);
//        springApplication.run(args);

    }

}
