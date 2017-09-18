/*
* Copyright (c) 2017 sunvalley. All Rights Reserved.
*/
package com.sunvalley.domain.erp.product.dto;

import java.util.List;

/**
 * UpdateSkuBaseInfoDTO.
 *
 * @Author: douglas.jiang
 * @Date: 2017-09-18 16:55
 */
public class UpdateSkuBaseInfoDTO {
    private int skuId;
    private Integer lineState;
    private Short magnetic;
    private Integer combineUnit;
    private Integer purchaseProperty;
    private String purspec;
    private String purDese;
    private String bomDesc;
    private Short width;
    private Short height;
    private Short weight;
    private Short len;
    private Short productLen;
    private Short productWidth;
    private Short productHeight;
    private Short productWeight;
    private List<ItemLocaleDTO> itemLocaleDTOList;

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

    public Integer getPurchaseProperty() {
        return purchaseProperty;
    }

    public void setPurchaseProperty(Integer purchaseProperty) {
        this.purchaseProperty = purchaseProperty;
    }

    public String getPurspec() {
        return purspec;
    }

    public void setPurspec(String purspec) {
        this.purspec = purspec;
    }

    public String getPurDese() {
        return purDese;
    }

    public void setPurDese(String purDese) {
        this.purDese = purDese;
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

    public List<ItemLocaleDTO> getItemLocaleDTOList() {
        return itemLocaleDTOList;
    }

    public void setItemLocaleDTOList(List<ItemLocaleDTO> itemLocaleDTOList) {
        this.itemLocaleDTOList = itemLocaleDTOList;
    }
}

