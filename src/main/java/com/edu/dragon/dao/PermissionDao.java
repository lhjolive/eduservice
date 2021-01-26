package com.edu.dragon.dao;

import com.alibaba.fastjson.JSONObject;

import java.util.Set;

/**
 * 
 * @author: olive
 * @description: 权限DAO层
 * @date: 2021-01-26 05:24:14
 */
public interface PermissionDao {
	/**
	 * 查询用户的角色 菜单 权限
	 */
	JSONObject getUserPermission(String username);

	/**
	 * 查询所有的菜单
	 */
	Set<String> getAllMenu();

	/**
	 * 查询所有的权限
	 */
	Set<String> getAllPermission();
}
