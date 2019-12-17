package com.ustglobal.maps;

import java.util.HashMap;

public class TestA {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put("Nandhini", 9786950);
		hm.put("Priya", 9786951);
		hm.put("Manogari", 9786952);
		hm.put(null, 45678);
		hm.put(null, 4567898);

		System.out.println("Data " + hm);
		hm.put("Priya", 9786953);
		System.out.println("Modified Data " + hm);
		hm.put("Mano", 9786952);
		System.out.println("Modified Mano " + hm);

		System.out.println("=================");
		Object phoneno = hm.get("Nandhini");
		System.out.println("Value " + phoneno);

		System.out.println("=================");
		Object phoneno1 = hm.get("Sheela");
		System.out.println("Value " + phoneno1);

		System.out.println("=================");
		Object value = hm.remove("Mano");
		System.out.println("Value " + value);
		System.out.println("After remove--->" + value);

	}
}
