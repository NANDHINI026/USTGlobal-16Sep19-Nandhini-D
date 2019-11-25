package com.ustglobal.jpawithhibernateapp;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.manytomany.Course;
import com.ustglobal.jpawithhibernateapp.manytomany.Student;

public class TestManyToMany {
public static void main(String[] args) {
	
	EntityManagerFactory entityManagerFactory =null;
	EntityManager entityManager =null;
	EntityTransaction entityTransaction=null;
	
	Course c = new Course();
	c.setCid(1);
	c.setCname("Java");
	
	Course c1 = new Course();
	c1.setCid(2);
	c1.setCname("JPA with Hibernate");
	
	ArrayList<Course> alCourse = new ArrayList<Course>();
	alCourse.add(c);
	alCourse.add(c1);
	
	Student s = new Student();
	s.setSid(1);
	s.setSname("Nandhini");
	s.setCourse(alCourse);
	
	
	try {
		 entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		 entityManager = entityManagerFactory.createEntityManager();
		 entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		System.out.println("Record saved");
		entityManager.persist(s);
		entityTransaction.commit();
		
	} catch (Exception e) {
		e.printStackTrace();
		
	}
	entityManager.close();
}
}
