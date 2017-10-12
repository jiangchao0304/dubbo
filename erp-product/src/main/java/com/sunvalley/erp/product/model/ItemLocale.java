package com.sunvalley.erp.product.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import java.math.BigDecimal;
import java.io.Serializable;

/**
* @Description: table:ItemLocale
* @author
* @date 2017-10-12 04:24:05
*/
public class ItemLocale implements Serializable{

	//===========================================代码生成开始============================================
	private static final long serialVersionUID = 1L;
    //columns 开始
    private java.lang.Integer skuid;//
    private Integer langId;//
    private java.lang.String sku;//
    private java.lang.String description;//
    private java.lang.String unitName;//
	//columns 结束



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
	public void setLangId(Integer value) {
		this.langId = value;
	}
	
	/**
     * 
     */
	public Integer getLangId() {
		return this.langId;
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
	public void setDescription(java.lang.String value) {
		this.description = value;
	}
	
	/**
     * 
     */
	public java.lang.String getDescription() {
		return this.description;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setUnitName(java.lang.String value) {
		this.unitName = value;
	}
	
	/**
     * 
     */
	public java.lang.String getUnitName() {
		return this.unitName;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("skuid",getSkuid())
			.append("langId",getLangId())
			.append("sku",getSku())
			.append("description",getDescription())
			.append("unitName",getUnitName())
			.toString();
	}
	//===========================================代码生成结束============================================
}

