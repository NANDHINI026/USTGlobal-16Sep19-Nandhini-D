package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestJ {
	public static void main(String[] args) {
		TreeSet<Customer> ts = new TreeSet<Customer>();

		Customer c1 = new Customer("Miruthan", 101, 30000);
		Customer c2 = new Customer("Mithran", 102, 10000);
		Customer c3 = new Customer("Sathyan", 103, 15000);

		ts.add(c1);
		ts.add(c2);
		ts.add(c3);

		System.out.println("*****Using Iterator*******");
		Iterator<Customer> ic = ts.iterator();
		while (ic.hasNext()) {
			Customer c = ic.next();
			System.out.println("Name is " + c.name);
			System.out.println("Id is " + c.id);
			System.out.println("Salry is " + c.salary);
		}
	}
}
