package com.service;

import com.vo.Cart;
import com.vo.Order;

public interface OrderService {
	void submitOrder(Order order,Cart cart,String username);

}
