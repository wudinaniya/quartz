package com.qx.mapper;

import com.qx.pojo.Porchased;

public interface PorchasedMapper {
	Porchased findByBid(Integer bid);
	int updatePorchasedById(Integer id);
	void insertPorchased(Porchased porchased);
	Integer findPorchasedByBid(Integer bid);
}
