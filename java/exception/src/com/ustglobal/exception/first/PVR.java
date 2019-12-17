package com.ustglobal.exception.first;

public class PVR {
	void book() {
		System.out.println("Booking Started");
		try {
			System.out.println(10 / 0);
			System.out.println("Logic for booking");
			System.out.println("Booking confirmed");
		} catch (ArithmeticException ae) {
			System.out.println("Booking failed");
			throw ae;
		}
	}
}
