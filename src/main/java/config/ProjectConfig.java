package config;

import main.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

// we use the @Configuration annotation to define this class
// as a Spring configuration class.
@Configuration
public class ProjectConfig {

    // By adding the @Bean annotation, we instruct Spring to call this method
    // when at context initialization and add the returned value to the context.
    @Bean(value = "koko")
    Parrot parrot1() {
        var p = new Parrot();
        p.setName("Koko");  // Set a name for the parrot we'll use later when we test the app.
        return p;   // Spring adds to its context the Parrot instance returned by the method
    }

    @Bean(name = "miki")    // Sets the name of the bean
    @Primary    // Spring will select Miki by default, so you can refer the Parrot without the specific name
    Parrot parrot2() {
        var p = new Parrot();
        p.setName("Miki");  // Sets the name of the parrot
        return p;
    }

    @Bean("riki")    // Sets the name of the bean
    Parrot parrot3() {
        var p = new Parrot();
        p.setName("Riki");  // Sets the name of the parrot
        return p;
    }

    /*
    @Bean
    String hello() {    // adds the string "Hello" to the Spring context
        return "Hello";
    }

    @Bean
    Integer ten() {     // adds the integer 10 to the Spring context
        return 10;
    }
    */

}
