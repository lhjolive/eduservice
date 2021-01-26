package com.edu.dragon.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.edu.dragon.dao.PermissionDao;
import com.edu.dragon.service.PermissionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * 
 * @author: olive
 * @description: 权限service实现类
 * @date: 2021-01-26 05:25:47
 */
@Service
public class PermissionServiceImpl implements PermissionService {

	@Autowired
	private PermissionDao permissionDao;

	/**
	 * 查询某用户的 角色  菜单列表   权限列表
	 */
	@Override
	public JSONObject getUserPermission(String username) {
		JSONObject userPermission = getUserPermissionFromDB(username);
		return userPermission;
	}

	/**
	 * 从数据库查询用户权限信息
	 */
	private JSONObject getUserPermissionFromDB(String username) {
		JSONObject userPermission = permissionDao.getUserPermission(username);
		//管理员角色ID为1
		int adminRoleId = 1;
		//如果是管理员
		String roleIdKey = "roleId";
		if (adminRoleId == userPermission.getIntValue(roleIdKey)) {
			//查询所有菜单  所有权限
			Set<String> menuList = permissionDao.getAllMenu();
			Set<String> permissionList = permissionDao.getAllPermission();
			userPermission.put("menuList", menuList);
			userPermission.put("permissionList", permissionList);
		}
		return userPermission;
	}
}
