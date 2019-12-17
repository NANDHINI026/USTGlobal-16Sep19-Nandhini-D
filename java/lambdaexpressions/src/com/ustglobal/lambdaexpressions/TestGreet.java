package com.ustglobal.lambdaexpressions;

public class TestGreet {

	public static void main(String[] args) {

		GreetInterface gi = (msg) -> {
			System.out.println("Hello");
			return msg;

		};
		System.out.println(gi.greet("roopa"));

	}

}
