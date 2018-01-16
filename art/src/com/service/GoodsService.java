package com.service;

import java.util.List;

import com.vo.Goods;
import com.vo.PageBean;

public interface GoodsService{

	List<Goods> newGoods();

	Goods findByGid(int gid);

	PageBean<Goods> findByCurrentPage(int currentPage);
	
	
}