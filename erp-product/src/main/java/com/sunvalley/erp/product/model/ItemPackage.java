package com.sunvalley.erp.product.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import java.math.BigDecimal;
import java.io.Serializable;

/**
* @Description: table:ItemPackage
* @author
* @date 2017-09-30 12:10:43
*/
public class ItemPackage implements Serializable{

	//===========================================代码生成开始============================================
	private static final long serialVersionUID = 1L;
    //columns 开始
    private java.lang.Integer id;//
    private java.lang.Integer skuid;//
    private java.lang.String sku;//
    private Short len;//
    private Short width;//
    private Short height;//
    private BigDecimal weight;//
    private BigDecimal volweight;//
    private java.lang.Integer capacity;//
    private Integer linestate;//
    private java.lang.String purdesc;//
    private java.util.Date createdate;//
    private java.lang.Integer createuserid;//
    private java.util.Date updatedate;//
    private java.lang.Integer updateuserid;//
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
	public void setLen(Short value) {
		this.len = value;
	}
	
	/**
     * 
     */
	public Short getLen() {
		return this.len;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setWidth(Short value) {
		this.width = value;
	}
	
	/**
     * 
     */
	public Short getWidth() {
		return this.width;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setHeight(Short value) {
		this.height = value;
	}
	
	/**
     * 
     */
	public Short getHeight() {
		return this.height;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setWeight(BigDecimal value) {
		this.weight = value;
	}
	
	/**
     * 
     */
	public BigDecimal getWeight() {
		return this.weight;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setVolweight(BigDecimal value) {
		this.volweight = value;
	}
	
	/**
     * 
     */
	public BigDecimal getVolweight() {
		return this.volweight;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setCapacity(java.lang.Integer value) {
		this.capacity = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getCapacity() {
		return this.capacity;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setLinestate(Integer value) {
		this.linestate = value;
	}
	
	/**
     * 
     */
	public Integer getLinestate() {
		return this.linestate;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setPurdesc(java.lang.String value) {
		this.purdesc = value;
	}
	
	/**
     * 
     */
	public java.lang.String getPurdesc() {
		return this.purdesc;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setCreatedate(java.util.Date value) {
		this.createdate = value;
	}
	
	/**
     * 
     */
	public java.util.Date getCreatedate() {
		return this.createdate;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setCreateuserid(java.lang.Integer value) {
		this.createuserid = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getCreateuserid() {
		return this.createuserid;
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
	public void setUpdateuserid(java.lang.Integer value) {
		this.updateuserid = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getUpdateuserid() {
		return this.updateuserid;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("id",getId())
			.append("skuid",getSkuid())
			.append("sku",getSku())
			.append("len",getLen())
			.append("width",getWidth())
			.append("height",getHeight())
			.append("weight",getWeight())
			.append("volweight",getVolweight())
			.append("capacity",getCapacity())
			.append("linestate",getLinestate())
			.append("purdesc",getPurdesc())
			.append("createdate",getCreatedate())
			.append("createuserid",getCreateuserid())
			.append("updatedate",getUpdatedate())
			.append("updateuserid",getUpdateuserid())
			.toString();
	}
	//===========================================代码生成结束============================================
}

