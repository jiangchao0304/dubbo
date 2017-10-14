/*
* Copyright (c) 2017 sunvalley. All Rights Reserved.
* @Owner:douglas.jiang
* @Date:  2017-10-13 16:03
*/
package com.sunvalley.erp.to.product;

/**
 * 类或方法的功能描述 :TODO
 *
 * @Author: douglas.jiang
 * @Date: 2017-10-13 16:03
 */
public class BomOneSkuTO {
    private String sku;
    private int skuid;
    private int skuType;
    private String purdesc;
    private String purspec;
    private int qty;
    private int purchaseProperty;
    private int rowState;
    private String bomDesc;

    public int getRowState() {
        return rowState;
    }

    public void setRowState(int rowState) {
        this.rowState = rowState;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public int getSkuid() {
        return skuid;
    }

    public void setSkuid(int skuid) {
        this.skuid = skuid;
    }

    public int getSkuType() {
        return skuType;
    }

    public void setSkuType(int skuType) {
        this.skuType = skuType;
    }

    public String getPurdesc() {
        return purdesc;
    }

    public void setPurdesc(String purdesc) {
        this.purdesc = purdesc;
    }

    public String getPurspec() {
        return purspec;
    }

    public void setPurspec(String purspec) {
        this.purspec = purspec;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getPurchaseProperty() {
        return purchaseProperty;
    }

    public void setPurchaseProperty(int purchaseProperty) {
        this.purchaseProperty = purchaseProperty;
    }

    public String getBomDesc() {
        return bomDesc;
    }

    public void setBomDesc(String bomDesc) {
        this.bomDesc = bomDesc;
    }
}

