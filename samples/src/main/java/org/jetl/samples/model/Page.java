package org.jetl.samples.model;

public class Page <E> {

	private E result;
	private int totalCount;
	private int pageIndex;
	private int pageSize;
	
	public Page(int pageIndex, int pageSize, int totalCount, E result){
		this.result = result;
		this.pageSize = pageSize;
		this.pageIndex = pageIndex;
		this.totalCount = totalCount;
	}

	public E getResult() {
		return result;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public int getPageIndex() {
		return pageIndex;
	}

	public int getPageSize() {
		return pageSize;
	}
	
}