package com.sunvalley.erp.product.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import java.math.BigDecimal;
import java.io.Serializable;

/**
* @Description: table:ItemLog
* @author
* @date 2017-09-22 12:18:46
*/
public class ItemLog implements Serializable{

	//===========================================代码生成开始============================================
	private static final long serialVersionUID = 1L;
    //columns 开始
    private java.lang.Integer id;//
    private java.lang.Integer skuid;//
    private java.lang.Integer optype;//
    private java.lang.Integer infoType;//
    private java.lang.String opnote;//
    private java.lang.String opterator;//
    private java.lang.Integer opteratorid;//
    private java.util.Date opdate;//
	//columns 结束



  	/**
     * 
     *
     * @param value
     */
	public void setId(java.lang.Integer value) {
		this.id = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getId() {
		return this.id;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setSkuid(java.lang.Integer value) {
		this.skuid = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getSkuid() {
		return this.skuid;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setOptype(java.lang.Integer value) {
		this.optype = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getOptype() {
		return this.optype;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setInfoType(java.lang.Integer value) {
		this.infoType = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getInfoType() {
		return this.infoType;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setOpnote(java.lang.String value) {
		this.opnote = value;
	}
	
	/**
     * 
     */
	public java.lang.String getOpnote() {
		return this.opnote;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setOpterator(java.lang.String value) {
		this.opterator = value;
	}
	
	/**
     * 
     */
	public java.lang.String getOpterator() {
		return this.opterator;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setOpteratorid(java.lang.Integer value) {
		this.opteratorid = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getOpteratorid() {
		return this.opteratorid;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setOpdate(java.util.Date value) {
		this.opdate = value;
	}
	
	/**
     * 
     */
	public java.util.Date getOpdate() {
		return this.opdate;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("id",getId())
			.append("skuid",getSkuid())
			.append("optype",getOptype())
			.append("infoType",getInfoType())
			.append("opnote",getOpnote())
			.append("opterator",getOpterator())
			.append("opteratorid",getOpteratorid())
			.append("opdate",getOpdate())
			.toString();
	}
	//===========================================代码生成结束============================================
}

