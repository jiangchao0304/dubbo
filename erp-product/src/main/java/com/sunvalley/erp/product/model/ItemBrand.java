package com.sunvalley.erp.product.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import java.math.BigDecimal;
import java.io.Serializable;

/**
* @Description: table:ItemBrand
* @author
* @date 2017-10-13 02:10:46
*/
public class ItemBrand implements Serializable{

	//===========================================代码生成开始============================================
	private static final long serialVersionUID = 1L;
    //columns 开始
    private java.lang.Integer brandId;//
    private java.lang.Integer parentId;//
    private java.lang.String brandDesc;//
    private java.lang.Integer orderno;//
    private java.lang.String note;//
    private BigDecimal ratio;//
    private java.lang.String brandCode;//品牌代码
    private java.lang.Integer hasused;//是否使用：1:使用;0:不使用
    private java.lang.Integer controlValue;//控制值
    private BigDecimal warningProportion;//预警比例
	//columns 结束



  	/**
     * 
     *
     * @param value
     */
	public void setBrandId(java.lang.Integer value) {
		this.brandId = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getBrandId() {
		return this.brandId;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setParentId(java.lang.Integer value) {
		this.parentId = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getParentId() {
		return this.parentId;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setBrandDesc(java.lang.String value) {
		this.brandDesc = value;
	}
	
	/**
     * 
     */
	public java.lang.String getBrandDesc() {
		return this.brandDesc;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setOrderno(java.lang.Integer value) {
		this.orderno = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getOrderno() {
		return this.orderno;
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
	public void setRatio(BigDecimal value) {
		this.ratio = value;
	}
	
	/**
     * 
     */
	public BigDecimal getRatio() {
		return this.ratio;
	}

  	/**
     * 品牌代码
     *
     * @param value
     */
	public void setBrandCode(java.lang.String value) {
		this.brandCode = value;
	}
	
	/**
     * 品牌代码
     */
	public java.lang.String getBrandCode() {
		return this.brandCode;
	}

  	/**
     * 是否使用：1:使用;0:不使用
     *
     * @param value
     */
	public void setHasused(java.lang.Integer value) {
		this.hasused = value;
	}
	
	/**
     * 是否使用：1:使用;0:不使用
     */
	public java.lang.Integer getHasused() {
		return this.hasused;
	}

  	/**
     * 控制值
     *
     * @param value
     */
	public void setControlValue(java.lang.Integer value) {
		this.controlValue = value;
	}
	
	/**
     * 控制值
     */
	public java.lang.Integer getControlValue() {
		return this.controlValue;
	}

  	/**
     * 预警比例
     *
     * @param value
     */
	public void setWarningProportion(BigDecimal value) {
		this.warningProportion = value;
	}
	
	/**
     * 预警比例
     */
	public BigDecimal getWarningProportion() {
		return this.warningProportion;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("brandId",getBrandId())
			.append("parentId",getParentId())
			.append("brandDesc",getBrandDesc())
			.append("orderno",getOrderno())
			.append("note",getNote())
			.append("ratio",getRatio())
			.append("brandCode",getBrandCode())
			.append("hasused",getHasused())
			.append("controlValue",getControlValue())
			.append("warningProportion",getWarningProportion())
			.toString();
	}
	//===========================================代码生成结束============================================
}

