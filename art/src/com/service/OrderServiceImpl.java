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
		 * ���ɶ������
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
		System.out.println("�������:"+orderNumber);
		
		/**
		 * ��ȡ���ﳵ��Ϣ
		 */
		System.out.println("���ﳵ�����ܼ�:"+cart.getTotal()+"  ���ﳵ��С:"+cart.getCartItems().size());
		Collection collection = cart.getCartItems();
				Iterator iterator = collection.iterator();
				while(iterator.hasNext()) {
				CartItem cartItem = (CartItem) iterator.next();
				System.out.println("��Ʒ��:"+cartItem.getGoods().getGoods_name());
				//���ö������
				order.setOrder_id(orderNumber);
				//������Ʒ��
				order.setGoods_name(cartItem.getGoods().getGoods_name());
				//������Ʒid
				order.setGid_one(cartItem.getGoods().getGid());
				//������ƷС��
				order.setGoods_subtotal(cartItem.getSubtotal());
				//���ö����ܼ�
				order.setGoods_total(cart.getTotal());
				//������Ʒ����
				order.setGoods_count(cartItem.getCount());
				//���ù��ﳵͼƬ
				order.setGoods_cart(cartItem.getGoods().getGoods_cart());
				//������Ʒ����
				order.setGoods_brew_price(cartItem.getGoods().getGoods_brew_price());
				//���ö�������ʱ��
				Date date1 =new Date();
				SimpleDateFormat create_time =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				order.setCreate_time(create_time.format(date1));
				order.setUsername(username);
				//���ö���״̬��01�����ύ��δ����
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
