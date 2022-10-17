package com.example.controllers;


import java.time.LocalDateTime;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Orders;
import com.example.model.RestaurantItems;
import com.example.model.Restaurants;
import com.example.service.RestaurantService;
import com.example.response.ResponseHandler;


@RestController
@RequestMapping("/api/OrderController")
public class OrderController {
	
	@Autowired
	RestaurantService restaurantService;
	
	@GetMapping(value = "/getAllRestaurants")
	private ResponseEntity<Object> getAllRestaurants(){
		String message = "";
		try {
			List<Restaurants> restaurants = restaurantService.getAllRestaurants();
			message = "Restaurant details successfully retrieved";
			return ResponseHandler.generateResponse(message, HttpStatus.OK, restaurants);
		} catch (Exception exception) {
			return ResponseHandler.generateResponse(message, HttpStatus.INTERNAL_SERVER_ERROR, null);
		}
	}
	
	@GetMapping(value = "/getItems/{id}")
	private ResponseEntity<Object> getItems(@PathVariable("id") Long restaurantId ){
		String message = "";
		try {
			List<RestaurantItems> restaurantItems = restaurantService.getAllItems(restaurantId);
			message = "Item details successfully retrieved";
			return ResponseHandler.generateResponse(message, HttpStatus.OK, restaurantItems);
		} catch (Exception exception) {
			return ResponseHandler.generateResponse(message, HttpStatus.INTERNAL_SERVER_ERROR, null);
		}
	}
	
	@GetMapping(value = "/placeOrder")
	private ResponseEntity<Object> placeOrder(@RequestBody Orders order, 
			HttpServletRequest preRequest){
		String message = "";
		try {
			Long orderId = restaurantService.placeOrder(order);
			message = "Order details successfully Inserted";
			return ResponseHandler.generateResponse(message, HttpStatus.OK, orderId);
		} catch (Exception exception) {
			return ResponseHandler.generateResponse(message, HttpStatus.INTERNAL_SERVER_ERROR, null);
		}
	}
	
}
	
