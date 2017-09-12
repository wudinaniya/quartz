package com.qx.mapper;

import java.util.List;

import com.qx.pojo.BuyHistory;

public interface BuyHistoryMappper {
	List<BuyHistory> getAllHistoryByBid(Integer bid);
}
