package com.globallogic.lambdaexpressiondemo;

interface Calculate{
	int values(int a);
}

public class LambdaExpressionDemo1 {
	public static void main(String[] args) {
		Calculate calculate=a->a*a*a;
		System.out.println(calculate.values(4));
	}

}
