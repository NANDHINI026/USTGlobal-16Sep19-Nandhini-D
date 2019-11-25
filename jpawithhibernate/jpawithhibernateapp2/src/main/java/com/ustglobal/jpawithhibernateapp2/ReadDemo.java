package com.ustglobal.jpawithhibernateapp2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import com.ustglobal.jpawithhibernetapp2.dto.Employee;

public class ReadDemo {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Employee employeeDetail = entityManager.find(Employee.class, 1);
		System.out.println("ID---"+employeeDetail.getEid());
		System.out.println("Name---"+employeeDetail.getEname());
		System.out.println("Quantity---"+employeeDetail.getEsalary());
	}
}
