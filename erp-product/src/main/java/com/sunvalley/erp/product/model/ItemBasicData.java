package com.sunvalley.erp.product.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import java.math.BigDecimal;
import java.io.Serializable;

/**
* @Description: table:ItemBasicData
* @author
* @date 2017-10-12 04:22:33
*/
public class ItemBasicData implements Serializable{

	//===========================================代码生成开始============================================
	private static final long serialVersionUID = 1L;
    //columns 开始
    private java.lang.Integer id;//
    private java.lang.String attribute;//属性
    private java.lang.String value;//属性值
    private java.lang.Integer type;//1:预备SKU颜色；2:预备sku安规; 3：预备SKU运输方式
    private BigDecimal value2;//比例值,类似value，此字段用于存储小数
    private java.lang.String country;//国家
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
     * 属性
     *
     * @param value
     */
	public void setAttribute(java.lang.String value) {
		this.attribute = value;
	}
	
	/**
     * 属性
     */
	public java.lang.String getAttribute() {
		return this.attribute;
	}

  	/**
     * 属性值
     *
     * @param value
     */
	public void setValue(java.lang.String value) {
		this.value = value;
	}
	
	/**
     * 属性值
     */
	public java.lang.String getValue() {
		return this.value;
	}

  	/**
     * 1:预备SKU颜色；2:预备sku安规; 3：预备SKU运输方式
     *
     * @param value
     */
	public void setType(java.lang.Integer value) {
		this.type = value;
	}
	
	/**
     * 1:预备SKU颜色；2:预备sku安规; 3：预备SKU运输方式
     */
	public java.lang.Integer getType() {
		return this.type;
	}

  	/**
     * 比例值,类似value，此字段用于存储小数
     *
     * @param value
     */
	public void setValue2(BigDecimal value) {
		this.value2 = value;
	}
	
	/**
     * 比例值,类似value，此字段用于存储小数
     */
	public BigDecimal getValue2() {
		return this.value2;
	}

  	/**
     * 国家
     *
     * @param value
     */
	public void setCountry(java.lang.String value) {
		this.country = value;
	}
	
	/**
     * 国家
     */
	public java.lang.String getCountry() {
		return this.country;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("id",getId())
			.append("attribute",getAttribute())
			.append("value",getValue())
			.append("type",getType())
			.append("value2",getValue2())
			.append("country",getCountry())
			.toString();
	}
	//===========================================代码生成结束============================================
}

