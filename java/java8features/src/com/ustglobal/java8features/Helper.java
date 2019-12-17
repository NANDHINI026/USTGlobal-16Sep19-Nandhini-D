package com.ustglobal.java8features;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Helper {

	void display(ArrayList<Student> al) {
		Iterator<Student> it = al.iterator();
		while (it.hasNext()) {
			Student s = it.next();
			System.out.println("Id is " + s.id);
			System.out.println("Name is " + s.name);
			System.out.println("Paercentage is " + s.percentage);
			System.out.println("===================");
		}
	}

	void displayFailedStudents(ArrayList<Student> al) {
		List<Student> l = al.stream().filter(i -> i.percentage < 40).collect(Collectors.toList());
		Iterator<Student> it = l.iterator();
		while (it.hasNext()) {
			Student s = it.next();
			System.out.println("Id is " + s.id);
			System.out.println("Name is " + s.name);
			System.out.println("Peercentage is " + s.percentage);
			System.out.println("===================");
		}
	}

	void displayPassedStudents(ArrayList<Student> al) {
		List<Student> l = al.stream().filter(i -> i.percentage >= 40).collect(Collectors.toList());

		Iterator<Student> it = l.iterator();
		while (it.hasNext()) {
			Student s = it.next();
			System.out.println("Id is " + s.id);
			System.out.println("Name is " + s.name);
			System.out.println("Percentage is " + s.percentage);
			System.out.println("===================");
		}

	}

	void topperOfClass(ArrayList<Student> al) {

	}

}
