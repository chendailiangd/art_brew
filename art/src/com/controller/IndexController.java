package com.controller;
import java.util.List;

import javax.enterprise.inject.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.service.GoodsService;
import com.vo.Goods;

@Controller
public class IndexController {
	@Autowired
	public GoodsService goodsService;
	
	@RequestMapping("index.do")//跳转至首页
	public String toIndex(ModelMap model){
		//查询最新商品
		List<Goods> glist=goodsService.newGoods();
		model.addAttribute("glist",glist);
		//查询最火商品
		
		
		return "index";
	}
	
	/**
	 *跳转到商品详情页面
	 */
	@RequestMapping("goods_detail.do")
	public String goodsDetail(){
		
		return "goods_detail";
	}
	
	
	
	

	
	
	
}
