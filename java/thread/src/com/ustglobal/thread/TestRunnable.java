package com.ustglobal.thread;

public class TestRunnable {
public static void main(String[] args) {
	System.out.println("Main Started");
	
	MyRunnable mr = new MyRunnable();
	//mr.start(); start() is undefined in myrunnable
	Thread t  = new Thread(mr);
	t.start();
	for(int i =0;i<10;i++) {
		System.out.println("Main thread");
	}
	System.out.println("Main ended");
	
}
}
