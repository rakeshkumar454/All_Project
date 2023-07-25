package com.globallogic.model;

public class SavingsAccountTester {

	public static void main(String[] args)
	{
		SavingsAccount savings = new SavingsAccount(1000, 0.10);
		
		savings.withdraw(250);
		
		savings.deposit(400);
		
		savings.addInterest();
		
		System.out.println(savings.getBalance());
		
		System.out.println("Expected: 1265.0");
		
		//1000-250=750 => 750+400=1150 => 1150+1150*0.10=1265.0
	}
}
