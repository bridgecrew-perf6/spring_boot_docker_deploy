package com.spring.employe.service;

import java.util.List;

import com.spring.employe.model.Employee;

public interface EmployeeService {
	List<Employee> getAllEmployees();
	void insertEmployee(Employee employee);
}
