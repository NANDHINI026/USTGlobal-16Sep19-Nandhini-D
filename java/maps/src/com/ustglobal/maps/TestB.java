package com.ustglobal.maps;

import java.util.HashMap;

public class TestB {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put("Nandhini", 9786950);
		hm.put("Priya", 9786951);
		hm.put("Manogari", 9786952);

		HashMap hm1 = new HashMap();
		hm1.put("Deepu", 70945);
		hm1.put("Riya", 70946);
		hm1.put("aariya", 70947);

		boolean hasKey = hm1.containsKey("Deepu");
		System.out.println("Has Key " + hasKey);

		boolean hasValue = hm.containsValue(9786950);
		System.out.println("Has Value " + hasValue);

		hm.putAll(hm1);

		System.out.println("====================");

		System.out.println("After put all " + hm);

		System.out.println(hm.size());

		boolean isEmpty = hm.isEmpty();
		System.out.println("Map is Empty " + isEmpty);

		hm.clear();
		System.out.println("After clear " + hm);
	}

}
