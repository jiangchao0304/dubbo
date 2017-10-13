package com.sunvalley.erp.product.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import java.math.BigDecimal;
import java.io.Serializable;

/**
* @Description: table:SalesPlanLockedData
* @author
* @date 2017-10-13 02:13:23
*/
public class SalesPlanLockedData implements Serializable{

	//===========================================代码生成开始============================================
	private static final long serialVersionUID = 1L;
    //columns 开始
    private java.lang.Integer id;//
    private java.lang.Integer orgId;//
    private java.lang.Integer salesPlanVersion;//
    private java.lang.String sku;//
    private java.lang.String purPec;//
    private java.lang.String model;//
    private java.lang.String country;//
    private BigDecimal mc;//
    private java.lang.String currency;//
    private java.lang.Integer exchangeRateVersion;//
    private BigDecimal exchangeRate;//
    private BigDecimal commissionRate;//Ӷ
    private BigDecimal fbaCost;//FBA
    private BigDecimal rmaRatio;//RMA
    private java.lang.String rmaFormule;//
    private java.lang.Integer status;//0:δ
    private java.util.Date lockedDate;//
    private java.lang.Integer lockedUser;//
    private java.lang.Integer month1Sales;//
    private java.lang.Integer month2Sales;//
    private java.lang.Integer month3Sales;//
    private java.lang.Integer month4Sales;//
    private java.lang.Integer month5Sales;//
    private java.lang.Integer month6Sales;//
    private BigDecimal vatTaxRate;//
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
	public void setOrgId(java.lang.Integer value) {
		this.orgId = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getOrgId() {
		return this.orgId;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setSalesPlanVersion(java.lang.Integer value) {
		this.salesPlanVersion = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getSalesPlanVersion() {
		return this.salesPlanVersion;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setSku(java.lang.String value) {
		this.sku = value;
	}
	
	/**
     * 
     */
	public java.lang.String getSku() {
		return this.sku;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setPurPec(java.lang.String value) {
		this.purPec = value;
	}
	
	/**
     * 
     */
	public java.lang.String getPurPec() {
		return this.purPec;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setModel(java.lang.String value) {
		this.model = value;
	}
	
	/**
     * 
     */
	public java.lang.String getModel() {
		return this.model;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setCountry(java.lang.String value) {
		this.country = value;
	}
	
	/**
     * 
     */
	public java.lang.String getCountry() {
		return this.country;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setMc(BigDecimal value) {
		this.mc = value;
	}
	
	/**
     * 
     */
	public BigDecimal getMc() {
		return this.mc;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setCurrency(java.lang.String value) {
		this.currency = value;
	}
	
	/**
     * 
     */
	public java.lang.String getCurrency() {
		return this.currency;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setExchangeRateVersion(java.lang.Integer value) {
		this.exchangeRateVersion = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getExchangeRateVersion() {
		return this.exchangeRateVersion;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setExchangeRate(BigDecimal value) {
		this.exchangeRate = value;
	}
	
	/**
     * 
     */
	public BigDecimal getExchangeRate() {
		return this.exchangeRate;
	}

  	/**
     * Ӷ
     *
     * @param value
     */
	public void setCommissionRate(BigDecimal value) {
		this.commissionRate = value;
	}
	
	/**
     * Ӷ
     */
	public BigDecimal getCommissionRate() {
		return this.commissionRate;
	}

  	/**
     * FBA
     *
     * @param value
     */
	public void setFbaCost(BigDecimal value) {
		this.fbaCost = value;
	}
	
	/**
     * FBA
     */
	public BigDecimal getFbaCost() {
		return this.fbaCost;
	}

  	/**
     * RMA
     *
     * @param value
     */
	public void setRmaRatio(BigDecimal value) {
		this.rmaRatio = value;
	}
	
	/**
     * RMA
     */
	public BigDecimal getRmaRatio() {
		return this.rmaRatio;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setRmaFormule(java.lang.String value) {
		this.rmaFormule = value;
	}
	
	/**
     * 
     */
	public java.lang.String getRmaFormule() {
		return this.rmaFormule;
	}

  	/**
     * 0:δ
     *
     * @param value
     */
	public void setStatus(java.lang.Integer value) {
		this.status = value;
	}
	
	/**
     * 0:δ
     */
	public java.lang.Integer getStatus() {
		return this.status;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setLockedDate(java.util.Date value) {
		this.lockedDate = value;
	}
	
	/**
     * 
     */
	public java.util.Date getLockedDate() {
		return this.lockedDate;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setLockedUser(java.lang.Integer value) {
		this.lockedUser = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getLockedUser() {
		return this.lockedUser;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setMonth1Sales(java.lang.Integer value) {
		this.month1Sales = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getMonth1Sales() {
		return this.month1Sales;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setMonth2Sales(java.lang.Integer value) {
		this.month2Sales = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getMonth2Sales() {
		return this.month2Sales;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setMonth3Sales(java.lang.Integer value) {
		this.month3Sales = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getMonth3Sales() {
		return this.month3Sales;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setMonth4Sales(java.lang.Integer value) {
		this.month4Sales = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getMonth4Sales() {
		return this.month4Sales;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setMonth5Sales(java.lang.Integer value) {
		this.month5Sales = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getMonth5Sales() {
		return this.month5Sales;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setMonth6Sales(java.lang.Integer value) {
		this.month6Sales = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getMonth6Sales() {
		return this.month6Sales;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setVatTaxRate(BigDecimal value) {
		this.vatTaxRate = value;
	}
	
	/**
     * 
     */
	public BigDecimal getVatTaxRate() {
		return this.vatTaxRate;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("id",getId())
			.append("orgId",getOrgId())
			.append("salesPlanVersion",getSalesPlanVersion())
			.append("sku",getSku())
			.append("purPec",getPurPec())
			.append("model",getModel())
			.append("country",getCountry())
			.append("mc",getMc())
			.append("currency",getCurrency())
			.append("exchangeRateVersion",getExchangeRateVersion())
			.append("exchangeRate",getExchangeRate())
			.append("commissionRate",getCommissionRate())
			.append("fbaCost",getFbaCost())
			.append("rmaRatio",getRmaRatio())
			.append("rmaFormule",getRmaFormule())
			.append("status",getStatus())
			.append("lockedDate",getLockedDate())
			.append("lockedUser",getLockedUser())
			.append("month1Sales",getMonth1Sales())
			.append("month2Sales",getMonth2Sales())
			.append("month3Sales",getMonth3Sales())
			.append("month4Sales",getMonth4Sales())
			.append("month5Sales",getMonth5Sales())
			.append("month6Sales",getMonth6Sales())
			.append("vatTaxRate",getVatTaxRate())
			.toString();
	}
	//===========================================代码生成结束============================================
}

