package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.manytoone.Pencil;
import com.ustglobal.jpawithhibernateapp.manytoone.PencilBox;

public class TestOneToMany {
public static void main(String[] args) {
	PencilBox pBox = new PencilBox();
	pBox.setBid(3);
	pBox.setBname("Apsara");
	
	Pencil pencil = new Pencil();
	pencil.setPid(14);
	pencil.setColor("Blue");
	pencil.setPencilBox(pBox);
	
	Pencil pencil1 = new Pencil();
	pencil1.setPid(15);
	pencil1.setColor("Green");
	pencil1.setPencilBox(pBox);
	
	EntityManagerFactory entityManagerFactory =null;
	EntityManager entityManager =null;
	EntityTransaction entityTransaction=null;
	try {
		 entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		 entityManager = entityManagerFactory.createEntityManager();
		 entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(pencil);
		entityManager.persist(pencil1);
		System.out.println("Record saved");
		entityTransaction.commit();
		
	} catch (Exception e) {
		e.printStackTrace();
		entityTransaction.rollback();
	}
	entityManager.close();
}
}
