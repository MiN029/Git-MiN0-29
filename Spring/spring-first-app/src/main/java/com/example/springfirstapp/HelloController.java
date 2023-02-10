package com.example.springfirstapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @GetMapping("/hello")
    public String helloWorld(){
        String text = "Hello I am mony";
        return text;
    }
}
