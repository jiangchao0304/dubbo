package com.sunvalley.erp.product.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import java.math.BigDecimal;
import java.io.Serializable;

/**
* @Description: table:ItemModel
* @author
* @date 2017-09-16 11:22:46
*/
public class ItemModel implements Serializable{

	//===========================================代码生成开始============================================
	private static final long serialVersionUID = 1L;
    //columns 开始
    private java.lang.Integer modelId;//主键
    private java.lang.String modelName;//model名称
    private java.lang.Integer brandId;//品牌
    private java.lang.String brandCode;//品牌编码
    private java.lang.Integer pmId;//项目经理编号
    private java.lang.Integer mainCategoryId;//大类ID
    private java.lang.Integer subCategoryId;//小类ID
    private java.lang.Integer battery;//电池
    private java.lang.Integer warranty;//保修期
    private java.lang.Integer rmacategoryid;//RMA产品品类
    private java.lang.Integer magnetic;//是否有磁性 0 未知 1 是 2 否
    private java.lang.String remark;//备注
    private java.lang.Integer createUser;//创建人
    private java.util.Date createDate;//创建时间
    private java.lang.Integer updateUser;//更新人
    private java.util.Date updateDate;//更新时间
	//columns 结束



  	/**
     * 主键
     *
     * @param value
     */
	public void setModelId(java.lang.Integer value) {
		this.modelId = value;
	}
	
	/**
     * 主键
     */
	public java.lang.Integer getModelId() {
		return this.modelId;
	}

  	/**
     * model名称
     *
     * @param value
     */
	public void setModelName(java.lang.String value) {
		this.modelName = value;
	}
	
	/**
     * model名称
     */
	public java.lang.String getModelName() {
		return this.modelName;
	}

  	/**
     * 品牌
     *
     * @param value
     */
	public void setBrandId(java.lang.Integer value) {
		this.brandId = value;
	}
	
	/**
     * 品牌
     */
	public java.lang.Integer getBrandId() {
		return this.brandId;
	}

  	/**
     * 品牌编码
     *
     * @param value
     */
	public void setBrandCode(java.lang.String value) {
		this.brandCode = value;
	}
	
	/**
     * 品牌编码
     */
	public java.lang.String getBrandCode() {
		return this.brandCode;
	}

  	/**
     * 项目经理编号
     *
     * @param value
     */
	public void setPmId(java.lang.Integer value) {
		this.pmId = value;
	}
	
	/**
     * 项目经理编号
     */
	public java.lang.Integer getPmId() {
		return this.pmId;
	}

  	/**
     * 大类ID
     *
     * @param value
     */
	public void setMainCategoryId(java.lang.Integer value) {
		this.mainCategoryId = value;
	}
	
	/**
     * 大类ID
     */
	public java.lang.Integer getMainCategoryId() {
		return this.mainCategoryId;
	}

  	/**
     * 小类ID
     *
     * @param value
     */
	public void setSubCategoryId(java.lang.Integer value) {
		this.subCategoryId = value;
	}
	
	/**
     * 小类ID
     */
	public java.lang.Integer getSubCategoryId() {
		return this.subCategoryId;
	}

  	/**
     * 电池
     *
     * @param value
     */
	public void setBattery(java.lang.Integer value) {
		this.battery = value;
	}
	
	/**
     * 电池
     */
	public java.lang.Integer getBattery() {
		return this.battery;
	}

  	/**
     * 保修期
     *
     * @param value
     */
	public void setWarranty(java.lang.Integer value) {
		this.warranty = value;
	}
	
	/**
     * 保修期
     */
	public java.lang.Integer getWarranty() {
		return this.warranty;
	}

  	/**
     * RMA产品品类
     *
     * @param value
     */
	public void setRmacategoryid(java.lang.Integer value) {
		this.rmacategoryid = value;
	}
	
	/**
     * RMA产品品类
     */
	public java.lang.Integer getRmacategoryid() {
		return this.rmacategoryid;
	}

  	/**
     * 是否有磁性 0 未知 1 是 2 否
     *
     * @param value
     */
	public void setMagnetic(java.lang.Integer value) {
		this.magnetic = value;
	}
	
	/**
     * 是否有磁性 0 未知 1 是 2 否
     */
	public java.lang.Integer getMagnetic() {
		return this.magnetic;
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
     * 创建人
     *
     * @param value
     */
	public void setCreateUser(java.lang.Integer value) {
		this.createUser = value;
	}
	
	/**
     * 创建人
     */
	public java.lang.Integer getCreateUser() {
		return this.createUser;
	}

  	/**
     * 创建时间
     *
     * @param value
     */
	public void setCreateDate(java.util.Date value) {
		this.createDate = value;
	}
	
	/**
     * 创建时间
     */
	public java.util.Date getCreateDate() {
		return this.createDate;
	}

  	/**
     * 更新人
     *
     * @param value
     */
	public void setUpdateUser(java.lang.Integer value) {
		this.updateUser = value;
	}
	
	/**
     * 更新人
     */
	public java.lang.Integer getUpdateUser() {
		return this.updateUser;
	}

  	/**
     * 更新时间
     *
     * @param value
     */
	public void setUpdateDate(java.util.Date value) {
		this.updateDate = value;
	}
	
	/**
     * 更新时间
     */
	public java.util.Date getUpdateDate() {
		return this.updateDate;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("modelId",getModelId())
			.append("modelName",getModelName())
			.append("brandId",getBrandId())
			.append("brandCode",getBrandCode())
			.append("pmId",getPmId())
			.append("mainCategoryId",getMainCategoryId())
			.append("subCategoryId",getSubCategoryId())
			.append("battery",getBattery())
			.append("warranty",getWarranty())
			.append("rmacategoryid",getRmacategoryid())
			.append("magnetic",getMagnetic())
			.append("remark",getRemark())
			.append("createUser",getCreateUser())
			.append("createDate",getCreateDate())
			.append("updateUser",getUpdateUser())
			.append("updateDate",getUpdateDate())
			.toString();
	}
	//===========================================代码生成结束============================================
}

