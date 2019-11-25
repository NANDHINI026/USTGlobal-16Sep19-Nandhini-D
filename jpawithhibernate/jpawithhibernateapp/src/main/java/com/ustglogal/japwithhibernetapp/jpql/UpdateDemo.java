package com.ustglogal.japwithhibernetapp.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UpdateDemo {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=null;
	EntityManager entityManager=null;
	EntityTransaction transaction=null;
	
	try {
		 entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		 entityManager = entityManagerFactory.createEntityManager();
		transaction = entityManager.getTransaction();
		transaction.begin();
		String jpql = "update Product set pname='watch' where pid=101";
		Query query = entityManager.createQuery(jpql);
		int result = query.executeUpdate();
		System.out.println(result);
		transaction.commit();
	} catch (Exception e) {
		e.printStackTrace();
		transaction.rollback();
	}finally {
		entityManager.close();
	}
	

}
}
