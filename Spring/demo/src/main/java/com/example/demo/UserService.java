package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    
    private static List<User> list = new ArrayList<User>();

    static{
        User u = new User(1,"User 1");
        list.add(u);

        u = new User(2,"User 2");
        list.add(u);

        u = new User(3,"User 3");
        list.add(u);
    }


    public List<User> getUserList(){
        return list;
    }

    

}
