/*
* Copyright (c) 2017 sunvalley. All Rights Reserved.
*/
package com.sunvalley.erp.product.modelEX;

import java.util.Date;
import java.util.List;

/**
 * 类或方法的功能描述 :TODO
 *
 * @Author: douglas.jiang
 * @Date: 2017-09-26 15:45
 */
public class BomEX {
    private Integer skuId;
    private  Integer id;
    private String bomDesc;
    private Integer purchaseProperty;
    private Date createDate;
    private Integer createUserId;
    private Date updateDate;
    private  Integer updateUserId;
    private String combineUnit;
    private  String updateName;
    private String createUserName;
    private  String sku;
    private String purdesc;
    private String purspec;

    private List<BomEX> bomOneSkuList;
    private List<BomEX> bomTwoSkuList;

    public List<BomEX> getBomOneSkuList() {
        return bomOneSkuList;
    }

    public void setBomOneSkuList(List<BomEX> bomOneSkuList) {
        this.bomOneSkuList = bomOneSkuList;
    }

    public List<BomEX> getBomTwoSkuList() {
        return bomTwoSkuList;
    }

    public void setBomTwoSkuList(List<BomEX> bomTwoSkuList) {
        this.bomTwoSkuList = bomTwoSkuList;
    }

    public Integer getSkuId() {
        return skuId;
    }

    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBomDesc() {
        return bomDesc;
    }

    public void setBomDesc(String bomDesc) {
        this.bomDesc = bomDesc;
    }

    public Integer getPurchaseProperty() {
        return purchaseProperty;
    }

    public void setPurchaseProperty(Integer purchaseProperty) {
        this.purchaseProperty = purchaseProperty;
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

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Integer getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(Integer updateUserId) {
        this.updateUserId = updateUserId;
    }

    public String getCombineUnit() {
        return combineUnit;
    }

    public void setCombineUnit(String combineUnit) {
        this.combineUnit = combineUnit;
    }

    public String getUpdateName() {
        return updateName;
    }

    public void setUpdateName(String updateName) {
        this.updateName = updateName;
    }

    public String getCreateUserName() {
        return createUserName;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
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
}

