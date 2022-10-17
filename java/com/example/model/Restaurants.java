package com.example.model;

public class Restaurants{
	
	private long restaurantId;
	private String name;
	private String location;
	
	
	
	public Restaurants() {
		super();
	}



	public Restaurants(long restaurantId, String name, String location) {
		super();
		this.restaurantId = restaurantId;
		this.name = name;
		this.location = location;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getLocation() {
		return location;
	}



	public void setLocation(String location) {
		this.location = location;
	}



	public long getRestaurantId() {
		return restaurantId;
	}



	public void setRestaurantId(long restaurantId) {
		this.restaurantId = restaurantId;
	}
	
	
	
}