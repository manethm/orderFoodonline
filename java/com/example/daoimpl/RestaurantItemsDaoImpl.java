package com.example.daoimpl;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import com.example.dao.RestaurantItemsDao;
import com.example.model.RestaurantItems;
import com.example.model.rowmapper.RestaurantItemsRowMapper;

public class RestaurantItemsDaoImpl implements RestaurantItemsDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<RestaurantItems> getAllRestaurantItems(Long restaurantId) {
		List<RestaurantItems> restaurantItems = new ArrayList<>();
		try {
			String query = "SELECT * FROM Items WHERE RestaurantId = ?";
			restaurantItems = jdbcTemplate.query(query, new RestaurantItemsRowMapper(),restaurantId);
			return restaurantItems;
		} catch (Exception exception) {
			System.out.println(exception);
		}
		return null;
	}
	
	
}
