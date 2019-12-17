package com.ustglobal.stringclass;

public class TestA {
public static void main(String[] args) {
	String s1 = "Aishu";
	String s2 = "Deppika";
	String s3 = new String ("aishu");
	String s4 = new String ("aishu");
	String s5 = "Aishu";
	
	System.out.println(s1.equals(s2));
	System.out.println(s3.equals(s4));
	System.out.println(s1.equals(s5));

	String s6 = s1.toLowerCase();
	System.out.println(s6);
	String s7 = s1.toUpperCase();
	System.out.println(s7);
	char c = s1.charAt(0);
	System.out.println(c);
	
	boolean b = s1.equalsIgnoreCase("AIShU");
	System.out.println(b);
	
	StringBuffer sb1 = new StringBuffer("Kavya");
	sb1.append("XYZ");
	System.out.println(sb1);
	
}
}
