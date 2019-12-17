package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestF {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("anupama");
		al.add("savitha");
		al.add("roopa");

		String s = al.get(0);
		System.out.println(s.toUpperCase());
		Iterator<String> li = al.iterator();
		while (li.hasNext()) {
			String s1 = li.next();
			System.out.println(s1);

		}
		System.out.println("=================Using ListIterator===============");
		ListIterator<String> l = al.listIterator();
		while (li.hasNext()) {
			String s1 = li.next();
			System.out.println(s1);
		}
		System.out.println("===========Using forEach loop===============");
		for (String s2 : al) {
			System.out.println(s2);
		}

	}
}