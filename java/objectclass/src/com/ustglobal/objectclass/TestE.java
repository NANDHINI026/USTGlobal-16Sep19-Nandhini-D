package com.ustglobal.objectclass;

public class TestE {
	public static void main(String[] args) {
		Car c = new Car(100000000, "Benz", "Black");
		System.out.println(c);
		int j = c.hashCode();
		System.out.println(j);

		Car c1 = new Car(300000, "Audi", "white");
		System.out.println(c1);
		int h = c1.hashCode();
		System.out.println(h);

		Car c2 = new Car(4500000, "Ferrari", "Blue");
		System.out.println(c2);
		int h1 = c2.hashCode();
		System.out.println(h1);

	}

}
