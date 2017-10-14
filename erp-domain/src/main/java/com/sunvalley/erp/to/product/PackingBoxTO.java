/*
* Copyright (c) 2017 sunvalley. All Rights Reserved.
* @Owner:douglas.jiang
* @Date:  2017-10-14 16:37
*/
package com.sunvalley.erp.to.product;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 类或方法的功能描述 :TODO
 *
 * @Author: douglas.jiang
 * @Date: 2017-10-14 16:37
 */
public class PackingBoxTO implements Serializable {
    private Integer skuid;
    private String sku;
    private Short len;
    private Short width;
    private Short height;
    private BigDecimal weight;
    private BigDecimal volweight;
    private Integer capacity;
    private Byte linestate;
    private String purdesc;
    private Date createdate;
    private Integer createuserid;
    private String creator;

    public Integer getSkuid() {
        return skuid;
    }

    public void setSkuid(Integer skuid) {
        this.skuid = skuid;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public Short getLen() {
        return len;
    }

    public void setLen(Short len) {
        this.len = len;
    }

    public Short getWidth() {
        return width;
    }

    public void setWidth(Short width) {
        this.width = width;
    }

    public Short getHeight() {
        return height;
    }

    public void setHeight(Short height) {
        this.height = height;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public BigDecimal getVolweight() {
        return volweight;
    }

    public void setVolweight(BigDecimal volweight) {
        this.volweight = volweight;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Byte getLinestate() {
        return linestate;
    }

    public void setLinestate(Byte linestate) {
        this.linestate = linestate;
    }

    public String getPurdesc() {
        return purdesc;
    }

    public void setPurdesc(String purdesc) {
        this.purdesc = purdesc;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Integer getCreateuserid() {
        return createuserid;
    }

    public void setCreateuserid(Integer createuserid) {
        this.createuserid = createuserid;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
}

