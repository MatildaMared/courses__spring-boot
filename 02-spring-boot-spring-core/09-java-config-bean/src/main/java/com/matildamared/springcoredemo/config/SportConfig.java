package com.matildamared.springcoredemo.config;

import com.matildamared.springcoredemo.common.Coach;
import com.matildamared.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

//    @Bean
//    public Coach swimCoach() {
//        return new SwimCoach();
//    }

    @Bean("aquaticsCoach")
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
