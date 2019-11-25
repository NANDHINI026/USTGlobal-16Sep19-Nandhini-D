package com.ustglobal.jpawithhibernateapp2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernetapp2.dto.Employee;

public class UpdateDemo {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory =null;
		EntityManager entityManager =null;
		EntityTransaction entityTransaction=null;
		try {
			 entityManagerFactory = Persistence.createEntityManagerFactory("test");
			 entityManager = entityManagerFactory.createEntityManager();
			 entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			Employee employee = entityManager.find(Employee.class, 1);
			employee.setEname("Nandhini Dayanithi");
			System.out.println("Updated Record");
			entityTransaction.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	}
}
