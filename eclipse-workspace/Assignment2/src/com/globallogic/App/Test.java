package com.globallogic.App;

import java.util.ArrayList;
import java.util.List;

import com.globallogic.Service.EmployeeValidation;
import com.globallogic.model.Employee;

public class Test {

	public static void main(String[] args) {
//		Employee employee=new Employee("Abc", "c");
//		EmployeeValidation empValidation=new EmployeeValidation(employee);
//		try {
//			System.out.println(empValidation.NameValidation());
//		}catch(Exception e) {
//			System.out.println(e.getMessage());
//		}
		Test test= new Test();
		test.fib(1);
		
	}
	public int fib(int n) {
		if (n<=1)
			return n;
		return fib(n-1)+ fib(n-2);
	}
	
}
