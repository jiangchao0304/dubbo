/*
* Copyright (c) 2017 sunvalley. All Rights Reserved.
*/
package com.sunvalley.domain.erp.product.dto;

import java.io.Serializable;

/**
 * 类或方法的功能描述 :TODO
 *
 * @Author: douglas.jiang
 * @Date: 2017-09-18 11:20
 */
public class ItemLocaleDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private java.lang.Integer skuid;//
    private Integer langId;//
    private java.lang.String sku;//
    private java.lang.String description;//
    private java.lang.String unitName;//

    public Integer getSkuid() {
        return skuid;
    }

    public void setSkuid(Integer skuid) {
        this.skuid = skuid;
    }

    public Integer getLangId() {
        return langId;
    }

    public void setLangId(Integer langId) {
        this.langId = langId;
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

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }
}

