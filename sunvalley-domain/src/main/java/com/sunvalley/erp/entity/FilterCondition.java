package com.sunvalley.erp.entity;

public class FilterCondition {
	
	private String sku="";
	private int categoryid=0;
	private int isactive=-1;
	private int pageNo=1;
	private int pageSize=10;
	private int maxPage;
	private int totalcout;
	//private List<Sku> skuList;
	
	public String getSku() {
		return sku;
	}
	public int getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public int getPageNo() {
		return pageNo;
	}
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getMaxPage() {
		return maxPage;
	}
	public void setMaxPage(int maxPage) {
		this.maxPage = maxPage;
	}

	public int getTotalcout() {
		return totalcout;
	}
	public void setTotalcout(int totalcout) {
		this.totalcout = totalcout;
	}
	public int getIsactive() {
		return isactive;
	}
	public void setIsactive(int isactive) {
		this.isactive = isactive;
	}
}
