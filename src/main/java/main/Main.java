package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        // creates ann instance of the Spring context
        var context = new AnnotationConfigApplicationContext();

        Parrot p = new Parrot();
    }

}
