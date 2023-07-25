package com.globallogic.Service;

import com.globallogic.exception.MinimumCharacterException;
import com.globallogic.model.Employee;

public class EmployeeValidation {

	private Employee employee;
	public EmployeeValidation(Employee employee) {
		this.employee=employee;
	}
	public Employee NameValidation() throws NullPointerException, MinimumCharacterException{
		if(employee.getFirstName()==null || employee.getLastName() == null) {
			throw new NullPointerException("Entry mising");
		}
		if(employee.getFirstName().length()<3 || employee.getLastName().length()<3) {
			throw new MinimumCharacterException("Name should be 3 characters");
		}
		return employee;
	}
	
}
