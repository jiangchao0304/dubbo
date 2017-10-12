package com.sunvalley.erp.product.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import java.math.BigDecimal;
import java.io.Serializable;

/**
* @Description: table:ItemCustomDetail
* @author
* @date 2017-10-12 04:22:55
*/
public class ItemCustomDetail implements Serializable{

	//===========================================代码生成开始============================================
	private static final long serialVersionUID = 1L;
    //columns 开始
    private java.lang.Integer id;//
    private java.lang.Integer bsitemcustomid;//主表ID
    private java.lang.String stateid;//进口国
    private java.lang.String customscode;//海关编码进口国
    private java.lang.String commodityname;//报关品名进口国
    private java.lang.Double tariffrates;//关税税率(%)
    private java.lang.String secondname;//第二语种品名
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
     * 主表ID
     *
     * @param value
     */
	public void setBsitemcustomid(java.lang.Integer value) {
		this.bsitemcustomid = value;
	}
	
	/**
     * 主表ID
     */
	public java.lang.Integer getBsitemcustomid() {
		return this.bsitemcustomid;
	}

  	/**
     * 进口国
     *
     * @param value
     */
	public void setStateid(java.lang.String value) {
		this.stateid = value;
	}
	
	/**
     * 进口国
     */
	public java.lang.String getStateid() {
		return this.stateid;
	}

  	/**
     * 海关编码进口国
     *
     * @param value
     */
	public void setCustomscode(java.lang.String value) {
		this.customscode = value;
	}
	
	/**
     * 海关编码进口国
     */
	public java.lang.String getCustomscode() {
		return this.customscode;
	}

  	/**
     * 报关品名进口国
     *
     * @param value
     */
	public void setCommodityname(java.lang.String value) {
		this.commodityname = value;
	}
	
	/**
     * 报关品名进口国
     */
	public java.lang.String getCommodityname() {
		return this.commodityname;
	}

  	/**
     * 关税税率(%)
     *
     * @param value
     */
	public void setTariffrates(java.lang.Double value) {
		this.tariffrates = value;
	}
	
	/**
     * 关税税率(%)
     */
	public java.lang.Double getTariffrates() {
		return this.tariffrates;
	}

  	/**
     * 第二语种品名
     *
     * @param value
     */
	public void setSecondname(java.lang.String value) {
		this.secondname = value;
	}
	
	/**
     * 第二语种品名
     */
	public java.lang.String getSecondname() {
		return this.secondname;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("id",getId())
			.append("bsitemcustomid",getBsitemcustomid())
			.append("stateid",getStateid())
			.append("customscode",getCustomscode())
			.append("commodityname",getCommodityname())
			.append("tariffrates",getTariffrates())
			.append("secondname",getSecondname())
			.toString();
	}
	//===========================================代码生成结束============================================
}

