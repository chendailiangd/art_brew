package com.mapper;

import java.util.List;
import com.vo.Goods;

public interface GoodsMapper {
	List<Goods> findNewGoods();

	Goods findByGid(int gid);
	

}
