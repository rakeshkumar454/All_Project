package com.globallogic.lambdaexpressiondemo;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionDemo {
	public static void main(String[] args) {
		Function<Integer, Integer> f1= (num)->num+10;
		System.out.println(f1.apply(22));
		
		Function<String, Integer> f3=(name)->name.length();
		System.out.println(f3.apply("Rakesh"));
		
		BiFunction<Integer, Integer, Integer> f2=(num1, num2)->num1+num2;
		System.out.println(f2.apply(23,33));
		
		BiFunction <Integer, Double, Double> f4=(num1, num2)->(num1+num2);
		System.out.println(f4.apply(2, 2.5));
		
	}

}
