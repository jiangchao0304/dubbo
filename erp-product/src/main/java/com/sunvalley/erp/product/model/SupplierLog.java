package com.sunvalley.erp.product.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import java.math.BigDecimal;
import java.io.Serializable;

/**
* @Description: table:SupplierLog
* @author
* @date 2017-10-13 02:13:53
*/
public class SupplierLog implements Serializable{

	//===========================================代码生成开始============================================
	private static final long serialVersionUID = 1L;
    //columns 开始
    private java.lang.Integer supplierlogid;//
    private java.lang.Integer supplierid;//
    private java.lang.Integer operationUserId;//
    private java.util.Date operationDate;//
    private java.lang.Integer operationType;//
    private java.lang.String note;//
    private java.lang.Integer belongsType;//
	//columns 结束



  	/**
     * 
     *
     * @param value
     */
	public void setSupplierlogid(java.lang.Integer value) {
		this.supplierlogid = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getSupplierlogid() {
		return this.supplierlogid;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setSupplierid(java.lang.Integer value) {
		this.supplierid = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getSupplierid() {
		return this.supplierid;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setOperationUserId(java.lang.Integer value) {
		this.operationUserId = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getOperationUserId() {
		return this.operationUserId;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setOperationDate(java.util.Date value) {
		this.operationDate = value;
	}
	
	/**
     * 
     */
	public java.util.Date getOperationDate() {
		return this.operationDate;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setOperationType(java.lang.Integer value) {
		this.operationType = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getOperationType() {
		return this.operationType;
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

  	/**
     * 
     *
     * @param value
     */
	public void setBelongsType(java.lang.Integer value) {
		this.belongsType = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getBelongsType() {
		return this.belongsType;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("supplierlogid",getSupplierlogid())
			.append("supplierid",getSupplierid())
			.append("operationUserId",getOperationUserId())
			.append("operationDate",getOperationDate())
			.append("operationType",getOperationType())
			.append("note",getNote())
			.append("belongsType",getBelongsType())
			.toString();
	}
	//===========================================代码生成结束============================================
}

