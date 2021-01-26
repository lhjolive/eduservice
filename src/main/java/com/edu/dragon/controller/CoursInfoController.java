package com.edu.dragon.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.web.bind.annotation.GetMapping;

import com.alibaba.fastjson.JSONObject;
import com.edu.dragon.util.CommonUtil;

/**
 * 
 * @author: olive
 * @description: 课程信息controller
 * @date: 2021-01-26 04:54:16
 */
public class CoursInfoController {

	/**
	 * 
	 * @description：TODO请描述该方法的功能
	 * @param request
	 * @return JSONObject
	 */
	@RequiresPermissions("coursInfo:list")
	@GetMapping("/listCoursInfo")
	public JSONObject listCoursInfo(HttpServletRequest request) {
		
		JSONObject json = new JSONObject();
		return null;
		//return articleService.listArticle(CommonUtil.request2Json(request));
	}
}
