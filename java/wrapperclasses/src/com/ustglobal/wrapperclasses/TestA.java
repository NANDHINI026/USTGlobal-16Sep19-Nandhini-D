package com.ustglobal.wrapperclasses;

public class TestA {
public static void main(String[] args) {
	int a = 10;
	System.out.println("a is "+a);
	Integer i =a;
	System.out.println("i is "+i); 
	
	Integer x =10;
	Integer z = new Integer(20);
	System.out.println("x is "+x);
	int y = x;
	System.out.println("y is "+y);
	
	int value = Integer.parseInt("a");
	System.out.println("Value ="+value);
}
}
