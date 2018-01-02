package com.service;

import java.util.List;

import com.vo.Goods;

public interface GoodsService{

	List<Goods> newGoods();

	Goods findByGid(int gid);
	
	
}