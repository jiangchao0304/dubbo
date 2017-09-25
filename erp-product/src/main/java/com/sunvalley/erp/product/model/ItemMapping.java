package com.sunvalley.erp.product.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import java.math.BigDecimal;
import java.io.Serializable;

/**
* @Description: table:ItemMapping
* @author
* @date 2017-09-25 01:05:44
*/
public class ItemMapping implements Serializable{

	//===========================================代码生成开始============================================
	private static final long serialVersionUID = 1L;
    //columns 开始
    private java.lang.Integer id;//
    private java.lang.Integer skuid;//skuId
    private java.lang.String maping;//
    private java.lang.Integer dataType;//数据类型：1、安规数据，2国家数据
    private java.lang.Integer dataOrigin;//数据来源：1、sku，2,预备sku
    private java.lang.Integer createUserId;//创建人
    private java.util.Date createDate;//创建时间
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
     * skuId
     *
     * @param value
     */
	public void setSkuid(java.lang.Integer value) {
		this.skuid = value;
	}
	
	/**
     * skuId
     */
	public java.lang.Integer getSkuid() {
		return this.skuid;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setMaping(java.lang.String value) {
		this.maping = value;
	}
	
	/**
     * 
     */
	public java.lang.String getMaping() {
		return this.maping;
	}

  	/**
     * 数据类型：1、安规数据，2国家数据
     *
     * @param value
     */
	public void setDataType(java.lang.Integer value) {
		this.dataType = value;
	}
	
	/**
     * 数据类型：1、安规数据，2国家数据
     */
	public java.lang.Integer getDataType() {
		return this.dataType;
	}

  	/**
     * 数据来源：1、sku，2,预备sku
     *
     * @param value
     */
	public void setDataOrigin(java.lang.Integer value) {
		this.dataOrigin = value;
	}
	
	/**
     * 数据来源：1、sku，2,预备sku
     */
	public java.lang.Integer getDataOrigin() {
		return this.dataOrigin;
	}

  	/**
     * 创建人
     *
     * @param value
     */
	public void setCreateUserId(java.lang.Integer value) {
		this.createUserId = value;
	}
	
	/**
     * 创建人
     */
	public java.lang.Integer getCreateUserId() {
		return this.createUserId;
	}

  	/**
     * 创建时间
     *
     * @param value
     */
	public void setCreateDate(java.util.Date value) {
		this.createDate = value;
	}
	
	/**
     * 创建时间
     */
	public java.util.Date getCreateDate() {
		return this.createDate;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("id",getId())
			.append("skuid",getSkuid())
			.append("maping",getMaping())
			.append("dataType",getDataType())
			.append("dataOrigin",getDataOrigin())
			.append("createUserId",getCreateUserId())
			.append("createDate",getCreateDate())
			.toString();
	}
	//===========================================代码生成结束============================================
}

