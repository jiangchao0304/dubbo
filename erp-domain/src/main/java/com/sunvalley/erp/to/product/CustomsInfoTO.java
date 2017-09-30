/*
* Copyright (c) 2017 sunvalley. All Rights Reserved.
*/
package com.sunvalley.erp.to.product;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 类或方法的功能描述 :TODO
 *
 * @Author: douglas.jiang
 * @Date: 2017-09-29 16:22
 */
public class CustomsInfoTO  implements Serializable{
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
    private String categoryName;
    private String taxRefundRate;
    private int status;

    // itemPackageInfo
    private Short len;//
    private Short width;//
    private Short height;//
    private BigDecimal weight;//
    private BigDecimal volweight;//
    private java.lang.Integer capacity;//
    private java.util.Date packageCreatedate;// 创建日期
    private java.lang.String packageCreateuser;// 创建人






    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSkuid() {
        return skuid;
    }

    public void setSkuid(Integer skuid) {
        this.skuid = skuid;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getStateid() {
        return stateid;
    }

    public void setStateid(String stateid) {
        this.stateid = stateid;
    }

    public String getCncustomscode() {
        return cncustomscode;
    }

    public void setCncustomscode(String cncustomscode) {
        this.cncustomscode = cncustomscode;
    }

    public Integer getImportchecking() {
        return importchecking;
    }

    public void setImportchecking(Integer importchecking) {
        this.importchecking = importchecking;
    }

    public Integer getExportchecking() {
        return exportchecking;
    }

    public void setExportchecking(Integer exportchecking) {
        this.exportchecking = exportchecking;
    }

    public String getCommodityunit() {
        return commodityunit;
    }

    public void setCommodityunit(String commodityunit) {
        this.commodityunit = commodityunit;
    }

    public String getCncommodityname() {
        return cncommodityname;
    }

    public void setCncommodityname(String cncommodityname) {
        this.cncommodityname = cncommodityname;
    }

    public Double getRefundrate() {
        return refundrate;
    }

    public void setRefundrate(Double refundrate) {
        this.refundrate = refundrate;
    }

    public Integer getCreateuserid() {
        return createuserid;
    }

    public void setCreateuserid(Integer createuserid) {
        this.createuserid = createuserid;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Integer getUpdateuserid() {
        return updateuserid;
    }

    public void setUpdateuserid(Integer updateuserid) {
        this.updateuserid = updateuserid;
    }

    public Date getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }

    public Integer getCategoryNameId() {
        return categoryNameId;
    }

    public void setCategoryNameId(Integer categoryNameId) {
        this.categoryNameId = categoryNameId;
    }

    public String getCustomsModel() {
        return customsModel;
    }

    public void setCustomsModel(String customsModel) {
        this.customsModel = customsModel;
    }

    public Integer getItemStatus() {
        return itemStatus;
    }

    public void setItemStatus(Integer itemStatus) {
        this.itemStatus = itemStatus;
    }

    public Integer getSkuStatus() {
        return skuStatus;
    }

    public void setSkuStatus(Integer skuStatus) {
        this.skuStatus = skuStatus;
    }

    public String getReportingElements() {
        return reportingElements;
    }

    public void setReportingElements(String reportingElements) {
        this.reportingElements = reportingElements;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getTaxRefundRate() {
        return taxRefundRate;
    }

    public void setTaxRefundRate(String taxRefundRate) {
        this.taxRefundRate = taxRefundRate;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}

