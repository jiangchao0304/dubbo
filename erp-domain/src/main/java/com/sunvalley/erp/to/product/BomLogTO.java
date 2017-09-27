/*
* Copyright (c) 2017 sunvalley. All Rights Reserved.
*/
package com.sunvalley.erp.to.product;

import java.io.Serializable;
import java.util.Date;

/**
 * 类或方法的功能描述 :TODO
 *
 * @Author: douglas.jiang
 * @Date: 2017-09-26 19:08
 */
public class BomLogTO implements Serializable{

    private java.lang.Integer id;//
    private java.lang.String sku;//
    private java.util.Date createDate;//
    private java.lang.Integer createUserId;//
    private java.lang.String remark;//
    private java.lang.Integer bomId;//
    private java.lang.Integer skuid;//
    private String createUserName;
    private String purchasePropertyStr;
    private String purDesc;
    private String purspec;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getBomId() {
        return bomId;
    }

    public void setBomId(Integer bomId) {
        this.bomId = bomId;
    }

    public Integer getSkuid() {
        return skuid;
    }

    public void setSkuid(Integer skuid) {
        this.skuid = skuid;
    }

    public String getCreateUserName() {
        return createUserName;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }

    public String getPurchasePropertyStr() {
        return purchasePropertyStr;
    }

    public void setPurchasePropertyStr(String purchasePropertyStr) {
        this.purchasePropertyStr = purchasePropertyStr;
    }

    public String getPurDesc() {
        return purDesc;
    }

    public void setPurDesc(String purDesc) {
        this.purDesc = purDesc;
    }

    public String getPurspec() {
        return purspec;
    }

    public void setPurspec(String purspec) {
        this.purspec = purspec;
    }
}

