package com.edu.dragon.service;

import com.alibaba.fastjson.JSONObject;

/**
 * 
 * @author: olive
 * @description: 登录Service
 * @date: 2021-01-26 05:27:57
 */
public interface LoginService {
	/**
	 * 登录表单提交
	 */
	JSONObject authLogin(JSONObject jsonObject);

	/**
	 * 根据用户名和密码查询对应的用户
	 *
	 * @param username 用户名
	 * @param password 密码
	 */
	JSONObject getUser(String username, String password);

	/**
	 * 查询当前登录用户的权限等信息
	 */
	JSONObject getInfo();

	/**
	 * 退出登录
	 */
	JSONObject logout();
}
