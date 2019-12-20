package com.ustglobal.stockmanagement.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name="order_info")
public class OrderInfo {
	@Id
	@Column
	@GeneratedValue
private int oid;
	@Column
private double totalPrice;
	@Column
private double totalPriceWithGst;
public int getOid() {
	return oid;
}
public void setOid(int oid) {
	this.oid = oid;
}
public double getTotalPrice() {
	return totalPrice;
}
public void setTotalPrice(double totalPrice) {
	this.totalPrice = totalPrice;
}
public double getTotalPriceWithGst() {
	return totalPriceWithGst;
}
public void setTotalPriceWithGst(double totalPriceWithGst) {
	this.totalPriceWithGst = totalPriceWithGst;
}
@ManyToMany(cascade = CascadeType.ALL)
@JoinTable(name="OrderInfo_ProductsInfo",joinColumns = @JoinColumn(name="oid"), inverseJoinColumns = @JoinColumn(name = "id"))

private List<ProductsInfo> products_info;
public List<ProductsInfo> getProducts_info() {
	return products_info;
}
public void setProducts_info(List<ProductsInfo> products_info) {
	this.products_info = products_info;
}
}
