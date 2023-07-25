package com.globallogic.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.globallogic.model.Employee;

public class EmployeeList {

	public static void main(String[] args) {

		// Create the object of ArrayList of generic type 'Employee'.
		List<Employee> emplist = new ArrayList<Employee>();

		Employee emp1 = new Employee(23, "Rahul", 23, "Hr", 32000);
		Employee emp2 = new Employee(12, "Babai", 27, "Hr", 45000);
		Employee emp3 = new Employee(2, "Sagnik", 32, "Hr", 56000);
		Employee emp4 = new Employee(17, "Kunal", 34, "Hr", 34000);
		Employee emp5 = new Employee(37, "Dev", 21, "Hr", 23000);

		// Add Employee object to the list
		emplist.add(emp1);
		emplist.add(emp2);
		emplist.add(emp3);
		emplist.add(emp4);
		emplist.add(emp5);

		// After adding print the normal list
		for (Employee employee : emplist) {
			System.out.println("After adding element to the list: " + employee);
		}

		System.out.println();
		System.out.println();

		Collections.sort(emplist, new Comparator<Employee>() {

			public int compare(Employee t, Employee t1) {
				int comp = t.getName().compareTo(t1.getName());
				if (comp != 0) { // names are different
					return comp;
				}
				return t1.getAge() - t.getAge();
			}
		});
		System.out.println("------------------Sorting By Name ------------");
		System.out.println();
		for (Employee employee : emplist) {

			System.out.println("After Sorting By the Name : " + employee);
		}

		System.out.println();
		System.out.println();

		// Comparator for Age

		class AgeComparator implements Comparator<Employee> {

			@Override
			public int compare(Employee e1, Employee e2) {

				if (e1.getAge() == e2.getAge()) {

					return 0;
				} else if (e1.getAge() > e2.getAge()) {
					return 1;
				} else {

					return -1;
				}

			}

		}

		System.out.println("------------------Sorting By Age ------------");
		System.out.println();

		Collections.sort(emplist, new AgeComparator());

		for (Employee employee : emplist) {

			System.out.println("After Sorting By the Age : " + employee);
		}

		// Comparator for salary

		class SalaryComparator implements Comparator<Employee> {

			@Override
			public int compare(Employee e1, Employee e2) {

				if (e1.getSalary() == e2.getSalary()) {

					return 0;
				} else if (e1.getSalary() < e2.getSalary()) {
					return 1;
				} else {

					return -1;
				}

			}

		}
		System.out.println();

		System.out.println("------------------Sorting By Salary ------------");
		System.out.println();

		Collections.sort(emplist, new SalaryComparator());

		for (Employee employee : emplist) {

			System.out.println("After Sorting By the Salary : " + employee);
		}

	}

}
