package com.ustglobal.beanobj;

public class TestB {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setId(12);
		e.setName("Aadhitya");
		e.setSalary(50000.000);
		e.setDesignation("Software developer");
		e.setDept("Mechanical");

		Database1 db1 = new Database1();
		db1.receive(e);
	}
}
