package com.ustglobal.exception.first;

public class TestE {
	public static void main(String[] args) {
		System.out.println("Main Started");
		String s = "hello";
		int[] a = { 10, 20, 30 };
		int b = 10;
		try {
			String s1 = s.toUpperCase();
			System.out.println(s1);
			System.out.println(a[2]);
			System.out.println(b / 0);
		} catch (NullPointerException npe) {
			System.out.println("Don't play with null");
		}

		catch (ArithmeticException ae) {
			System.out.println("Number divided by zero");
		} catch (ArrayIndexOutOfBoundsException ai) {
			System.out.println("Index not found");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Main Ended");
	}
}
