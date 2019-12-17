package com.ustglobal.objectclass;

public class TestD {
	public static void main(String[] args) {
		Student s = new Student(10, "Nandhini", 71.72);
		System.out.println(s);
		int j = s.hashCode();
		System.out.println(j);
	}
}
