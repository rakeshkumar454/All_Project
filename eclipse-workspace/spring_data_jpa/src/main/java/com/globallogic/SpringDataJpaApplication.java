package com.globallogic;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.globallogic.dao.EmployeeRepository;
import com.globallogic.entity.Employee;

@SpringBootApplication
public class SpringDataJpaApplication implements CommandLineRunner {

	@Autowired
	EmployeeRepository employeeRepo;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Employee employee=new Employee();
		employee.setId(3);
		employee.setName("Rahul");
		employee.setDept("IT");
		employee.setAge(24);
		employee.setSalary(60000);
		employeeRepo.save(employee);
		
		
		System.out.println("Inserted...");
		List<Employee> employees = employeeRepo.findAll();
		employees.forEach(System.out::println);
		
		System.out.println("-----Find By id------");
		Employee emp = employeeRepo.findById(1).get();
		System.out.println(emp);
		
		System.out.println("-----Find By Name------");
		Employee emp1=employeeRepo.findByName("Rakesh");
		System.out.println(emp1);
		
	
		System.out.println("-----Delete By Id----------");
//		Employee emp2=employeeRepo.deleteById(2);
//		System.out.println(emp2);
		
		List<Employee> employees1 = employeeRepo.findAll();
		employees1.forEach(System.out::println);
		
		System.out.println("======Find By Dept=======");
		Employee emp3 = employeeRepo.findByDept("IT");
		System.out.println(emp3);
	}

}
