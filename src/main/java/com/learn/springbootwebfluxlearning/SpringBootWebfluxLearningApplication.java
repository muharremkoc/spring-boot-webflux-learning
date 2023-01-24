package com.learn.springbootwebfluxlearning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;


@SpringBootApplication
@EnableReactiveMongoRepositories
public class SpringBootWebfluxLearningApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootWebfluxLearningApplication.class, args);
    }

}
