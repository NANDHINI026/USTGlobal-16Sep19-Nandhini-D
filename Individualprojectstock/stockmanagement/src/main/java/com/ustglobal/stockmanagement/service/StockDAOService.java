package com.ustglobal.stockmanagement.service;

import java.util.List;

import com.ustglobal.stockmanagement.dto.ProductsInfo;

public interface StockDAOService {
	public boolean addProduct(ProductsInfo products);
	public boolean updateProduct(ProductsInfo products);
	public ProductsInfo searchProductByName(String name);
	public ProductsInfo searchProductByCategory(String category);
	public ProductsInfo searchProductByCompany(String company);
	public List<ProductsInfo> getAllProducts();
}
