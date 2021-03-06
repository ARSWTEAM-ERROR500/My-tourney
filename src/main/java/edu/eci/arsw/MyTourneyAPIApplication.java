package edu.eci.arsw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class MyTourneyAPIApplication {


    public static void main(String[] args) {
        SpringApplication.run(MyTourneyAPIApplication.class, args);
    }
}

