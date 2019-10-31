package com.mr.boomsky_user_service.util;

import java.util.List;

public class PageUtil<T> {

	//当前页
	private Integer pageNum=1;

	// 每页条数
	private Integer pageSize=10;

	// 开始条数
	private Integer startPos;

	private Integer totalPage;

	// 总条数 easyui可以通过total计算内容
	private Long total;

	private List<T> list;

	public void calculate() {
		this.totalPage = (pageNum)*pageSize;
	}

	public Integer getPageNum() {
		return pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getStartPos() {
		return startPos;
	}

	public void setStartPos(Integer startPos) {
		this.startPos = startPos;
	}

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

	public Integer getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}
}
