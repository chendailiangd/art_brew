package com.vo;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 购物项的map集合，将购项加入到该购物车中
 * @author little
 *
 */
public class Cart {
	private Map<Integer,CartItem> map = new LinkedHashMap<Integer, CartItem>();
	public Collection<CartItem> getCartItems(){
		return map.values();//将map中所有的value返回成一个单列的集合
	}
	private double total;//购物车总计
	public double getTotal() {
		return total;
	}
	
	//1.清空购物车
	public void clearCart(){
		map.clear();
		total=0;
	}
	
	//2.移除购物项
	public void removeCartItem(int gid){
		System.out.println(map.get(gid));
		CartItem item =map.remove(gid);
		total -= item.getSubtotal(); 
		
	}
	
	//3.将购物项加入购物车
	public void addCartItem(CartItem cartItem){
		Integer gid =cartItem.getGoods().getGid();
		if(map.containsKey(gid)){//如果这个map中存在这个商品id
			CartItem cartItem1 =map.get(gid);
			//将新的购物项的数量加上原来的商品数量
			cartItem1.setCount(cartItem1.getCount()+cartItem.getCount());
		}else{
			map.put(gid, cartItem);
		}
		total+=cartItem.getSubtotal();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
