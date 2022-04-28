package com.spring.employe.dao;

import com.spring.employe.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
public interface EmployeeDao extends JpaRepository<Employee, Long>{
}
