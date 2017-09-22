package com.sunvalley.erp.model.product;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import java.math.BigDecimal;
import java.io.Serializable;

/**
* @Description: table:ItemAttrValueLocale
* @author
* @date 2017-09-22 01:50:58
*/
public class ItemAttrValueLocale implements Serializable{

	//===========================================代码生成开始============================================
	private static final long serialVersionUID = 1L;
    //columns 开始
    private java.lang.Integer skuid;//
    private Integer langId;//
    private Integer rowflag;//
    private java.lang.String fa01;//
    private java.lang.String fa02;//
    private java.lang.String fa03;//
    private java.lang.String fa04;//
    private java.lang.String fa05;//
    private java.lang.String fa06;//
    private java.lang.String fa07;//
    private java.lang.String fa08;//
    private java.lang.String fa09;//
    private java.lang.String fa10;//
    private java.lang.String fa11;//
    private java.lang.String fa12;//
    private java.lang.String fa13;//
    private java.lang.String fa14;//
    private java.lang.String fa15;//
	//columns 结束



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
	public void setLangId(Integer value) {
		this.langId = value;
	}
	
	/**
     * 
     */
	public Integer getLangId() {
		return this.langId;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setRowflag(Integer value) {
		this.rowflag = value;
	}
	
	/**
     * 
     */
	public Integer getRowflag() {
		return this.rowflag;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setFa01(java.lang.String value) {
		this.fa01 = value;
	}
	
	/**
     * 
     */
	public java.lang.String getFa01() {
		return this.fa01;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setFa02(java.lang.String value) {
		this.fa02 = value;
	}
	
	/**
     * 
     */
	public java.lang.String getFa02() {
		return this.fa02;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setFa03(java.lang.String value) {
		this.fa03 = value;
	}
	
	/**
     * 
     */
	public java.lang.String getFa03() {
		return this.fa03;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setFa04(java.lang.String value) {
		this.fa04 = value;
	}
	
	/**
     * 
     */
	public java.lang.String getFa04() {
		return this.fa04;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setFa05(java.lang.String value) {
		this.fa05 = value;
	}
	
	/**
     * 
     */
	public java.lang.String getFa05() {
		return this.fa05;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setFa06(java.lang.String value) {
		this.fa06 = value;
	}
	
	/**
     * 
     */
	public java.lang.String getFa06() {
		return this.fa06;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setFa07(java.lang.String value) {
		this.fa07 = value;
	}
	
	/**
     * 
     */
	public java.lang.String getFa07() {
		return this.fa07;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setFa08(java.lang.String value) {
		this.fa08 = value;
	}
	
	/**
     * 
     */
	public java.lang.String getFa08() {
		return this.fa08;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setFa09(java.lang.String value) {
		this.fa09 = value;
	}
	
	/**
     * 
     */
	public java.lang.String getFa09() {
		return this.fa09;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setFa10(java.lang.String value) {
		this.fa10 = value;
	}
	
	/**
     * 
     */
	public java.lang.String getFa10() {
		return this.fa10;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setFa11(java.lang.String value) {
		this.fa11 = value;
	}
	
	/**
     * 
     */
	public java.lang.String getFa11() {
		return this.fa11;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setFa12(java.lang.String value) {
		this.fa12 = value;
	}
	
	/**
     * 
     */
	public java.lang.String getFa12() {
		return this.fa12;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setFa13(java.lang.String value) {
		this.fa13 = value;
	}
	
	/**
     * 
     */
	public java.lang.String getFa13() {
		return this.fa13;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setFa14(java.lang.String value) {
		this.fa14 = value;
	}
	
	/**
     * 
     */
	public java.lang.String getFa14() {
		return this.fa14;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setFa15(java.lang.String value) {
		this.fa15 = value;
	}
	
	/**
     * 
     */
	public java.lang.String getFa15() {
		return this.fa15;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("skuid",getSkuid())
			.append("langId",getLangId())
			.append("rowflag",getRowflag())
			.append("fa01",getFa01())
			.append("fa02",getFa02())
			.append("fa03",getFa03())
			.append("fa04",getFa04())
			.append("fa05",getFa05())
			.append("fa06",getFa06())
			.append("fa07",getFa07())
			.append("fa08",getFa08())
			.append("fa09",getFa09())
			.append("fa10",getFa10())
			.append("fa11",getFa11())
			.append("fa12",getFa12())
			.append("fa13",getFa13())
			.append("fa14",getFa14())
			.append("fa15",getFa15())
			.toString();
	}
	//===========================================代码生成结束============================================
}

