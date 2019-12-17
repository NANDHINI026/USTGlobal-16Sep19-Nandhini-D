package com.ustglobal.lambdaexpressions;

public class TestAdd implements AddInterface {

	public static void main(String[] args) {

		TestAdd ta = new TestAdd();
		int sum = ta.add(12, 32);
		System.out.println("Sum is " + sum);

	}

	@Override
	public int add(int a, int b) {
		return a + b;
	}

}
