package com.sunvalley.domain.erp.product.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by jcgh on 2017-09-15.
 */
public class ModelAndPreSkuDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String safety;
    private String safetyCountry;
    private Integer skuid;
    private Date createDate;
    private Date modelCreateDate;
    private String createUserIdStr;
    private String model;
    private String brandDesc;
    private String preSku;
    private String sku;
    private Integer status;
    private String mainProLineName;
    private String subProLineName;
    private String pmName;
    private String colorStr;
    private Integer modelId;
    private Integer battery;
    private Integer warranty;
    private Integer rmacategoryid;
    private Integer magnetic;
    private String rmaName;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getSafety() {
        return safety;
    }

    public void setSafety(String safety) {
        this.safety = safety;
    }

    public String getSafetyCountry() {
        return safetyCountry;
    }

    public void setSafetyCountry(String safetyCountry) {
        this.safetyCountry = safetyCountry;
    }

    public Integer getSkuid() {
        return skuid;
    }

    public void setSkuid(Integer skuid) {
        this.skuid = skuid;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModelCreateDate() {
        return modelCreateDate;
    }

    public void setModelCreateDate(Date modelCreateDate) {
        this.modelCreateDate = modelCreateDate;
    }

    public String getCreateUserIdStr() {
        return createUserIdStr;
    }

    public void setCreateUserIdStr(String createUserIdStr) {
        this.createUserIdStr = createUserIdStr;
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

    public String getPreSku() {
        return preSku;
    }

    public void setPreSku(String preSku) {
        this.preSku = preSku;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMainProLineName() {
        return mainProLineName;
    }

    public void setMainProLineName(String mainProLineName) {
        this.mainProLineName = mainProLineName;
    }

    public String getSubProLineName() {
        return subProLineName;
    }

    public void setSubProLineName(String subProLineName) {
        this.subProLineName = subProLineName;
    }

    public String getPmName() {
        return pmName;
    }

    public void setPmName(String pmName) {
        this.pmName = pmName;
    }

    public String getColorStr() {
        return colorStr;
    }

    public void setColorStr(String colorStr) {
        this.colorStr = colorStr;
    }

    public Integer getModelId() {
        return modelId;
    }

    public void setModelId(Integer modelId) {
        this.modelId = modelId;
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

    public String getRmaName() {
        return rmaName;
    }

    public void setRmaName(String rmaName) {
        this.rmaName = rmaName;
    }
}
