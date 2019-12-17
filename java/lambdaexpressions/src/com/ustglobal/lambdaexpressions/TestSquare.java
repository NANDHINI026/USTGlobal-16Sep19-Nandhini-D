package com.ustglobal.lambdaexpressions;

public class TestSquare {

	public static void main(String[] args) {

		SquareInterface si = x -> x * x;
		System.out.println(si.square(200));
	}

}
