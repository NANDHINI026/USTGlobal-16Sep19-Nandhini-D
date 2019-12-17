package com.ustglobal.collectionframework.list;

import java.util.ArrayList;

public class TestJ {

	public static void main(String[] args) {

		ArrayList<Student> al = new ArrayList<Student>();
		Student s1 = new Student(101, "roopa", 43.4);
		Student s2 = new Student(102, "kowsi", 99.99);
		Student s3 = new Student(198, "magi", 90.0);

		al.add(s1);
		al.add(s2);
		al.add(s3);

		for (int i = 0; i < al.size(); i++) {
			Student s = al.get(i);
			System.out.println(s.id);
			System.out.println(s.name);
			System.out.println(s.percentage);
		}
		for (Student student : al) {
			System.out.println(student);

		}

	}

}
