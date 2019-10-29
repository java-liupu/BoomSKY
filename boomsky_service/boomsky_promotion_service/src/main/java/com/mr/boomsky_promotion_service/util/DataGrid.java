package com.mr.boomsky_promotion_service.util;

import java.util.List;

public class DataGrid {

	private PageUtil data;
	private Integer total;
	private List rows;
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public List getRows() {
		return rows;
	}
	public void setRows(List rows) {
		this.rows = rows;
	}

	public PageUtil getData() {
		return data;
	}

	public void setData(PageUtil data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "DataGrid{" +
				"data=" + data +
				", total=" + total +
				", rows=" + rows +
				'}';
	}
}
