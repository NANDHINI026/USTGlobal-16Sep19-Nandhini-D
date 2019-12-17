
package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		ArrayList<Double> al = new ArrayList<Double>();
		al.add(34.5);
		al.add(45.3);
		al.add(23.5);
		al.add(87.5);
		al.add(65.5);
		al.add(null);
		al.add(null);

		System.out.println(al);
		al.add(2, 45.7);
		System.out.println("after adding: " + al);
		al.remove(1);
		System.out.println("after removing " + al);
		al.remove(null);
		System.out.println("afetr removing: " + al);
		Double val = al.get(4);
		System.out.println("4th index value is: " + val);
		al.set(2, 40.5);
		System.out.println("after setting value " + al);
		al.contains(45.7);
		System.out.println("contains: " + al);
		al.clear();

		List<Double> al1 = new ArrayList<Double>();
		al1.add(12.3);
		al1.add(23.4);
		al1.add(34.5);

		al1.addAll(al1);
		System.out.println("after add all: " + al1);

		boolean contains = al1.contains(12.3);
		System.out.println("Contains all: " + contains);

		boolean res = al1.removeAll(al1);
		System.out.println("Remove all " + res);

	}

}
