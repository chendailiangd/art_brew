package com.vo;

public class CartItem {
	private Goods goods;//商品对象
	private int count;//商品数量
	private double subtotal;//商品小计
	public Goods getGoods() {
		return goods;
	}
	public void setGoods(Goods goods) {
		this.goods = goods;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public double getSubtotal() {
		return count*goods.getGoods_brew_price();
	}
	
	

}
