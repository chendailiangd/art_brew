package com.mapper;

import java.util.List;

import com.vo.Order;
public interface OrderMapper {

	void submitOrder(Order order);

	List<Order> findMyOrderByUsername(String username);

}
