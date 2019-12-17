package com.ustglobal.predicates;

import java.util.function.Predicate;

public class PositiveOrNegative {

	public static void main(String[] args) {

		Predicate<Integer> p = i -> {
			if (i > 0) {
				return true;
			} else {
				return false;
			}
		};
		boolean res = p.test(100);
		System.out.println("Result : " + res);
	}

}
