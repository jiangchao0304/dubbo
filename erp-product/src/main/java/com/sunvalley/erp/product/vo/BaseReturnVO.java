/*
* Copyright (c) 2017 sunvalley. All Rights Reserved.
*/
package com.sunvalley.erp.product.vo;

/**
 * 类或方法的功能描述 :TODO
 *
 * @Author: douglas.jiang
 * @Date: 2017-10-10 8:59
 */
public class BaseReturnVO {
    protected String resCode; // 结果码
    protected String resDes; // 结果描述
    protected Object data;

    public String getResCode() {
        return resCode;
    }

    public void setResCode(String resCode) {
        this.resCode = resCode;
    }

    public String getResDes() {
        return resDes;
    }

    public void setResDes(String resDes) {
        this.resDes = resDes;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public BaseReturnVO() {
    }

    public BaseReturnVO(String code,String msg) {
        this.resCode=code;
        this.resDes=msg;
    }

    public BaseReturnVO(Object data) {
        this.resCode="000000";
        this.resDes="success";
        this.data=data;
    }
}

