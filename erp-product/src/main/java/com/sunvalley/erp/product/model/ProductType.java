package com.sunvalley.erp.product.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import java.math.BigDecimal;
import java.io.Serializable;

/**
* @Description: table:ProductType
* @author
* @date 2017-09-22 04:56:15
*/
public class ProductType implements Serializable{

	//===========================================代码生成开始============================================
	private static final long serialVersionUID = 1L;
    //columns 开始
    private java.lang.Integer id;//
    private java.lang.String name;//
    private java.lang.Integer type;//1：产品类型 2，使用类别
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
	public void setName(java.lang.String value) {
		this.name = value;
	}
	
	/**
     * 
     */
	public java.lang.String getName() {
		return this.name;
	}

  	/**
     * 1：产品类型 2，使用类别
     *
     * @param value
     */
	public void setType(java.lang.Integer value) {
		this.type = value;
	}
	
	/**
     * 1：产品类型 2，使用类别
     */
	public java.lang.Integer getType() {
		return this.type;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("id",getId())
			.append("name",getName())
			.append("type",getType())
			.toString();
	}
	//===========================================代码生成结束============================================
}

