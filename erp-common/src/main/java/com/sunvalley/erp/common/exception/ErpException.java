/*
* Copyright (c) 2016 sunvalley. All Rights Reserved.
*/
package com.sunvalley.erp.common.exception;

import java.util.Map;

/**
 * 类或方法的功能描述 :TODO
 *
 * @Author:
 * @Date: 2017-01-06 20:08
 */
public interface ErpException {
     String getErrCode();
     String getErrMessage();
     Map<String, Object> requestParam();
}

