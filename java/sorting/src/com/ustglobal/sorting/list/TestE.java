package com.ustglobal.sorting.list;

import java.util.Iterator;
import java.util.LinkedList;

public class TestE {
	public static void main(String[] args) {
		LinkedList<Pen> ll = new LinkedList<Pen>();
		Pen p1 = new Pen(10, "Cello");
		Pen p2 = new Pen(20, "Montex");
		Pen p3 = new Pen(3, "Universal Doner");
		Pen p4 = new Pen(15, "ball pen");

		ll.add(p1);
		ll.add(p2);
		ll.add(p3);
		ll.add(p4);
		displayPenDetails(ll);
	}

	static void displayPenDetails(LinkedList<Pen> l) {
		Iterator<Pen> it = l.iterator();
		while (it.hasNext()) {
			Pen p = it.next();
			System.out.println("Price is" + p.price);
			System.out.println("Brand is" + p.brand);
		}
	}
}
