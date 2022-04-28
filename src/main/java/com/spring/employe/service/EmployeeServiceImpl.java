package com.spring.employe.service;

import java.util.List;

import com.spring.employe.dao.EmployeeDao;
import com.spring.employe.model.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

   @Autowired
	private EmployeeDao employeeDao;

	public List<Employee> getAllEmployees() {
		List<Employee> employees = employeeDao.findAll();
		return employees;
	}

	@Override
	public void insertEmployee(Employee employee) {
		employeeDao.save(employee);

	}

}
