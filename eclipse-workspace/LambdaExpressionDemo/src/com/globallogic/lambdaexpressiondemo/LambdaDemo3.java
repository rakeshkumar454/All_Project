package com.globallogic.lambdaexpressiondemo;

interface Test{
	void greet();
}

class Test1{
	public static void greetStudent() {
		System.out.println("wlc...");
	}
	public void student() {
		System.out.println("welcome...");
	}
}

public class LambdaDemo3 {
	public static void main(String[] args) {
		Test1 test3= new Test1();
		Test test=Test1::greetStudent;
		test.greet();
		
		Test t2=test3::student;
		t2.greet();
	}

}
