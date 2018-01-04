package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.service.GoodsService;
import com.vo.Cart;
import com.vo.CartItem;
import com.vo.Goods;

@Controller
public class GoodsController {
	HttpServletRequest req;
	@Autowired
	public GoodsService goodsService;
	
	
	
	/**
	 *跳转到商品详情页面
	 *显示商品详情
	 */
	@RequestMapping("goods_detail.do")
	public String goodsDetail(ModelMap model, int gid){
		Goods goods=  goodsService.findByGid(gid);
		model.addAttribute("goods",goods);
		
		return "goods_detail";
	}
	
	/**
	 *跳转到购物车页面
	 */
	@RequestMapping("cart.do")
	public String addCart(int count,int gid){
		
		System.out.println(count+" "+gid);
		
		
		CartItem cartItem =new CartItem();
		cartItem.setCount(count);//在购物项中设置从商品详情页面传过来的数量 
		Goods goods =goodsService.findByGid(gid);//通过商品页面传过来的pid查询单个商品
		cartItem.setGoods(goods);//把商品添加到购物项中
		Cart cart =getCart();//调用这个方法，如果不为空则添加购物项到购物车
		cart.addCartItem(cartItem);
		return "addCart";
	}
	private Cart getCart(){
		Cart cart =(Cart) req.getSession().getAttribute("cart");
		if(cart==null){
			cart =new Cart();
			req.getSession().setAttribute("cart", cart);
		}
		return cart;
	}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
