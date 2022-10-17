package com.example.model;

public class RestaurantItems {
	
	private Long itemId;
	private String name;
	private double price;
	
	public RestaurantItems() {
		super();
	}
	
	public RestaurantItems(Long itemId, String name, double price) {
		super();
		this.itemId = itemId;
		this.name = name;
		this.price = price;
	}


    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}
	
	
	
	
	

}
