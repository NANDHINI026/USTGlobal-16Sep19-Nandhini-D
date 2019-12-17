package com.ustglobal.sorting.list;

public class Pen implements Comparable<Pen> {
	double price;
	String brand;

	public Pen(double price, String brand) {
		this.price = price;
		this.brand = brand;
	}

	@Override
	public int compareTo(Pen pn) {
		if (this.price < pn.price) {
			return 1;
		} else if (this.price > pn.price) {
			return -1;
		} else {
			return 0;
		}
	}
}
