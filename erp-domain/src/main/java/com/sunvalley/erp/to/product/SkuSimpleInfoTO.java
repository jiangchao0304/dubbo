/*
* Copyright (c) 2017 sunvalley. All Rights Reserved.
*/
package com.sunvalley.erp.to.product;

import java.io.Serializable;

/**
 * 类或方法的功能描述 :TODO
 *
 * @Author: douglas.jiang
 * @Date: 2017-10-09 19:20
 */
public class SkuSimpleInfoTO  implements Serializable{
    private int skuid;
    private String sku;
    private int skuType;
    private String description;
    private String purspec;
    private String purdesc;
    private String purtitle;
    private int purchaserId;
    private boolean isactive;
    private String bomDesc;
    private int purchaseProperty;
    private String purchasePropertyStr;

    public int getSkuid() {
        return skuid;
    }

    public void setSkuid(int skuid) {
        this.skuid = skuid;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public int getSkuType() {
        return skuType;
    }

    public void setSkuType(int skuType) {
        this.skuType = skuType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPurspec() {
        return purspec;
    }

    public void setPurspec(String purspec) {
        this.purspec = purspec;
    }

    public String getPurdesc() {
        return purdesc;
    }

    public void setPurdesc(String purdesc) {
        this.purdesc = purdesc;
    }

    public String getPurtitle() {
        return purtitle;
    }

    public void setPurtitle(String purtitle) {
        this.purtitle = purtitle;
    }

    public int getPurchaserId() {
        return purchaserId;
    }

    public void setPurchaserId(int purchaserId) {
        this.purchaserId = purchaserId;
    }

    public boolean isIsactive() {
        return isactive;
    }

    public void setIsactive(boolean isactive) {
        this.isactive = isactive;
    }

    public String getBomDesc() {
        return bomDesc;
    }

    public void setBomDesc(String bomDesc) {
        this.bomDesc = bomDesc;
    }

    public int getPurchaseProperty() {
        return purchaseProperty;
    }

    public void setPurchaseProperty(int purchaseProperty) {
        this.purchaseProperty = purchaseProperty;
    }

    public String getPurchasePropertyStr() {
        return purchasePropertyStr;
    }

    public void setPurchasePropertyStr(String purchasePropertyStr) {
        this.purchasePropertyStr = purchasePropertyStr;
    }
}

