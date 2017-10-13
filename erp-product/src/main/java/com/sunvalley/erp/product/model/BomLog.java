package com.sunvalley.erp.product.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import java.math.BigDecimal;
import java.io.Serializable;

/**
* @Description: table:BomLog
* @author
* @date 2017-10-13 02:09:22
*/
public class BomLog implements Serializable{

	//===========================================代码生成开始============================================
	private static final long serialVersionUID = 1L;
    //columns 开始
    private java.lang.Integer id;//
    private java.lang.String sku;//
    private java.util.Date createDate;//
    private java.lang.Integer createUserId;//
    private java.lang.String remark;//
    private java.lang.Integer bomId;//
    private java.lang.Integer skuid;//
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
	public void setSku(java.lang.String value) {
		this.sku = value;
	}
	
	/**
     * 
     */
	public java.lang.String getSku() {
		return this.sku;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setCreateDate(java.util.Date value) {
		this.createDate = value;
	}
	
	/**
     * 
     */
	public java.util.Date getCreateDate() {
		return this.createDate;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setCreateUserId(java.lang.Integer value) {
		this.createUserId = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getCreateUserId() {
		return this.createUserId;
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
	public void setBomId(java.lang.Integer value) {
		this.bomId = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getBomId() {
		return this.bomId;
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

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("id",getId())
			.append("sku",getSku())
			.append("createDate",getCreateDate())
			.append("createUserId",getCreateUserId())
			.append("remark",getRemark())
			.append("bomId",getBomId())
			.append("skuid",getSkuid())
			.toString();
	}
	//===========================================代码生成结束============================================
}

