package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.Employee;

public interface EmployeeDAO {
	
	int Save (Employee employee);
	
	int Update(Employee employee , int id);
	
	int Delete(int id);
	
	List<Employee> getAll();
	
	Employee getById(int id);
	
}
