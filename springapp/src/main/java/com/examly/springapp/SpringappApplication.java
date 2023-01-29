package com.examly.springapp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;

 

@SpringBootApplication
@ComponentScan("controller")
@EnableJpaRepositories("dao")
@EntityScan("model")
public class MovieAppApplication {

 

    public static void main(String[] args) {
        SpringApplication.run(MovieAppApplication.class, args);
    }

 

}