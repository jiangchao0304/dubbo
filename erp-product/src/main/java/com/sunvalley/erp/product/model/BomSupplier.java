package com.sunvalley.erp.product.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import java.math.BigDecimal;
import java.io.Serializable;

/**
* @Description: table:BomSupplier
* @author
* @date 2017-09-26 06:43:59
*/
public class BomSupplier implements Serializable{

	//===========================================代码生成开始============================================
	private static final long serialVersionUID = 1L;
    //columns 开始
    private java.lang.Integer id;//
    private java.lang.Integer bomId;//
    private java.lang.Integer skuid;//
    private java.lang.Integer purchaseProperty;//采购属性（特殊）
    private java.lang.Integer supplierId;//供应商id
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

  	/**
     * 采购属性（特殊）
     *
     * @param value
     */
	public void setPurchaseProperty(java.lang.Integer value) {
		this.purchaseProperty = value;
	}
	
	/**
     * 采购属性（特殊）
     */
	public java.lang.Integer getPurchaseProperty() {
		return this.purchaseProperty;
	}

  	/**
     * 供应商id
     *
     * @param value
     */
	public void setSupplierId(java.lang.Integer value) {
		this.supplierId = value;
	}
	
	/**
     * 供应商id
     */
	public java.lang.Integer getSupplierId() {
		return this.supplierId;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("id",getId())
			.append("bomId",getBomId())
			.append("skuid",getSkuid())
			.append("purchaseProperty",getPurchaseProperty())
			.append("supplierId",getSupplierId())
			.toString();
	}
	//===========================================代码生成结束============================================
}

