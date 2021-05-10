package com.edu.dragon.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.edu.dragon.dao.CoursInfoDao;
import com.edu.dragon.entity.CoursInfo;
import com.edu.dragon.service.CoursInfoService;

/**
 * 
 * @author: olive
 * @description: 课程信息service实现类
 * @date: 2021-01-26 05:26:58
 */
@Service
public class CoursInfoServiceImpl implements CoursInfoService {

	@Autowired
	private CoursInfoDao coursInfoDao;
	
	@Override
	public CoursInfo addCoursInfo(JSONObject jsonObject) {
		CoursInfo coursInfo = JSONObject.toJavaObject(jsonObject, CoursInfo.class);
		coursInfoDao.save(coursInfo);
		return coursInfo;
	}

	@Override
	public Page<CoursInfo> listCoursInfo(JSONObject jsonObject) {
		Pageable pageable = new PageRequest(0, 10);
		Page<CoursInfo> result = coursInfoDao.findAll(pageable);
		return result;
	}

	@Override
	public CoursInfo updateCoursInfo(JSONObject jsonObject) {
		CoursInfo coursInfo = JSONObject.toJavaObject(jsonObject, CoursInfo.class);
		coursInfoDao.save(coursInfo);
		return coursInfo;
	}

}
