package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        // creates ann instance of the Spring context
        // sending the configuration class as a parameter to instruct Spring to use it
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        // Gets a reference of a bean of type Parrot from the Spring context
        Parrot p = context.getBean("parrot2", Parrot.class);   //
        System.out.println(p.getName());

//        String s = context.getBean(String.class);
//        System.out.println(s);

//        Integer n = context.getBean(Integer.class);
//        System.out.println(n);
    }

}
