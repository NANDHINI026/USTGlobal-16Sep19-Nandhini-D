package com.ustglobal.stringclass;

public class TestC {
	public static void main(String[] args) {
		int[]  nums = new int[5];
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		nums[3] = 40;
		nums[4] = 50;
		
		for(int i =0; i<nums.length;i++) {
			System.out.println(nums[i]);
		}
		System.out.println("====================================");
		for(int num : nums) {
			System.out.println(num);
		}
		System.out.println("===========================");
		
		
		
		char[] ch= {'a','b','c','d'};
		for(int i =0; i<ch.length;i++) {
			System.out.println(ch[i]);
		}
		System.out.println("====================================");
		for(char c : ch) {
			System.out.println(c);
		}
		System.out.println("===========================");
		
		
		double[] d = {26.24,24.8,15.16,20.79};
		for(int i =0; i<ch.length;i++) {
			System.out.println(d[i]);
		}
		System.out.println("====================================");
		for(double dou : d) {
			System.out.println(dou);
		}
		System.out.println("===========================");
		
		String[] names = {"aishu","kavya","divya","priya"};
		for(int i =0; i<ch.length;i++) {
			System.out.println(names[i]);
		}
		System.out.println("====================================");
		for(String s1 : names) {
			System.out.println(s1);
		}
		System.out.println("===========================");
	}

}
