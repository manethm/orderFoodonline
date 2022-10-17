package com.example.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import com.example.dao.RestaurantDao;
import com.example.model.Restaurants;
import com.example.model.rowmapper.RestaurantsRowMapper;

public class RestaurantDaoImpl implements RestaurantDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Restaurants> getAllRestaurants() {
		List<Restaurants> restaurants = new ArrayList<>();
		try {
			String query = "SELECT * FROM Restaurants";
			restaurants = jdbcTemplate.query(query, new RestaurantsRowMapper());
			return restaurants;
		} catch (Exception exception) {
			System.out.println(exception);
		}
		return null;
	}
}