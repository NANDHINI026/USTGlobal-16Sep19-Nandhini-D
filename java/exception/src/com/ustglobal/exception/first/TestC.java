package com.ustglobal.exception.first;

public class TestC {
	public static void main(String[] args) {
		System.out.println("Main Started");
		int[] a = { 10, 20, 30 };
		int b = 10;
		try {
			System.out.println(a[4]);
			System.out.println(b / 2);
		} catch (ArithmeticException ae) {
			System.out.println("Number divided by zero");
		} catch (ArrayIndexOutOfBoundsException ai) {
			System.out.println("Index not found");
		}
		System.out.println("Main Ended");
	}
}
