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
		CartItem cartItem =new CartItem();
		cartItem.setCount(count);//�ڹ����������ô���Ʒ����ҳ�洫���������� 
		Goods goods =goodsService.findByGid(gid);//ͨ����Ʒҳ�洫������pid��ѯ������Ʒ
		cartItem.setGoods(goods);//����Ʒ��ӵ���������
		Cart cart =getCart(req);
		cart.addCartItem(cartItem);
		return "cart";
	}
	//�����ﳵ����session��
	private Cart getCart(HttpServletRequest req) {
		Cart cart=(Cart) req.getSession().getAttribute("cart");
		if(cart==null){
			cart =new Cart();
			req.getSession().setAttribute("cart", cart);
		}
		return cart;
	}

	/**
	 * ɾ��һ��������
	 */
	@RequestMapping("delete.do")
	public String deleteGoods(int gid,HttpServletRequest req){
		Cart cart =getCart(req);
		cart.removeCartItem(gid);
		return "cart";
	}

	/**
	 * ��ת������ҳ��
	 */
	@RequestMapping("pay.do")
	public String toPay(){
		return "pay";
	}
	
	/**
	 * ��ת��������Ʒҳ��
	 */
	@RequestMapping("findAllBrew.do")
	public String findAllBrew(int currentPage,ModelMap model){
		PageBean<Goods> pageBean =goodsService.findByCurrentPage(currentPage);
		model.addAttribute("pageBean",pageBean);
		
		return null;
	}
	
	
	
	
	
	
	
	
}
