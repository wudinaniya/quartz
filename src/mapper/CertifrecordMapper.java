package com.qx.mapper;

import java.util.List;

import com.qx.pojo.Certifrecord;

public interface CertifrecordMapper {
	/**
	 * 根据用户的主键查询用户的认证信息
	 * @param uid
	 * @return
	 */
	List<Certifrecord> selectByUid(Integer uid);
	
	/**
	 * 插入认证记录数据
	 * @param certifrecord
	 */
	
	void insertCertifrecord(Certifrecord certifrecord);
	/**
	 * 查询所有的认证信息
	 * @return
	 */
	List<Certifrecord> findAllCertifrecord();
	/**
	 * 更新认证状态
	 * @param certifrecord
	 * @return
	 */
	int updateStatusByCrid(Certifrecord certifrecord);
}
