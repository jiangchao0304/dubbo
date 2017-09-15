package com.sunvalley.erp.model.product;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

/**
* @Description: table:Item
* @author
* @date 2017-09-15 10:39:28
*/
public class Item implements Serializable{

	//===========================================代码生成开始============================================
	private static final long serialVersionUID = 1L;
    //columns 开始
    private java.lang.Integer skuid;//
    private java.lang.String sku;//
    private Integer len;//
    private Integer width;//
    private Integer height;//
    private Integer weight;//
    private Integer volweight;//
    private java.util.Date createDate;//
    private Integer active;//
    private java.lang.Boolean isdrop;//
    private java.lang.Boolean dropDef;//
    private Integer isvirtual;//
    private Integer lineState;//1 COMING 2 NEWARRIVAL 3 REGULAR 4 REGULAR_INT 5 ONPROMOTION 6 CLEARANCE 7 WILLDEACTIVATE 8 INACTIVE 9 SEMIS
    private java.lang.String remark;//
    private java.lang.Boolean issale;//
    private java.lang.Boolean zeroStock;//
    private Integer zeroWhid;//
    private Integer zeroQty;//
    private Integer boxtype;//
    private java.lang.Integer pmid;//
    private java.lang.Integer peid;//
    private java.lang.Boolean isoriginal;//
    private java.lang.String purdesc;//
    private java.lang.String purspec;//
    private Integer leadtime;//
    private java.lang.String skulable;//
    private java.lang.Integer innerskuId;//
    private java.lang.Integer outerskuId;//
    private Integer pkgweight;//
    private Integer pkgrate;//
    private java.lang.String purpkg;//
    private java.lang.String stopkg;//
    private java.lang.Integer standard;//
    private Integer versionno;//
    private java.lang.Integer updateuserid;//
    private java.util.Date updatedate;//
    private java.lang.Boolean haspic;//
    private java.lang.String updatepicuser;//
    private java.util.Date updatepicdate;//
    private java.lang.String descSourc;//
    private java.util.Date lineStateDate;//
    private java.lang.String purtitle;//
    private java.lang.Integer brandId;//
    private java.lang.Integer purchaserId;//é‡‡è´­å‘˜ID
    private Integer productLen;//裸机长
    private Integer productWidth;//裸机宽
    private Integer productHeight;//裸机高
    private Integer productWeight;//裸机重
    private Integer productVolweight;//裸机材积重
    private java.lang.Integer battery;//电池
    private java.lang.String model;//模型
    private java.lang.Integer psid;//
    private java.util.Date updatedate2;//
    private java.lang.Integer rmacategoryid;//RMA产品品类
    private java.lang.Integer region;//
    private java.lang.Integer createUserId;//创建人
    private java.lang.String proFeatures;//
    private java.lang.Integer categoryid;//
    private java.lang.Integer subcategoryid;//小类
    private java.lang.Integer isPackage;//包材 1:否； 2:是
    private java.lang.Integer color;//颜色
    private java.lang.Integer modelId;//模型ID
    private java.lang.Boolean isMagnetic;//是否有磁性 0：否 1：是
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
	public void setLen(Integer value) {
		this.len = value;
	}
	
	/**
     * 
     */
	public Integer getLen() {
		return this.len;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setWidth(Integer value) {
		this.width = value;
	}
	
	/**
     * 
     */
	public Integer getWidth() {
		return this.width;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setHeight(Integer value) {
		this.height = value;
	}
	
	/**
     * 
     */
	public Integer getHeight() {
		return this.height;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setWeight(Integer value) {
		this.weight = value;
	}
	
	/**
     * 
     */
	public Integer getWeight() {
		return this.weight;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setVolweight(Integer value) {
		this.volweight = value;
	}
	
	/**
     * 
     */
	public Integer getVolweight() {
		return this.volweight;
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
	public void setActive(Integer value) {
		this.active = value;
	}
	
	/**
     * 
     */
	public Integer getActive() {
		return this.active;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setIsdrop(java.lang.Boolean value) {
		this.isdrop = value;
	}
	
	/**
     * 
     */
	public java.lang.Boolean getIsdrop() {
		return this.isdrop;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setDropDef(java.lang.Boolean value) {
		this.dropDef = value;
	}
	
	/**
     * 
     */
	public java.lang.Boolean getDropDef() {
		return this.dropDef;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setIsvirtual(Integer value) {
		this.isvirtual = value;
	}
	
	/**
     * 
     */
	public Integer getIsvirtual() {
		return this.isvirtual;
	}

  	/**
     * 1 COMING 2 NEWARRIVAL 3 REGULAR 4 REGULAR_INT 5 ONPROMOTION 6 CLEARANCE 7 WILLDEACTIVATE 8 INACTIVE 9 SEMIS
     *
     * @param value
     */
	public void setLineState(Integer value) {
		this.lineState = value;
	}
	
	/**
     * 1 COMING 2 NEWARRIVAL 3 REGULAR 4 REGULAR_INT 5 ONPROMOTION 6 CLEARANCE 7 WILLDEACTIVATE 8 INACTIVE 9 SEMIS
     */
	public Integer getLineState() {
		return this.lineState;
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
     * 
     *
     * @param value
     */
	public void setIssale(java.lang.Boolean value) {
		this.issale = value;
	}
	
	/**
     * 
     */
	public java.lang.Boolean getIssale() {
		return this.issale;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setZeroStock(java.lang.Boolean value) {
		this.zeroStock = value;
	}
	
	/**
     * 
     */
	public java.lang.Boolean getZeroStock() {
		return this.zeroStock;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setZeroWhid(Integer value) {
		this.zeroWhid = value;
	}
	
	/**
     * 
     */
	public Integer getZeroWhid() {
		return this.zeroWhid;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setZeroQty(Integer value) {
		this.zeroQty = value;
	}
	
	/**
     * 
     */
	public Integer getZeroQty() {
		return this.zeroQty;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setBoxtype(Integer value) {
		this.boxtype = value;
	}
	
	/**
     * 
     */
	public Integer getBoxtype() {
		return this.boxtype;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setPmid(java.lang.Integer value) {
		this.pmid = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getPmid() {
		return this.pmid;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setPeid(java.lang.Integer value) {
		this.peid = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getPeid() {
		return this.peid;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setIsoriginal(java.lang.Boolean value) {
		this.isoriginal = value;
	}
	
	/**
     * 
     */
	public java.lang.Boolean getIsoriginal() {
		return this.isoriginal;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setPurdesc(java.lang.String value) {
		this.purdesc = value;
	}
	
	/**
     * 
     */
	public java.lang.String getPurdesc() {
		return this.purdesc;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setPurspec(java.lang.String value) {
		this.purspec = value;
	}
	
	/**
     * 
     */
	public java.lang.String getPurspec() {
		return this.purspec;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setLeadtime(Integer value) {
		this.leadtime = value;
	}
	
	/**
     * 
     */
	public Integer getLeadtime() {
		return this.leadtime;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setSkulable(java.lang.String value) {
		this.skulable = value;
	}
	
	/**
     * 
     */
	public java.lang.String getSkulable() {
		return this.skulable;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setInnerskuId(java.lang.Integer value) {
		this.innerskuId = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getInnerskuId() {
		return this.innerskuId;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setOuterskuId(java.lang.Integer value) {
		this.outerskuId = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getOuterskuId() {
		return this.outerskuId;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setPkgweight(Integer value) {
		this.pkgweight = value;
	}
	
	/**
     * 
     */
	public Integer getPkgweight() {
		return this.pkgweight;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setPkgrate(Integer value) {
		this.pkgrate = value;
	}
	
	/**
     * 
     */
	public Integer getPkgrate() {
		return this.pkgrate;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setPurpkg(java.lang.String value) {
		this.purpkg = value;
	}
	
	/**
     * 
     */
	public java.lang.String getPurpkg() {
		return this.purpkg;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setStopkg(java.lang.String value) {
		this.stopkg = value;
	}
	
	/**
     * 
     */
	public java.lang.String getStopkg() {
		return this.stopkg;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setStandard(java.lang.Integer value) {
		this.standard = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getStandard() {
		return this.standard;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setVersionno(Integer value) {
		this.versionno = value;
	}
	
	/**
     * 
     */
	public Integer getVersionno() {
		return this.versionno;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setUpdateuserid(java.lang.Integer value) {
		this.updateuserid = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getUpdateuserid() {
		return this.updateuserid;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setUpdatedate(java.util.Date value) {
		this.updatedate = value;
	}
	
	/**
     * 
     */
	public java.util.Date getUpdatedate() {
		return this.updatedate;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setHaspic(java.lang.Boolean value) {
		this.haspic = value;
	}
	
	/**
     * 
     */
	public java.lang.Boolean getHaspic() {
		return this.haspic;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setUpdatepicuser(java.lang.String value) {
		this.updatepicuser = value;
	}
	
	/**
     * 
     */
	public java.lang.String getUpdatepicuser() {
		return this.updatepicuser;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setUpdatepicdate(java.util.Date value) {
		this.updatepicdate = value;
	}
	
	/**
     * 
     */
	public java.util.Date getUpdatepicdate() {
		return this.updatepicdate;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setDescSourc(java.lang.String value) {
		this.descSourc = value;
	}
	
	/**
     * 
     */
	public java.lang.String getDescSourc() {
		return this.descSourc;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setLineStateDate(java.util.Date value) {
		this.lineStateDate = value;
	}
	
	/**
     * 
     */
	public java.util.Date getLineStateDate() {
		return this.lineStateDate;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setPurtitle(java.lang.String value) {
		this.purtitle = value;
	}
	
	/**
     * 
     */
	public java.lang.String getPurtitle() {
		return this.purtitle;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setBrandId(java.lang.Integer value) {
		this.brandId = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getBrandId() {
		return this.brandId;
	}

  	/**
     * é‡‡è´­å‘˜ID
     *
     * @param value
     */
	public void setPurchaserId(java.lang.Integer value) {
		this.purchaserId = value;
	}
	
	/**
     * é‡‡è´­å‘˜ID
     */
	public java.lang.Integer getPurchaserId() {
		return this.purchaserId;
	}

  	/**
     * 裸机长
     *
     * @param value
     */
	public void setProductLen(Integer value) {
		this.productLen = value;
	}
	
	/**
     * 裸机长
     */
	public Integer getProductLen() {
		return this.productLen;
	}

  	/**
     * 裸机宽
     *
     * @param value
     */
	public void setProductWidth(Integer value) {
		this.productWidth = value;
	}
	
	/**
     * 裸机宽
     */
	public Integer getProductWidth() {
		return this.productWidth;
	}

  	/**
     * 裸机高
     *
     * @param value
     */
	public void setProductHeight(Integer value) {
		this.productHeight = value;
	}
	
	/**
     * 裸机高
     */
	public Integer getProductHeight() {
		return this.productHeight;
	}

  	/**
     * 裸机重
     *
     * @param value
     */
	public void setProductWeight(Integer value) {
		this.productWeight = value;
	}
	
	/**
     * 裸机重
     */
	public Integer getProductWeight() {
		return this.productWeight;
	}

  	/**
     * 裸机材积重
     *
     * @param value
     */
	public void setProductVolweight(Integer value) {
		this.productVolweight = value;
	}
	
	/**
     * 裸机材积重
     */
	public Integer getProductVolweight() {
		return this.productVolweight;
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
     * 模型
     *
     * @param value
     */
	public void setModel(java.lang.String value) {
		this.model = value;
	}
	
	/**
     * 模型
     */
	public java.lang.String getModel() {
		return this.model;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setPsid(java.lang.Integer value) {
		this.psid = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getPsid() {
		return this.psid;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setUpdatedate2(java.util.Date value) {
		this.updatedate2 = value;
	}
	
	/**
     * 
     */
	public java.util.Date getUpdatedate2() {
		return this.updatedate2;
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
     * 
     *
     * @param value
     */
	public void setRegion(java.lang.Integer value) {
		this.region = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getRegion() {
		return this.region;
	}

  	/**
     * 创建人
     *
     * @param value
     */
	public void setCreateUserId(java.lang.Integer value) {
		this.createUserId = value;
	}
	
	/**
     * 创建人
     */
	public java.lang.Integer getCreateUserId() {
		return this.createUserId;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setProFeatures(java.lang.String value) {
		this.proFeatures = value;
	}
	
	/**
     * 
     */
	public java.lang.String getProFeatures() {
		return this.proFeatures;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setCategoryid(java.lang.Integer value) {
		this.categoryid = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getCategoryid() {
		return this.categoryid;
	}

  	/**
     * 小类
     *
     * @param value
     */
	public void setSubcategoryid(java.lang.Integer value) {
		this.subcategoryid = value;
	}
	
	/**
     * 小类
     */
	public java.lang.Integer getSubcategoryid() {
		return this.subcategoryid;
	}

  	/**
     * 包材 1:否； 2:是
     *
     * @param value
     */
	public void setIsPackage(java.lang.Integer value) {
		this.isPackage = value;
	}
	
	/**
     * 包材 1:否； 2:是
     */
	public java.lang.Integer getIsPackage() {
		return this.isPackage;
	}

  	/**
     * 颜色
     *
     * @param value
     */
	public void setColor(java.lang.Integer value) {
		this.color = value;
	}
	
	/**
     * 颜色
     */
	public java.lang.Integer getColor() {
		return this.color;
	}

  	/**
     * 模型ID
     *
     * @param value
     */
	public void setModelId(java.lang.Integer value) {
		this.modelId = value;
	}
	
	/**
     * 模型ID
     */
	public java.lang.Integer getModelId() {
		return this.modelId;
	}

  	/**
     * 是否有磁性 0：否 1：是
     *
     * @param value
     */
	public void setIsMagnetic(java.lang.Boolean value) {
		this.isMagnetic = value;
	}
	
	/**
     * 是否有磁性 0：否 1：是
     */
	public java.lang.Boolean getIsMagnetic() {
		return this.isMagnetic;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("skuid",getSkuid())
			.append("sku",getSku())
			.append("len",getLen())
			.append("width",getWidth())
			.append("height",getHeight())
			.append("weight",getWeight())
			.append("volweight",getVolweight())
			.append("createDate",getCreateDate())
			.append("active",getActive())
			.append("isdrop",getIsdrop())
			.append("dropDef",getDropDef())
			.append("isvirtual",getIsvirtual())
			.append("lineState",getLineState())
			.append("remark",getRemark())
			.append("issale",getIssale())
			.append("zeroStock",getZeroStock())
			.append("zeroWhid",getZeroWhid())
			.append("zeroQty",getZeroQty())
			.append("boxtype",getBoxtype())
			.append("pmid",getPmid())
			.append("peid",getPeid())
			.append("isoriginal",getIsoriginal())
			.append("purdesc",getPurdesc())
			.append("purspec",getPurspec())
			.append("leadtime",getLeadtime())
			.append("skulable",getSkulable())
			.append("innerskuId",getInnerskuId())
			.append("outerskuId",getOuterskuId())
			.append("pkgweight",getPkgweight())
			.append("pkgrate",getPkgrate())
			.append("purpkg",getPurpkg())
			.append("stopkg",getStopkg())
			.append("standard",getStandard())
			.append("versionno",getVersionno())
			.append("updateuserid",getUpdateuserid())
			.append("updatedate",getUpdatedate())
			.append("haspic",getHaspic())
			.append("updatepicuser",getUpdatepicuser())
			.append("updatepicdate",getUpdatepicdate())
			.append("descSourc",getDescSourc())
			.append("lineStateDate",getLineStateDate())
			.append("purtitle",getPurtitle())
			.append("brandId",getBrandId())
			.append("purchaserId",getPurchaserId())
			.append("productLen",getProductLen())
			.append("productWidth",getProductWidth())
			.append("productHeight",getProductHeight())
			.append("productWeight",getProductWeight())
			.append("productVolweight",getProductVolweight())
			.append("battery",getBattery())
			.append("model",getModel())
			.append("psid",getPsid())
			.append("updatedate2",getUpdatedate2())
			.append("rmacategoryid",getRmacategoryid())
			.append("region",getRegion())
			.append("createUserId",getCreateUserId())
			.append("proFeatures",getProFeatures())
			.append("categoryid",getCategoryid())
			.append("subcategoryid",getSubcategoryid())
			.append("isPackage",getIsPackage())
			.append("color",getColor())
			.append("modelId",getModelId())
			.append("isMagnetic",getIsMagnetic())
			.toString();
	}
	//===========================================代码生成结束============================================
}

