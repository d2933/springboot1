package com.example.codingshuttle.aditya.introductionToSpringBootweek1;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean
    Apple getApple()
    {
        return  new Apple();
    }
    @Bean
    Car getCar()
    {
        return new Car();
    }
}
