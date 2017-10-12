package com.sunvalley.erp.product.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import java.math.BigDecimal;
import java.io.Serializable;

/**
* @Description: table:ProductLine
* @author
* @date 2017-10-12 04:26:29
*/
public class ProductLine implements Serializable{

	//===========================================代码生成开始============================================
	private static final long serialVersionUID = 1L;
    //columns 开始
    private java.lang.Integer id;//
    private java.lang.Integer useType;//
    private java.lang.Integer productType;//1:normal,2:大类，3:小类
    private java.lang.String productLineName;//产品线名称
    private java.lang.Integer createUserId;//
    private java.util.Date createDate;//
    private java.lang.Integer status;//状态：1为有效，0为无效
    private java.lang.String productCode;//编码
    private java.lang.String modelNo;//型号
    private java.lang.Integer updateUserId;//
    private java.util.Date updateDate;//
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
	public void setUseType(java.lang.Integer value) {
		this.useType = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getUseType() {
		return this.useType;
	}

  	/**
     * 1:normal,2:大类，3:小类
     *
     * @param value
     */
	public void setProductType(java.lang.Integer value) {
		this.productType = value;
	}
	
	/**
     * 1:normal,2:大类，3:小类
     */
	public java.lang.Integer getProductType() {
		return this.productType;
	}

  	/**
     * 产品线名称
     *
     * @param value
     */
	public void setProductLineName(java.lang.String value) {
		this.productLineName = value;
	}
	
	/**
     * 产品线名称
     */
	public java.lang.String getProductLineName() {
		return this.productLineName;
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
     * 状态：1为有效，0为无效
     *
     * @param value
     */
	public void setStatus(java.lang.Integer value) {
		this.status = value;
	}
	
	/**
     * 状态：1为有效，0为无效
     */
	public java.lang.Integer getStatus() {
		return this.status;
	}

  	/**
     * 编码
     *
     * @param value
     */
	public void setProductCode(java.lang.String value) {
		this.productCode = value;
	}
	
	/**
     * 编码
     */
	public java.lang.String getProductCode() {
		return this.productCode;
	}

  	/**
     * 型号
     *
     * @param value
     */
	public void setModelNo(java.lang.String value) {
		this.modelNo = value;
	}
	
	/**
     * 型号
     */
	public java.lang.String getModelNo() {
		return this.modelNo;
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

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("id",getId())
			.append("useType",getUseType())
			.append("productType",getProductType())
			.append("productLineName",getProductLineName())
			.append("createUserId",getCreateUserId())
			.append("createDate",getCreateDate())
			.append("status",getStatus())
			.append("productCode",getProductCode())
			.append("modelNo",getModelNo())
			.append("updateUserId",getUpdateUserId())
			.append("updateDate",getUpdateDate())
			.toString();
	}
	//===========================================代码生成结束============================================
}

