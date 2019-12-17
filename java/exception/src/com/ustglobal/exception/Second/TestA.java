package com.ustglobal.exception.Second;

public class TestA {
	public static void main(String[] args) {
		System.out.println("Main Started");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException ie) {
			System.out.println("Exception caught");
			ie.printStackTrace();
		}
		System.out.println("Main ended");
	}
}
