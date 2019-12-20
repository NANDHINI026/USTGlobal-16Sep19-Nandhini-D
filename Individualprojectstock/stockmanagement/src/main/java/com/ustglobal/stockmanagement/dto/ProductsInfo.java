package com.ustglobal.stockmanagement.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import net.bytebuddy.build.ToStringPlugin.Exclude;


@Entity
@Table(name = "products_info")
public class ProductsInfo {
	@Id
	@Column
	@GeneratedValue
	private int id;
	@Column(unique = true)
	private String name;
	@Column
	private String category;
	@Column
	private String company;
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public List<OrderInfo> getOrder() {
		return order;
	}

	public void setOrder(List<OrderInfo> order) {
		this.order = order;
	}
	@Column
	private int quantity;
	@Column
	private double price;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	@Exclude
	@ManyToMany(cascade = CascadeType.ALL , mappedBy = "products_info")
	
	private List<OrderInfo> order;
}
