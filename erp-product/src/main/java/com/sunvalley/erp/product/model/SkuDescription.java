package com.sunvalley.erp.product.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import java.math.BigDecimal;
import java.io.Serializable;

/**
* @Description: table:SkuDescription
* @author
* @date 2017-10-12 04:27:53
*/
public class SkuDescription implements Serializable{

	//===========================================代码生成开始============================================
	private static final long serialVersionUID = 1L;
    //columns 开始
    private java.lang.Integer id;//
    private java.lang.Integer skuid;//
    private java.lang.String descSourc;//
    private java.lang.String action;//
    private java.lang.String updatepicuser;//
    private java.util.Date updatepicdate;//
	//columns 结束



  	/**
     * 
     *
     * @param value
     */
	public void setId(java.lang.Integer value) {
		this.id = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getId() {
		return this.id;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setSkuid(java.lang.Integer value) {
		this.skuid = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getSkuid() {
		return this.skuid;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setDescSourc(java.lang.String value) {
		this.descSourc = value;
	}
	
	/**
     * 
     */
	public java.lang.String getDescSourc() {
		return this.descSourc;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setAction(java.lang.String value) {
		this.action = value;
	}
	
	/**
     * 
     */
	public java.lang.String getAction() {
		return this.action;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setUpdatepicuser(java.lang.String value) {
		this.updatepicuser = value;
	}
	
	/**
     * 
     */
	public java.lang.String getUpdatepicuser() {
		return this.updatepicuser;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setUpdatepicdate(java.util.Date value) {
		this.updatepicdate = value;
	}
	
	/**
     * 
     */
	public java.util.Date getUpdatepicdate() {
		return this.updatepicdate;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("id",getId())
			.append("skuid",getSkuid())
			.append("descSourc",getDescSourc())
			.append("action",getAction())
			.append("updatepicuser",getUpdatepicuser())
			.append("updatepicdate",getUpdatepicdate())
			.toString();
	}
	//===========================================代码生成结束============================================
}

