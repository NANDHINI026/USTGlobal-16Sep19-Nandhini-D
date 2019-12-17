package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestF {
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("roopa");
		ts.add("Sumiya");
		ts.add("Sindhuja");
		ts.add("Aphipsa");
		ts.add("Nandhini");
		System.out.println("********Using for each********");
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
