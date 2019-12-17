package com.ustglobal.collectionframework.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestG {

	public static void main(String[] args) {

		LinkedList li = new LinkedList();
		li.add(10);
		li.add("Roopa");
		li.add(29.4);
		li.add(null);

		System.out.println("======Using for loop========");
		for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i));
		}
		System.out.println("Using iterator");
		Iterator it = li.descendingIterator();
		while (it.hasNext()) {
			Object o = it.next();
			System.out.println(o);

		}
		System.out.println("USing ListIterator");
		ListIterator lt = li.listIterator();
		while (lt.hasNext()) {
			Object o1 = lt.next();
			System.out.println(o1);
		}

		System.out.println("Using Iterator backward");
		while (lt.hasPrevious()) {
			Object o2 = lt.previous();
			System.out.println(o2);

		}
	}
}
