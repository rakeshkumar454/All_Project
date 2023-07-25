package com.globallogic.streamApp;

import java.util.ArrayList;

import com.globallogic.streamModel.Employee;
import com.globallogic.streamService.EmployeeService;

public class EmployeeAp {
	
	public static void main(String[] args) {
		ArrayList <Employee> employee= new ArrayList<>();
		employee.add(new Employee(1,"Rakesh", "Software", 40000, 22));
		employee.add(new Employee(2,"Rahul", "IT", 50000, 27));
		employee.add(new Employee(3,"Alash", "HR", 60000, 24));
		employee.add(new Employee(4,"Ramesh", "IT", 30000, 32));
		employee.add(new Employee(5,"Rupesh", "Hr", 70000, 42));
		employee.add(new Employee(6,"Akash", "IT", 50000, 29));
		
		EmployeeService employees=new EmployeeService();
		
		employees.countOfEmpBasedOnDept(employee);
		employees.shortBasedOnAge(employee);
	}

}
