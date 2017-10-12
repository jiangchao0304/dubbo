/*
* Copyright (c) 2016 bond. All Rights Reserved.
*/
package com.sunvalley.erp.common.enums;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * api返回结果枚举定义 包括返回码，系统信息，用户友好信息
 * @Author: jiangchao@bond520.com
 * @Date: 2017-03-21 14:20
 */
public enum ApiMsgEnum {
    CORRECT("000000", "操作成功"),
    EXCEPTION_CODE_NOT_FOUND("000010", "操作码不存在"),
    SERVICEERROR("999999","服务端异常"), 
    ;


    private String resCode;
    private String resDes;
    public static Map<String, String> apiMsgMap = new HashMap<String, String>();
    static {
        apiMsgMap=getAll();
    }

    ApiMsgEnum(String code, String msg) {
        this.resCode = code;
        this.resDes = msg;
    }

    private static Map<String, String> getAll() {
        Map<String, String> retMap = new LinkedHashMap<String, String>();
        ApiMsgEnum[] enumArr = ApiMsgEnum.values();
        for (ApiMsgEnum aEnum : enumArr) {
            retMap.put(aEnum.getResCode(), aEnum.getResDes());
        }
        return retMap;
    }

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


}

