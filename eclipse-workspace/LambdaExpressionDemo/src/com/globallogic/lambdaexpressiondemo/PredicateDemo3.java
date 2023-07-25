package com.globallogic.lambdaexpressiondemo;

import java.util.function.Predicate;

public class PredicateDemo3 {
	public static void main(String[] args) {
		String names[]= {"rahul","karan","sourav","manish","Rakesh","sachin","john"};
		
		
		Predicate<String> p1=(name)->name.startsWith("s");
	
		Predicate<String> p2=(name)->name.contains("a");
		
		System.out.println("============");
		checkCondition(p1, names);
		
		System.out.println("=============");
		checkCondition(p2, names);
		
	}
	static void checkCondition(Predicate<String>p, String[]x) {
		System.out.println("Names display");
		for(String x1:x) {
			if(p.test(x1))
				System.out.print(x1+ " ");
		}
		System.out.println();
	}

}
