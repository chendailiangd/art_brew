package com.little.util;

import java.util.List;

public class PageBean<T>{
	private int page;//��ǰҳ
	private int totalCount;//�ܼ�¼
	private int taotalPage;//��ҳ��
	private int pageSize;//ÿҳ��ʾ�ļ�¼
	private List<T> list;//���Product������Ϣ
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
