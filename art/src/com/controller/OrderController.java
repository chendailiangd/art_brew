package com.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.service.OrderService;
import com.vo.Cart;
import com.vo.Order;
import com.vo.User;

@Controller
public class OrderController {
	@Autowired
	public OrderService orderService;
	
	
	/**
	 * 将订单信息提交过来，并插入数据库
	 */
	@RequestMapping("submitOrder.do")
	public String submitOrder(Order order,HttpServletRequest req){
		Cart cart =(Cart) req.getSession().getAttribute("cart");
		User user =(User) req.getSession().getAttribute("existUser");
		System.out.println(user.getUsername());
		if((cart!=null)&&(user!=null)){
			System.out.println("order"+order);
			orderService.submitOrder(order,cart,user.getUsername());
			req.getSession().removeAttribute("cart");
			System.out.println("订单提交成功，已清空购物车！");
		}
		return "pay_success";
	}
	
	
	
	
	
}
