package com.example.JpaBackend.service.Impl;

import com.example.JpaBackend.exception.ResourceNotFoundException;
import com.example.JpaBackend.model.Employee;
import com.example.JpaBackend.repository.EmployeeRepository;
import com.example.JpaBackend.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployee() {

        return employeeRepository.findAll();

    }

    @Override
    public Employee getEmployeeById(long id) {
        Optional<Employee> employee = employeeRepository.findById(id);
        if (employee.isPresent()){
            return employee.get();
        }
        else {
            throw new ResourceNotFoundException("Employee" , "ID" , id);
        }
    }

    @Override
    public Employee updateEmployee(Employee employee, long id) {
        Employee exitingEmployee = employeeRepository.findById(id).orElseThrow(
                () ->new ResourceNotFoundException("Employee", "ID" , id));

        exitingEmployee.setFirstName(employee.getFirstName());
        exitingEmployee.setLastName(employee.getLastName());
        exitingEmployee.setEmail(employee.getEmail());

        employeeRepository.save(exitingEmployee);
        return exitingEmployee;
    }

    @Override
    public void deleteEmployee(long id) {

        employeeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee","ID",id));

        employeeRepository.deleteById(id);
    }
}
