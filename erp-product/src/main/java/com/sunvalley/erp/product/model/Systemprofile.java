package com.sunvalley.erp.product.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import java.math.BigDecimal;
import java.io.Serializable;

/**
* @Description: table:Systemprofile
* @author
* @date 2017-10-11 02:51:00
*/
public class Systemprofile implements Serializable{

	//===========================================代码生成开始============================================
	private static final long serialVersionUID = 1L;
    //columns 开始
    private java.lang.Integer companyid;//
    private java.lang.String category;//
    private java.lang.String fkey;//
    private java.lang.String fvalue;//
    private java.lang.String fdatatype;//
    private java.lang.String reftype;//
    private java.lang.String remark;//
    private java.lang.Integer updateuserid;//
    private java.util.Date updatedate;//
    private Short versionno;//
	//columns 结束



  	/**
     * 
     *
     * @param value
     */
	public void setCompanyid(java.lang.Integer value) {
		this.companyid = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getCompanyid() {
		return this.companyid;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setCategory(java.lang.String value) {
		this.category = value;
	}
	
	/**
     * 
     */
	public java.lang.String getCategory() {
		return this.category;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setFkey(java.lang.String value) {
		this.fkey = value;
	}
	
	/**
     * 
     */
	public java.lang.String getFkey() {
		return this.fkey;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setFvalue(java.lang.String value) {
		this.fvalue = value;
	}
	
	/**
     * 
     */
	public java.lang.String getFvalue() {
		return this.fvalue;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setFdatatype(java.lang.String value) {
		this.fdatatype = value;
	}
	
	/**
     * 
     */
	public java.lang.String getFdatatype() {
		return this.fdatatype;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setReftype(java.lang.String value) {
		this.reftype = value;
	}
	
	/**
     * 
     */
	public java.lang.String getReftype() {
		return this.reftype;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setRemark(java.lang.String value) {
		this.remark = value;
	}
	
	/**
     * 
     */
	public java.lang.String getRemark() {
		return this.remark;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setUpdateuserid(java.lang.Integer value) {
		this.updateuserid = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getUpdateuserid() {
		return this.updateuserid;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setUpdatedate(java.util.Date value) {
		this.updatedate = value;
	}
	
	/**
     * 
     */
	public java.util.Date getUpdatedate() {
		return this.updatedate;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setVersionno(Short value) {
		this.versionno = value;
	}
	
	/**
     * 
     */
	public Short getVersionno() {
		return this.versionno;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("companyid",getCompanyid())
			.append("category",getCategory())
			.append("fkey",getFkey())
			.append("fvalue",getFvalue())
			.append("fdatatype",getFdatatype())
			.append("reftype",getReftype())
			.append("remark",getRemark())
			.append("updateuserid",getUpdateuserid())
			.append("updatedate",getUpdatedate())
			.append("versionno",getVersionno())
			.toString();
	}
	//===========================================代码生成结束============================================
}

