package com.JpqlCodingChelange.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.JpqlCodingChelange.entity.Department;
import com.JpqlCodingChelange.entity.Employee;

import java.util.List;

public interface DepartmentRepo extends JpaRepository<Department,Integer> {
	
	@Query("SELECT d FROM Department d WHERE d.departmentName = :departmentName")
    List<Department> findByDepartmentName(String departmentName);
	
	 
}
