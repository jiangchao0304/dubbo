package com.sunvalley.erp.product.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import java.math.BigDecimal;
import java.io.Serializable;

/**
* @Description: table:Sequence
* @author
* @date 2017-10-13 02:13:41
*/
public class Sequence implements Serializable{

	//===========================================代码生成开始============================================
	private static final long serialVersionUID = 1L;
    //columns 开始
    private java.lang.String name;//
    private java.lang.Integer value;//
    private Short step;//
    private java.lang.Integer start;//
	//columns 结束



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
     * 
     *
     * @param value
     */
	public void setValue(java.lang.Integer value) {
		this.value = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getValue() {
		return this.value;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setStep(Short value) {
		this.step = value;
	}
	
	/**
     * 
     */
	public Short getStep() {
		return this.step;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setStart(java.lang.Integer value) {
		this.start = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getStart() {
		return this.start;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("name",getName())
			.append("value",getValue())
			.append("step",getStep())
			.append("start",getStart())
			.toString();
	}
	//===========================================代码生成结束============================================
}

