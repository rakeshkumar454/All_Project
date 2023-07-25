package com.globallogic.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	Employee findByName(String name);
	
	Employee deleteById(int id);
	
	Employee findByDept(String name);

	
}
