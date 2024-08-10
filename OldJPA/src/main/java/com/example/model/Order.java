package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Order {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@ManyToOne
    @JoinColumn(name="orders", nullable=false)
	 Integer orderId;
	String orderDate;
	Integer price;
	
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderDate=" + orderDate + ", price=" + price + "]";
	}
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(Integer orderId, String orderDate, Integer price) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.price = price;
	}
}
