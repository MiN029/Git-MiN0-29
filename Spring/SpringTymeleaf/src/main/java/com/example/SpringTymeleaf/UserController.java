package com.example.SpringTymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    @GetMapping("/iteration")
    public String iteration(Model model){
        List<User> user = new ArrayList<>();
        user.add(new User("Monny" , "Chan" , 21 , "Monnychan.mc@gmail.com.kh" , "ADMIN"));
        user.add(new User("Javi" , "Navi" , 32 , "JaviNavi@gmail.com.kh" , "ADMIN"));
        user.add(new User("Pavi" , "Nuna" , 12 , "PaviNuna@gmail.com.kh" , "READ"));
        user.add(new User("Nalku" , "John" , 99 , "NalkuJohn@gmail.com.kh" , "READ"));
        user.add(new User("John" , "Cena" , 34 , "JohnCena@gmail.com.kh" , "ADMIN"));
        user.add(new User("Naltal" , "KuKu" , 21 , "NaltalKuKu@gmail.com.kh" ,  "READ"));
        user.add(new User("Monny" , "Chan" , 26 , "Monnychan.mc@gmail.com.kh" , "ADMIN"));
        model.addAttribute("user",user);
        return "iteration";
    }

}
