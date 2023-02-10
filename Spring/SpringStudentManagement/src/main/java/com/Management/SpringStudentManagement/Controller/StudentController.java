package com.Management.SpringStudentManagement.Controller;

import com.Management.SpringStudentManagement.Repository.StudentRepository;
import com.Management.SpringStudentManagement.entity.Student;
import com.Management.SpringStudentManagement.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class StudentController {

    private StudentService studentService;
    private final StudentRepository studentRepository;

    public StudentController(StudentService studentService,
                             StudentRepository studentRepository) {
        this.studentService = studentService;
        this.studentRepository = studentRepository;
    }

    @GetMapping(value = "/students")
    public String ListStudent(Model model){

        model.addAttribute("students" , studentService.getAllStudents());
        return "Students";

    }

    @GetMapping(value = "/students/new")
    public String createStudentForm(Model model){
        Student student = new Student();
        model.addAttribute("student" , student);
        return "create_student";
    }

    @PostMapping("/add")
    public Student addNewStudent(Student student){
        return studentRepository.save(student);
    }

    @PostMapping(value = "/students")
    public String saveStudent(@ModelAttribute("student") Student student){
        studentService.saveStudent(student);
        return "redirect:students";
    }

    @GetMapping("student/edit/{id}")
    public String updateStudent(@PathVariable("id") Long id , Model model){
        model.addAttribute("student" , studentService.getStudentById(id));
        return "edit_student";
    }

    @PostMapping("/students/{id}")
    public String updateStudent(@PathVariable("id") Long id , @ModelAttribute Student student){
        Student existingStudent = studentService.getStudentById(id);
        existingStudent.setId(id);
        existingStudent.setFirstName(student.getFirstName());
        existingStudent.setLastName(student.getLastName());
        existingStudent.setEmail(student.getEmail());
        studentService.updateStudent(existingStudent);
        return "redirect:/students";
    }

    @GetMapping("/student/{id}")
    public String deleteStudent(@PathVariable("id") Long id){
        studentService.deleteStudent(id);
        return "redirect:/students";
    }

}
