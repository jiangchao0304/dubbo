/*
* Copyright (c) 2017 sunvalley. All Rights Reserved.
*/
package com.sunvalley.erp.domain.product.dto;

/**
 * 类或方法的功能描述 :TODO
 *
 * @Author: douglas.jiang
 * @Date: 2017-09-14 14:57
 */
public class PackageSkuDTO {

    private String sku;
    private String anruleStr;
    private String anrule;
    private String colorStr;

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

    public String getColorStr() {
        return colorStr;
    }

    public void setColorStr(String colorStr) {
        this.colorStr = colorStr;
    }
}

