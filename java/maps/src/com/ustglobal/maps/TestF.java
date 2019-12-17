package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestF {
	public static void main(String[] args) {

		Student s1 = new Student(2, "divya", 67.89);
		Student s2 = new Student(39, "ambika", 68.99);
		Student s3 = new Student(4, "kiran", 97.89);
		Student s4 = new Student(5, "dinesh", 77.79);
		Student s5 = new Student(33, "harish", 87.69);
		Student s6 = new Student(43, "poorni", 57.59);
		Student s7 = new Student(45, "Naresh", 47.49);
		Student s8 = new Student(45, "thamaiyanthee", 97.49);
		Student s9 = new Student(45, "Avanthika", 77.49);

		ArrayList<Student> al = new ArrayList<>();
		al.add(s1);
		al.add(s2);
		al.add(s3);

		ArrayList<Student> al1 = new ArrayList<>();
		al.add(s4);
		al.add(s5);
		al.add(s6);

		ArrayList<Student> al2 = new ArrayList<>();
		al.add(s7);
		al.add(s8);
		al.add(s9);

		HashMap<String, ArrayList<Student>> hm = new HashMap();
		hm.put("first", al);
		hm.put("Second", al1);
		hm.put("third", al2);

		ArrayList<Student> first = hm.get("Second");

		Iterator<Student> it = first.iterator();
		while (it.hasNext()) {
			Student s = it.next();
			System.out.println("Id is " + s.id);
			System.out.println("Name is " + s.name);
			System.out.println("Percentage is " + s.percentage);
			System.out.println("==========================");
		}

	}
}
