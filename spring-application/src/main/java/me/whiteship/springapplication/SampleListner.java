package me.whiteship.springapplication;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
ApplicationListener의 이벤트가 ApplicationContext가 만들어지기 전에 발생하는 거냐, 후에 발생하는 것이냐에 따라서,
등록하는 방법이 조금 달라 질 수 있다.
1. 자동 등록될수 있도록 하거나,
2. 수동 등록해주거나,
 */
@Component
// @Order(1) 어플리케이션러너가 여러개있을때, 실행 순서를 지정해줄수있다. 1등이 빨리실행되는 식으로 이해하면 될듯.
public class SampleListner implements CommandLineRunner/*implements ApplicationRunner*//*implements ApplicationListener<ApplicationStartedEvent>*/ {

    @Override
    public void run(String... args) throws Exception {
        Arrays.stream(args).forEach(System.out::println);
    }

//    // 어떤 빈의 생성자가 한개고, 생성자의 파라미터가 빈일 경우에 빈을 스프링이 알아서 주입해준다.
//    public SampleListner(ApplicationArguments arguments) {
//        System.out.println("foo: " + arguments.containsOption("foo"));
//        System.out.println("bar: " + arguments.containsOption("bar"));
//    }

    //ApplicationRunner의 추상메소드.
//    @Override
//    public void run(ApplicationArguments args) throws Exception {
//        System.out.println("foo: " + args.containsOption("foo"));
//        System.out.println("bar: " + args.containsOption("bar"));
//    }

//    @Override
//    public void onApplicationEvent(ApplicationStartedEvent applicationStartedEvent) {
//        System.out.println("========================");
//        System.out.println("Application is starting");
//        System.out.println("========================");
//    }
}
