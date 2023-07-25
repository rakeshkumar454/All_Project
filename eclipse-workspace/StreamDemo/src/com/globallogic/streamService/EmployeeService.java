package com.globallogic.streamService;

import java.util.ArrayList;
import java.util.Comparator;

import com.globallogic.streamModel.Employee;

public class EmployeeService {
	public void countOfEmpBasedOnDept(ArrayList<Employee>employee) {
		long empcount=employee.stream().filter(s->s.getDept().equals("IT")).count();
		System.out.println(empcount);
	}
	
	public void shortBasedOnAge(ArrayList<Employee>employee) {
		employee.stream().sorted(Comparator.comparingInt(Employee::getAge)).forEach(System.out::println);
	}

}
