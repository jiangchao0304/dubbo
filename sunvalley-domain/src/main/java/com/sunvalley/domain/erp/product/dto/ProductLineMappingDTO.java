/*
* Copyright (c) 2017 sunvalley. All Rights Reserved.
*/
package com.sunvalley.domain.erp.product.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * 类或方法的功能描述 :TODO
 *
 * @Author: douglas.jiang
 * @Date: 2017-09-22 16:27
 */
public class ProductLineMappingDTO  implements Serializable {
    //columns 开始
    private java.lang.Integer id;//
    private java.lang.Integer productLineId;//产品线id
    private java.lang.Integer mappingId;//
    private java.lang.Integer type;//1表示sku 2,大小类关系，3编辑权限，4，数据权限
    private java.lang.Integer createUserId;//
    private java.util.Date createDate;//
    private String productCode; //编码
    private String productLineName; //产品线名称

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProductLineId() {
        return productLineId;
    }

    public void setProductLineId(Integer productLineId) {
        this.productLineId = productLineId;
    }

    public Integer getMappingId() {
        return mappingId;
    }

    public void setMappingId(Integer mappingId) {
        this.mappingId = mappingId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductLineName() {
        return productLineName;
    }

    public void setProductLineName(String productLineName) {
        this.productLineName = productLineName;
    }
}

