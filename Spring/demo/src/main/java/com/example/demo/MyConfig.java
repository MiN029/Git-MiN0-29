package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    
    @Bean(name = "myBean")
    public UserService getUser(){
        return new UserService();
    }

}
