package com.edu.dragon.dao;

import com.alibaba.fastjson.JSONObject;

import java.util.List;

/**
 * 
 * @author: olive
 * @description: 文章Dao层
 * @date: 2021-01-26 05:23:41
 */
public interface ArticleDao {
	/**
	 * 新增文章
	 */
	int addArticle(JSONObject jsonObject);

	/**
	 * 统计文章总数
	 */
	int countArticle(JSONObject jsonObject);

	/**
	 * 文章列表
	 */
	List<JSONObject> listArticle(JSONObject jsonObject);

	/**
	 * 更新文章
	 */
	int updateArticle(JSONObject jsonObject);
}
