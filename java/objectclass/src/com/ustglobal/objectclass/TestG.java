package com.ustglobal.objectclass;

public class TestG {
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Nandhini", 300000);
		Employee e2 = new Employee(1, "Priya", 300000);

		boolean isEqual = e1.equals(e2);

		System.out.println(isEqual);
	}

}
