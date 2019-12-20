package com.ustglobal.stockmanagement.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import com.ustglobal.stockmanagement.dto.ProductsInfo;

@Repository
public class StockDAOImpl implements StockDAO{
	
	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public boolean addProduct(ProductsInfo products) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(products);
			transaction.commit();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean updateProduct(ProductsInfo products) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
		ProductsInfo p = manager.find(ProductsInfo.class, products.getId());
		p.setName(products.getName());
		p.setCategory(products.getCategory());
		p.setCompany(products.getCompany());
		p.setQuantity(products.getQuantity());
		p.setPrice(products.getPrice());
		transaction.commit();
		return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public ProductsInfo searchProductByName(String name) {
		EntityManager manager = factory.createEntityManager();
		try {
			String jpql = "from ProductsInfo where name=:name";
			TypedQuery<ProductsInfo> typedQuery = manager.createQuery(jpql,ProductsInfo.class);
			typedQuery.setParameter("name", name);
			ProductsInfo product = typedQuery.getSingleResult();
			return product;
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public ProductsInfo searchProductByCategory(String category) {
		EntityManager manager = factory.createEntityManager();
		try {
			String jpql = "from ProductsInfo where category=:category";
			TypedQuery<ProductsInfo> typedQuery = manager.createQuery(jpql,ProductsInfo.class);
			typedQuery.setParameter("category", category);
			ProductsInfo product = typedQuery.getSingleResult();
			return product;
		} catch (Exception e) {
			return null;
		}
		
	}

	@Override
	public ProductsInfo searchProductByCompany(String company) {
		EntityManager manager = factory.createEntityManager();
		try {
			String jpql = "from ProductsInfo where company=:company";
			TypedQuery<ProductsInfo> typedQuery = manager.createQuery(jpql,ProductsInfo.class);
			typedQuery.setParameter("category", company);
			ProductsInfo product = typedQuery.getSingleResult();
			return product;
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public List<ProductsInfo> getAllProducts() {
		String jpql = "from ProductsInfo";
		EntityManager manager = factory.createEntityManager();
		TypedQuery<ProductsInfo> query = manager.createQuery(jpql, ProductsInfo.class);
		List<ProductsInfo> product = query.getResultList();
		return product;
	}

	
}
