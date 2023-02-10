package com.Management.SpringStudentManagement.Repository;

import com.Management.SpringStudentManagement.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student , Long> {

}
