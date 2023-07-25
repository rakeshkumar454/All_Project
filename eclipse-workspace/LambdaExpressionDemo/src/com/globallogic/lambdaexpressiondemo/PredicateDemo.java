package com.globallogic.lambdaexpressiondemo;

import java.util.function.Predicate;

public class PredicateDemo {
	public static void main(String[] args) {
		int marks[]= {45, 65, 43, 77, 55};
		
		Predicate<Integer> p1=mark->mark>40;
		Predicate<Integer> p2=mark->mark<50;
//		System.out.println("=====marks>40=====");
		checkCondition(p1, marks);
		
//		System.out.println("=====marks<50=====");
		checkCondition(p2, marks);
	}
	static void checkCondition(Predicate<Integer>p, int[]x) {
		System.out.println("Method is called");
		for(int x1:x) {
			if(p.test(x1))
				System.out.print(x1+" ");
		}
		System.out.println();
	}

}
