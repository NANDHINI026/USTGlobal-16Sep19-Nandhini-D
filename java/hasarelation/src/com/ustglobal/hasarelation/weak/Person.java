package com.ustglobal.hasarelation.weak;

public class Person {
	String name;
	Marker m = new Marker();

	void sleep() {
		System.out.println("Person sleep()");
	}

	void eat() {
		System.out.println("Person eat()");
	}
}
