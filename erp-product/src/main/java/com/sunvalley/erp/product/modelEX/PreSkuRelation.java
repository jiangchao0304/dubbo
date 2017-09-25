/*
* Copyright (c) 2017 sunvalley. All Rights Reserved.
*/
package com.sunvalley.erp.product.modelEX;

/**
 * 预备sku和sku关系.
 *
 * @Author: douglas.jiang
 * @Date: 2017-09-25 14:40
 */
public class PreSkuRelation {
    private int preSkuId;
    private int skuId;
    private String preSku;
    private String sku;

    public int getPreSkuId() {
        return preSkuId;
    }

    public void setPreSkuId(int preSkuId) {
        this.preSkuId = preSkuId;
    }

    public int getSkuId() {
        return skuId;
    }

    public void setSkuId(int skuId) {
        this.skuId = skuId;
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
}

