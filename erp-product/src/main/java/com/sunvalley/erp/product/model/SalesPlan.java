package com.sunvalley.erp.product.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import java.math.BigDecimal;
import java.io.Serializable;

/**
* @Description: table:SalesPlan
* @author
* @date 2017-10-12 04:27:20
*/
public class SalesPlan implements Serializable{

	//===========================================代码生成开始============================================
	private static final long serialVersionUID = 1L;
    //columns 开始
    private java.lang.Integer id;//
    private java.lang.Integer orgId;//
    private java.lang.Integer salesPlanVersion;//
    private java.lang.Integer planType;//1 : top down; 2 : bottom up; 
    private java.lang.String dataType;//1:ë
    private BigDecimal pjan;//
    private BigDecimal pfeb;//
    private BigDecimal pmar;//
    private BigDecimal papr;//
    private BigDecimal pmay;//
    private BigDecimal pjun;//
    private BigDecimal pjul;//
    private BigDecimal paug;//
    private BigDecimal psep;//
    private BigDecimal poct;//
    private BigDecimal pnov;//
    private BigDecimal pdec;//
    private java.lang.Integer status;//0:
    private java.lang.Integer appState;//
    private java.lang.Integer createUser;//
    private java.util.Date createTime;//
    private java.lang.Integer updateUser;//
    private java.util.Date updateTime;//
    private java.lang.String sku;//
    private java.lang.String country;//
    private java.lang.Integer submitUser;//提交人
    private java.lang.String remark;//备注
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
     * 1 : top down; 2 : bottom up; 
     *
     * @param value
     */
	public void setPlanType(java.lang.Integer value) {
		this.planType = value;
	}
	
	/**
     * 1 : top down; 2 : bottom up; 
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
	public void setPjan(BigDecimal value) {
		this.pjan = value;
	}
	
	/**
     * 
     */
	public BigDecimal getPjan() {
		return this.pjan;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setPfeb(BigDecimal value) {
		this.pfeb = value;
	}
	
	/**
     * 
     */
	public BigDecimal getPfeb() {
		return this.pfeb;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setPmar(BigDecimal value) {
		this.pmar = value;
	}
	
	/**
     * 
     */
	public BigDecimal getPmar() {
		return this.pmar;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setPapr(BigDecimal value) {
		this.papr = value;
	}
	
	/**
     * 
     */
	public BigDecimal getPapr() {
		return this.papr;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setPmay(BigDecimal value) {
		this.pmay = value;
	}
	
	/**
     * 
     */
	public BigDecimal getPmay() {
		return this.pmay;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setPjun(BigDecimal value) {
		this.pjun = value;
	}
	
	/**
     * 
     */
	public BigDecimal getPjun() {
		return this.pjun;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setPjul(BigDecimal value) {
		this.pjul = value;
	}
	
	/**
     * 
     */
	public BigDecimal getPjul() {
		return this.pjul;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setPaug(BigDecimal value) {
		this.paug = value;
	}
	
	/**
     * 
     */
	public BigDecimal getPaug() {
		return this.paug;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setPsep(BigDecimal value) {
		this.psep = value;
	}
	
	/**
     * 
     */
	public BigDecimal getPsep() {
		return this.psep;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setPoct(BigDecimal value) {
		this.poct = value;
	}
	
	/**
     * 
     */
	public BigDecimal getPoct() {
		return this.poct;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setPnov(BigDecimal value) {
		this.pnov = value;
	}
	
	/**
     * 
     */
	public BigDecimal getPnov() {
		return this.pnov;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setPdec(BigDecimal value) {
		this.pdec = value;
	}
	
	/**
     * 
     */
	public BigDecimal getPdec() {
		return this.pdec;
	}

  	/**
     * 0:
     *
     * @param value
     */
	public void setStatus(java.lang.Integer value) {
		this.status = value;
	}
	
	/**
     * 0:
     */
	public java.lang.Integer getStatus() {
		return this.status;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setAppState(java.lang.Integer value) {
		this.appState = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getAppState() {
		return this.appState;
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
     * 提交人
     *
     * @param value
     */
	public void setSubmitUser(java.lang.Integer value) {
		this.submitUser = value;
	}
	
	/**
     * 提交人
     */
	public java.lang.Integer getSubmitUser() {
		return this.submitUser;
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

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("id",getId())
			.append("orgId",getOrgId())
			.append("salesPlanVersion",getSalesPlanVersion())
			.append("planType",getPlanType())
			.append("dataType",getDataType())
			.append("pjan",getPjan())
			.append("pfeb",getPfeb())
			.append("pmar",getPmar())
			.append("papr",getPapr())
			.append("pmay",getPmay())
			.append("pjun",getPjun())
			.append("pjul",getPjul())
			.append("paug",getPaug())
			.append("psep",getPsep())
			.append("poct",getPoct())
			.append("pnov",getPnov())
			.append("pdec",getPdec())
			.append("status",getStatus())
			.append("appState",getAppState())
			.append("createUser",getCreateUser())
			.append("createTime",getCreateTime())
			.append("updateUser",getUpdateUser())
			.append("updateTime",getUpdateTime())
			.append("sku",getSku())
			.append("country",getCountry())
			.append("submitUser",getSubmitUser())
			.append("remark",getRemark())
			.toString();
	}
	//===========================================代码生成结束============================================
}

