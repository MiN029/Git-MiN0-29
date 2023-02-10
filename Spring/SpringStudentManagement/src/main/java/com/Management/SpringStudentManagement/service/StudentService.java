package com.Management.SpringStudentManagement.service;

import com.Management.SpringStudentManagement.entity.Student;

import java.util.List;

public interface StudentService {

    public List<Student> getAllStudents();
    public Student saveStudent(Student student);

    public Student updateStudent(Student student);

    public Student getStudentById(Long id);

    public void deleteStudent(Long id);
}

