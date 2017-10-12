/**
 * @(#)ParameterException.java 2011-12-20 Copyright 2011 it.kedacom.com, Inc.
 *                             All rights reserved.
 */

package com.sunvalley.erp.common.exception;


/**
 * 参数异常类
 */
public class ParameterException extends RuntimeException {

	/** serialVersionUID */
	private static final long serialVersionUID = 2332608236621015982L;
	private String code;

	public ParameterException() {
		super();
	}

	public ParameterException(String message) {
		super(message);
	}

	public ParameterException(String code, String message) {
		super(message);
		this.code = code;
	}

	public ParameterException(Throwable cause) {
		super(cause);
	}

	public ParameterException(String message, Throwable cause) {
		super(message, cause);
	}

	public ParameterException(String code, String message, Throwable cause) {
		super(message, cause);
		this.code = code;
	}
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}
