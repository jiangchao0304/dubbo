package com.sunvalley.erp.product.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import java.math.BigDecimal;
import java.io.Serializable;

/**
* @Description: table:Warehouse
* @author
* @date 2017-09-22 12:25:29
*/
public class Warehouse implements Serializable{

	//===========================================代码生成开始============================================
	private static final long serialVersionUID = 1L;
    //columns 开始
    private java.lang.Integer whId;//
    private java.lang.String whName;//
    private java.lang.String type;//
    private java.lang.String whEmail;//
    private java.lang.String whContact;//
    private java.lang.String whContactLastname;//
    private java.lang.String whAddr;//
    private java.lang.String whCity;//
    private java.lang.String whState;//
    private java.lang.String whCountry;//
    private java.lang.String whZip;//
    private java.lang.String whTel;//
    private java.lang.String whFax;//
    private java.lang.String curno;//
    private BigDecimal perordercharge;//
    private BigDecimal peritemcharge;//
    private Integer dropship;//
    private Integer virtual;//
    private java.lang.Integer usedWhId;//
    private java.lang.Integer cistencilid;//CI
    private java.lang.String isMerger;//标识仓库是否同一地址,同一地址可以设置同一值
    private BigDecimal invoicePriceCoefficient;//发票美金价计算系数
    private BigDecimal customPriceCoefficient;//报关单单价系数
    private BigDecimal ciPriceCoefficient;//CI单价系数
    private java.lang.String whCountryZone;//州
    private java.lang.Integer wh3rd;//
    private java.lang.Integer istax;//是否含税: 1:含税; 2:不含税
	//columns 结束



  	/**
     * 
     *
     * @param value
     */
	public void setWhId(java.lang.Integer value) {
		this.whId = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getWhId() {
		return this.whId;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setWhName(java.lang.String value) {
		this.whName = value;
	}
	
	/**
     * 
     */
	public java.lang.String getWhName() {
		return this.whName;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setType(java.lang.String value) {
		this.type = value;
	}
	
	/**
     * 
     */
	public java.lang.String getType() {
		return this.type;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setWhEmail(java.lang.String value) {
		this.whEmail = value;
	}
	
	/**
     * 
     */
	public java.lang.String getWhEmail() {
		return this.whEmail;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setWhContact(java.lang.String value) {
		this.whContact = value;
	}
	
	/**
     * 
     */
	public java.lang.String getWhContact() {
		return this.whContact;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setWhContactLastname(java.lang.String value) {
		this.whContactLastname = value;
	}
	
	/**
     * 
     */
	public java.lang.String getWhContactLastname() {
		return this.whContactLastname;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setWhAddr(java.lang.String value) {
		this.whAddr = value;
	}
	
	/**
     * 
     */
	public java.lang.String getWhAddr() {
		return this.whAddr;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setWhCity(java.lang.String value) {
		this.whCity = value;
	}
	
	/**
     * 
     */
	public java.lang.String getWhCity() {
		return this.whCity;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setWhState(java.lang.String value) {
		this.whState = value;
	}
	
	/**
     * 
     */
	public java.lang.String getWhState() {
		return this.whState;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setWhCountry(java.lang.String value) {
		this.whCountry = value;
	}
	
	/**
     * 
     */
	public java.lang.String getWhCountry() {
		return this.whCountry;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setWhZip(java.lang.String value) {
		this.whZip = value;
	}
	
	/**
     * 
     */
	public java.lang.String getWhZip() {
		return this.whZip;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setWhTel(java.lang.String value) {
		this.whTel = value;
	}
	
	/**
     * 
     */
	public java.lang.String getWhTel() {
		return this.whTel;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setWhFax(java.lang.String value) {
		this.whFax = value;
	}
	
	/**
     * 
     */
	public java.lang.String getWhFax() {
		return this.whFax;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setCurno(java.lang.String value) {
		this.curno = value;
	}
	
	/**
     * 
     */
	public java.lang.String getCurno() {
		return this.curno;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setPerordercharge(BigDecimal value) {
		this.perordercharge = value;
	}
	
	/**
     * 
     */
	public BigDecimal getPerordercharge() {
		return this.perordercharge;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setPeritemcharge(BigDecimal value) {
		this.peritemcharge = value;
	}
	
	/**
     * 
     */
	public BigDecimal getPeritemcharge() {
		return this.peritemcharge;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setDropship(Integer value) {
		this.dropship = value;
	}
	
	/**
     * 
     */
	public Integer getDropship() {
		return this.dropship;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setVirtual(Integer value) {
		this.virtual = value;
	}
	
	/**
     * 
     */
	public Integer getVirtual() {
		return this.virtual;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setUsedWhId(java.lang.Integer value) {
		this.usedWhId = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getUsedWhId() {
		return this.usedWhId;
	}

  	/**
     * CI
     *
     * @param value
     */
	public void setCistencilid(java.lang.Integer value) {
		this.cistencilid = value;
	}
	
	/**
     * CI
     */
	public java.lang.Integer getCistencilid() {
		return this.cistencilid;
	}

  	/**
     * 标识仓库是否同一地址,同一地址可以设置同一值
     *
     * @param value
     */
	public void setIsMerger(java.lang.String value) {
		this.isMerger = value;
	}
	
	/**
     * 标识仓库是否同一地址,同一地址可以设置同一值
     */
	public java.lang.String getIsMerger() {
		return this.isMerger;
	}

  	/**
     * 发票美金价计算系数
     *
     * @param value
     */
	public void setInvoicePriceCoefficient(BigDecimal value) {
		this.invoicePriceCoefficient = value;
	}
	
	/**
     * 发票美金价计算系数
     */
	public BigDecimal getInvoicePriceCoefficient() {
		return this.invoicePriceCoefficient;
	}

  	/**
     * 报关单单价系数
     *
     * @param value
     */
	public void setCustomPriceCoefficient(BigDecimal value) {
		this.customPriceCoefficient = value;
	}
	
	/**
     * 报关单单价系数
     */
	public BigDecimal getCustomPriceCoefficient() {
		return this.customPriceCoefficient;
	}

  	/**
     * CI单价系数
     *
     * @param value
     */
	public void setCiPriceCoefficient(BigDecimal value) {
		this.ciPriceCoefficient = value;
	}
	
	/**
     * CI单价系数
     */
	public BigDecimal getCiPriceCoefficient() {
		return this.ciPriceCoefficient;
	}

  	/**
     * 州
     *
     * @param value
     */
	public void setWhCountryZone(java.lang.String value) {
		this.whCountryZone = value;
	}
	
	/**
     * 州
     */
	public java.lang.String getWhCountryZone() {
		return this.whCountryZone;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setWh3rd(java.lang.Integer value) {
		this.wh3rd = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getWh3rd() {
		return this.wh3rd;
	}

  	/**
     * 是否含税: 1:含税; 2:不含税
     *
     * @param value
     */
	public void setIstax(java.lang.Integer value) {
		this.istax = value;
	}
	
	/**
     * 是否含税: 1:含税; 2:不含税
     */
	public java.lang.Integer getIstax() {
		return this.istax;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("whId",getWhId())
			.append("whName",getWhName())
			.append("type",getType())
			.append("whEmail",getWhEmail())
			.append("whContact",getWhContact())
			.append("whContactLastname",getWhContactLastname())
			.append("whAddr",getWhAddr())
			.append("whCity",getWhCity())
			.append("whState",getWhState())
			.append("whCountry",getWhCountry())
			.append("whZip",getWhZip())
			.append("whTel",getWhTel())
			.append("whFax",getWhFax())
			.append("curno",getCurno())
			.append("perordercharge",getPerordercharge())
			.append("peritemcharge",getPeritemcharge())
			.append("dropship",getDropship())
			.append("virtual",getVirtual())
			.append("usedWhId",getUsedWhId())
			.append("cistencilid",getCistencilid())
			.append("isMerger",getIsMerger())
			.append("invoicePriceCoefficient",getInvoicePriceCoefficient())
			.append("customPriceCoefficient",getCustomPriceCoefficient())
			.append("ciPriceCoefficient",getCiPriceCoefficient())
			.append("whCountryZone",getWhCountryZone())
			.append("wh3rd",getWh3rd())
			.append("istax",getIstax())
			.toString();
	}
	//===========================================代码生成结束============================================
}

