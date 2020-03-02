package arsw.mytourneyapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"arsw.mytourney"})
public class MyTourneyAPIApplication {


    public static void main(String[] args) {
        SpringApplication.run(MyTourneyAPIApplication.class, args);
    }
}

