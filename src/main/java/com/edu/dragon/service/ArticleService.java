package com.edu.dragon.service;

import com.alibaba.fastjson.JSONObject;

/**
 * 
 * @author: olive
 * @description: 文章信息service
 * @date: 2021-01-26 05:13:10
 */
public interface ArticleService {
	/**
	 * 新增文章
	 */
	JSONObject addArticle(JSONObject jsonObject);

	/**
	 * 文章列表
	 */
	JSONObject listArticle(JSONObject jsonObject);

	/**
	 * 更新文章
	 */
	JSONObject updateArticle(JSONObject jsonObject);
}
