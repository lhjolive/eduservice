package com.edu.dragon.service;

import org.springframework.data.domain.Page;

import com.alibaba.fastjson.JSONObject;
import com.edu.dragon.entity.CoursInfo;

/**
 * 
 * @author: olive
 * @description: 课程信息service类
 * @date: 2021-01-26 05:26:37
 */
public interface CoursInfoService {

	/**
	 * 新增课程信息
	 */
	JSONObject addCoursInfo(JSONObject jsonObject);

	/**
	 * 课程信息列表
	 */
	Page<CoursInfo> listCoursInfo(JSONObject jsonObject);

	/**
	 * 更新课程信息
	 */
	JSONObject updateCoursInfo(JSONObject jsonObject);
}
