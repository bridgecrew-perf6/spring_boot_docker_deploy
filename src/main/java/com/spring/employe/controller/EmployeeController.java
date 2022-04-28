package com.spring.employe.controller;

import java.util.List;

import com.spring.employe.model.Employee;
import com.spring.employe.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService empService;

	@RequestMapping(value = "/employees", method = RequestMethod.GET)
	public List<Employee> getEmployees() {
		return empService.getAllEmployees();

	}

	@RequestMapping(value = "/insertEmployee", method = RequestMethod.POST)
	public void insertEmployee(@RequestBody Employee employee) {
		empService.insertEmployee(employee);
	}

}