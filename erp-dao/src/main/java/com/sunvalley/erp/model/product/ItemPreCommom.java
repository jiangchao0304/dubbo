package com.sunvalley.erp.model.product;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.math.BigDecimal;

/**
* @Description: table:ItemPreCommom
* @author
* @date 2017-09-15 04:42:55
*/
public class ItemPreCommom implements Serializable{

	//===========================================代码生成开始============================================
	private static final long serialVersionUID = 1L;
    //columns 开始
    private java.lang.Integer id;//
    private java.lang.Integer modelId;//model_id
    private java.lang.Integer standardSize;//尺寸
    private BigDecimal weight;//重量
    private java.lang.Integer shippingType;//常用运输方式
    private BigDecimal mc;//预估MC
    private java.util.Date setupDate;//预估立项时间
    private BigDecimal salePrice;//预估销售价
    private java.lang.String customName;//预设报关品名
    private java.lang.Integer saleDept;//销售部门
    private java.lang.Integer createUserId;//创建人
    private java.util.Date createDate;//创建时间
    private java.util.Date updateDate;//修改时间
    private java.lang.Integer updateUserId;//创建人
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
     * model_id
     *
     * @param value
     */
	public void setModelId(java.lang.Integer value) {
		this.modelId = value;
	}
	
	/**
     * model_id
     */
	public java.lang.Integer getModelId() {
		return this.modelId;
	}

  	/**
     * 尺寸
     *
     * @param value
     */
	public void setStandardSize(java.lang.Integer value) {
		this.standardSize = value;
	}
	
	/**
     * 尺寸
     */
	public java.lang.Integer getStandardSize() {
		return this.standardSize;
	}

  	/**
     * 重量
     *
     * @param value
     */
	public void setWeight(BigDecimal value) {
		this.weight = value;
	}
	
	/**
     * 重量
     */
	public BigDecimal getWeight() {
		return this.weight;
	}

  	/**
     * 常用运输方式
     *
     * @param value
     */
	public void setShippingType(java.lang.Integer value) {
		this.shippingType = value;
	}
	
	/**
     * 常用运输方式
     */
	public java.lang.Integer getShippingType() {
		return this.shippingType;
	}

  	/**
     * 预估MC
     *
     * @param value
     */
	public void setMc(BigDecimal value) {
		this.mc = value;
	}
	
	/**
     * 预估MC
     */
	public BigDecimal getMc() {
		return this.mc;
	}

  	/**
     * 预估立项时间
     *
     * @param value
     */
	public void setSetupDate(java.util.Date value) {
		this.setupDate = value;
	}
	
	/**
     * 预估立项时间
     */
	public java.util.Date getSetupDate() {
		return this.setupDate;
	}

  	/**
     * 预估销售价
     *
     * @param value
     */
	public void setSalePrice(BigDecimal value) {
		this.salePrice = value;
	}
	
	/**
     * 预估销售价
     */
	public BigDecimal getSalePrice() {
		return this.salePrice;
	}

  	/**
     * 预设报关品名
     *
     * @param value
     */
	public void setCustomName(java.lang.String value) {
		this.customName = value;
	}
	
	/**
     * 预设报关品名
     */
	public java.lang.String getCustomName() {
		return this.customName;
	}

  	/**
     * 销售部门
     *
     * @param value
     */
	public void setSaleDept(java.lang.Integer value) {
		this.saleDept = value;
	}
	
	/**
     * 销售部门
     */
	public java.lang.Integer getSaleDept() {
		return this.saleDept;
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

  	/**
     * 修改时间
     *
     * @param value
     */
	public void setUpdateDate(java.util.Date value) {
		this.updateDate = value;
	}
	
	/**
     * 修改时间
     */
	public java.util.Date getUpdateDate() {
		return this.updateDate;
	}

  	/**
     * 创建人
     *
     * @param value
     */
	public void setUpdateUserId(java.lang.Integer value) {
		this.updateUserId = value;
	}
	
	/**
     * 创建人
     */
	public java.lang.Integer getUpdateUserId() {
		return this.updateUserId;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("id",getId())
			.append("modelId",getModelId())
			.append("standardSize",getStandardSize())
			.append("weight",getWeight())
			.append("shippingType",getShippingType())
			.append("mc",getMc())
			.append("setupDate",getSetupDate())
			.append("salePrice",getSalePrice())
			.append("customName",getCustomName())
			.append("saleDept",getSaleDept())
			.append("createUserId",getCreateUserId())
			.append("createDate",getCreateDate())
			.append("updateDate",getUpdateDate())
			.append("updateUserId",getUpdateUserId())
			.toString();
	}
	//===========================================代码生成结束============================================
}

