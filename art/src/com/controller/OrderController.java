package com.controller;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
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
	 * ��������Ϣ�ύ���������������ݿ�
	 */
	@RequestMapping("submitOrder.do")
	public String submitOrder(Order order,HttpServletRequest req){
		Cart cart =(Cart) req.getSession().getAttribute("cart");
		User user =(User) req.getSession().getAttribute("existUserS");
		System.out.println(user.getUsername());
		if((cart!=null)&&(user!=null)){
			System.out.println("order"+order);
			orderService.submitOrder(order,cart,user.getUsername());
			req.getSession().removeAttribute("cart");
			System.out.println("�����ύ�ɹ�������չ��ﳵ��");
		}
		return "pay_success";
	}
	
	/**
	 * ��ת���ҵĹ��ﳵ
	 */
	@RequestMapping("MyCart.do")
	public String MyCart(){
		return "cart";
	}
	
	/**
	 * ��ת���ҵĶ���ҳ�棬����ѯ���ҵĶ���
	 */
	@RequestMapping("MyOrder.do")
	public String MyOrder(String username,ModelMap model ){
		System.out.println(username);
		List<Order> olist =orderService.findMyOrderByUsername(username);
//		for(Order o : olist){
//			System.out.println( o.getGoods_total());
//			System.out.println("1111:"+o.getGoods().getGoods_name()+o.getGoods().getGoods_brew_price());
//		}
		model.addAttribute("olist", olist);
		return "my_order";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
