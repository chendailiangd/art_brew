package com.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mapper.OrderMapper;
import com.vo.Cart;
import com.vo.CartItem;
import com.vo.Goods;
import com.vo.Order;

@Service
@Transactional
public class OrderServiceImpl implements OrderService{
	@Resource
	public OrderMapper orderMapper;
	
	public void submitOrder(Order order,Cart cart,String username) {
		/**
		 * 生成订单编号
		 */
		Date date =new Date();
		SimpleDateFormat sdf =new SimpleDateFormat("yyyyMMddHHmmss");
		String middleNumber =sdf.format(date);
		String tailNumber =Integer.toString((int)(Math.random()*999999+000001));
		String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String headNumber="";
		for(int i =0;i<4;i++){
			char head=chars.charAt((int)(Math.random() * 26));
			headNumber = headNumber+head; 
		}
		String orderNumber ="BWAT"+headNumber+middleNumber+tailNumber;
		System.out.println("订单编号:"+orderNumber);
		
		/**
		 * 获取购物车信息
		 */
		System.out.println("购物车费用总计:"+cart.getTotal()+"  购物车大小:"+cart.getCartItems().size());
		Collection collection = cart.getCartItems();
				Iterator iterator = collection.iterator();
				while(iterator.hasNext()) {
				CartItem cartItem = (CartItem) iterator.next();
				System.out.println("商品名:"+cartItem.getGoods().getGoods_name());
				//设置订单编号
				order.setOrder_id(orderNumber);
				//设置商品名
				order.setGoods_name(cartItem.getGoods().getGoods_name());
				//设置商品id
				order.setGid_one(cartItem.getGoods().getGid());
				//设置商品小计
				order.setGoods_subtotal(cartItem.getSubtotal());
				//设置订单总计
				order.setGoods_total(cart.getTotal());
				//设置商品数量
				order.setGoods_count(cartItem.getCount());
				//设置购物车图片
				order.setGoods_cart(cartItem.getGoods().getGoods_cart());
				//设置商品单价
				order.setGoods_brew_price(cartItem.getGoods().getGoods_brew_price());
				//设置订单生成时间
				Date date1 =new Date();
				SimpleDateFormat create_time =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				order.setCreate_time(create_time.format(date1));
				order.setUsername(username);
				//设置订单状态，01：已提交，未付款
				order.setOrder_status("01");
				orderMapper.submitOrder(order);
				}
	
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		OrderServiceImpl q =new OrderServiceImpl();
		Order order =new Order();
		Cart cart =new Cart();
		 q.submitOrder(order,cart,"ccc");
	}
}
