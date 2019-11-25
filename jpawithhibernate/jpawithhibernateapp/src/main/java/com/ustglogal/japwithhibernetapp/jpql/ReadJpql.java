package com.ustglogal.japwithhibernetapp.jpql;



import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class ReadJpql {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	/*String jpql = "from Product";
	Query query = entityManager.createQuery(jpql);
	query.getResultList();
//	entityManager.close();
	List<Product> productInfos = query.getResultList();
	for (Product product : productInfos) {
		System.out.println(product.getPid());
		System.out.println(product.getPname());
		System.out.println(product.getQuantity());
	}
	*/
	
	String jpql = "select pname from product";
	Query query = entityManager.createQuery(jpql);
	System.out.println(query.getResultList());
	List<String> productInfos = query.getResultList();
	for (String pname : productInfos) {
		System.out.println("Names of the product:"+pname);
	}
	}
}


