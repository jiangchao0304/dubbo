package com.sunvalley.erp.product.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import java.math.BigDecimal;
import java.io.Serializable;

/**
* @Description: table:OrganizationDetail
* @author
* @date 2017-09-25 03:10:30
*/
public class OrganizationDetail implements Serializable{

	//===========================================代码生成开始============================================
	private static final long serialVersionUID = 1L;
    //columns 开始
    private java.lang.Integer id;//
    private java.lang.Integer forPlan;//1:需要做计划 2：不需要做计划
    private java.lang.String versionNo;//
    private java.lang.Integer psId;//
    private java.lang.Integer cmId;//
    private java.lang.Integer skuid;//
    private Integer skuType;//
    private java.lang.String companyName;//
    private java.lang.Integer companyId;//
    private java.lang.Integer deptId;//
    private java.lang.Integer groupId;//
    private java.lang.Integer teamId;//第四层节点ID 
    private java.lang.String deptName;//
    private java.lang.String groupName;//
    private java.lang.String countryCode;//
    private java.lang.String sku;//
    private Integer levelId;//
    private Integer forStockUp;//是否做备货[1:是;2:否]
    private java.lang.Integer tlId;//组长
    private java.lang.Integer stlId;//高级组长
    private java.lang.Integer structureType;//结构类型1表示model 2.sku+country
    private java.lang.Integer deptTypeId;//部门类型ID
    private java.lang.Integer modelId;//
    private java.lang.String modelName;//
    private java.lang.String teamName;//
    private java.util.Date createDate;//
    private java.lang.Integer createUserId;//
    private java.util.Date updateDate;//
    private java.lang.Integer updateUserId;//
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
     * 
     *
     * @param value
     */
	public void setPsId(java.lang.Integer value) {
		this.psId = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getPsId() {
		return this.psId;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setCmId(java.lang.Integer value) {
		this.cmId = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getCmId() {
		return this.cmId;
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
     * 
     *
     * @param value
     */
	public void setSkuType(Integer value) {
		this.skuType = value;
	}
	
	/**
     * 
     */
	public Integer getSkuType() {
		return this.skuType;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setCompanyName(java.lang.String value) {
		this.companyName = value;
	}
	
	/**
     * 
     */
	public java.lang.String getCompanyName() {
		return this.companyName;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setCompanyId(java.lang.Integer value) {
		this.companyId = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getCompanyId() {
		return this.companyId;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setDeptId(java.lang.Integer value) {
		this.deptId = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getDeptId() {
		return this.deptId;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setGroupId(java.lang.Integer value) {
		this.groupId = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getGroupId() {
		return this.groupId;
	}

  	/**
     * 第四层节点ID 
     *
     * @param value
     */
	public void setTeamId(java.lang.Integer value) {
		this.teamId = value;
	}
	
	/**
     * 第四层节点ID 
     */
	public java.lang.Integer getTeamId() {
		return this.teamId;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setDeptName(java.lang.String value) {
		this.deptName = value;
	}
	
	/**
     * 
     */
	public java.lang.String getDeptName() {
		return this.deptName;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setGroupName(java.lang.String value) {
		this.groupName = value;
	}
	
	/**
     * 
     */
	public java.lang.String getGroupName() {
		return this.groupName;
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
	public void setLevelId(Integer value) {
		this.levelId = value;
	}
	
	/**
     * 
     */
	public Integer getLevelId() {
		return this.levelId;
	}

  	/**
     * 是否做备货[1:是;2:否]
     *
     * @param value
     */
	public void setForStockUp(Integer value) {
		this.forStockUp = value;
	}
	
	/**
     * 是否做备货[1:是;2:否]
     */
	public Integer getForStockUp() {
		return this.forStockUp;
	}

  	/**
     * 组长
     *
     * @param value
     */
	public void setTlId(java.lang.Integer value) {
		this.tlId = value;
	}
	
	/**
     * 组长
     */
	public java.lang.Integer getTlId() {
		return this.tlId;
	}

  	/**
     * 高级组长
     *
     * @param value
     */
	public void setStlId(java.lang.Integer value) {
		this.stlId = value;
	}
	
	/**
     * 高级组长
     */
	public java.lang.Integer getStlId() {
		return this.stlId;
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
     * 部门类型ID
     *
     * @param value
     */
	public void setDeptTypeId(java.lang.Integer value) {
		this.deptTypeId = value;
	}
	
	/**
     * 部门类型ID
     */
	public java.lang.Integer getDeptTypeId() {
		return this.deptTypeId;
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
	public void setModelName(java.lang.String value) {
		this.modelName = value;
	}
	
	/**
     * 
     */
	public java.lang.String getModelName() {
		return this.modelName;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setTeamName(java.lang.String value) {
		this.teamName = value;
	}
	
	/**
     * 
     */
	public java.lang.String getTeamName() {
		return this.teamName;
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

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("id",getId())
			.append("forPlan",getForPlan())
			.append("versionNo",getVersionNo())
			.append("psId",getPsId())
			.append("cmId",getCmId())
			.append("skuid",getSkuid())
			.append("skuType",getSkuType())
			.append("companyName",getCompanyName())
			.append("companyId",getCompanyId())
			.append("deptId",getDeptId())
			.append("groupId",getGroupId())
			.append("teamId",getTeamId())
			.append("deptName",getDeptName())
			.append("groupName",getGroupName())
			.append("countryCode",getCountryCode())
			.append("sku",getSku())
			.append("levelId",getLevelId())
			.append("forStockUp",getForStockUp())
			.append("tlId",getTlId())
			.append("stlId",getStlId())
			.append("structureType",getStructureType())
			.append("deptTypeId",getDeptTypeId())
			.append("modelId",getModelId())
			.append("modelName",getModelName())
			.append("teamName",getTeamName())
			.append("createDate",getCreateDate())
			.append("createUserId",getCreateUserId())
			.append("updateDate",getUpdateDate())
			.append("updateUserId",getUpdateUserId())
			.toString();
	}
	//===========================================代码生成结束============================================
}

