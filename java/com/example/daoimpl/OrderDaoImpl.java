package com.example.daoimpl;

import java.sql.PreparedStatement;
import java.sql.Statement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.example.dao.OrderDao;
import com.example.model.Orders;

@Repository
public class OrderDaoImpl implements OrderDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Long placeOrder(Orders order) {
		try {
			Long orderId = insertNewOrder(order);
			for (Long restaurantItem:order.getItems()) {
				insertOrderItem(restaurantItem,orderId);
			}
			return orderId;

		}catch (Exception exception) {
			System.out.println(exception);
		}
		return null;
	}
		
		public void insertOrderItem(Long itemId, Long orderId) {
			try {
				String query = "INSERT INTO OrderItems(ItemId,OrderId) VALUES (?, ?)";
				jdbcTemplate.update(query, itemId, orderId);
			}catch (Exception exception) {
				System.out.println(exception);
			}
		}


		public Long insertNewOrder(Orders order) {
			try {
				String query = "INSERT INTO MainOrders(CustomerId,RestaurantId,Price) VALUES (?, ?, ?)";
				KeyHolder keyHolder = new GeneratedKeyHolder();
				jdbcTemplate.update(connection -> {
					PreparedStatement pst = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
					pst.setLong(1, order.getCustomerId());
					pst.setLong(2, order.getrestaurantId());
					pst.setDouble(2, order.getOrderPrice());
					return pst;
				}, keyHolder);
				Long id = keyHolder.getKey().longValue();
				order.setOrderId(id);
				return id;
			}catch (Exception exception) {
				System.out.println(exception);
			}
			return null;

		}

}