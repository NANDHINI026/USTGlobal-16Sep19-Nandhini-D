package com.ustglobal.thread;

public class TestThread {
public static void main(String[] args) {
	System.out.println("Main Started");
	
	MyThread t1 = new MyThread();
	
	/*Don't call run() method,it behaves like normal program 
	 * All code will be excuted inside main thread only
	*/
	t1.start();
	
	for(int i =0;i<10;i++) {
		System.out.println("Main thread");
	}
	System.out.println("Main ended");
}
}
