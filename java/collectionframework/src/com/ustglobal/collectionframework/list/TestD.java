package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestD {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(10);
		al.add("roopa");
		al.add(24.5);
		al.add(true);

		ListIterator li = al.listIterator();

		while (li.hasNext()) {
			Object ob = li.previous();
			System.out.println(ob);
		}
		while (li.hasPrevious()) {
			Object o = li.previous();
			System.out.println(o);
		}

	}

}
