package com.vo;

public class CartItem {
	private Goods goods;//��Ʒ����
	private int count;//��Ʒ����
	private double subtotal;//��ƷС��
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
