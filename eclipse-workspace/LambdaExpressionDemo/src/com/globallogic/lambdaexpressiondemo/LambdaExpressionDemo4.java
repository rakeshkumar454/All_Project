package com.globallogic.lambdaexpressiondemo;

interface C{
	public Employee getEmployee();
}
interface D{
	public Employee getEmployee(String name, int age);
}

class Employee{
	String ename;
	int eage;
	
	public Employee(){

		super();
	}

	public Employee(String ename, int eage) {
		super();
		this.ename = ename;
		this.eage = eage;
	}
	public void getInfo() {
		System.out.println("Im the method of Employee class");
		System.out.println("Name : "+ename);
		System.out.println("Age : "+eage);
	}
	
}
public class LambdaExpressionDemo4 {
	public static void main(String[] args) {
		C c1=()-> new Employee();
//		c1.getEmployee().getInfo();
		D d1=(name, age)-> new Employee(name, age);
		d1.getEmployee("Rakesh", 22).getInfo();
//		
//		C c2 = Employee::new;
//		c2.getEmployee().getInfo();
//		D d2 = Employee::new;
//		d2.getEmployee("Tony", 34).getInfo();
		
	}

}
