package com.little.util;

import java.util.List;

public class PageBean<T>{
	private int page;//当前页
	private int totalCount;//总记录
	private int taotalPage;//总页数
	private int pageSize;//每页显示的记录
	private List<T> list;//存放Product所有信息
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public int getTaotalPage() {
		return taotalPage;
	}
	public void setTaotalPage(int taotalPage) {
		this.taotalPage = taotalPage;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public List<T> getList() {
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
	}
	
	
	

}
