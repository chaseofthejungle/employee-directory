package com.cotj.springboot.employeedirectoryapp.service;

import java.util.List;

import com.cotj.springboot.employeedirectoryapp.entity.Employee;

public interface EmployeeService {

	List<Employee> findAll();
	
	Employee findById(int theId);
	
	void save(Employee theEmployee);
	
	void deleteById(int theId);
	
}
