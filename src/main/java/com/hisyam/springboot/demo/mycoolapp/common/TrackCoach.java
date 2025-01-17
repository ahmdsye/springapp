package com.hisyam.springboot.demo.mycoolapp.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class TrackCoach implements Coach{

    public TrackCoach(){
        System.out.println("in " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "track workout";
    }
}
