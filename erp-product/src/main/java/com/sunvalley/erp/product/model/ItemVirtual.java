package com.sunvalley.erp.product.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import java.math.BigDecimal;
import java.io.Serializable;

/**
* @Description: table:ItemVirtual
* @author
* @date 2017-09-28 03:10:43
*/
public class ItemVirtual implements Serializable{

	//===========================================代码生成开始============================================
	private static final long serialVersionUID = 1L;
    //columns 开始
    private java.lang.Integer virtualSkuid;//
    private java.lang.Integer actualSkuid;//
    private Short qty;//
	//columns 结束



  	/**
     * 
     *
     * @param value
     */
	public void setVirtualSkuid(java.lang.Integer value) {
		this.virtualSkuid = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getVirtualSkuid() {
		return this.virtualSkuid;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setActualSkuid(java.lang.Integer value) {
		this.actualSkuid = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getActualSkuid() {
		return this.actualSkuid;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setQty(Short value) {
		this.qty = value;
	}
	
	/**
     * 
     */
	public Short getQty() {
		return this.qty;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("virtualSkuid",getVirtualSkuid())
			.append("actualSkuid",getActualSkuid())
			.append("qty",getQty())
			.toString();
	}
	//===========================================代码生成结束============================================
}

