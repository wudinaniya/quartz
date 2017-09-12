package com.qx.mapper;

import com.qx.pojo.User;

public interface UserMapper {

	/**
	 * 注册
	 * @param user
	 */
	 void addUser(User user);
	/**
	 * 根据用户名和密码登陆查询
	 * @param user
	 * @return
	 */
	 User findByPrimaryKey(User user);
}
