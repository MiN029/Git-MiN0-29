package com.example.springfirstapp;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class studentController {
    
    @GetMapping(value = "/Student")
    public Student getStudent(){
        return new Student("Monny","Chan");
    }

    @GetMapping(value = "/Student-List")
    public List<Student> getStudentList(){
        
        List<Student> s1 = new ArrayList<Student>();
        s1.add(new Student("Monny", "Chan"));
        s1.add(new Student("Bora", "BoyLoy"));
        s1.add(new Student("Phom", "GangGang"));
        s1.add(new Student("Nuy", "Nuy"));
        s1.add(new Student("Poy", "Pew"));
        
        return s1;
        
    }
    
    @GetMapping("/Student-List/{firstName}/{lastName}/")
    public Student getPathVariableStudent(@PathVariable("firstName") String firstName ,
    		@PathVariable("lastName") String lastName) {
    	return new Student(firstName, lastName);
    }
    
    @GetMapping("/Student-List/Query")
    public Student getPathParamRequest(@RequestParam(name = "firstName") String firstName ,
    		@RequestParam(name = "lastName") String lastName) {
    	return new Student(firstName, lastName);
    }
}
