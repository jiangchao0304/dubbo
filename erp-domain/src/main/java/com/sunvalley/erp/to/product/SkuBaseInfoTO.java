/*
* Copyright (c) 2017 sunvalley. All Rights Reserved.
*/
package com.sunvalley.erp.to.product;

import com.sunvalley.erp.to.common.SysSessionTO;

import java.io.Serializable;
import java.util.List;

/**
 * sku&pre信息
 *
 * @Author: douglas.jiang
 * @Date: 2017-09-18 11:13
 */
public class SkuBaseInfoTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private String sku;
    private int skuId;
    private Integer lineState;
    private Integer categoryId;
    private String categoryStr;
    private String subCategoryStr;
    private Integer subCategortId;
    private Integer brandId;
    private String  brandDesc;
    private String model;
    private Integer modelId;
    private Integer pmId;
    private String pmName;
    private Integer battery;
    private Integer rmacategoryid;
    private Integer region;
    private String preSku;
    private String color;
    private String anruleStr;
    private String anrule;
    private String country;
    private Integer isPackage;
    private Short magnetic;
    private Integer combineUnit;
    private Integer warranty;
    private Integer purchaseProperty;
    private String purSpec;
    private String purDesc;
    private String productName;
    private String bomDesc;
    private Short width;
    private Short height;
    private Short weight;
    private Short len;
    private Short productLen;
    private Short productWidth;
    private Short productHeight;
    private Short productWeight;
    private SysSessionTO sessionTO;
    private List<ItemLocaleTO> itemLocaleTOList;


    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public int getSkuId() {
        return skuId;
    }

    public void setSkuId(int skuId) {
        this.skuId = skuId;
    }

    public Integer getLineState() {
        return lineState;
    }

    public void setLineState(Integer lineState) {
        this.lineState = lineState;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryStr() {
        return categoryStr;
    }

    public void setCategoryStr(String categoryStr) {
        this.categoryStr = categoryStr;
    }

    public String getSubCategoryStr() {
        return subCategoryStr;
    }

    public void setSubCategoryStr(String subCategoryStr) {
        this.subCategoryStr = subCategoryStr;
    }

    public Integer getSubCategortId() {
        return subCategortId;
    }

    public void setSubCategortId(Integer subCategortId) {
        this.subCategortId = subCategortId;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getBrandDesc() {
        return brandDesc;
    }

    public void setBrandDesc(String brandDesc) {
        this.brandDesc = brandDesc;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getModelId() {
        return modelId;
    }

    public void setModelId(Integer modelId) {
        this.modelId = modelId;
    }

    public Integer getPmId() {
        return pmId;
    }

    public void setPmId(Integer pmId) {
        this.pmId = pmId;
    }

    public String getPmName() {
        return pmName;
    }

    public void setPmName(String pmName) {
        this.pmName = pmName;
    }

    public Integer getBattery() {
        return battery;
    }

    public void setBattery(Integer battery) {
        this.battery = battery;
    }

    public Integer getRmacategoryid() {
        return rmacategoryid;
    }

    public void setRmacategoryid(Integer rmacategoryid) {
        this.rmacategoryid = rmacategoryid;
    }

    public Integer getRegion() {
        return region;
    }

    public void setRegion(Integer region) {
        this.region = region;
    }

    public String getPreSku() {
        return preSku;
    }

    public void setPreSku(String preSku) {
        this.preSku = preSku;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAnruleStr() {
        return anruleStr;
    }

    public void setAnruleStr(String anruleStr) {
        this.anruleStr = anruleStr;
    }

    public String getAnrule() {
        return anrule;
    }

    public void setAnrule(String anrule) {
        this.anrule = anrule;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getIsPackage() {
        return isPackage;
    }

    public void setIsPackage(Integer isPackage) {
        this.isPackage = isPackage;
    }

    public Short getMagnetic() {
        return magnetic;
    }

    public void setMagnetic(Short magnetic) {
        this.magnetic = magnetic;
    }

    public Integer getCombineUnit() {
        return combineUnit;
    }

    public void setCombineUnit(Integer combineUnit) {
        this.combineUnit = combineUnit;
    }

    public Integer getWarranty() {
        return warranty;
    }

    public void setWarranty(Integer warranty) {
        this.warranty = warranty;
    }

    public Integer getPurchaseProperty() {
        return purchaseProperty;
    }

    public void setPurchaseProperty(Integer purchaseProperty) {
        this.purchaseProperty = purchaseProperty;
    }

    public String getPurSpec() {
        return purSpec;
    }

    public void setPurSpec(String purSpec) {
        this.purSpec = purSpec;
    }

    public String getPurDesc() {
        return purDesc;
    }

    public void setPurDesc(String purDesc) {
        this.purDesc = purDesc;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getBomDesc() {
        return bomDesc;
    }

    public void setBomDesc(String bomDesc) {
        this.bomDesc = bomDesc;
    }

    public Short getWidth() {
        return width;
    }

    public void setWidth(Short width) {
        this.width = width;
    }

    public Short getHeight() {
        return height;
    }

    public void setHeight(Short height) {
        this.height = height;
    }

    public Short getWeight() {
        return weight;
    }

    public void setWeight(Short weight) {
        this.weight = weight;
    }

    public Short getLen() {
        return len;
    }

    public void setLen(Short len) {
        this.len = len;
    }

    public Short getProductLen() {
        return productLen;
    }

    public void setProductLen(Short productLen) {
        this.productLen = productLen;
    }

    public Short getProductWidth() {
        return productWidth;
    }

    public void setProductWidth(Short productWidth) {
        this.productWidth = productWidth;
    }

    public Short getProductHeight() {
        return productHeight;
    }

    public void setProductHeight(Short productHeight) {
        this.productHeight = productHeight;
    }

    public Short getProductWeight() {
        return productWeight;
    }

    public void setProductWeight(Short productWeight) {
        this.productWeight = productWeight;
    }

    public SysSessionTO getSessionTO() {
        return sessionTO;
    }

    public void setSessionTO(SysSessionTO sessionTO) {
        this.sessionTO = sessionTO;
    }

    public List<ItemLocaleTO> getItemLocaleTOList() {
        return itemLocaleTOList;
    }

    public void setItemLocaleTOList(List<ItemLocaleTO> itemLocaleTOList) {
        this.itemLocaleTOList = itemLocaleTOList;
    }
}

