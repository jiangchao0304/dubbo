/*
* Copyright (c) 2017 sunvalley. All Rights Reserved.
*/
package com.sunvalley.erp.to.product;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 类或方法的功能描述 :TODO
 *
 * @Author: douglas.jiang
 * @Date: 2017-09-26 19:06
 */
public class BomTO implements Serializable{
    private Integer skuid;
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

    private int pageSize=10;
    private int rowCount=0;
    private int pageNo=1;

    private List<BomTO> bomOneSkuList;
    private List<BomTO> bomTwoSkuList;
    private List<BomTO> bomSkuInfoList;
    private List<BomSupplierTO> bomSupplierList;

    private List<BomLogTO> bomLogExList;

    public List<BomLogTO> getBomLogExList() {
        return bomLogExList;
    }

    public void setBomLogExList(List<BomLogTO> bomLogExList) {
        this.bomLogExList = bomLogExList;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public List<BomTO> getBomSkuInfoList() {
        return bomSkuInfoList;
    }

    public void setBomSkuInfoList(List<BomTO> bomSkuInfoList) {
        this.bomSkuInfoList = bomSkuInfoList;
    }

    public List<BomSupplierTO> getBomSupplierList() {
        return bomSupplierList;
    }

    public void setBomSupplierList(List<BomSupplierTO> bomSupplierList) {
        this.bomSupplierList = bomSupplierList;
    }

    public List<BomTO> getBomOneSkuList() {
        return bomOneSkuList;
    }

    public void setBomOneSkuList(List<BomTO> bomOneSkuList) {
        this.bomOneSkuList = bomOneSkuList;
    }

    public List<BomTO> getBomTwoSkuList() {
        return bomTwoSkuList;
    }

    public void setBomTwoSkuList(List<BomTO> bomTwoSkuList) {
        this.bomTwoSkuList = bomTwoSkuList;
    }

    public Integer getSkuid() {
        return skuid;
    }

    public void setSkuid(Integer skuid) {
        this.skuid = skuid;
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

