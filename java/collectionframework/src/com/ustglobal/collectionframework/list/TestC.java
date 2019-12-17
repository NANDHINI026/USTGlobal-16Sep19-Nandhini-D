package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestC {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		al.add(33320);
		al.add(299.7);
		al.add(true);
		al.add("Good evening");

		Iterator i = al.iterator();
		Object o1 = i.next();
		System.out.println(o1);
		Object o2 = i.next();
		System.out.println(o2);
		Object o3 = i.next();
		System.out.println(o3);
		Object o4 = i.next();
		System.out.println(o4);
//		Object o5 = i.next();
//		System.out.println(o5);
//		NoSuchElementException.
		System.out.println("========Using for loop======");

		for (int j = 1; j < al.size(); j++) {
			Object o = al.get(j);
			System.out.println(o);

			ArrayList al1 = new ArrayList();
			al.add(3);
			al.add(2.7);
			al.add(false);
			al.add("Good Ni8");

			System.out.println("=========Using Iterator======");
			Iterator it = al1.iterator();
			while (it.hasNext()) {
				Object o8 = it.next();
				System.out.println(o8);
			}

		}
	}

}
