package com.ustglobal.lambdaexpressions;

public class TestFactorial {

	public static void main(String[] args) {

		FactorialInterface tf = (a) -> {

			int fact = 1;
			for (int i = 2; i <= a; i++) {
				fact = fact * i;
			}

			return fact;

		};
		System.out.println(tf.factorial(10));

	}
}
