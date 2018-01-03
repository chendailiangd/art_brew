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
	@RequestMapping("addCart.do")
	public String addCart(){
		
		return "addCart";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
