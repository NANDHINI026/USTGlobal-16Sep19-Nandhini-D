package com.ustglobal.thread.properties;

public class MyPriorityThread extends Thread{
public static void main(String[] args) {
	System.out.println("Main started");
	
	int p = Thread.currentThread().getPriority();
	System.out.println("Main thread priority "+p);
	
	Thread.currentThread().setPriority(7);
	System.out.println("Main thread priority "+Thread.currentThread().getPriority());
	
	MyPriorityThread t = new MyPriorityThread();
	int q = t.getPriority();
	System.out.println("Mypriority thread priority "+q);
	
	System.out.println("Main ended");
}
}
