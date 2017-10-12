package com.sunvalley.erp.product.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import java.math.BigDecimal;
import java.io.Serializable;

/**
* @Description: table:Organization
* @author
* @date 2017-10-12 04:26:09
*/
public class Organization implements Serializable{

	//===========================================代码生成开始============================================
	private static final long serialVersionUID = 1L;
    //columns 开始
    private java.lang.Integer id;//
    private java.lang.String organizationName;//
    private java.lang.Integer parentId;//上级id
    private java.lang.Integer modelId;//
    private java.lang.String versionNo;//
    private java.lang.Integer levelId;//级别  公司：1，部门：2，组别：3 组别国家：4 SKU国家：5
    private java.lang.String countryCode;//
    private java.lang.String sku;//
    private java.lang.Integer skuid;//
    private java.lang.Integer deptTypeId;//组织架构部门类型
    private java.lang.Integer cmId;//CM 
    private java.lang.Integer psId;//PS
    private java.lang.Integer skuType;//sku类型 1正式SKU 2预备SKU
    private java.lang.Integer status;//组织架构状态0.表示可用，1表示不可用
    private java.lang.Integer forPlan;//1:需要做计划 2：不需要做计划
    private Integer forStockUp;//是否做备货[1:是;2否]
    private java.lang.Integer tlId;//组长用户ID
    private java.lang.Integer stlId;//高级组长ID
    private java.util.Date createDate;//
    private java.lang.Integer createUserId;//
    private java.util.Date updateDate;//
    private java.lang.Integer updateUserId;//
    private java.lang.String remark;//
    private java.lang.Integer structureType;//结构类型1表示model 2.sku+country
    private java.lang.Integer oldId;//
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
	public void setOrganizationName(java.lang.String value) {
		this.organizationName = value;
	}
	
	/**
     * 
     */
	public java.lang.String getOrganizationName() {
		return this.organizationName;
	}

  	/**
     * 上级id
     *
     * @param value
     */
	public void setParentId(java.lang.Integer value) {
		this.parentId = value;
	}
	
	/**
     * 上级id
     */
	public java.lang.Integer getParentId() {
		return this.parentId;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setModelId(java.lang.Integer value) {
		this.modelId = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getModelId() {
		return this.modelId;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setVersionNo(java.lang.String value) {
		this.versionNo = value;
	}
	
	/**
     * 
     */
	public java.lang.String getVersionNo() {
		return this.versionNo;
	}

  	/**
     * 级别  公司：1，部门：2，组别：3 组别国家：4 SKU国家：5
     *
     * @param value
     */
	public void setLevelId(java.lang.Integer value) {
		this.levelId = value;
	}
	
	/**
     * 级别  公司：1，部门：2，组别：3 组别国家：4 SKU国家：5
     */
	public java.lang.Integer getLevelId() {
		return this.levelId;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setCountryCode(java.lang.String value) {
		this.countryCode = value;
	}
	
	/**
     * 
     */
	public java.lang.String getCountryCode() {
		return this.countryCode;
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
     * 组织架构部门类型
     *
     * @param value
     */
	public void setDeptTypeId(java.lang.Integer value) {
		this.deptTypeId = value;
	}
	
	/**
     * 组织架构部门类型
     */
	public java.lang.Integer getDeptTypeId() {
		return this.deptTypeId;
	}

  	/**
     * CM 
     *
     * @param value
     */
	public void setCmId(java.lang.Integer value) {
		this.cmId = value;
	}
	
	/**
     * CM 
     */
	public java.lang.Integer getCmId() {
		return this.cmId;
	}

  	/**
     * PS
     *
     * @param value
     */
	public void setPsId(java.lang.Integer value) {
		this.psId = value;
	}
	
	/**
     * PS
     */
	public java.lang.Integer getPsId() {
		return this.psId;
	}

  	/**
     * sku类型 1正式SKU 2预备SKU
     *
     * @param value
     */
	public void setSkuType(java.lang.Integer value) {
		this.skuType = value;
	}
	
	/**
     * sku类型 1正式SKU 2预备SKU
     */
	public java.lang.Integer getSkuType() {
		return this.skuType;
	}

  	/**
     * 组织架构状态0.表示可用，1表示不可用
     *
     * @param value
     */
	public void setStatus(java.lang.Integer value) {
		this.status = value;
	}
	
	/**
     * 组织架构状态0.表示可用，1表示不可用
     */
	public java.lang.Integer getStatus() {
		return this.status;
	}

  	/**
     * 1:需要做计划 2：不需要做计划
     *
     * @param value
     */
	public void setForPlan(java.lang.Integer value) {
		this.forPlan = value;
	}
	
	/**
     * 1:需要做计划 2：不需要做计划
     */
	public java.lang.Integer getForPlan() {
		return this.forPlan;
	}

  	/**
     * 是否做备货[1:是;2否]
     *
     * @param value
     */
	public void setForStockUp(Integer value) {
		this.forStockUp = value;
	}
	
	/**
     * 是否做备货[1:是;2否]
     */
	public Integer getForStockUp() {
		return this.forStockUp;
	}

  	/**
     * 组长用户ID
     *
     * @param value
     */
	public void setTlId(java.lang.Integer value) {
		this.tlId = value;
	}
	
	/**
     * 组长用户ID
     */
	public java.lang.Integer getTlId() {
		return this.tlId;
	}

  	/**
     * 高级组长ID
     *
     * @param value
     */
	public void setStlId(java.lang.Integer value) {
		this.stlId = value;
	}
	
	/**
     * 高级组长ID
     */
	public java.lang.Integer getStlId() {
		return this.stlId;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setCreateDate(java.util.Date value) {
		this.createDate = value;
	}
	
	/**
     * 
     */
	public java.util.Date getCreateDate() {
		return this.createDate;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setCreateUserId(java.lang.Integer value) {
		this.createUserId = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getCreateUserId() {
		return this.createUserId;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setUpdateDate(java.util.Date value) {
		this.updateDate = value;
	}
	
	/**
     * 
     */
	public java.util.Date getUpdateDate() {
		return this.updateDate;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setUpdateUserId(java.lang.Integer value) {
		this.updateUserId = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getUpdateUserId() {
		return this.updateUserId;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setRemark(java.lang.String value) {
		this.remark = value;
	}
	
	/**
     * 
     */
	public java.lang.String getRemark() {
		return this.remark;
	}

  	/**
     * 结构类型1表示model 2.sku+country
     *
     * @param value
     */
	public void setStructureType(java.lang.Integer value) {
		this.structureType = value;
	}
	
	/**
     * 结构类型1表示model 2.sku+country
     */
	public java.lang.Integer getStructureType() {
		return this.structureType;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setOldId(java.lang.Integer value) {
		this.oldId = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getOldId() {
		return this.oldId;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("id",getId())
			.append("organizationName",getOrganizationName())
			.append("parentId",getParentId())
			.append("modelId",getModelId())
			.append("versionNo",getVersionNo())
			.append("levelId",getLevelId())
			.append("countryCode",getCountryCode())
			.append("sku",getSku())
			.append("skuid",getSkuid())
			.append("deptTypeId",getDeptTypeId())
			.append("cmId",getCmId())
			.append("psId",getPsId())
			.append("skuType",getSkuType())
			.append("status",getStatus())
			.append("forPlan",getForPlan())
			.append("forStockUp",getForStockUp())
			.append("tlId",getTlId())
			.append("stlId",getStlId())
			.append("createDate",getCreateDate())
			.append("createUserId",getCreateUserId())
			.append("updateDate",getUpdateDate())
			.append("updateUserId",getUpdateUserId())
			.append("remark",getRemark())
			.append("structureType",getStructureType())
			.append("oldId",getOldId())
			.toString();
	}
	//===========================================代码生成结束============================================
}

