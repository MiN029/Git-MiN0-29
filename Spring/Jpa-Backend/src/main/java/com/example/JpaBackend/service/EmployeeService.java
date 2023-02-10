package com.example.JpaBackend.service;

import com.example.JpaBackend.model.Employee;

import java.util.List;

public interface EmployeeService {
    public Employee saveEmployee(Employee employee);

    public List<Employee> getAllEmployee();

    public Employee getEmployeeById(long id);

    public Employee updateEmployee(Employee employee , long id);

    public void deleteEmployee(long id);
}
