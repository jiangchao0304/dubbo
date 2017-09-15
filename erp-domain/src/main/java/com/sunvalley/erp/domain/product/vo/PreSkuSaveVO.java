/*
* Copyright (c) 2017 sunvalley. All Rights Reserved.
*/
package com.sunvalley.erp.domain.product.vo;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 类或方法的功能描述 :TODO
 *
 * @Author: douglas.jiang
 * @Date: 2017-09-14 16:11
 */
public class PreSkuSaveVO {


    private int brandId;

    private Integer modelId;

    private String model;

    private int pmId;

    private int salesDept;

    private int warranty;

    private int rmaCategoryId;

    private int battery;

    private int magnetic;

    private Integer standardSize;

    private String weight;

    private String shippingType;

    private BigDecimal mc;

    private BigDecimal salePrice;

    private Date setupDate;

    private String modelRemark;

    private Integer mainCategoryId;

    private Integer subCategoryId;

    private Integer sessionId;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getMainCategoryId() {
        return mainCategoryId;
    }

    public void setMainCategoryId(Integer mainCategoryId) {
        this.mainCategoryId = mainCategoryId;
    }

    public Integer getSubCategoryId() {
        return subCategoryId;
    }

    public void setSubCategoryId(Integer subCategoryId) {
        this.subCategoryId = subCategoryId;
    }

    public Integer getSessionId() {
        return sessionId;
    }

    public void setSessionId(Integer sessionId) {
        this.sessionId = sessionId;
    }

    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    public Integer getModelId() {
        return modelId;
    }

    public void setModelId(Integer modelId) {
        this.modelId = modelId;
    }

    public int getPmId() {
        return pmId;
    }

    public void setPmId(int pmId) {
        this.pmId = pmId;
    }

    public int getSalesDept() {
        return salesDept;
    }

    public void setSalesDept(int salesDept) {
        this.salesDept = salesDept;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    public int getRmaCategoryId() {
        return rmaCategoryId;
    }

    public void setRmaCategoryId(int rmaCategoryId) {
        this.rmaCategoryId = rmaCategoryId;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public int getMagnetic() {
        return magnetic;
    }

    public void setMagnetic(int magnetic) {
        this.magnetic = magnetic;
    }

    public Integer getStandardSize() {
        return standardSize;
    }

    public void setStandardSize(Integer standardSize) {
        this.standardSize = standardSize;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getShippingType() {
        return shippingType;
    }

    public void setShippingType(String shippingType) {
        this.shippingType = shippingType;
    }

    public BigDecimal getMc() {
        return mc;
    }

    public void setMc(BigDecimal mc) {
        this.mc = mc;
    }

    public BigDecimal getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    public Date getSetupDate() {
        return setupDate;
    }

    public void setSetupDate(Date setupDate) {
        this.setupDate = setupDate;
    }

    public String getModelRemark() {
        return modelRemark;
    }

    public void setModelRemark(String modelRemark) {
        this.modelRemark = modelRemark;
    }
}

