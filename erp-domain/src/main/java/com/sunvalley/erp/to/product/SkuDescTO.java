/*
* Copyright (c) 2017 sunvalley. All Rights Reserved.
*/
package com.sunvalley.erp.to.product;

import java.io.Serializable;

/**
 * 类或方法的功能描述 :TODO
 *
 * @Author: douglas.jiang
 * @Date: 2017-10-09 11:32
 */
public class SkuDescTO implements Serializable {
    private int skuId;
    private String sku;
    private String purDesc;
    private String purSpec;

    public String getPurSpec() {
        return purSpec;
    }

    public void setPurSpec(String purSpec) {
        this.purSpec = purSpec;
    }

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

    public String getPurDesc() {
        return purDesc;
    }

    public void setPurDesc(String purDesc) {
        this.purDesc = purDesc;
    }
}

