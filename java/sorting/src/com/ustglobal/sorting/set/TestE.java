package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestE {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(34);
		ts.add(45);
		ts.add(12);
		ts.add(9);

		System.out.println("************Using for each**********");
		for (Object s : ts) {
			System.out.println(s);
		}
		System.out.println("*********** Using iterator*************");
		Iterator it = ts.iterator();
		while (it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}
	}
}
