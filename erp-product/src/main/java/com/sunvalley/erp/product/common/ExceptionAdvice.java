/*
* Copyright (c) 2016 bond. All Rights Reserved.
*/
package com.sunvalley.erp.product.common;

import com.sunvalley.erp.common.enums.ApiMsgEnum;
import com.sunvalley.erp.common.exception.BusinessException;
import com.sunvalley.erp.common.exception.SunvalleyException;
import com.sunvalley.erp.common.exception.UniteException;
import com.sunvalley.erp.product.vo.BaseReturnVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;
import java.util.Map;

/**
 * 全局异常捕获.
 *
 * @Author: douglas.jiang
 * @Date: 2017-10-05 14:03
 */
@ControllerAdvice
public class ExceptionAdvice {
    private final static Logger logger = LoggerFactory.getLogger(ExceptionAdvice.class);


    @ResponseBody
    @ExceptionHandler(value=Exception.class)
    public BaseReturnVO handleException(Exception e) {

        if (e instanceof SunvalleyException) {
            logger.error("发生异常:", e);
            return  new BaseReturnVO((SunvalleyException)e);
        }

        logger.error("发生未捕获的异常:", e);
        return  new BaseReturnVO(ApiMsgEnum.SERVICEERROR.getResCode(),e.getMessage());
    }

}

