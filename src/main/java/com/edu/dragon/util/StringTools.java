package com.edu.dragon.util;

/**
 * 
 * @author: olive
 * @description: String处理类
 * @date: 2021-01-26 05:29:31
 */
public class StringTools {

	public static boolean isNullOrEmpty(String str) {
		return null == str || "".equals(str) || "null".equals(str);
	}

	public static boolean isNullOrEmpty(Object obj) {
		return null == obj || "".equals(obj);
	}
}
