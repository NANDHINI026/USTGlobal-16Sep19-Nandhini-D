package com.ustglobal.java8features;

import java.util.function.Predicate;

public class TestA {

	public static void main(String[] args) {

		Predicate<Integer> p = i -> {
			if (i % 2 == 0) {
				return true;
			} else {
				return false;
			}
		};
		boolean res = p.test(100);
		System.out.println("Result : " + res);
	}

}
