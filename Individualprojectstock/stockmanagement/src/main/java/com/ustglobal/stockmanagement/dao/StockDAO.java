package com.ustglobal.stockmanagement.dao;

import java.util.List;


import com.ustglobal.stockmanagement.dto.ProductsInfo;

public interface StockDAO {
public boolean addProduct(ProductsInfo products);
public boolean updateProduct(ProductsInfo products);
public ProductsInfo searchProductByName(String name);
public ProductsInfo searchProductByCategory(String category);
public ProductsInfo searchProductByCompany(String company);
public List<ProductsInfo> getAllProducts();
}
