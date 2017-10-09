/*
* Copyright (c) 2017 sunvalley. All Rights Reserved.
*/
package com.sunvalley.erp.to.product;

import java.util.Date;

/**
 * 类或方法的功能描述 :TODO
 *
 * @Author: douglas.jiang
 * @Date: 2017-10-10 16:58
 */
public class ItemRequirementsTO {
    private java.lang.Integer id;//
    private java.lang.Integer skuid;//
    private Integer typeId;//
    private java.lang.String productReq;//
    private java.lang.String purchaseReq;//
    private java.lang.String warehouseReq;//
    private java.util.Date createDate;//
    private java.lang.Integer createuserid;//
    private java.lang.String note;//

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSkuid() {
        return skuid;
    }

    public void setSkuid(Integer skuid) {
        this.skuid = skuid;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getProductReq() {
        return productReq;
    }

    public void setProductReq(String productReq) {
        this.productReq = productReq;
    }

    public String getPurchaseReq() {
        return purchaseReq;
    }

    public void setPurchaseReq(String purchaseReq) {
        this.purchaseReq = purchaseReq;
    }

    public String getWarehouseReq() {
        return warehouseReq;
    }

    public void setWarehouseReq(String warehouseReq) {
        this.warehouseReq = warehouseReq;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getCreateuserid() {
        return createuserid;
    }

    public void setCreateuserid(Integer createuserid) {
        this.createuserid = createuserid;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}

