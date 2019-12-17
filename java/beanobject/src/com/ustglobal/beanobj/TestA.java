package com.ustglobal.beanobj;

public class TestA {
	public static void main(String[] args) {
		Student s = new Student();
		s.setId(12);
		s.setName("Aadhitya");
		s.setRollNo(134);

		Database db = new Database();
		db.receive(s);
	}
}
