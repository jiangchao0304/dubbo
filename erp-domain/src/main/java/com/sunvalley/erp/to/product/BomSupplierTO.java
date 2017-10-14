/*
* Copyright (c) 2017 sunvalley. All Rights Reserved.
*/
package com.sunvalley.erp.to.product;

import java.io.Serializable;

/**
 * 类或方法的功能描述 :TODO
 *
 * @Author: douglas.jiang
 * @Date: 2017-09-26 19:08
 */
public class BomSupplierTO implements Serializable{

    private Integer supplierid;
    private String name;
    private Integer purProperty;
    private int purchaserid;
    private String purchaserName;
    private String purPropertyStr;

    public Integer getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(Integer supplierid) {
        this.supplierid = supplierid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPurProperty() {
        return purProperty;
    }

    public void setPurProperty(Integer purProperty) {
        this.purProperty = purProperty;
    }

    public int getPurchaserid() {
        return purchaserid;
    }

    public void setPurchaserid(int purchaserid) {
        this.purchaserid = purchaserid;
    }

    public String getPurchaserName() {
        return purchaserName;
    }

    public void setPurchaserName(String purchaserName) {
        this.purchaserName = purchaserName;
    }

    public String getPurPropertyStr() {
        return purPropertyStr;
    }

    public void setPurPropertyStr(String purPropertyStr) {
        this.purPropertyStr = purPropertyStr;
    }
}

