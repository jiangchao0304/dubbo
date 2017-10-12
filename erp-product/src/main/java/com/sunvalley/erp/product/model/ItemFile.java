package com.sunvalley.erp.product.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import java.math.BigDecimal;
import java.io.Serializable;

/**
* @Description: table:ItemFile
* @author
* @date 2017-10-12 04:23:13
*/
public class ItemFile implements Serializable{

	//===========================================代码生成开始============================================
	private static final long serialVersionUID = 1L;
    //columns 开始
    private java.lang.Integer itemFileId;//
    private java.lang.Integer fileId;//
    private java.lang.String fileName;//
    private java.lang.Integer fileType;//
    private java.lang.Integer skuId;//
    private java.lang.String sku;//
    private java.lang.Integer userId;//
    private java.lang.String email;//
    private java.lang.String desc;//
    private java.util.Date createDate;//
    private java.util.Date updateDate;//
	//columns 结束



  	/**
     * 
     *
     * @param value
     */
	public void setItemFileId(java.lang.Integer value) {
		this.itemFileId = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getItemFileId() {
		return this.itemFileId;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setFileId(java.lang.Integer value) {
		this.fileId = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getFileId() {
		return this.fileId;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setFileName(java.lang.String value) {
		this.fileName = value;
	}
	
	/**
     * 
     */
	public java.lang.String getFileName() {
		return this.fileName;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setFileType(java.lang.Integer value) {
		this.fileType = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getFileType() {
		return this.fileType;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setSkuId(java.lang.Integer value) {
		this.skuId = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getSkuId() {
		return this.skuId;
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
	public void setUserId(java.lang.Integer value) {
		this.userId = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getUserId() {
		return this.userId;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setEmail(java.lang.String value) {
		this.email = value;
	}
	
	/**
     * 
     */
	public java.lang.String getEmail() {
		return this.email;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setDesc(java.lang.String value) {
		this.desc = value;
	}
	
	/**
     * 
     */
	public java.lang.String getDesc() {
		return this.desc;
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
			.append("itemFileId",getItemFileId())
			.append("fileId",getFileId())
			.append("fileName",getFileName())
			.append("fileType",getFileType())
			.append("skuId",getSkuId())
			.append("sku",getSku())
			.append("userId",getUserId())
			.append("email",getEmail())
			.append("desc",getDesc())
			.append("createDate",getCreateDate())
			.append("updateDate",getUpdateDate())
			.toString();
	}
	//===========================================代码生成结束============================================
}

