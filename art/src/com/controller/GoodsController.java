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
import com.vo.PageBean;

@Controller
public class GoodsController {
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
	public String addCart(int count,int gid,HttpServletRequest req){
		CartItem cartItem =new CartItem();
		cartItem.setCount(count);//在购物项中设置从商品详情页面传过来的数量 
		Goods goods =goodsService.findByGid(gid);//通过商品页面传过来的pid查询单个商品
		cartItem.setGoods(goods);//把商品添加到购物项中
		Cart cart =getCart(req);
		cart.addCartItem(cartItem);
		return "cart";
	}
	//将购物车存在session中
	private Cart getCart(HttpServletRequest req) {
		Cart cart=(Cart) req.getSession().getAttribute("cart");
		if(cart==null){
			cart =new Cart();
			req.getSession().setAttribute("cart", cart);
		}
		return cart;
	}

	/**
	 * 删除一个购物项
	 */
	@RequestMapping("delete.do")
	public String deleteGoods(int gid,HttpServletRequest req){
		Cart cart =getCart(req);
		cart.removeCartItem(gid);
		return "cart";
	}

	/**
	 * 跳转至付款页面
	 */
	@RequestMapping("pay.do")
	public String toPay(){
		return "pay";
	}
	
	/**
	 * 跳转至所有商品页面
	 */
	@RequestMapping("findAllBrew.do")
	public String findAllBrew(int currentPage,ModelMap model){
		PageBean<Goods> pageBean =goodsService.findByCurrentPage(currentPage);
		model.addAttribute("pageBean",pageBean);
		
		return null;
	}
	
	
	
	
	
	
	
	
}
