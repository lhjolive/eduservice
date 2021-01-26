package com.edu.dragon.service;

import com.alibaba.fastjson.JSONObject;

/**
 * 
 * @author: olive
 * @description: 权限Service
 * @date: 2021-01-26 05:28:07
 */
public interface PermissionService {
	/**
	 * 查询某用户的 角色  菜单列表   权限列表
	 */
	JSONObject getUserPermission(String username);
}
