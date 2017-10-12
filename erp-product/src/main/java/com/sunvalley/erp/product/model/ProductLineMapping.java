package com.sunvalley.erp.product.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import java.math.BigDecimal;
import java.io.Serializable;

/**
* @Description: table:ProductLineMapping
* @author
* @date 2017-10-12 04:26:39
*/
public class ProductLineMapping implements Serializable{

	//===========================================代码生成开始============================================
	private static final long serialVersionUID = 1L;
    //columns 开始
    private java.lang.Integer id;//
    private java.lang.Integer productLineId;//产品线id
    private java.lang.Integer mappingId;//
    private java.lang.Integer type;//1表示sku 2,大小类关系，3编辑权限，4，数据权限
    private java.lang.Integer createUserId;//
    private java.util.Date createDate;//
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
     * 产品线id
     *
     * @param value
     */
	public void setProductLineId(java.lang.Integer value) {
		this.productLineId = value;
	}
	
	/**
     * 产品线id
     */
	public java.lang.Integer getProductLineId() {
		return this.productLineId;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setMappingId(java.lang.Integer value) {
		this.mappingId = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getMappingId() {
		return this.mappingId;
	}

  	/**
     * 1表示sku 2,大小类关系，3编辑权限，4，数据权限
     *
     * @param value
     */
	public void setType(java.lang.Integer value) {
		this.type = value;
	}
	
	/**
     * 1表示sku 2,大小类关系，3编辑权限，4，数据权限
     */
	public java.lang.Integer getType() {
		return this.type;
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

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("id",getId())
			.append("productLineId",getProductLineId())
			.append("mappingId",getMappingId())
			.append("type",getType())
			.append("createUserId",getCreateUserId())
			.append("createDate",getCreateDate())
			.toString();
	}
	//===========================================代码生成结束============================================
}

