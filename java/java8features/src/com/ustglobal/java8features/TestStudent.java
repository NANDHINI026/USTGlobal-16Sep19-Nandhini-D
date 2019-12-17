package com.ustglobal.java8features;

import java.util.function.Predicate;

public class TestStudent {

	public static void main(String[] args) {
		Student s1 = new Student(1, "roopa", 99.90);
		Predicate<Student> p = s -> {
			if (s.percentage >= 35) {
				return true;
			} else {
				return false;
			}
		};

		boolean b = p.test(s1);
		System.out.println("result " + b);
	}

}
