package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestI {
	public static void main(String[] args) {
		// SortByName sb = new SortByName();
		SortByName sb1 = new SortByName();
		SortByMicr sb2 = new SortByMicr();
		TreeSet<Bank> ts = new TreeSet<Bank>(sb2);
		Bank b1 = new Bank("HDFC", 560068, 678958);
		Bank b2 = new Bank("SBI", 560071, 98980);
		Bank b3 = new Bank("CITI", 560054, 4547266);
		Bank b4 = new Bank("Indian BAnk", 560050, 9786950);
		Bank b5 = new Bank("HDFC", 560068, 678958);

		ts.add(b1);
		ts.add(b2);
		ts.add(b3);
		ts.add(b4);
		ts.add(b5);

		System.out.println("*********USing Iterator");
		Iterator<Bank> it = ts.iterator();
		while (it.hasNext()) {
			Bank b = it.next();
			System.out.println("Name is" + b.name);
			System.out.println("Pincode is" + b.pincode);
			System.out.println("MICR is" + b.micr);
			System.out.println("=========================");
		}
	}
}
