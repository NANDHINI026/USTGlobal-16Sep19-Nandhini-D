package com.ustglobal.car;

import com.ustglobal.hasarelation.weak.Person;

public class TestB {
	public static void main(String[] args) {
		Car c = new Car();
		c.start();
		c.stop();
		System.out.println("=====================");
		c.m.song(); // Has-A-Relation

	}

}
