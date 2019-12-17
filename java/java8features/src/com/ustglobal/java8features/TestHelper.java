package com.ustglobal.java8features;

import java.util.ArrayList;

public class TestHelper {
	public static void main(String[] args) {

		ArrayList<Student> al = new ArrayList<Student>();

		al.add(new Student(1, "roopa", 89.4));
		al.add(new Student(4, "roopa", 45.4));
		al.add(new Student(3, "roopa", 76.4));
		al.add(new Student(5, "roopa", 35.4));
		al.add(new Student(2, "roopa", 30.4));
		al.add(new Student(6, "roopa", 8.4));

		Helper h = new Helper();
		// h.display(al);
		// System.out.println("Failed students");
		// h.displayFailedStudents(al);
		// System.out.println("Passed students");
		h.displayPassedStudents(al);

	}

}
