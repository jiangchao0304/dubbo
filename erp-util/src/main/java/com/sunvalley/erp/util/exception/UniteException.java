package com.sunvalley.erp.util.exception;

public class UniteException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	// 异常代码
	private String key;
	private String[] values;

	// 构造器重载
	public UniteException() {
		super();
	}

	public UniteException(String message, Throwable throwable) {
		super(message, throwable);
	}

	public UniteException(String message) {
		super(message);
	}

	public UniteException(Throwable throwable) {
		super(throwable);
	}

	public UniteException(String message, String key) {
		super(message);
		this.key = key;
	}

	public UniteException(String message, String key, String value) {
		super(message);
		this.key = key;
		this.values = new String[] { value };
	}

	public UniteException(String message, String key, String[] values) {
		super(message);
		this.key = key;
		this.values = values;
	}

	public String getKey() {
		return key;
	}

	public String[] getValues() {
		return values;
	}
}
