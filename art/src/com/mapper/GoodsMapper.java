package com.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.vo.Goods;

public interface GoodsMapper {
	List<Goods> findNewGoods();

	Goods findByGid(int gid);

	int findTotalcount();

	List<Goods> findByPage(@Param("begin") int begin, @Param("pageSize")int pageSize);

	void uploadGoods(Goods goods);
	

}
