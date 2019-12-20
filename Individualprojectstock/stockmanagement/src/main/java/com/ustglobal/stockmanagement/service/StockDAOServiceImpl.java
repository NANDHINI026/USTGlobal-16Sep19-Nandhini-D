package com.ustglobal.stockmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.stockmanagement.dao.StockDAO;
import com.ustglobal.stockmanagement.dto.ProductsInfo;
@Service
public class StockDAOServiceImpl implements StockDAOService{
@Autowired
private StockDAO dao;
	@Override
	public boolean addProduct(ProductsInfo products) {
		return dao.addProduct(products);
	}

	@Override
	public boolean updateProduct(ProductsInfo products) {
		return dao.updateProduct(products);
	}

	@Override
	public ProductsInfo searchProductByName(String name) {
		return dao.searchProductByName(name);
	}

	@Override
	public ProductsInfo searchProductByCategory(String category) {
		return dao.searchProductByCategory(category);
	}

	@Override
	public ProductsInfo searchProductByCompany(String company) {
		return dao.searchProductByCompany(company);
	}

	@Override
	public List<ProductsInfo> getAllProducts() {
		return dao.getAllProducts();
	}

}
