package com.sunvalley.erp.product.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import java.math.BigDecimal;
import java.io.Serializable;

/**
* @Description: table:SalesPlanCost
* @author
* @date 2017-09-25 03:10:40
*/
public class SalesPlanCost implements Serializable{

	//===========================================代码生成开始============================================
	private static final long serialVersionUID = 1L;
    //columns 开始
    private java.lang.Integer id;//
    private java.lang.String sku;//
    private java.lang.Integer skuType;//1:正式SKU 2：预备SKU
    private java.lang.String model;//
    private java.lang.String country;//
    private BigDecimal commissionRate;//
    private BigDecimal fbaCost;//
    private java.lang.Integer createUser;//
    private java.util.Date createTime;//
    private java.lang.Integer updateUser;//
    private java.util.Date updateTime;//
    private java.lang.String remark;//备注
    private java.lang.String status;//
    private BigDecimal vatTaxRate;//
    private java.lang.Integer skuid;//
    private Integer shipType;//运输方式
    private java.lang.Integer purchaseCycle;//采购周期
    private BigDecimal calMonth;//计算月份
    private Integer isDirectShipments;//是否直发[1：是；2：否]
    private Integer isOutsideDetect;//是否外验[1：是；2：否]
    private java.lang.Integer fcstQty;//Forecast数量
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
     * 1:正式SKU 2：预备SKU
     *
     * @param value
     */
	public void setSkuType(java.lang.Integer value) {
		this.skuType = value;
	}
	
	/**
     * 1:正式SKU 2：预备SKU
     */
	public java.lang.Integer getSkuType() {
		return this.skuType;
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
	public void setCommissionRate(BigDecimal value) {
		this.commissionRate = value;
	}
	
	/**
     * 
     */
	public BigDecimal getCommissionRate() {
		return this.commissionRate;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setFbaCost(BigDecimal value) {
		this.fbaCost = value;
	}
	
	/**
     * 
     */
	public BigDecimal getFbaCost() {
		return this.fbaCost;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setCreateUser(java.lang.Integer value) {
		this.createUser = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getCreateUser() {
		return this.createUser;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setCreateTime(java.util.Date value) {
		this.createTime = value;
	}
	
	/**
     * 
     */
	public java.util.Date getCreateTime() {
		return this.createTime;
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
     * 备注
     *
     * @param value
     */
	public void setRemark(java.lang.String value) {
		this.remark = value;
	}
	
	/**
     * 备注
     */
	public java.lang.String getRemark() {
		return this.remark;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setStatus(java.lang.String value) {
		this.status = value;
	}
	
	/**
     * 
     */
	public java.lang.String getStatus() {
		return this.status;
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
     * 运输方式
     *
     * @param value
     */
	public void setShipType(Integer value) {
		this.shipType = value;
	}
	
	/**
     * 运输方式
     */
	public Integer getShipType() {
		return this.shipType;
	}

  	/**
     * 采购周期
     *
     * @param value
     */
	public void setPurchaseCycle(java.lang.Integer value) {
		this.purchaseCycle = value;
	}
	
	/**
     * 采购周期
     */
	public java.lang.Integer getPurchaseCycle() {
		return this.purchaseCycle;
	}

  	/**
     * 计算月份
     *
     * @param value
     */
	public void setCalMonth(BigDecimal value) {
		this.calMonth = value;
	}
	
	/**
     * 计算月份
     */
	public BigDecimal getCalMonth() {
		return this.calMonth;
	}

  	/**
     * 是否直发[1：是；2：否]
     *
     * @param value
     */
	public void setIsDirectShipments(Integer value) {
		this.isDirectShipments = value;
	}
	
	/**
     * 是否直发[1：是；2：否]
     */
	public Integer getIsDirectShipments() {
		return this.isDirectShipments;
	}

  	/**
     * 是否外验[1：是；2：否]
     *
     * @param value
     */
	public void setIsOutsideDetect(Integer value) {
		this.isOutsideDetect = value;
	}
	
	/**
     * 是否外验[1：是；2：否]
     */
	public Integer getIsOutsideDetect() {
		return this.isOutsideDetect;
	}

  	/**
     * Forecast数量
     *
     * @param value
     */
	public void setFcstQty(java.lang.Integer value) {
		this.fcstQty = value;
	}
	
	/**
     * Forecast数量
     */
	public java.lang.Integer getFcstQty() {
		return this.fcstQty;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("id",getId())
			.append("sku",getSku())
			.append("skuType",getSkuType())
			.append("model",getModel())
			.append("country",getCountry())
			.append("commissionRate",getCommissionRate())
			.append("fbaCost",getFbaCost())
			.append("createUser",getCreateUser())
			.append("createTime",getCreateTime())
			.append("updateUser",getUpdateUser())
			.append("updateTime",getUpdateTime())
			.append("remark",getRemark())
			.append("status",getStatus())
			.append("vatTaxRate",getVatTaxRate())
			.append("skuid",getSkuid())
			.append("shipType",getShipType())
			.append("purchaseCycle",getPurchaseCycle())
			.append("calMonth",getCalMonth())
			.append("isDirectShipments",getIsDirectShipments())
			.append("isOutsideDetect",getIsOutsideDetect())
			.append("fcstQty",getFcstQty())
			.toString();
	}
	//===========================================代码生成结束============================================
}

