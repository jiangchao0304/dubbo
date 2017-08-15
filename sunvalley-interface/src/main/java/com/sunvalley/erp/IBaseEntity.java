package com.sunvalley.erp;

import java.util.Date;

/**
 * @author Cheng Liangwei
 * @version 1.0
 * @date 2010-03-24
 * @see 所有与数据库表相关的实体类的接口
 * */
public interface IBaseEntity {

	//设置新增的主键
	public void setPkValue(int pkid, IBaseEntity ib);
	
	public int getSeller_id();

	public void setSeller_id(int sellerId);

	public int getRowState();

	public void setRowState(int rowState);

	public String getErrormsg();

	public void setErrormsg(String errormsg);

	public boolean isExistCheck();

	public void setExistCheck(boolean existCheck);

	public int getUser_id();

	public void setUser_id(int userId);

	public Date getCreate_date();

	public void setCreate_date(Date createDate);

	public Date getUpdate_date();

	public void setUpdate_date(Date updateDate);

	public int getVersionno();

	public void setVersionno(int versionno);
	
	public int getUpdateuserid();

	public void setUpdateuserid(int updateuserid);

	public Date getUpdatedate();

	public void setUpdatedate(Date updatedate);

	public boolean isBackPkID();

	public void setBackPkID(boolean isBackPkID);
	
	public Date getCreatedate() ;

	public void setCreatedate(Date createdate) ;

	public int getCreateuserid() ;

	public void setCreateuserid(int createuserid);
}
