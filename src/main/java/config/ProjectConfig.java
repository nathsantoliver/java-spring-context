package config;

import main.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// we use the @Configuration annotation to define this class
// as a Spring configuration class.
@Configuration
public class ProjectConfig {

    // By adding the @Bean annotation, we instruct Spring to call this method
    // when at context initialization and add the returned value to the context.
    @Bean
    Parrot parrot() {
        var p = new Parrot();
        p.setName("Koko");  // Set a name for the parrot we'll use later when we test the app.
        return p;   // Spring adds to its context the Parrot instance returned by the method
    }

    @Bean
    String hello() {    // adds the string "Hello" to the Spring context
        return "Hello";
    }

    @Bean
    Integer ten() {     // adds the integer 10 to the Spring context
        return 10;
    }

}
