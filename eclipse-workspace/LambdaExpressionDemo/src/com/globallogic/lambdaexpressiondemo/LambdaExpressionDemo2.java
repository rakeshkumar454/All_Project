package com.globallogic.lambdaexpressiondemo;

interface Largest {
	int largest(int a, int b, int c);
}

public class LambdaExpressionDemo2 {
	public static void main(String[] args) {

		Largest lar = (a, b, c) -> {
			if (a > b) {
				return a;
			} else if (b > c) {
				return b;

			} else {
				return c;
			}
		};
		System.out.println("Largest : " + lar.largest(600, 7687, 99));
	}
}
