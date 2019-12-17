package com.ustglobal.sorting.list;

import java.util.Iterator;
import java.util.LinkedList;

public class TestF {
	public static void main(String[] args) {
		LinkedList<Marker> ll = new LinkedList<Marker>();
		Marker m1 = new Marker(10, "Blue");
		Marker m2 = new Marker(20, "Red");
		Marker m3 = new Marker(3, "Brown");
		Marker m4 = new Marker(15, "Black");

		ll.add(m1);
		ll.add(m2);
		ll.add(m3);
		ll.add(m4);
		displayMarkerDetails(ll);
	}

	static void displayMarkerDetails(LinkedList<Marker> l) {
		Iterator<Marker> it = l.iterator();
		while (it.hasNext()) {
			Marker m = it.next();
			System.out.println("Price is" + m.price);
			System.out.println("Brand is" + m.color);
		}
	}

}
