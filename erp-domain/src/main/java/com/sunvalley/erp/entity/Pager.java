package com.sunvalley.erp.entity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Cheng Liangwei
 * @version 1.0
 * @date 2010-03-23
 * @see 分页信息的实体类，其中的模板T是指查询分页结果时的实体的类型
 * */
public class Pager<T>{
	
	private int pageSize=20;//页的大小
	private int rowCount=0;//行数
	private int pageNo=1;//页的编号
	private List<T> list;//结果列表
	private String filterSql;//所要进行查询的条件限制
	private HashMap<String, Object> map;
	
	public HashMap<String, Object> getMap() {
		return map;
	}

	public void setMap(HashMap<String, Object> map) {
		this.map = map;
	}

	public Pager(){}
	
	public Pager(int pageNo,int pageSize)
	{
		this.pageNo = pageNo;
		this.pageSize = pageSize;
	}
	
	public Pager(int pageNo,int pageSize,String filterSql){
		this.pageNo=pageNo;
		this.pageSize=pageSize;
		this.filterSql=filterSql;
	}
	
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public void setRowCount(int rowCount) {
		this.rowCount = rowCount;
	}
	
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getPageSize() {
		return pageSize;
	}

	public int getPageNo() {
		return pageNo;
	}

	public int getOffset()
	{
		return (pageNo-1) * pageSize;
	}
	
	public int getRowCount() {
		return rowCount;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}
	
	public String getFilterSql() {
		return filterSql;
	}

	public void setFilterSql(String filterSql) {
		this.filterSql = filterSql;
	}
	
	public Map<String, Object> getPageMap(Map<String, Object> map) {
		map.put("pageNo", pageNo);
		map.put("pageSize", pageSize);
		map.put("rowCount", rowCount);
		map.put("list", list);
		map.put("map", this.map);
		return map;
	}
}
