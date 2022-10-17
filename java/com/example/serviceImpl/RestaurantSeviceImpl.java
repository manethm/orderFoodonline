package com.example.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.OrderDao;
import com.example.dao.RestaurantDao;
import com.example.dao.RestaurantItemsDao;
import com.example.model.Orders;
import com.example.model.RestaurantItems;
import com.example.model.Restaurants;
import com.example.service.RestaurantService;

@Service
class RestaurantServiceImpl implements RestaurantService{
	
	@Autowired
	RestaurantDao restaurantDao;
	
	@Autowired
	RestaurantItemsDao restaurantItemsDao;
	
	@Autowired
	OrderDao orderDao;
	
	@Override
	public List<Restaurants> getAllRestaurants() {
		return restaurantDao.getAllRestaurants();
	}

	@Override
	public List<RestaurantItems> getAllItems(Long restaurantId) {
		return restaurantItemsDao.getAllRestaurantItems(restaurantId);
	}

	@Override
	public Long placeOrder(Orders order) {
		return orderDao.placeOrder(order);
	}
	
	
}