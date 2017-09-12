package com.qx.mapper;

import java.util.List;

import com.qx.pojo.Borrowmoney;
import com.qx.pojo.MainAndlistDataPojo;

public interface BorrowmoneyMapper {

	/**
	 * 添加借钱
	 * @param borrowmoney
	 */
	void addBorrowMoney(Borrowmoney borrowmoney);
	/**
	 * 查询所有的借款数据
	 * @return
	 */
	List<Borrowmoney> findBorrowListByPage();
	/**
	 * 更新审核信息
	 * @param borrowmoney
	 * @return
	 */
	int updateRenzhengInfo(Borrowmoney borrowmoney);
	/**
	 * 查询所有的 投资产品
	 * @return
	 */
	List<MainAndlistDataPojo> getAllBorrow();
	
	/**
	 * 根据主键查询贷款信息
	 * @param bid
	 * @return
	 */
	Borrowmoney findBorrowMoneyByBId(Integer bid);
	/**
	 * 查询利率
	 * @param bid
	 * @return
	 */
	Double findBrateByBid(Integer bid);
}
