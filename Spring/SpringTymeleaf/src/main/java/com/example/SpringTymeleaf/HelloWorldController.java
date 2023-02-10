package com.example.SpringTymeleaf;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloWorldController {

    @GetMapping("/HelloWorld")
    public String hello(Model model){
        model.addAttribute("Message" , "Hello world");
        return "HelloWorld";
    }

    @GetMapping("/style")
    public String style(Model model){
        return "add-css-js";
    }
}
