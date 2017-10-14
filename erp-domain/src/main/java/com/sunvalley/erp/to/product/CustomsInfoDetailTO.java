/*
* Copyright (c) 2017 sunvalley. All Rights Reserved.
* @Owner:douglas.jiang
* @Date:  2017-10-14 17:09
*/
package com.sunvalley.erp.to.product;

import java.io.Serializable;

/**
 * 类或方法的功能描述 :TODO
 *
 * @Author: douglas.jiang
 * @Date: 2017-10-14 17:09
 */
public class CustomsInfoDetailTO implements Serializable{
    //columns 开始
    private java.lang.Integer id;//
    private java.lang.Integer bsitemcustomid;//主表ID
    private java.lang.String stateid;//进口国编号
    private java.lang.String stateName; //进口国名称
    private java.lang.String customscode;//海关编码进口国
    private java.lang.String commodityname;//报关品名进口国
    private java.lang.Double tariffrates;//关税税率(%)
    private java.lang.String secondname;//第二语种品名

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBsitemcustomid() {
        return bsitemcustomid;
    }

    public void setBsitemcustomid(Integer bsitemcustomid) {
        this.bsitemcustomid = bsitemcustomid;
    }

    public String getStateid() {
        return stateid;
    }

    public void setStateid(String stateid) {
        this.stateid = stateid;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getCustomscode() {
        return customscode;
    }

    public void setCustomscode(String customscode) {
        this.customscode = customscode;
    }

    public String getCommodityname() {
        return commodityname;
    }

    public void setCommodityname(String commodityname) {
        this.commodityname = commodityname;
    }

    public Double getTariffrates() {
        return tariffrates;
    }

    public void setTariffrates(Double tariffrates) {
        this.tariffrates = tariffrates;
    }

    public String getSecondname() {
        return secondname;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }
}

