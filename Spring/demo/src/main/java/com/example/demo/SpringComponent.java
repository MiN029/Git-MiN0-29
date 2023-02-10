package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class SpringComponent {
    public String Message(){
        
        String text = "Hello this is from class spring component";
        return text;
    }
}
