package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestG {
	public static void main(String[] args) {

		Employee e1 = new Employee(1, "Nandhini", 25000);
		Employee e2 = new Employee(1, "Abitha", 15000);
		Employee e3 = new Employee(1, "Amutha", 35000);
		Employee e4 = new Employee(1, "Apoorna", 45000);
		Employee e5 = new Employee(1, "Bharathi", 55000);
		Employee e6 = new Employee(1, "Benita", 65000);
		Employee e7 = new Employee(1, "Divya", 75000);
		Employee e8 = new Employee(1, "Dharani", 85000);
		Employee e9 = new Employee(1, "Abinesh", 95000);

		ArrayList<Employee> al = new ArrayList();
		al.add(e1);
		al.add(e2);
		al.add(e3);

		ArrayList<Employee> al1 = new ArrayList();
		al.add(e4);
		al.add(e5);
		al.add(e6);

		ArrayList<Employee> al2 = new ArrayList();
		al.add(e7);
		al.add(e8);
		al.add(e9);

		HashMap<String, ArrayList<Employee>> hm = new HashMap<>();
		hm.put("first", al);
		hm.put("Second", al1);
		hm.put("third", al2);

		ArrayList<Employee> second = hm.get("Second");

		Iterator<Employee> it = second.iterator();
		while (it.hasNext()) {
			Employee e = it.next();
			System.out.println("Id is " + e.id);
			System.out.println("Name is " + e.name);
			System.out.println("Percentage is " + e.salary);
			System.out.println("==========================");

		}
	}
}
