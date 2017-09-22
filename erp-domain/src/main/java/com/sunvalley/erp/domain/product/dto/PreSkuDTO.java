/*
* Copyright (c) 2017 sunvalley. All Rights Reserved.
*/
package com.sunvalley.erp.domain.product.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 类或方法的功能描述 :TODO
 *
 * @Author: douglas.jiang
 * @Date: 2017-09-13 13:17
 */
public class PreSkuDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String sku;
    private String model;
    private Integer modelId;
    private Integer brandId;
    private String brandDesc;
    private Integer pmId;
    private String pmName;
    private String mainBrandCode; //大类编码
    private Integer mainCategoryId;
    private String mainModelNo;  //大类型号
    private String subModelNo;  //小类型号
    private Integer subCategoryId;
    private String subBrandCode; //小类编码
    private String customName;
    private Integer saleDept;
    private Integer standardSize;
    private String weight;
    private String shippingType;
    private BigDecimal mc;
    private BigDecimal salePrice;
    private Date setupDate;
    private String remark; //model备注
    private Integer battery;
    private Integer warranty;
    private Integer rmacategoryid;
    private Integer magnetic;
    private Integer sessionId;
    private List<PreSkuGridDTO> preSkuList;   //sku列表
    private List<PackageSkuDTO> packageSkuList;

    public String getRemark() {
        return remark;
    }

    public Integer getSessionId() {
        return sessionId;
    }

    public void setSessionId(Integer sessionId) {
        this.sessionId = sessionId;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getBattery() {
        return battery;
    }

    public void setBattery(Integer battery) {
        this.battery = battery;
    }

    public Integer getWarranty() {
        return warranty;
    }

    public void setWarranty(Integer warranty) {
        this.warranty = warranty;
    }

    public Integer getRmacategoryid() {
        return rmacategoryid;
    }

    public void setRmacategoryid(Integer rmacategoryid) {
        this.rmacategoryid = rmacategoryid;
    }

    public Integer getMagnetic() {
        return magnetic;
    }

    public void setMagnetic(Integer magnetic) {
        this.magnetic = magnetic;
    }

    public List<PackageSkuDTO> getPackageSkuList() {
        return packageSkuList;
    }


    public void setPackageSkuList(List<PackageSkuDTO> packageSkuList) {
        this.packageSkuList = packageSkuList;
    }

    public List<PreSkuGridDTO> getPreSkuList() {
        return preSkuList;
    }

    public void setPreSkuList(List<PreSkuGridDTO> preSkuList) {
        this.preSkuList = preSkuList;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
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

    public String getMainBrandCode() {
        return mainBrandCode;
    }

    public void setMainBrandCode(String mainBrandCode) {
        this.mainBrandCode = mainBrandCode;
    }

    public Integer getMainCategoryId() {
        return mainCategoryId;
    }

    public void setMainCategoryId(Integer mainCategoryId) {
        this.mainCategoryId = mainCategoryId;
    }

    public String getMainModelNo() {
        return mainModelNo;
    }

    public void setMainModelNo(String mainModelNo) {
        this.mainModelNo = mainModelNo;
    }

    public String getSubModelNo() {
        return subModelNo;
    }

    public void setSubModelNo(String subModelNo) {
        this.subModelNo = subModelNo;
    }

    public Integer getSubCategoryId() {
        return subCategoryId;
    }

    public void setSubCategoryId(Integer subCategoryId) {
        this.subCategoryId = subCategoryId;
    }

    public String getSubBrandCode() {
        return subBrandCode;
    }

    public void setSubBrandCode(String subBrandCode) {
        this.subBrandCode = subBrandCode;
    }

    public String getCustomName() {
        return customName;
    }

    public void setCustomName(String customName) {
        this.customName = customName;
    }

    public Integer getSaleDept() {
        return saleDept;
    }

    public void setSaleDept(Integer saleDept) {
        this.saleDept = saleDept;
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






}

