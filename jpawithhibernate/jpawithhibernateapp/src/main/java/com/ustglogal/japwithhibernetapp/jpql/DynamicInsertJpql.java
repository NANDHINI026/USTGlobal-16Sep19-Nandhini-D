package com.ustglogal.japwithhibernetapp.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DynamicInsertJpql {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=null;
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		
		try {
			 entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			 entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			String jpql = "insert into Product (pid,pname,quantity) values(:id,:name,:quantity) ";
			Query query = entityManager.createNativeQuery(jpql);
			query.setParameter("name", "Book");
			query.setParameter("id", 104);
			query.setParameter("quantity", 10);
			
			
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
