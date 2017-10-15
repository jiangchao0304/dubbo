/*
* Copyright (c) 2016 . All Rights Reserved.
*/
package com.sunvalley.erp.product.common;

import com.sunvalley.erp.common.constants.Constants;
import com.sunvalley.erp.common.enums.ApiMsgEnum;
import com.sunvalley.erp.common.exception.SunvalleyException;
import com.sunvalley.erp.common.util.DateUtil;
import com.sunvalley.erp.common.util.JsonUtil;
import com.sunvalley.erp.product.vo.BaseReturnVO;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.StopWatch;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.Enumeration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 时间统计aop
 *
 * @Author:
 * @Date: 2017-03-21 11:09
 */
@Aspect
@Component
public class Interceptor {
    private final static Logger logger = LoggerFactory.getLogger(Interceptor.class);
    private static String osName = System.getProperties().getProperty("os.name");
    private static Pattern verPattern = Pattern.compile("\"version\":\"(.*?)\"");
    /**
     * 统计方法执行耗时Around环绕通知
     *
     * @param joinPoint
     * @return
     */
    public Object timeAround(ProceedingJoinPoint joinPoint) {
        // 定义返回对象、得到方法需要的参数
        RequestAttributes ra = RequestContextHolder.getRequestAttributes();
        ServletRequestAttributes sra = (ServletRequestAttributes)ra;
        HttpServletRequest request = sra.getRequest();
        //beforeInvokeService(request);
        Object result = null;
        Object[] args = joinPoint.getArgs();
        StopWatch clock = new StopWatch();
        clock.start(); //计时开始
        Date startTime =new Date();
        try {
             result = joinPoint.proceed(args);
        } catch (Throwable e) {
            e.printStackTrace();
            if (e instanceof SunvalleyException) {
                //bondErrorScene(startTime,request,((SunvalleyException)e).getErrCode(),((SunvalleyException)e).getErrMessage(),e);
                return  new BaseReturnVO( ((SunvalleyException)e).getErrCode(), ((SunvalleyException)e).getErrMessage());
            }else {
                //bondErrorScene(startTime,request,ApiMsgEnum.SERVICEERROR.getResCode(),e.getMessage(),e);
            }
            return  new BaseReturnVO(ApiMsgEnum.SERVICEERROR.getResCode(),e.getMessage());
        }
        clock.stop();  //计时结束
        return result;

    }



    /**
     * 调用service之前.
     *
     * @param request
     * @author
     */
    private void beforeInvokeService(HttpServletRequest request) {
        StringBuilder sb = new StringBuilder();
        sb.append("thread_"+ Thread.currentThread().getId() +" start request api :"+request.getRequestURI() ).append("\n");
        sb.append("=======================================\n");
        sb.append("request param:\n");
        sb.append(getParameter(request));
        sb.append("request header:\n");
        sb.append(getHeader(request));
        sb.append("=======================================\n");
        logger.debug(sb.toString());

    }

    /**
     * 调用service之后.
     * requestTime|responseTime|duringTime|serverIP|clinetIp|device|userId|imei|ticket|systemType|responseCode|requrl|requri|refer|requestParam|responseParam|ex
     */
    private void afterInvokeService(Date requestTime, HttpServletRequest request, BaseReturnVO response) {
        Date currentDate= DateUtil.getCurrentDateTime();
        long duringTime =currentDate.getTime()-requestTime.getTime();
        StringBuilder sb = new StringBuilder();
        sb.append(Constants.LOG_SPLITER); //log start
        sb.append(DateUtil.formatDateTime(requestTime,"yyyy-MM-dd HH:mm:ss.SSS")).append(Constants.LOG_SPLITER); //requestTime
        sb.append(DateUtil.formatDateTime(currentDate,"yyyy-MM-dd HH:mm:ss.SSS")).append(Constants.LOG_SPLITER); //responseTime
        sb.append(duringTime).append(Constants.LOG_SPLITER); //duringTime
        sb.append("ip").append(Constants.LOG_SPLITER); //serverIP
        sb.append("ip").append(Constants.LOG_SPLITER); //clinetIp
        sb.append(request.getHeader("user-agent")).append(Constants.LOG_SPLITER); //device
        sb.append(request.getHeader("userId")).append(Constants.LOG_SPLITER); //userId
        sb.append(request.getHeader("imei")).append(Constants.LOG_SPLITER); //imei
        sb.append(request.getHeader("ticket")).append(Constants.LOG_SPLITER); //ticket
        sb.append(request.getHeader("systemType")).append(Constants.LOG_SPLITER); //systemType
        sb.append(response.getResCode()).append(Constants.LOG_SPLITER); //responseCode
        sb.append(request.getRequestURL()).append(Constants.LOG_SPLITER); //requrl
        sb.append(request.getRequestURI()).append(Constants.LOG_SPLITER); //requri
        sb.append(request.getHeader("Referer")).append(Constants.LOG_SPLITER); //refer
        sb.append(getApiVer(request)).append(Constants.LOG_SPLITER); //apiVersion
        sb.append(getParameter(request)).append(Constants.LOG_SPLITER); //requestParam
        sb.append(JsonUtil.toJSON(response.getData())).append(Constants.LOG_SPLITER); //responseParam
        sb.append("").append(Constants.LOG_SPLITER);//errorMsg
        sb.append("");//Throwable
        logger.info(sb.toString());
    }


    private void bondErrorScene(Date requestTime, HttpServletRequest request,String responseCode,String errMsg, Throwable e){
        Date currentDate= DateUtil.getCurrentDateTime();
        long duringTime = currentDate.getTime()-requestTime.getTime();
        StringBuilder sb = new StringBuilder();
        sb.append(Constants.LOG_SPLITER); //log start
        sb.append(DateUtil.formatDateTime(requestTime,"yyyy-MM-dd HH:mm:ss.SSS")).append(Constants.LOG_SPLITER); //requestTime
        sb.append(DateUtil.formatDateTime(currentDate,"yyyy-MM-dd HH:mm:ss.SSS")).append(Constants.LOG_SPLITER); //responseTime
        sb.append(duringTime).append(Constants.LOG_SPLITER); //duringTime
        sb.append("ip").append(Constants.LOG_SPLITER); //serverIP
        sb.append("ip").append(Constants.LOG_SPLITER); //clinetIp
        sb.append(request.getHeader("user-agent")).append(Constants.LOG_SPLITER); //device
        sb.append(request.getHeader("userId")).append(Constants.LOG_SPLITER); //userId
        sb.append(request.getHeader("imei")).append(Constants.LOG_SPLITER); //imei
        sb.append(request.getHeader("ticket")).append(Constants.LOG_SPLITER); //ticket
        sb.append(request.getHeader("systemType")).append(Constants.LOG_SPLITER); //systemType
        sb.append(responseCode).append(Constants.LOG_SPLITER); //responseCode
        sb.append(request.getRequestURL()).append(Constants.LOG_SPLITER); //requrl
        sb.append(request.getRequestURI()).append(Constants.LOG_SPLITER); //requr
        sb.append(request.getHeader("Referer")).append(Constants.LOG_SPLITER); //refer
        sb.append(getApiVer(request)).append(Constants.LOG_SPLITER); //apiVersion
        sb.append(getParameter(request)).append(Constants.LOG_SPLITER); //requestParam
        sb.append("").append(Constants.LOG_SPLITER); //responseParam
        sb.append(errMsg).append(Constants.LOG_SPLITER); //errorMsg
        logger.error(sb.toString(),e); //Throwable
    }

    private String getApiVer(HttpServletRequest request) {
        String jsonData = request.getParameter("jsonData");
        if (StringUtils.isBlank(jsonData)) {
            return StringUtils.isBlank(request.getHeader("version")) ? "16" : request.getHeader("version");
        }
        Matcher m = verPattern.matcher(jsonData);
        if (m.find( )) {
                return  m.group(1);
        } else {
           return "16";
        }
    }


    private String getParameter(HttpServletRequest request){
        StringBuilder sb = new StringBuilder();
        Enumeration em = request.getParameterNames();
        while (em.hasMoreElements()) {
            String key = (String) em.nextElement();
            sb.append(key+"="+request.getParameter(key));

        }
        return  sb.toString();

    }

    private String getHeader(HttpServletRequest request){
        StringBuilder sb = new StringBuilder();
        Enumeration headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String key = (String) headerNames.nextElement();
            sb.append(key+"="+request.getHeader(key)).append("\n");
        }
        return  sb.toString();
    }

    private static void  appenStackMsg(Throwable e,StringBuilder sb){
        sb.append(e).append("\n");
        StackTraceElement[] stackArray = e.getStackTrace();
        for (int i = 0; i < stackArray.length; i++) {
            StackTraceElement element = stackArray[i];
            sb.append(element.toString() + "\n");
        }
    }


}

