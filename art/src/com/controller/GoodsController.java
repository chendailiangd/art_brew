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
	 *��ת����Ʒ����ҳ��
	 *��ʾ��Ʒ����
	 */
	@RequestMapping("goods_detail.do")
	public String goodsDetail(ModelMap model, int gid){
		Goods goods=  goodsService.findByGid(gid);
		model.addAttribute("goods",goods);
		
		return "goods_detail";
	}
	
	/**
	 *��ת�����ﳵҳ��
	 */
	@RequestMapping("cart.do")
	public String addCart(int count,int gid,HttpServletRequest req){
		int a=0;
//		System.out.println(count+" "+gid);
		CartItem cartItem =new CartItem();
		cartItem.setCount(count);//�ڹ����������ô���Ʒ����ҳ�洫���������� 
		Goods goods =goodsService.findByGid(gid);//ͨ����Ʒҳ�洫������pid��ѯ������Ʒ
		cartItem.setGoods(goods);//����Ʒ��ӵ���������
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
	//�����ﳵ����session��
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
		 * 1.��ȡsession��ֵ�����Ϊ�գ���newһ��cart����
		 * 2.���session��Ϊ�գ���ȡ�����session���������ټ�һ��cart
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
