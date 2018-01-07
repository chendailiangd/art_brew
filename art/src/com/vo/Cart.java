package com.vo;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * �������map���ϣ���������뵽�ù��ﳵ��
 * @author little
 *
 */
public class Cart {
	private Map<Integer,CartItem> map = new LinkedHashMap<Integer, CartItem>();
	public Collection<CartItem> getCartItems(){
		return map.values();//��map�����е�value���س�һ�����еļ���
	}
	private double total;//���ﳵ�ܼ�
	public double getTotal() {
		return total;
	}
	
	//1.��չ��ﳵ
	public void clearCart(){
		map.clear();
		total=0;
	}
	
	//2.�Ƴ�������
	public void removeCartItem(int gid){
		System.out.println(map.get(gid));
		CartItem item =map.remove(gid);
		total -= item.getSubtotal(); 
		
	}
	
	//3.����������빺�ﳵ
	public void addCartItem(CartItem cartItem){
		Integer gid =cartItem.getGoods().getGid();
		if(map.containsKey(gid)){//������map�д��������Ʒid
			CartItem cartItem1 =map.get(gid);
			//���µĹ��������������ԭ������Ʒ����
			cartItem1.setCount(cartItem1.getCount()+cartItem.getCount());
		}else{
			map.put(gid, cartItem);
		}
		total+=cartItem.getSubtotal();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
