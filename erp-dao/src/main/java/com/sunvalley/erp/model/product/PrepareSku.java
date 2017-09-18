package com.sunvalley.erp.model.product;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import java.math.BigDecimal;
import java.io.Serializable;

/**
* @Description: table:PrepareSku
* @author
* @date 2017-09-18 12:24:14
*/
public class PrepareSku implements Serializable{

	//===========================================代码生成开始============================================
	private static final long serialVersionUID = 1L;
    //columns 开始
    private java.lang.Integer id;//
    private java.lang.String preSku;//
    private java.lang.String sku;//sku
    private java.lang.String model;//
    private java.lang.Integer modelId;//model_id
    private BigDecimal rmaRatio;//rma比例
    private java.lang.Integer skuid;//
    private java.lang.String purspec;//
    private java.lang.Integer status;//1:新建，2:转正，3提交
    private java.lang.Integer saleQty;//预估销售数量
    private java.lang.Integer marketCapacity;//预估市场容量
    private java.util.Date mpDate;//mp时间
    private java.lang.Integer color;//颜色
    private java.lang.String productName;//产品名称
    private java.lang.String remark;//备注
    private java.lang.Integer createUserId;//创建人
    private java.util.Date createDate;//创建时间
    private java.lang.Integer region;//销售区域
    private java.util.Date updateDate;//修改时间
    private java.lang.Integer updateUserId;//修改人
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
	public void setPreSku(java.lang.String value) {
		this.preSku = value;
	}
	
	/**
     * 
     */
	public java.lang.String getPreSku() {
		return this.preSku;
	}

  	/**
     * sku
     *
     * @param value
     */
	public void setSku(java.lang.String value) {
		this.sku = value;
	}
	
	/**
     * sku
     */
	public java.lang.String getSku() {
		return this.sku;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setModel(java.lang.String value) {
		this.model = value;
	}
	
	/**
     * 
     */
	public java.lang.String getModel() {
		return this.model;
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
     * rma比例
     *
     * @param value
     */
	public void setRmaRatio(BigDecimal value) {
		this.rmaRatio = value;
	}
	
	/**
     * rma比例
     */
	public BigDecimal getRmaRatio() {
		return this.rmaRatio;
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
	public void setPurspec(java.lang.String value) {
		this.purspec = value;
	}
	
	/**
     * 
     */
	public java.lang.String getPurspec() {
		return this.purspec;
	}

  	/**
     * 1:新建，2:转正，3提交
     *
     * @param value
     */
	public void setStatus(java.lang.Integer value) {
		this.status = value;
	}
	
	/**
     * 1:新建，2:转正，3提交
     */
	public java.lang.Integer getStatus() {
		return this.status;
	}

  	/**
     * 预估销售数量
     *
     * @param value
     */
	public void setSaleQty(java.lang.Integer value) {
		this.saleQty = value;
	}
	
	/**
     * 预估销售数量
     */
	public java.lang.Integer getSaleQty() {
		return this.saleQty;
	}

  	/**
     * 预估市场容量
     *
     * @param value
     */
	public void setMarketCapacity(java.lang.Integer value) {
		this.marketCapacity = value;
	}
	
	/**
     * 预估市场容量
     */
	public java.lang.Integer getMarketCapacity() {
		return this.marketCapacity;
	}

  	/**
     * mp时间
     *
     * @param value
     */
	public void setMpDate(java.util.Date value) {
		this.mpDate = value;
	}
	
	/**
     * mp时间
     */
	public java.util.Date getMpDate() {
		return this.mpDate;
	}

  	/**
     * 颜色
     *
     * @param value
     */
	public void setColor(java.lang.Integer value) {
		this.color = value;
	}
	
	/**
     * 颜色
     */
	public java.lang.Integer getColor() {
		return this.color;
	}

  	/**
     * 产品名称
     *
     * @param value
     */
	public void setProductName(java.lang.String value) {
		this.productName = value;
	}
	
	/**
     * 产品名称
     */
	public java.lang.String getProductName() {
		return this.productName;
	}

  	/**
     * 备注
     *
     * @param value
     */
	public void setRemark(java.lang.String value) {
		this.remark = value;
	}
	
	/**
     * 备注
     */
	public java.lang.String getRemark() {
		return this.remark;
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
     * 销售区域
     *
     * @param value
     */
	public void setRegion(java.lang.Integer value) {
		this.region = value;
	}
	
	/**
     * 销售区域
     */
	public java.lang.Integer getRegion() {
		return this.region;
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
     * 修改人
     *
     * @param value
     */
	public void setUpdateUserId(java.lang.Integer value) {
		this.updateUserId = value;
	}
	
	/**
     * 修改人
     */
	public java.lang.Integer getUpdateUserId() {
		return this.updateUserId;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("id",getId())
			.append("preSku",getPreSku())
			.append("sku",getSku())
			.append("model",getModel())
			.append("modelId",getModelId())
			.append("rmaRatio",getRmaRatio())
			.append("skuid",getSkuid())
			.append("purspec",getPurspec())
			.append("status",getStatus())
			.append("saleQty",getSaleQty())
			.append("marketCapacity",getMarketCapacity())
			.append("mpDate",getMpDate())
			.append("color",getColor())
			.append("productName",getProductName())
			.append("remark",getRemark())
			.append("createUserId",getCreateUserId())
			.append("createDate",getCreateDate())
			.append("region",getRegion())
			.append("updateDate",getUpdateDate())
			.append("updateUserId",getUpdateUserId())
			.toString();
	}
	//===========================================代码生成结束============================================
}

