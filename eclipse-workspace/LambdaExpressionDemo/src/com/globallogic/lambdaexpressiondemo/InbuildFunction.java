package com.globallogic.lambdaexpressiondemo;

import java.util.function.Predicate;

public class InbuildFunction {

	public static void main(String[] args) {
		
		Predicate<Integer> predicate=(age)->{
			if(age>18)
				return true;
			return false;
		};
		System.out.println(predicate.test(34));
		
		Predicate<String>stringName=(name)->name.contains("k");
		System.out.println(stringName.test("Rakesh"));
	}
}
