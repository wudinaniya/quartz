package com.qx.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.qx.pojo.Backdate;

public interface BackdateMapper {
	void insertBackDate(Backdate backdate);

	Date getBackdateByBidAndState(@Param("bid") Integer bid, @Param("state")Integer state);
	
	List<Backdate> getBackDateAndStateByBid(Integer bid);
}
