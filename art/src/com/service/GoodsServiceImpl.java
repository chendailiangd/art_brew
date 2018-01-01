package com.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mapper.GoodsMapper;
import com.vo.Goods;

@Service
@Transactional
public class GoodsServiceImpl implements GoodsService{
	@Resource
	public GoodsMapper goodsMapper;
	
	/**
	 * 查询最新商品
	 */
	public List<Goods> newGoods() {
		List<Goods> glist =goodsMapper.findNewGoods();
		return glist;
	}
	
	
	
	
	
	
	

}
