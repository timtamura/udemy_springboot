package com.example.demo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    public CricketCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    // custom init method
    @PostConstruct
    public void doMyStartup() {
        System.out.println("In doMyStartup(): " + getClass().getSimpleName());
    }

    // custom destroy method
    @PreDestroy
    public void doMyCleanup() {
        System.out.println("In doMyCleanup(): " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes.";
    }
}
