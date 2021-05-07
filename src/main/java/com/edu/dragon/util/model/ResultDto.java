package com.edu.dragon.util.model;

import org.springframework.data.domain.PageImpl;

import com.github.pagehelper.Page;

public class ResultDto<T> {

	private String code = "1000";
	private String msg = "success";
	private T data;
	private Long total;
	private Integer totalPage;

	public ResultDto() {
	}
	
	public ResultDto(T data) {
		this.data = data;
		if(data instanceof PageImpl) {
			this.total = ((PageImpl) data).getTotalElements();
			this.totalPage = ((PageImpl) data).getTotalPages();
		}
	}
	
	public ResultDto(Long total, Integer totalPage, T data) {
		this.total = total;
		this.totalPage = totalPage;
		this.data = data;
	}
	
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
		if(data instanceof Page) {
			this.total = ((Page) data).getTotal();
			this.totalPage = ((Page) data).getPages();
		}
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public Integer getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}
	
}
