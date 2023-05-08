package com.example.demo.common;

// This class doesn't have @Component unlike other classes.
// Instead, it is configured as a Spring bean using @Bean in SportConfig class.
// @Bean is used for existing third-party class.
public class SwimCoach implements Coach {

    public SwimCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters as a warm up.";
    }
}
