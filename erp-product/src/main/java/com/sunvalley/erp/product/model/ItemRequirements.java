package com.sunvalley.erp.product.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import java.math.BigDecimal;
import java.io.Serializable;

/**
* @Description: table:ItemRequirements
* @author
* @date 2017-10-13 02:12:00
*/
public class ItemRequirements implements Serializable{

	//===========================================代码生成开始============================================
	private static final long serialVersionUID = 1L;
    //columns 开始
    private java.lang.Integer id;//
    private java.lang.Integer skuid;//
    private Integer typeId;//
    private java.lang.String productReq;//
    private java.lang.String purchaseReq;//
    private java.lang.String warehouseReq;//
    private java.util.Date createDate;//
    private java.lang.Integer createuserid;//
    private java.lang.String note;//
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
	public void setTypeId(Integer value) {
		this.typeId = value;
	}
	
	/**
     * 
     */
	public Integer getTypeId() {
		return this.typeId;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setProductReq(java.lang.String value) {
		this.productReq = value;
	}
	
	/**
     * 
     */
	public java.lang.String getProductReq() {
		return this.productReq;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setPurchaseReq(java.lang.String value) {
		this.purchaseReq = value;
	}
	
	/**
     * 
     */
	public java.lang.String getPurchaseReq() {
		return this.purchaseReq;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setWarehouseReq(java.lang.String value) {
		this.warehouseReq = value;
	}
	
	/**
     * 
     */
	public java.lang.String getWarehouseReq() {
		return this.warehouseReq;
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
	public void setNote(java.lang.String value) {
		this.note = value;
	}
	
	/**
     * 
     */
	public java.lang.String getNote() {
		return this.note;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("id",getId())
			.append("skuid",getSkuid())
			.append("typeId",getTypeId())
			.append("productReq",getProductReq())
			.append("purchaseReq",getPurchaseReq())
			.append("warehouseReq",getWarehouseReq())
			.append("createDate",getCreateDate())
			.append("createuserid",getCreateuserid())
			.append("note",getNote())
			.toString();
	}
	//===========================================代码生成结束============================================
}

