/**
 * <p>接口服务基础包，如实体类以及通用返回码等</p>
 * */
package com.sunvalley.faced.base;

/**
 * <p>各类服务响应的载体</p>
 * <p>Copyright 2016: SunvalleyTek Co.,LTD</p>
 * @author Simon.Cheng
 * @version 1.0
 * @since 2016-12-22
 * 
 * */
public class ResponseBean {

	/**
	 * 响应返回码
	 * */
	private int responseCode;
	
	/**
	 * 响应JSON格式字符串
	 * */
	private String jsonContent;
	
	/**
	 * 请求处理时间
	 * */
	private String processTime;
	
	/**
	 * 异常信息
	 * */
	private String errorMessage;

	public int getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(int responseCode) {
		this.responseCode = responseCode;
	}

	public String getJsonContent() {
		return jsonContent;
	}

	public void setJsonContent(String jsonContent) {
		this.jsonContent = jsonContent;
	}
	
	public String getProcessTime() {
		return processTime;
	}

	public void setProcessTime(String processTime) {
		this.processTime = processTime;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
