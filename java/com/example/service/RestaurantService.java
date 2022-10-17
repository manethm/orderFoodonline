package com.example.service;

import java.util.List;

import com.example.model.Orders;
import com.example.model.RestaurantItems;
import com.example.model.Restaurants;

public interface RestaurantService{
	
	public Long placeOrder(Orders order);

	public List<Restaurants> getAllRestaurants();

	public List<RestaurantItems> getAllItems(Long restaurantId);

	
	
}