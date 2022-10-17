package com.example.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.model.Restaurants;

public class RestaurantsRowMapper implements RowMapper<Restaurants> {

	@Override
	public Restaurants mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		Restaurants restaurant = new Restaurants();
		
		restaurant.setRestaurantId(rs.getLong("id"));
		restaurant.setName(rs.getString("name"));
		restaurant.setLocation(rs.getString("location"));
		
		
		return restaurant;
	}

	

}