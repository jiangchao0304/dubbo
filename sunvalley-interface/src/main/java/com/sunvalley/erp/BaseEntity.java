package com.sunvalley.erp;

import java.util.Date;

/**
 * @author Cheng Liangwei
 * @version 1.1
 * @date 2010-03-23
 * @see 基础的实体类
 * */
public class BaseEntity implements IBaseEntity{

	private int rowState;// 行状态
	private String errormsg;// 错误信息键值
	private boolean existCheck = false;// 是否检测存在性，默认是不检测
	private boolean isBackPkID=false;//是否返回主键ID
	private int user_id;// 操作员
	private Date create_date;// 创建日期
	private Date update_date;// 修改日期
	private int updateuserid;//更改人
	private Date updatedate;//更改日期
	private int versionno;// 版本号
	private int seller_id;// 渠道ID

	//不带下划线的
	private Date createdate;// 创建日期
	private int createuserid;//更改人
	
	//日期输出为字符串类型
	private String createDateStr;
	private String updateDateStr;
	
	public int getSeller_id() {
		return seller_id;
	}

	public void setSeller_id(int sellerId) {
		seller_id = sellerId;
	}

	public int getRowState() {
		return rowState;
	}

	public void setRowState(int rowState) {
		this.rowState = rowState;
	}

	public String getErrormsg() {
		return errormsg;
	}

	public void setErrormsg(String errormsg) {
		this.errormsg = errormsg;
	}

	public boolean isExistCheck() {
		return existCheck;
	}

	public void setExistCheck(boolean existCheck) {
		this.existCheck = existCheck;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int userId) {
		user_id = userId;
	}

	public Date getCreate_date() {
		return create_date;
	}

	public void setCreate_date(Date createDate) {
		create_date = createDate;
	}

	public Date getUpdate_date() {
		return update_date;
	}

	public void setUpdate_date(Date updateDate) {
		update_date = updateDate;
	}

	public int getVersionno() {
		return versionno;
	}

	public void setVersionno(int versionno) {
		this.versionno = versionno;
	}
	
	//设置新增的主键
	public void setPkValue(int pkid,IBaseEntity ibe) {
	}

	public int getUpdateuserid() {
		return updateuserid;
	}

	public void setUpdateuserid(int updateuserid) {
		this.updateuserid = updateuserid;
	}

	public Date getUpdatedate() {
		return updatedate;
	}

	public void setUpdatedate(Date updatedate) {
		this.updatedate = updatedate;
	}

	public boolean isBackPkID() {
		return isBackPkID;
	}

	public void setBackPkID(boolean isBackPkID) {
		this.isBackPkID = isBackPkID;
	}

	public Date getCreatedate() {
		return createdate;
	}

	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}

	public int getCreateuserid() {
		return createuserid;
	}

	public void setCreateuserid(int createuserid) {
		this.createuserid = createuserid;
	}

	public String getCreateDateStr() {
		return createDateStr;
	}

	public void setCreateDateStr(String createDateStr) {
		this.createDateStr = createDateStr;
	}

	public String getUpdateDateStr() {
		return updateDateStr;
	}

	public void setUpdateDateStr(String updateDateStr) {
		this.updateDateStr = updateDateStr;
	}
	
}
