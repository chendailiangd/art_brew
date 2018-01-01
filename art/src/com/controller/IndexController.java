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
	
	@RequestMapping("index.do")//��ת����ҳ
	public String toIndex(ModelMap model){
		//��ѯ������Ʒ
		List<Goods> glist=goodsService.newGoods();
		model.addAttribute("glist",glist);
		//��ѯ�����Ʒ
		
		
		return "index";
	}
	
	/**
	 *��ת����Ʒ����ҳ��
	 */
	@RequestMapping("goods_detail.do")
	public String goodsDetail(){
		
		return "goods_detail";
	}
	
	
	
	

	
	
	
}
