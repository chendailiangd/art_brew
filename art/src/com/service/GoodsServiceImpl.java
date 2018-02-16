package com.service;

import java.text.SimpleDateFormat;
import java.util.Date;
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
		pageBean.setPageSize(pageSize);
		int totalCount =0;
		totalCount=goodsMapper.findTotalcount();
		pageBean.setTotalCount(totalCount);//��������������
		int totalPage=0;
		if(totalCount%pageSize==0){
			totalPage=totalCount/pageSize;
		}else{
			totalPage=totalCount/pageSize+1;
		}
		pageBean.setTotalPage(totalPage);//���ܵ�ҳ�����pageBean
		System.out.println("��ҳ��:"+totalPage);
		
		int begin =(currentPage-1)*pageSize;
		System.out.println("pageSize:"+pageSize);
		
		List<Goods> list =goodsMapper.findByPage(begin,pageSize);
		
		for(Goods g:list){
			System.out.println(g.getGoods_name());
		}
		
		
		pageBean.setList(list);
		return pageBean;
	}


	/**
	 * ����Ʒ��Ϣ�������ݿ�
	 */
	public void uploadGoods(Goods goods, List<String> batchFileName) {
		System.out.println(batchFileName);
		if(batchFileName!=null){
		goods.setGoods_cover_image(batchFileName.get(0));
		goods.setGoods_introduce_image1(batchFileName.get(1));
		goods.setGoods_introduce_image2(batchFileName.get(2));
		goods.setGoods_introduce_image3(batchFileName.get(3));
		goods.setGoods_introduce_image4(batchFileName.get(4));
		goods.setGoods_introduce_image5(batchFileName.get(5));
		goods.setGoods_introduce_image6(batchFileName.get(6));
		
		Date date =new Date();
		SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		goods.setGoods_publish_time(sdf.format(date));
		goodsMapper.uploadGoods(goods);
		}
		
	}
	
	
	
	
	
	
	

}
