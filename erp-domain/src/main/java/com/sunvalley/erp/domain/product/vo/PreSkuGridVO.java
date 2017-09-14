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
 * @Date: 2017-09-14 14:50
 */
public class PreSkuGridVO {

    private Integer  id;
    private String  preSku;
    private String  productName;
    private String  sku;
    private String  anruleStr;
    private String  anrule;
    private Integer  color;
    private String  colorStr;
    private String  country;
    private Integer  saleQty;
    private Integer  marketCapacity;
    private BigDecimal rmaRatio;
    private Date mpDate;
    private String  saleZone;
    private Integer  status;
    private Integer  remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPreSku() {
        return preSku;
    }

    public void setPreSku(String preSku) {
        this.preSku = preSku;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
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

    public Integer getColor() {
        return color;
    }

    public void setColor(Integer color) {
        this.color = color;
    }

    public String getColorStr() {
        return colorStr;
    }

    public void setColorStr(String colorStr) {
        this.colorStr = colorStr;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getSaleQty() {
        return saleQty;
    }

    public void setSaleQty(Integer saleQty) {
        this.saleQty = saleQty;
    }

    public Integer getMarketCapacity() {
        return marketCapacity;
    }

    public void setMarketCapacity(Integer marketCapacity) {
        this.marketCapacity = marketCapacity;
    }

    public BigDecimal getRmaRatio() {
        return rmaRatio;
    }

    public void setRmaRatio(BigDecimal rmaRatio) {
        this.rmaRatio = rmaRatio;
    }

    public Date getMpDate() {
        return mpDate;
    }

    public void setMpDate(Date mpDate) {
        this.mpDate = mpDate;
    }

    public String getSaleZone() {
        return saleZone;
    }

    public void setSaleZone(String saleZone) {
        this.saleZone = saleZone;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getRemark() {
        return remark;
    }

    public void setRemark(Integer remark) {
        this.remark = remark;
    }
}

