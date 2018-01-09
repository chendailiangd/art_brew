package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrderController {
	
	/**
	 * 将订单信息提交过来
	 */
	@RequestMapping("submitOrder.do")
	public String submitOrder(String receiver_address){
		System.out.println(receiver_address);
		
		
		return "pay_success";
	}
	
	
	
	
	
}
