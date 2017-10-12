package com.sunvalley.erp.product.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import java.math.BigDecimal;
import java.io.Serializable;

/**
* @Description: table:ItemCustom
* @author
* @date 2017-10-12 04:23:04
*/
public class ItemCustom implements Serializable{

	//===========================================代码生成开始============================================
	private static final long serialVersionUID = 1L;
    //columns 开始
    private java.lang.Integer id;//
    private java.lang.Integer skuid;//SKUID
    private java.lang.String sku;//SKU名
    private java.lang.String stateid;//出口国
    private java.lang.String cncustomscode;//海关编码中国
    private Integer importchecking;//进口检验
    private Integer exportchecking;//出口检验
    private java.lang.String commodityunit;//单位
    private java.lang.String cncommodityname;//报关品名中国
    private java.lang.Double refundrate;//退税率(%)
    private java.lang.Integer createuserid;//创建用户ID
    private java.util.Date createdate;//创建日期
    private java.lang.Integer updateuserid;//更新用户ID
    private java.util.Date updatedate;//更新日期
    private java.lang.Integer categoryNameId;//
    private java.lang.String customsModel;//
    private java.lang.Integer itemStatus;//状态:1:新建,2:已审核
    private java.lang.Integer skuStatus;//是否启用状态:1:启用,2:禁用
    private java.lang.String reportingElements;//申报要素
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
     * SKUID
     *
     * @param value
     */
	public void setSkuid(java.lang.Integer value) {
		this.skuid = value;
	}
	
	/**
     * SKUID
     */
	public java.lang.Integer getSkuid() {
		return this.skuid;
	}

  	/**
     * SKU名
     *
     * @param value
     */
	public void setSku(java.lang.String value) {
		this.sku = value;
	}
	
	/**
     * SKU名
     */
	public java.lang.String getSku() {
		return this.sku;
	}

  	/**
     * 出口国
     *
     * @param value
     */
	public void setStateid(java.lang.String value) {
		this.stateid = value;
	}
	
	/**
     * 出口国
     */
	public java.lang.String getStateid() {
		return this.stateid;
	}

  	/**
     * 海关编码中国
     *
     * @param value
     */
	public void setCncustomscode(java.lang.String value) {
		this.cncustomscode = value;
	}
	
	/**
     * 海关编码中国
     */
	public java.lang.String getCncustomscode() {
		return this.cncustomscode;
	}

  	/**
     * 进口检验
     *
     * @param value
     */
	public void setImportchecking(Integer value) {
		this.importchecking = value;
	}
	
	/**
     * 进口检验
     */
	public Integer getImportchecking() {
		return this.importchecking;
	}

  	/**
     * 出口检验
     *
     * @param value
     */
	public void setExportchecking(Integer value) {
		this.exportchecking = value;
	}
	
	/**
     * 出口检验
     */
	public Integer getExportchecking() {
		return this.exportchecking;
	}

  	/**
     * 单位
     *
     * @param value
     */
	public void setCommodityunit(java.lang.String value) {
		this.commodityunit = value;
	}
	
	/**
     * 单位
     */
	public java.lang.String getCommodityunit() {
		return this.commodityunit;
	}

  	/**
     * 报关品名中国
     *
     * @param value
     */
	public void setCncommodityname(java.lang.String value) {
		this.cncommodityname = value;
	}
	
	/**
     * 报关品名中国
     */
	public java.lang.String getCncommodityname() {
		return this.cncommodityname;
	}

  	/**
     * 退税率(%)
     *
     * @param value
     */
	public void setRefundrate(java.lang.Double value) {
		this.refundrate = value;
	}
	
	/**
     * 退税率(%)
     */
	public java.lang.Double getRefundrate() {
		return this.refundrate;
	}

  	/**
     * 创建用户ID
     *
     * @param value
     */
	public void setCreateuserid(java.lang.Integer value) {
		this.createuserid = value;
	}
	
	/**
     * 创建用户ID
     */
	public java.lang.Integer getCreateuserid() {
		return this.createuserid;
	}

  	/**
     * 创建日期
     *
     * @param value
     */
	public void setCreatedate(java.util.Date value) {
		this.createdate = value;
	}
	
	/**
     * 创建日期
     */
	public java.util.Date getCreatedate() {
		return this.createdate;
	}

  	/**
     * 更新用户ID
     *
     * @param value
     */
	public void setUpdateuserid(java.lang.Integer value) {
		this.updateuserid = value;
	}
	
	/**
     * 更新用户ID
     */
	public java.lang.Integer getUpdateuserid() {
		return this.updateuserid;
	}

  	/**
     * 更新日期
     *
     * @param value
     */
	public void setUpdatedate(java.util.Date value) {
		this.updatedate = value;
	}
	
	/**
     * 更新日期
     */
	public java.util.Date getUpdatedate() {
		return this.updatedate;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setCategoryNameId(java.lang.Integer value) {
		this.categoryNameId = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getCategoryNameId() {
		return this.categoryNameId;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setCustomsModel(java.lang.String value) {
		this.customsModel = value;
	}
	
	/**
     * 
     */
	public java.lang.String getCustomsModel() {
		return this.customsModel;
	}

  	/**
     * 状态:1:新建,2:已审核
     *
     * @param value
     */
	public void setItemStatus(java.lang.Integer value) {
		this.itemStatus = value;
	}
	
	/**
     * 状态:1:新建,2:已审核
     */
	public java.lang.Integer getItemStatus() {
		return this.itemStatus;
	}

  	/**
     * 是否启用状态:1:启用,2:禁用
     *
     * @param value
     */
	public void setSkuStatus(java.lang.Integer value) {
		this.skuStatus = value;
	}
	
	/**
     * 是否启用状态:1:启用,2:禁用
     */
	public java.lang.Integer getSkuStatus() {
		return this.skuStatus;
	}

  	/**
     * 申报要素
     *
     * @param value
     */
	public void setReportingElements(java.lang.String value) {
		this.reportingElements = value;
	}
	
	/**
     * 申报要素
     */
	public java.lang.String getReportingElements() {
		return this.reportingElements;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("id",getId())
			.append("skuid",getSkuid())
			.append("sku",getSku())
			.append("stateid",getStateid())
			.append("cncustomscode",getCncustomscode())
			.append("importchecking",getImportchecking())
			.append("exportchecking",getExportchecking())
			.append("commodityunit",getCommodityunit())
			.append("cncommodityname",getCncommodityname())
			.append("refundrate",getRefundrate())
			.append("createuserid",getCreateuserid())
			.append("createdate",getCreatedate())
			.append("updateuserid",getUpdateuserid())
			.append("updatedate",getUpdatedate())
			.append("categoryNameId",getCategoryNameId())
			.append("customsModel",getCustomsModel())
			.append("itemStatus",getItemStatus())
			.append("skuStatus",getSkuStatus())
			.append("reportingElements",getReportingElements())
			.toString();
	}
	//===========================================代码生成结束============================================
}

