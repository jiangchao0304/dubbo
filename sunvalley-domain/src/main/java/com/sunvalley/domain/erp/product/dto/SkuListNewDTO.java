/*
* Copyright (c) 2017 sunvalley. All Rights Reserved.
*/
package com.sunvalley.domain.erp.product.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * SkuListNewDTO.
 *
 * @Author: douglas.jiang
 * @Date: 2017-09-19 10:09
 */
public class SkuListNewDTO  implements Serializable{
    private int skuId; //skuid
    private String sku; //sku
    private String description; //sku 描述
    private String model; //model
    private String brandDesc; //品牌描述
    private Integer region; //
    private Integer lineState; //状态
    private Integer isPackage; //包材 1:否； 2:是
    private int magnetic;// 磁性 0 未知 1 是  2 否
    private String pmName;
    private String creator; //创建者
    private Date createDate; //创建时间

    public int getSkuId() {
        return skuId;
    }

    public void setSkuId(int skuId) {
        this.skuId = skuId;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrandDesc() {
        return brandDesc;
    }

    public void setBrandDesc(String brandDesc) {
        this.brandDesc = brandDesc;
    }

    public Integer getRegion() {
        return region;
    }

    public void setRegion(Integer region) {
        this.region = region;
    }

    public Integer getLineState() {
        return lineState;
    }

    public void setLineState(Integer lineState) {
        this.lineState = lineState;
    }

    public Integer getIsPackage() {
        return isPackage;
    }

    public void setIsPackage(Integer isPackage) {
        this.isPackage = isPackage;
    }

    public int getMagnetic() {
        return magnetic;
    }

    public void setMagnetic(int magnetic) {
        this.magnetic = magnetic;
    }

    public String getPmName() {
        return pmName;
    }

    public void setPmName(String pmName) {
        this.pmName = pmName;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}

