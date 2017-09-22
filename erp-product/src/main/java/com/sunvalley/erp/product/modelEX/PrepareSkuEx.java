package com.sunvalley.erp.product.modelEX;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.sunvalley.erp.product.model.PrepareSku;

public class PrepareSkuEx extends PrepareSku {
	
	private String pmName;
	private String createUserIdStr;
	private String brandDesc;
	private String safety;
	private String safetyCountry;
	private String department ;
	private String colorStr;
	private String preFreight;
	private String mcStr;
	private String shippingTypeStr;
	private String standardSizeStr;
	private String statuStr;
	
	
	private String country;
	private BigDecimal seaRatio;
	private BigDecimal seaFreight;
	private BigDecimal seaMc;
	private BigDecimal airRatio;
	private BigDecimal airFreight;
	private BigDecimal airMc;
	private BigDecimal landRatio;
	private BigDecimal landFreight;
	private BigDecimal landMc;
	
	private BigDecimal ratio;
	private BigDecimal freight;
	private BigDecimal mc;
	private Integer mainProLineId;
	private Integer subProLineId;
	private Integer model_no;
	
	private String productName; 
	private String customName;
	private String saleDept;
	private Integer standardSize;
	private String weight;
	private String shippingType;
	private BigDecimal salePrice;
	private Date setupDate;
	private String saleZone;
	private String anruleStr;
	private Integer brandId;
	private Integer mainCategoryId;
	
	private Integer subCategoryId;
	private Integer pmId;
	private Integer emailType;
	private String anrule;
	private String mainModelNo;  //大类型号
	private String subModelNo;  //小类型号
	
	private String mainBrandCode;   //大类编码
	private String subBrandCode;  //小类编码
	private Date modelCreateDate;
	
	private String model_remark;   //model备注
	
	
	
	
	public String getModel_remark() {
		return model_remark;
	}
	public void setModel_remark(String model_remark) {
		this.model_remark = model_remark;
	}
	public Integer getEmailType() {
		return emailType;
	}
	public void setEmailType(Integer emailType) {
		this.emailType = emailType;
	}

	public String getMainBrandCode() {
		return mainBrandCode;
	}
	public void setMainBrandCode(String mainBrandCode) {
		this.mainBrandCode = mainBrandCode;
	}
	public String getSubBrandCode() {
		return subBrandCode;
	}
	public void setSubBrandCode(String subBrandCode) {
		this.subBrandCode = subBrandCode;
	}
	
	

	public String getMainModelNo() {
		return mainModelNo;
	}
	public void setMainModelNo(String mainModelNo) {
		this.mainModelNo = mainModelNo;
	}
	public String getSubModelNo() {
		return subModelNo;
	}
	public void setSubModelNo(String subModelNo) {
		this.subModelNo = subModelNo;
	}
	public String getAnrule() {
		return anrule;
	}
	public void setAnrule(String anrule) {
		this.anrule = anrule;
	}
	public Integer getStandardSize() {
		return standardSize;
	}
	public void setStandardSize(Integer standardSize) {
		this.standardSize = standardSize;
	}
	public Integer getPmId() {
		return pmId;
	}
	public void setPmId(Integer pmId) {
		this.pmId = pmId;
	}
	public Integer getMainCategoryId() {
		return mainCategoryId;
	}
	public void setMainCategoryId(Integer mainCategoryId) {
		this.mainCategoryId = mainCategoryId;
	}
	public Integer getSubCategoryId() {
		return subCategoryId;
	}
	public void setSubCategoryId(Integer subCategoryId) {
		this.subCategoryId = subCategoryId;
	}
	public Integer getBrandId() {
		return brandId;
	}
	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}
	private List<PrepareSkuEx> preSkuList;   //sku列表
	
	private boolean hasNull;
	private String saleQtyStr;
	private String marketCapacityStr;
	private String rmaRatioStr;
	private String mpDateStr;
	private String mainProLineName;
	private String subProLineName;
	
	private List<PrepareSkuEx> packageSkuList;   //sku列表
	
	public List<PrepareSkuEx> getPackageSkuList() {
		return packageSkuList;
	}
	public void setPackageSkuList(List<PrepareSkuEx> packageSkuList) {
		this.packageSkuList = packageSkuList;
	}
	public boolean isHasNull() {
		return hasNull;
	}
	public void setHasNull(boolean hasNull) {
		this.hasNull = hasNull;
	}
	public Integer getModel_no() {
		return model_no;
	}
	public void setModel_no(Integer model_no) {
		this.model_no = model_no;
	}
	public String getAnruleStr() {
		return anruleStr;
	}
	public void setAnruleStr(String anruleStr) {
		this.anruleStr = anruleStr;
	}
	
	public List<PrepareSkuEx> getPreSkuList() {
		return preSkuList;
	}
	public void setPreSkuList(List<PrepareSkuEx> preSkuList) {
		this.preSkuList = preSkuList;
	}
	public String getSaleZone() {
		return saleZone;
	}
	public void setSaleZone(String saleZone) {
		this.saleZone = saleZone;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getCustomName() {
		return customName;
	}
	public void setCustomName(String customName) {
		this.customName = customName;
	}
	public String getSaleDept() {
		return saleDept;
	}
	public void setSaleDept(String saleDept) {
		this.saleDept = saleDept;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getShippingType() {
		return shippingType;
	}
	public void setShippingType(String shippingType) {
		this.shippingType = shippingType;
	}
	public BigDecimal getSalePrice() {
		return salePrice;
	}
	public void setSalePrice(BigDecimal salePrice) {
		this.salePrice = salePrice;
	}
	public Date getSetupDate() {
		return setupDate;
	}
	public void setSetupDate(Date setupDate) {
		this.setupDate = setupDate;
	}
	public Integer getMainProLineId() {
		return mainProLineId;
	}
	public void setMainProLineId(Integer mainProLineId) {
		this.mainProLineId = mainProLineId;
	}
	public Integer getSubProLineId() {
		return subProLineId;
	}
	public void setSubProLineId(Integer subProLineId) {
		this.subProLineId = subProLineId;
	}
	public String getShippingTypeStr() {
		return shippingTypeStr;
	}
	public void setShippingTypeStr(String shippingTypeStr) {
		this.shippingTypeStr = shippingTypeStr;
	}
	public String getStandardSizeStr() {
		return standardSizeStr;
	}
	public void setStandardSizeStr(String standardSizeStr) {
		this.standardSizeStr = standardSizeStr;
	}
	public String getMcStr() {
		return mcStr;
	}
	public void setMcStr(String mcStr) {
		this.mcStr = mcStr;
	}
	public String getPreFreight() {
		return preFreight;
	}
	public void setPreFreight(String preFreight) {
		this.preFreight = preFreight;
	}
	public String getColorStr() {
		return colorStr;
	}
	public void setColorStr(String colorStr) {
		this.colorStr = colorStr;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

	public String getSafetyCountry() {
		return safetyCountry;
	}
	public void setSafetyCountry(String safetyCountry) {
		this.safetyCountry = safetyCountry;
	}
	public String getSafety() {
		return safety;
	}
	public void setSafety(String safety) {
		this.safety = safety;
	}
	
	public BigDecimal getRatio() {
		return ratio;
	}
	public void setRatio(BigDecimal ratio) {
		this.ratio = ratio;
	}
	public BigDecimal getFreight() {
		return freight;
	}
	public void setFreight(BigDecimal freight) {
		this.freight = freight;
	}
	public BigDecimal getMc() {
		return mc;
	}
	public void setMc(BigDecimal mc) {
		this.mc = mc;
	}
	
	
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public BigDecimal getSeaRatio() {
		return seaRatio;
	}
	public void setSeaRatio(BigDecimal seaRatio) {
		this.seaRatio = seaRatio;
	}
	public BigDecimal getSeaFreight() {
		return seaFreight;
	}
	public void setSeaFreight(BigDecimal seaFreight) {
		this.seaFreight = seaFreight;
	}
	public BigDecimal getSeaMc() {
		return seaMc;
	}
	public void setSeaMc(BigDecimal seaMc) {
		this.seaMc = seaMc;
	}
	public BigDecimal getAirRatio() {
		return airRatio;
	}
	public void setAirRatio(BigDecimal airRatio) {
		this.airRatio = airRatio;
	}
	public BigDecimal getAirFreight() {
		return airFreight;
	}
	public void setAirFreight(BigDecimal airFreight) {
		this.airFreight = airFreight;
	}
	public BigDecimal getAirMc() {
		return airMc;
	}
	public void setAirMc(BigDecimal airMc) {
		this.airMc = airMc;
	}
	public BigDecimal getLandRatio() {
		return landRatio;
	}
	public void setLandRatio(BigDecimal landRatio) {
		this.landRatio = landRatio;
	}
	public BigDecimal getLandFreight() {
		return landFreight;
	}
	public void setLandFreight(BigDecimal landFreight) {
		this.landFreight = landFreight;
	}
	public BigDecimal getLandMc() {
		return landMc;
	}
	public void setLandMc(BigDecimal landMc) {
		this.landMc = landMc;
	}
	public String getBrandDesc() {
		return brandDesc;
	}
	public void setBrandDesc(String brandDesc) {
		this.brandDesc = brandDesc;
	}
	public String getPmName() {
		return pmName;
	}
	public void setPmName(String pmName) {
		this.pmName = pmName;
	}
	public String getCreateUserIdStr() {
		return createUserIdStr;
	}
	public void setCreateUserIdStr(String createUserIdStr) {
		this.createUserIdStr = createUserIdStr;
	}
	public String getStatuStr() {
		return statuStr;
	}
	public void setStatuStr(String statuStr) {
		this.statuStr = statuStr;
	}
	public String getSaleQtyStr() {
		return saleQtyStr;
	}
	public void setSaleQtyStr(String saleQtyStr) {
		this.saleQtyStr = saleQtyStr;
	}
	public String getMarketCapacityStr() {
		return marketCapacityStr;
	}
	public void setMarketCapacityStr(String marketCapacityStr) {
		this.marketCapacityStr = marketCapacityStr;
	}
	public String getRmaRatioStr() {
		return rmaRatioStr;
	}
	public void setRmaRatioStr(String rmaRatioStr) {
		this.rmaRatioStr = rmaRatioStr;
	}
	public String getMpDateStr() {
		return mpDateStr;
	}
	public void setMpDateStr(String mpDateStr) {
		this.mpDateStr = mpDateStr;
	}
	public String getMainProLineName() {
		return mainProLineName;
	}
	public void setMainProLineName(String mainProLineName) {
		this.mainProLineName = mainProLineName;
	}
	public String getSubProLineName() {
		return subProLineName;
	}
	public void setSubProLineName(String subProLineName) {
		this.subProLineName = subProLineName;
	}
	public Date getModelCreateDate() {
		return modelCreateDate;
	}
	public void setModelCreateDate(Date modelCreateDate) {
		this.modelCreateDate = modelCreateDate;
	}
	
	
}
