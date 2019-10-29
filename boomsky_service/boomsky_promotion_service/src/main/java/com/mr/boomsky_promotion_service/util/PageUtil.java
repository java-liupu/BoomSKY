package com.mr.boomsky_promotion_service.util;

public class PageUtil {

	private Integer page=1;
	private Integer rows=3;
	private Integer startPos;
	
	/*private String sort;*/
	private String order;
	
	/**
	 * calculate(计算)   
	 * 创建人：詹姆斯.赵斯林     
	 * 创建时间：2019年7月12日 上午11:50:44    
	 * 修改人：詹姆斯.赵斯林      
	 * 修改时间：2019年7月12日 上午11:50:44    
	 * 修改备注：
	 */
	public void calculate() {
		startPos = (page-1)*rows;
	}
	
	/*
	public String getSort() {
		return sort;
	}


	public void setSort(String sort) {
		this.sort = sort;
	}
*/

	public String getOrder() {
		return order;
	}


	public void setOrder(String order) {
		this.order = order;
	}


	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getRows() {
		return rows;
	}
	public void setRows(Integer rows) {
		this.rows = rows;
	}
	public Integer getStartPos() {
		return startPos;
	}
	public void setStartPos(Integer startPos) {
		this.startPos = startPos;
	}
	
}
