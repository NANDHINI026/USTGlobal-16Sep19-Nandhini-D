package com.ustglobal.stockmanagement.dto;

import java.util.List;


public class StockResponse {
	private int statusCode;
	private String message;
	private String description;
	private List<ProductsInfo> product;
	public List<ProductsInfo> getProduct() {
		return product;
	}
	public void setProduct(List<ProductsInfo> product) {
		this.product = product;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
