package com.sunvalley.erp.product.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import java.math.BigDecimal;
import java.io.Serializable;

/**
* @Description: table:SalesPlanSum
* @author
* @date 2017-10-13 02:13:35
*/
public class SalesPlanSum implements Serializable{

	//===========================================代码生成开始============================================
	private static final long serialVersionUID = 1L;
    //columns 开始
    private java.lang.Integer id;//
    private java.lang.Integer orgId;//
    private java.lang.Integer salesPlanVersion;//
    private java.lang.Integer planType;//1 : top down; 2 : botton up; 
    private java.lang.String dataType;//1:ë
    private java.lang.Integer pmonth;//
    private BigDecimal pvalue;//
    private java.lang.String pquarter;//
    private java.lang.String pyear;//
    private java.lang.Integer status;//0 : 
    private java.lang.Integer appState;//0:
    private java.lang.Integer updateUser;//
    private java.util.Date updateTime;//
    private BigDecimal grossIncome;//ë
    private BigDecimal netIncome;//
    private java.lang.Double netIncomePercentage;//
    private java.lang.Double grossProfitRate;//ëë
    private BigDecimal grossProfit;//ëë
    private BigDecimal promotionExpenses;//
    private BigDecimal netProfit;//
    private java.lang.Double netProfitRatePercentage;//
    private java.lang.Integer salesVolumn;//
    private BigDecimal perUnitSalesPrice;//
    private BigDecimal mktCost;//MKT 
    private BigDecimal sampleCost;//
    private BigDecimal vatTaxes;//VAT ˰
    private java.lang.String sku;//
    private java.lang.String country;//
    private java.lang.Double promotionExpensesRate;//
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
     * 1 : top down; 2 : botton up; 
     *
     * @param value
     */
	public void setPlanType(java.lang.Integer value) {
		this.planType = value;
	}
	
	/**
     * 1 : top down; 2 : botton up; 
     */
	public java.lang.Integer getPlanType() {
		return this.planType;
	}

  	/**
     * 1:ë
     *
     * @param value
     */
	public void setDataType(java.lang.String value) {
		this.dataType = value;
	}
	
	/**
     * 1:ë
     */
	public java.lang.String getDataType() {
		return this.dataType;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setPmonth(java.lang.Integer value) {
		this.pmonth = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getPmonth() {
		return this.pmonth;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setPvalue(BigDecimal value) {
		this.pvalue = value;
	}
	
	/**
     * 
     */
	public BigDecimal getPvalue() {
		return this.pvalue;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setPquarter(java.lang.String value) {
		this.pquarter = value;
	}
	
	/**
     * 
     */
	public java.lang.String getPquarter() {
		return this.pquarter;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setPyear(java.lang.String value) {
		this.pyear = value;
	}
	
	/**
     * 
     */
	public java.lang.String getPyear() {
		return this.pyear;
	}

  	/**
     * 0 : 
     *
     * @param value
     */
	public void setStatus(java.lang.Integer value) {
		this.status = value;
	}
	
	/**
     * 0 : 
     */
	public java.lang.Integer getStatus() {
		return this.status;
	}

  	/**
     * 0:
     *
     * @param value
     */
	public void setAppState(java.lang.Integer value) {
		this.appState = value;
	}
	
	/**
     * 0:
     */
	public java.lang.Integer getAppState() {
		return this.appState;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setUpdateUser(java.lang.Integer value) {
		this.updateUser = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getUpdateUser() {
		return this.updateUser;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setUpdateTime(java.util.Date value) {
		this.updateTime = value;
	}
	
	/**
     * 
     */
	public java.util.Date getUpdateTime() {
		return this.updateTime;
	}

  	/**
     * ë
     *
     * @param value
     */
	public void setGrossIncome(BigDecimal value) {
		this.grossIncome = value;
	}
	
	/**
     * ë
     */
	public BigDecimal getGrossIncome() {
		return this.grossIncome;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setNetIncome(BigDecimal value) {
		this.netIncome = value;
	}
	
	/**
     * 
     */
	public BigDecimal getNetIncome() {
		return this.netIncome;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setNetIncomePercentage(java.lang.Double value) {
		this.netIncomePercentage = value;
	}
	
	/**
     * 
     */
	public java.lang.Double getNetIncomePercentage() {
		return this.netIncomePercentage;
	}

  	/**
     * ëë
     *
     * @param value
     */
	public void setGrossProfitRate(java.lang.Double value) {
		this.grossProfitRate = value;
	}
	
	/**
     * ëë
     */
	public java.lang.Double getGrossProfitRate() {
		return this.grossProfitRate;
	}

  	/**
     * ëë
     *
     * @param value
     */
	public void setGrossProfit(BigDecimal value) {
		this.grossProfit = value;
	}
	
	/**
     * ëë
     */
	public BigDecimal getGrossProfit() {
		return this.grossProfit;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setPromotionExpenses(BigDecimal value) {
		this.promotionExpenses = value;
	}
	
	/**
     * 
     */
	public BigDecimal getPromotionExpenses() {
		return this.promotionExpenses;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setNetProfit(BigDecimal value) {
		this.netProfit = value;
	}
	
	/**
     * 
     */
	public BigDecimal getNetProfit() {
		return this.netProfit;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setNetProfitRatePercentage(java.lang.Double value) {
		this.netProfitRatePercentage = value;
	}
	
	/**
     * 
     */
	public java.lang.Double getNetProfitRatePercentage() {
		return this.netProfitRatePercentage;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setSalesVolumn(java.lang.Integer value) {
		this.salesVolumn = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getSalesVolumn() {
		return this.salesVolumn;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setPerUnitSalesPrice(BigDecimal value) {
		this.perUnitSalesPrice = value;
	}
	
	/**
     * 
     */
	public BigDecimal getPerUnitSalesPrice() {
		return this.perUnitSalesPrice;
	}

  	/**
     * MKT 
     *
     * @param value
     */
	public void setMktCost(BigDecimal value) {
		this.mktCost = value;
	}
	
	/**
     * MKT 
     */
	public BigDecimal getMktCost() {
		return this.mktCost;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setSampleCost(BigDecimal value) {
		this.sampleCost = value;
	}
	
	/**
     * 
     */
	public BigDecimal getSampleCost() {
		return this.sampleCost;
	}

  	/**
     * VAT ˰
     *
     * @param value
     */
	public void setVatTaxes(BigDecimal value) {
		this.vatTaxes = value;
	}
	
	/**
     * VAT ˰
     */
	public BigDecimal getVatTaxes() {
		return this.vatTaxes;
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
	public void setPromotionExpensesRate(java.lang.Double value) {
		this.promotionExpensesRate = value;
	}
	
	/**
     * 
     */
	public java.lang.Double getPromotionExpensesRate() {
		return this.promotionExpensesRate;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("id",getId())
			.append("orgId",getOrgId())
			.append("salesPlanVersion",getSalesPlanVersion())
			.append("planType",getPlanType())
			.append("dataType",getDataType())
			.append("pmonth",getPmonth())
			.append("pvalue",getPvalue())
			.append("pquarter",getPquarter())
			.append("pyear",getPyear())
			.append("status",getStatus())
			.append("appState",getAppState())
			.append("updateUser",getUpdateUser())
			.append("updateTime",getUpdateTime())
			.append("grossIncome",getGrossIncome())
			.append("netIncome",getNetIncome())
			.append("netIncomePercentage",getNetIncomePercentage())
			.append("grossProfitRate",getGrossProfitRate())
			.append("grossProfit",getGrossProfit())
			.append("promotionExpenses",getPromotionExpenses())
			.append("netProfit",getNetProfit())
			.append("netProfitRatePercentage",getNetProfitRatePercentage())
			.append("salesVolumn",getSalesVolumn())
			.append("perUnitSalesPrice",getPerUnitSalesPrice())
			.append("mktCost",getMktCost())
			.append("sampleCost",getSampleCost())
			.append("vatTaxes",getVatTaxes())
			.append("sku",getSku())
			.append("country",getCountry())
			.append("promotionExpensesRate",getPromotionExpensesRate())
			.toString();
	}
	//===========================================代码生成结束============================================
}

