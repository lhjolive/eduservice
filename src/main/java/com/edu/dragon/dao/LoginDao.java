package com.edu.dragon.dao;

import com.alibaba.fastjson.JSONObject;
import org.apache.ibatis.annotations.Param;

/**
 * 
 * @author: olive
 * @description: 登录相关dao
 * @date: 2021-01-26 05:23:58
 */
public interface LoginDao {
	/**
	 * 根据用户名和密码查询对应的用户
	 */
	JSONObject getUser(@Param("username") String username, @Param("password") String password);
}
