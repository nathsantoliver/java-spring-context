package main;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

// by using the @Component annotation over the class, we instruct Spring
// to create an instance of this class and add it to its context.
@Component
public class Parrot {

    private String name;

    @PostConstruct
    public void init() {
        this.name = "Kiki";
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
