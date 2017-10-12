/*
* Copyright (c) 2017 sunvalley. All Rights Reserved.
*/
package com.sunvalley.erp.product.vo;

import com.sunvalley.erp.common.enums.ApiMsgEnum;
import com.sunvalley.erp.common.exception.SunvalleyException;
import com.sunvalley.erp.common.util.DateUtil;
import com.sunvalley.erp.common.util.TimeUtil;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

/**
 * 类或方法的功能描述 :TODO
 *
 * @Author: douglas.jiang
 * @Date: 2017-10-10 8:59
 */
public class BaseReturnVO  implements Serializable {
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
        this.resCode= ApiMsgEnum.CORRECT.getResCode();
        this.resDes= ApiMsgEnum.CORRECT.getResDes();
        this.data=data;
    }

    public BaseReturnVO(SunvalleyException exp) {
        this.resCode = exp.getErrCode();
        this.resDes = exp.getErrMessage();

    }


    public BaseReturnVO(ApiMsgEnum msgEnum) {
        this.resCode = msgEnum.getResCode();
        this.resDes = msgEnum.getResDes();

    }
}

