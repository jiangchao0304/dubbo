package com.sunvalley.erp.common.util;

import java.io.Serializable;

public class FilterModel implements Serializable{
	private static final long serialVersionUID = 1L;

	private String value;
	private String datatype;
	private String filed;
	private String oper;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getDatatype() {
		return datatype;
	}

	public void setDatatype(String datatype) {
		this.datatype = datatype;
	}

	public String getFiled() {
		return filed;
	}

	public void setFiled(String filed) {
		this.filed = filed;
	}

	public String getOper() {
		return oper;
	}

	public void setOper(String oper) {
		this.oper = oper;
	}
}
