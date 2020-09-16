package me.whiteship.externalsetting;

import com.sun.org.apache.xpath.internal.objects.XString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleRunner implements ApplicationRunner {

//    @Value("${keesun.full-name}")
//    private String name;
//
//    @Value("${keesun.age}")
//    private int age;

    @Value("${nani.name}")
    String nani;

    @Autowired
    KeesunProperties keesunProperties;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("===========");
        System.out.println(keesunProperties.getName());
        System.out.println(keesunProperties.getFullName());
        System.out.println(keesunProperties.getAge());
        System.out.println(keesunProperties.getClass());
        System.out.println(keesunProperties.getSessionTimeout());

        System.out.println(nani);
//        System.out.println(name);
//        System.out.println(age);
        System.out.println("===========");
    }
}
