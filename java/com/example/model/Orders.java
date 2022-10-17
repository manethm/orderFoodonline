package com.example.model;

import java.util.ArrayList;
import java.util.List;

public class Orders {
	
	private Long orderId;
	private double orderPrice;
	private Long customerId;
	private Long restaurantId;
	private List<Long> items = new ArrayList<Long>();
	
	
	public Orders() {
		super();
	}

	public Orders(Long orderId, double orderPrice, Long customerId, Long restaurantId, List<Long> items) {
		super();
		this.orderId = orderId;
		this.orderPrice = orderPrice;
		this.customerId = customerId;
		this.restaurantId = restaurantId;
		this.items = items;
	}
	
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public double getOrderPrice() {
		return orderPrice;
	}
	public void setOrderPrice(double orderPrice) {
		this.orderPrice = orderPrice;
	}
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public Long getrestaurantId() {
		return restaurantId;
	}
	public void setrestaurantId(Long restaurantId) {
		this.restaurantId = restaurantId;
	}
	public List<Long> getItems() {
		return items;
	}
	public void setItems(List<Long> items) {
		this.items = items;
	}
	
	
	
	
	
	
	

}
