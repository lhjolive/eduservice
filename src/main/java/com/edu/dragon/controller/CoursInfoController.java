package com.edu.dragon.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.edu.dragon.entity.CoursInfo;
import com.edu.dragon.service.CoursInfoService;
import com.edu.dragon.util.CommonUtil;
import com.edu.dragon.util.model.ResultDto;

/**
 * 
 * @author: olive
 * @description: 课程信息controller
 * @date: 2021-01-26 04:54:16
 */
@RestController
@RequestMapping("/coursInfo")
public class CoursInfoController {

	@Autowired
	private CoursInfoService coursInfoService;
	
	/**
	 * 
	 * @description：课程信息列表查询
	 * @param request
	 * @return JSONObject
	 */
	@RequiresPermissions("coursInfo:list")
	@GetMapping("/listCoursInfo")
	public ResultDto<Page<CoursInfo>> listCoursInfo(HttpServletRequest request) {
		Page<CoursInfo> res = coursInfoService.listCoursInfo(CommonUtil.request2Json(request));
		return new ResultDto<Page<CoursInfo>>(res);
	}
	
	/**
	 * 
	 * @description：新增课程信息
	 * @param requestJson
	 * @return JSONObject
	 */
	@RequiresPermissions("coursInfo:add")
	@PostMapping("/addCoursInfo")
	public JSONObject addCoursInfo(@RequestBody JSONObject requestJson) {
		CommonUtil.hasAllRequired(requestJson, "");
		return coursInfoService.addCoursInfo(requestJson);
	}
	
	/**
	 * 
	 * @description：修改
	 * @param requestJson
	 * @return JSONObject
	 */
	@RequiresPermissions("coursInfo:update")
	@PostMapping("/updateCoursInfo")
	public JSONObject updateCoursInfo(@RequestBody JSONObject requestJson) {
		CommonUtil.hasAllRequired(requestJson, "");
		return coursInfoService.updateCoursInfo(requestJson);
	}
}
