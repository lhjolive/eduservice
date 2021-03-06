package com.edu.dragon.controller;

import com.alibaba.fastjson.JSONObject;
import com.edu.dragon.service.ArticleService;
import com.edu.dragon.util.CommonUtil;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * 
 * @author: olive
 * @description: 文章Controller
 * @date: 2021-01-26 04:54:34
 */
@RestController
@RequestMapping("/article")
public class ArticleController {

	@Autowired
	private ArticleService articleService;

	/**
	 * 查询文章列表
	 */
	@RequiresPermissions("article:list")
	@GetMapping("/listArticle")
	public JSONObject listArticle(HttpServletRequest request) {
		return articleService.listArticle(CommonUtil.request2Json(request));
	}

	/**
	 * 新增文章
	 */
	@RequiresPermissions("article:add")
	@PostMapping("/addArticle")
	public JSONObject addArticle(@RequestBody JSONObject requestJson) {
		CommonUtil.hasAllRequired(requestJson, "content");
		return articleService.addArticle(requestJson);
	}

	/**
	 * 修改文章
	 */
	@RequiresPermissions("article:update")
	@PostMapping("/updateArticle")
	public JSONObject updateArticle(@RequestBody JSONObject requestJson) {
		CommonUtil.hasAllRequired(requestJson, "id,content");
		return articleService.updateArticle(requestJson);
	}
}
