package com.example.model.rowmapper;


import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.model.RestaurantItems;

public class RestaurantItemsRowMapper implements RowMapper<RestaurantItems> {

	@Override
	public RestaurantItems mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		RestaurantItems restaurantItems = new RestaurantItems();
		
		restaurantItems.setItemId(rs.getLong("id"));
		restaurantItems.setName(rs.getString("name"));
		restaurantItems.setPrice(rs.getDouble("price"));
		
		
		return restaurantItems;
	}
}

	
