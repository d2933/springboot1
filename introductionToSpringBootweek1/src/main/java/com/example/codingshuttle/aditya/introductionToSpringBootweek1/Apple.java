package com.example.codingshuttle.aditya.introductionToSpringBootweek1;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


public class Apple {

    void eatApple()
    {
        System.out.println("I am eating the apple");
    }
    @PostConstruct
    void CallthisbeforeUsingBean()
    {
        System.out.println("I am Created before i am in use");
    }

    @PreDestroy
    void PreDestroyingBean()
    {
        System.out.println("Bean is getting destroyed ");
    }
}
