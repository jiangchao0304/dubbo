package com.sunvalley.erp.model.product;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import java.math.BigDecimal;
import java.io.Serializable;

/**
* @Description: table:Bom
* @author
* @date 2017-09-18 12:23:54
*/
public class Bom implements Serializable{

	//===========================================代码生成开始============================================
	private static final long serialVersionUID = 1L;
    //columns 开始
    private java.lang.Integer id;//
    private java.util.Date createDate;//
    private java.lang.Integer createUserId;//
    private java.util.Date updateDate;//
    private java.lang.Integer updateUserId;//
    private java.lang.String bomDesc;//BOM Description
    private java.lang.Integer skuid;//
    private java.lang.Integer combineUnit;//
    private java.lang.Integer purchaseProperty;//
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
	public void setUpdateDate(java.util.Date value) {
		this.updateDate = value;
	}
	
	/**
     * 
     */
	public java.util.Date getUpdateDate() {
		return this.updateDate;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setUpdateUserId(java.lang.Integer value) {
		this.updateUserId = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getUpdateUserId() {
		return this.updateUserId;
	}

  	/**
     * BOM Description
     *
     * @param value
     */
	public void setBomDesc(java.lang.String value) {
		this.bomDesc = value;
	}
	
	/**
     * BOM Description
     */
	public java.lang.String getBomDesc() {
		return this.bomDesc;
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
	public void setCombineUnit(java.lang.Integer value) {
		this.combineUnit = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getCombineUnit() {
		return this.combineUnit;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setPurchaseProperty(java.lang.Integer value) {
		this.purchaseProperty = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getPurchaseProperty() {
		return this.purchaseProperty;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("id",getId())
			.append("createDate",getCreateDate())
			.append("createUserId",getCreateUserId())
			.append("updateDate",getUpdateDate())
			.append("updateUserId",getUpdateUserId())
			.append("bomDesc",getBomDesc())
			.append("skuid",getSkuid())
			.append("combineUnit",getCombineUnit())
			.append("purchaseProperty",getPurchaseProperty())
			.toString();
	}
	//===========================================代码生成结束============================================
}

