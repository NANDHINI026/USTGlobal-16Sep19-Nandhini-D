package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestH {
	public static void main(String[] args) {
		TreeSet<Employee> hs = new TreeSet<Employee>();
		Employee e1 = new Employee(12, "Sweety", 45000);
		Employee e2 = new Employee(34, "teju", 50000);
		Employee e3 = new Employee(5, "giri", 25000);
		Employee e4 = new Employee(25, "sheela", 10000);
		Employee e5 = new Employee(25, "sheela", 10000);
		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		hs.add(e4);
		hs.add(e5);
		System.out.println("**********Using iterator************");
		Iterator<Employee> it = hs.iterator();
		while (it.hasNext()) {
			Employee e = it.next();
			System.out.println("Id is " + e.id);
			System.out.println("Name is " + e.name);
			System.out.println("Salary is " + e.salary);
		}
	}

}
