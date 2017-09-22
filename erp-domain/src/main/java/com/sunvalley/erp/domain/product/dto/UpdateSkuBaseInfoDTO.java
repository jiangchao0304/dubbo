/*
* Copyright (c) 2017 sunvalley. All Rights Reserved.
*/
package com.sunvalley.erp.domain.product.dto;

import java.io.Serializable;
import java.util.List;

/**
 * UpdateSkuBaseInfoDTO.
 *
 * @Author: douglas.jiang
 * @Date: 2017-09-18 16:55
 */
public class UpdateSkuBaseInfoDTO  implements Serializable {
    private static final long serialVersionUID = 1L;

    private int skuId;
    private int lineState;
    private short magnetic;
    private int combineUnit;
    private int purchaseProperty;
    private String purspec;
    private String purDese;
    private String bomDesc;
    private short width;
    private short height;
    private short weight;
    private short len;
    private short productLen;
    private short productWidth;
    private short productHeight;
    private short productWeight;
    private List<ItemLocaleDTO> itemLocaleDTOList;

    public int getSkuId() {
        return skuId;
    }

    public void setSkuId(int skuId) {
        this.skuId = skuId;
    }

    public int getLineState() {
        return lineState;
    }

    public void setLineState(int lineState) {
        this.lineState = lineState;
    }

    public short getMagnetic() {
        return magnetic;
    }

    public void setMagnetic(short magnetic) {
        this.magnetic = magnetic;
    }

    public int getCombineUnit() {
        return combineUnit;
    }

    public void setCombineUnit(int combineUnit) {
        this.combineUnit = combineUnit;
    }

    public int getPurchaseProperty() {
        return purchaseProperty;
    }

    public void setPurchaseProperty(int purchaseProperty) {
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

    public short getWidth() {
        return width;
    }

    public void setWidth(short width) {
        this.width = width;
    }

    public short getHeight() {
        return height;
    }

    public void setHeight(short height) {
        this.height = height;
    }

    public short getWeight() {
        return weight;
    }

    public void setWeight(short weight) {
        this.weight = weight;
    }

    public short getLen() {
        return len;
    }

    public void setLen(short len) {
        this.len = len;
    }

    public short getProductLen() {
        return productLen;
    }

    public void setProductLen(short productLen) {
        this.productLen = productLen;
    }

    public short getProductWidth() {
        return productWidth;
    }

    public void setProductWidth(short productWidth) {
        this.productWidth = productWidth;
    }

    public short getProductHeight() {
        return productHeight;
    }

    public void setProductHeight(short productHeight) {
        this.productHeight = productHeight;
    }

    public short getProductWeight() {
        return productWeight;
    }

    public void setProductWeight(short productWeight) {
        this.productWeight = productWeight;
    }

    public List<ItemLocaleDTO> getItemLocaleDTOList() {
        return itemLocaleDTOList;
    }

    public void setItemLocaleDTOList(List<ItemLocaleDTO> itemLocaleDTOList) {
        this.itemLocaleDTOList = itemLocaleDTOList;
    }
}

