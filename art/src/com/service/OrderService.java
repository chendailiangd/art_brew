package com.service;

import java.util.List;

import com.vo.Cart;
import com.vo.Order;

public interface OrderService {
	//提交dingd
	void submitOrder(Order order,Cart cart,String username);
	//查询我的订单
	List<Order> findMyOrderByUsername(String username);

}
