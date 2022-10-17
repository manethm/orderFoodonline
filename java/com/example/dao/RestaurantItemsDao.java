package com.example.dao;

import java.util.List;

import com.example.model.RestaurantItems;

public interface RestaurantItemsDao{
	
	public List<RestaurantItems> getAllRestaurantItems(Long restaurantId);
}
