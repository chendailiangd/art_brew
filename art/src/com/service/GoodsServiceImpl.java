package com.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mapper.GoodsMapper;
import com.vo.Goods;
import com.vo.PageBean;

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

	//通过gid查询单个商品详情
	public Goods findByGid(int gid) {
		Goods goods= goodsMapper.findByGid(gid);
		return goods;
	}

	/**
	 * 通过当前页查询当页信息
	 */
	public PageBean<Goods> findByCurrentPage(int currentPage) {
		PageBean<Goods> pageBean =new PageBean<Goods>();
		pageBean.setCurrentPage(currentPage);//从页面传过来的值
		int pageSize=8;//每页容量设置为8
		pageBean.setPageSize(currentPage);
		int totalCount =0;
		totalCount=goodsMapper.findTotalcount();
		pageBean.setTotalCount(totalCount);//设置总数据条数
		
		
		
		
		return null;
	}
	
	
	
	
	
	
	

}
