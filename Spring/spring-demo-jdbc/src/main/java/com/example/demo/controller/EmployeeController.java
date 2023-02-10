package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.dao.EmployeeDAO;
import com.example.demo.model.Employee;

@RestController
public class EmployeeController{
		
	@Autowired
	private EmployeeDAO empDao;
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployee(){
		return empDao.getAll();
	}
	
	@GetMapping("/employees/{id}")
	public Employee getEmployeeById(@PathVariable int id) {
		return empDao.getById(id);
	}
	
	@RequestMapping("/employees")
	public String saveEmployee(@RequestBody Employee employee) {
		return empDao.Save(employee)+"No. of rows saved to the database";
	}
	
	@PutMapping("/employees/{id}")
	public String updateEmployee(@RequestBody Employee employee , @PathVariable int id) {
		return empDao.Update(employee, id)+"No. of rows updated on the database";
	}
	
	@DeleteMapping("/employees/{id}")
	public String deleteEmployee(@PathVariable int id) {
		return empDao.Delete(id)+ " No. has delete from database";
	}
		
}
