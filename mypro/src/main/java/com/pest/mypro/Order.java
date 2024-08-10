package com.pest.mypro;

import java.time.LocalDate;
import java.util.List;

public class Order {
	String orderId;
	String orderDate;
	String currentDate;
	List<String> products;
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public String getCurrentDate() {
		return currentDate;
	}
	public void setCurrentDate(String currentDate) {
		this.currentDate = currentDate;
	}
	
	
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderDate=" + orderDate + ", currentDate=" + currentDate + ", products="
				+ products + "]";
	}
	public Order(String orderId, String orderDate, String currentDate, List<String> products) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.currentDate = currentDate;
		this.products = products;
	}
	public List<String> getProducts() {
		return products;
	}
	public void setProducts(List<String> products) {
		this.products = products;
	}
	
}
