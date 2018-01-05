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
import com.vo.User;

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
		int a=0;
//		System.out.println(count+" "+gid);
		CartItem cartItem =new CartItem();
		cartItem.setCount(count);//在购物项中设置从商品详情页面传过来的数量 
		Goods goods =goodsService.findByGid(gid);//通过商品页面传过来的pid查询单个商品
		cartItem.setGoods(goods);//把商品添加到购物项中
		if(a==0){
			Cart cart =new Cart();
			cart.addCartItem(cartItem);
			req.getSession().setAttribute("cart", cart);
		}
		if(a>0){
			Cart cart=(Cart)req.getSession().getAttribute("cart");
			cart.addCartItem(cartItem);
			req.getSession().setAttribute("cart", cart);
		}
		a++;
//		Cart cart =getCart();
		return "cart";
	}
	//将购物车存在session中
//	private Cart getCart() {
//		req.getSession().setAttribute("cart", null);
//		Cart cart=(Cart) req.getSession().getAttribute("cart");
//		if(cart==null){
//			cart =new Cart();
//			req.getSession().setAttribute("cart", cart);
//		}
//		return cart;
//	}
//		
		
		/**
		 * 1.获取session的值，如果为空，则new一个cart对象
		 * 2.如果session不为空，则取到这个session，往里面再加一个cart
		 */
//		if(((Cart) req.getSession().getAttribute("cart"))==null){
//			Cart cart =new Cart();
//			req.getSession().setAttribute("cart", cart);
//		}else{
//			Cart cart =(Cart)req.getSession().getAttribute("cart");
//			cart.addCartItem(cartItem);
//			
//			System.out.println(cart.getTotal());
//			
//		}
//		return "cart";
//	}
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
