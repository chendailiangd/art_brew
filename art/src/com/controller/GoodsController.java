package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.service.GoodsService;
import com.vo.Goods;

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
	@RequestMapping("addCart.do")
	public String addCart(){
		
		return "addCart";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
