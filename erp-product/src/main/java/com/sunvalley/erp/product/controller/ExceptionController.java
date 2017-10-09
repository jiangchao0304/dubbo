/*
* Copyright (c) 2016 bond. All Rights Reserved.
*/
package com.sunvalley.erp.product.controller;

import com.sunvalley.erp.product.vo.BaseReturnVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 全局异常捕获.
 *
 * @Author: jiangchao@bond520.com
 * @Date: 2017-03-21 14:03
 */
@ControllerAdvice
public class ExceptionController {
    private final static Logger logger = LoggerFactory.getLogger(ExceptionController.class);


    @ResponseBody
    @ExceptionHandler({ Exception.class })
    public BaseReturnVO handleException(Exception e) {
        logger.error("由异常控制器捕获，提示:", e);
//        if (e instanceof BondException) {
//            return  new BaseReturnVO((BondException)e);
//        }
//        return  new BaseReturnVO(ApiMsgEnum.SERVICEERROR.getResCode(),e.getMessage());
        return  new BaseReturnVO("99999","error");
    }
}

