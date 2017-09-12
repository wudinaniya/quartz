package com.qx.mapper;

public interface EmpMapper {
	/**
	 * 根据员工id查询员工名字
	 * @param id
	 * @return
	 */
	String findNamebyId(Integer id);
}
