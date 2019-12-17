package com.ustglobal.sorting.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestA {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(12);
		hs.add(10);
		hs.add("Deepa");
		hs.add(56.7);
		hs.add(12);
		hs.add(null);

		System.out.println("******** Using For each ***********");
		for (Object o : hs) {
			System.out.println(o);
		}
		System.out.println("*********** USing iterator*********");
		Iterator it = hs.iterator();
		while (it.hasNext()) {
			Object s = it.next();
			System.out.println(s);
		}

	}
}
