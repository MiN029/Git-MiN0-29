package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{
	
	@Autowired
	JdbcTemplate jdbc;
	
	@Override
	public int Save(Employee employee) {
		return jdbc.update("INSERT INTO tbl_employees (name , email , department) VALUES (? , ? , ?)",
				new Object[] {employee.getName() , employee.getEmail() , employee.getDepartment()});
	}

	@Override
	public int Update(Employee employee, int id) {

		return jdbc.update("UPDATE tbl_employees SET name=?,email=?,department=? WHERE id=?",
				new Object[] {employee.getName() , employee.getEmail() , employee.getDepartment(), id});
	}

	@Override
	public int Delete(int id) {
		return jdbc.update("DELETE FROM tbl_employees WHERE id = ?",id);
	}

	@Override
	public List<Employee> getAll() {
		List<Employee> result = jdbc.query("SELECT * FROM tbl_employees", new BeanPropertyRowMapper<Employee>(Employee.class));
		return result;
	}

	@Override
	public Employee getById(int id) {
		return jdbc.queryForObject("SELECT * FROM tbl_employees WHERE id = ?", new BeanPropertyRowMapper<Employee>(Employee.class) , id);
	}
	
}
