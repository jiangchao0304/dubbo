/*
* Copyright (c) 2016 bond. All Rights Reserved.
*/
package com.sunvalley.erp.common.exception;


import com.sunvalley.erp.common.constants.Constants;
import com.sunvalley.erp.common.enums.ApiMsgEnum;

import java.util.Map;

/**
 * 组件异常。
 * 主要调用第三方接口返回的异常.
 *
 * @Author: jiangchao@bond520.com
 * @Date: 2017-01-06 19:32
 */
public class BusinessException  extends RuntimeException implements SunvalleyException {
    private static final long serialVersionUID = 8093803025939797139L;
    private String exceptionCode;
    private String detailMsg;
    private StackTraceElement[] stackTrace;
    private  Map<String, Object> requestParam;

    public BusinessException(String exceptionCode) {
        this(null,exceptionCode,"",null);
    }

    public BusinessException(String exceptionCode, String extraMsg) {
        this(null,exceptionCode,extraMsg,null);
    }

    public BusinessException(Map<String, Object> param ,String exceptionCode, String extraMsg) {
        this(param,exceptionCode,extraMsg,null);
    }
    public BusinessException(String exceptionCode, String extraMsg, StackTraceElement[] stackTrace) {
        this(null,exceptionCode,extraMsg,stackTrace);
    }

    public BusinessException(Map<String, Object> param , String exceptionCode, String extraMsg, StackTraceElement[] stackTrace) {
        super();
        this.setDetailMsg(exceptionCode);
        this.setExtraMsg(extraMsg);
        this.stackTrace=stackTrace;
        this.requestParam=param;
        if(stackTrace!=null ){
            super.setStackTrace(stackTrace);
        }

    }



    //notice: we do not offer the set method to set the excption code.
    public String getExceptionCode() {
        return exceptionCode;
    }

    //if there has no extra message for this excption code, init it.
    private void setDetailMsg(String exceptionCode) {
        this.exceptionCode = exceptionCode;

        if (ApiMsgEnum.apiMsgMap.containsKey(exceptionCode)) {
            this.detailMsg = ApiMsgEnum.apiMsgMap.get(exceptionCode);
        } else {
            this.detailMsg = ApiMsgEnum.EXCEPTION_CODE_NOT_FOUND.getResDes();
        }
    }

    //if there has extra message for this exception code, add it.
    private void setExtraMsg(String extraMsg) {
        this.detailMsg += Constants.EXTRA_EXCEPTION_MSG_SPLITER + extraMsg;
    }

    //override the super class method getMessage()
    @Override
    public String getMessage() {
        return this.detailMsg;
    }

    @Override
    public String getErrCode() {
        return  this.exceptionCode;
    }

    @Override
    public String getErrMessage() {
        return this.detailMsg;
    }

    @Override
    public Map<String, Object> requestParam() {
        return  this.requestParam;
    }
}

