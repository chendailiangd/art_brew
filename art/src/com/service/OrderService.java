package com.service;

import java.util.List;

import com.vo.Cart;
import com.vo.Order;

public interface OrderService {
	//�ύdingd
	void submitOrder(Order order,Cart cart,String username);
	//��ѯ�ҵĶ���
	List<Order> findMyOrderByUsername(String username);

}
