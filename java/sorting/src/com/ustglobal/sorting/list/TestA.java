package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestA {
	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<Student>();
		Student s1 = new Student(11, "Ramya", 70.12);
		Student s2 = new Student(11, "vinaya", 80.12);
		Student s3 = new Student(11, "Sowndharya", 90.12);

		al.add(s1);
		al.add(s2);
		al.add(s3);
		displayStudentDetails(al);

	}

	static void displayStudentDetails(ArrayList<Student> al) {
		Iterator<Student> it = al.iterator();
		while (it.hasNext()) {
			Student s = it.next();
			System.out.println("Id is :" + s.id);
			System.out.println("Name is :" + s.name);
			System.out.println("Percentage is :" + s.percentage);

		}
	}

}
