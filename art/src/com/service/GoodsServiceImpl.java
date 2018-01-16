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
	 * ��ѯ������Ʒ
	 */
	public List<Goods> newGoods() {
		List<Goods> glist =goodsMapper.findNewGoods();
		return glist;
	}

	//ͨ��gid��ѯ������Ʒ����
	public Goods findByGid(int gid) {
		Goods goods= goodsMapper.findByGid(gid);
		return goods;
	}

	/**
	 * ͨ����ǰҳ��ѯ��ҳ��Ϣ
	 */
	public PageBean<Goods> findByCurrentPage(int currentPage) {
		PageBean<Goods> pageBean =new PageBean<Goods>();
		pageBean.setCurrentPage(currentPage);//��ҳ�洫������ֵ
		int pageSize=8;//ÿҳ��������Ϊ8
		pageBean.setPageSize(currentPage);
		int totalCount =0;
		totalCount=goodsMapper.findTotalcount();
		pageBean.setTotalCount(totalCount);//��������������
		
		
		
		
		return null;
	}
	
	
	
	
	
	
	

}
