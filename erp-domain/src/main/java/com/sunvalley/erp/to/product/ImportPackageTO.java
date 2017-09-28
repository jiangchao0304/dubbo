/*
* Copyright (c) 2017 sunvalley. All Rights Reserved.
*/
package com.sunvalley.erp.to.product;

import java.io.Serializable;

/**
 * 批量导入包材信息.
 *
 * @Author: douglas.jiang
 * @Date: 2017-09-28 14:34
 */
public class ImportPackageTO  implements Serializable{
    private int skuType;
    private String purDesc;
    private String purSpec;
    private int qty;
    private int purchaseProperty;
    private String remark;

    public int getSkuType() {
        return skuType;
    }

    public void setSkuType(int skuType) {
        this.skuType = skuType;
    }

    public String getPurDesc() {
        return purDesc;
    }

    public void setPurDesc(String purDesc) {
        this.purDesc = purDesc;
    }

    public String getPurSpec() {
        return purSpec;
    }

    public void setPurSpec(String purSpec) {
        this.purSpec = purSpec;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}

