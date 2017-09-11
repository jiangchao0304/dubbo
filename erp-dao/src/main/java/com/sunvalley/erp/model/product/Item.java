package com.sunvalley.erp.model.product;

import com.sunvalley.framework.base.BaseModel;
import java.util.Date;

public class Item extends BaseModel {
    private Integer skuid;

    private String sku;

    private Short len;

    private Short width;

    private Short height;

    private Short weight;

    private Short volweight;

    private Short active;

    private Boolean isdrop;

    private Boolean dropDef;

    private Byte isvirtual;

    private Byte lineState;

    private Boolean issale;

    private Boolean zeroStock;

    private Short zeroWhid;

    private Short zeroQty;

    private Byte boxtype;

    private Integer pmid;

    private Integer peid;

    private Boolean isoriginal;

    private String purdesc;

    private String purspec;

    private Byte leadtime;

    private String skulable;

    private Integer innerskuId;

    private Integer outerskuId;

    private Short pkgweight;

    private Short pkgrate;

    private String purpkg;

    private String stopkg;

    private Integer standard;

    private Short versionno;

    private Integer updateuserid;

    private Date updatedate;

    private Boolean haspic;

    private String updatepicuser;

    private Date updatepicdate;

    private String descSourc;

    private Date lineStateDate;

    private String purtitle;

    private Integer brandId;

    private Integer purchaserId;

    private Short productLen;

    private Short productWidth;

    private Short productHeight;

    private Short productWeight;

    private Short productVolweight;

    private Integer battery;

    private String model;

    private Integer psid;

    private Date updatedate2;

    private Integer rmacategoryid;

    private Integer region;

    private String proFeatures;

    private Integer categoryid;

    private Integer subcategoryid;

    private Integer isPackage;

    private Integer color;

    private Integer modelId;

    public Integer getSkuid() {
        return skuid;
    }

    public void setSkuid(Integer skuid) {
        this.skuid = skuid;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku == null ? null : sku.trim();
    }

    public Short getLen() {
        return len;
    }

    public void setLen(Short len) {
        this.len = len;
    }

    public Short getWidth() {
        return width;
    }

    public void setWidth(Short width) {
        this.width = width;
    }

    public Short getHeight() {
        return height;
    }

    public void setHeight(Short height) {
        this.height = height;
    }

    public Short getWeight() {
        return weight;
    }

    public void setWeight(Short weight) {
        this.weight = weight;
    }

    public Short getVolweight() {
        return volweight;
    }

    public void setVolweight(Short volweight) {
        this.volweight = volweight;
    }

    public Short getActive() {
        return active;
    }

    public void setActive(Short active) {
        this.active = active;
    }

    public Boolean getIsdrop() {
        return isdrop;
    }

    public void setIsdrop(Boolean isdrop) {
        this.isdrop = isdrop;
    }

    public Boolean getDropDef() {
        return dropDef;
    }

    public void setDropDef(Boolean dropDef) {
        this.dropDef = dropDef;
    }

    public Byte getIsvirtual() {
        return isvirtual;
    }

    public void setIsvirtual(Byte isvirtual) {
        this.isvirtual = isvirtual;
    }

    public Byte getLineState() {
        return lineState;
    }

    public void setLineState(Byte lineState) {
        this.lineState = lineState;
    }

    public Boolean getIssale() {
        return issale;
    }

    public void setIssale(Boolean issale) {
        this.issale = issale;
    }

    public Boolean getZeroStock() {
        return zeroStock;
    }

    public void setZeroStock(Boolean zeroStock) {
        this.zeroStock = zeroStock;
    }

    public Short getZeroWhid() {
        return zeroWhid;
    }

    public void setZeroWhid(Short zeroWhid) {
        this.zeroWhid = zeroWhid;
    }

    public Short getZeroQty() {
        return zeroQty;
    }

    public void setZeroQty(Short zeroQty) {
        this.zeroQty = zeroQty;
    }

    public Byte getBoxtype() {
        return boxtype;
    }

    public void setBoxtype(Byte boxtype) {
        this.boxtype = boxtype;
    }

    public Integer getPmid() {
        return pmid;
    }

    public void setPmid(Integer pmid) {
        this.pmid = pmid;
    }

    public Integer getPeid() {
        return peid;
    }

    public void setPeid(Integer peid) {
        this.peid = peid;
    }

    public Boolean getIsoriginal() {
        return isoriginal;
    }

    public void setIsoriginal(Boolean isoriginal) {
        this.isoriginal = isoriginal;
    }

    public String getPurdesc() {
        return purdesc;
    }

    public void setPurdesc(String purdesc) {
        this.purdesc = purdesc == null ? null : purdesc.trim();
    }

    public String getPurspec() {
        return purspec;
    }

    public void setPurspec(String purspec) {
        this.purspec = purspec == null ? null : purspec.trim();
    }

    public Byte getLeadtime() {
        return leadtime;
    }

    public void setLeadtime(Byte leadtime) {
        this.leadtime = leadtime;
    }

    public String getSkulable() {
        return skulable;
    }

    public void setSkulable(String skulable) {
        this.skulable = skulable == null ? null : skulable.trim();
    }

    public Integer getInnerskuId() {
        return innerskuId;
    }

    public void setInnerskuId(Integer innerskuId) {
        this.innerskuId = innerskuId;
    }

    public Integer getOuterskuId() {
        return outerskuId;
    }

    public void setOuterskuId(Integer outerskuId) {
        this.outerskuId = outerskuId;
    }

    public Short getPkgweight() {
        return pkgweight;
    }

    public void setPkgweight(Short pkgweight) {
        this.pkgweight = pkgweight;
    }

    public Short getPkgrate() {
        return pkgrate;
    }

    public void setPkgrate(Short pkgrate) {
        this.pkgrate = pkgrate;
    }

    public String getPurpkg() {
        return purpkg;
    }

    public void setPurpkg(String purpkg) {
        this.purpkg = purpkg == null ? null : purpkg.trim();
    }

    public String getStopkg() {
        return stopkg;
    }

    public void setStopkg(String stopkg) {
        this.stopkg = stopkg == null ? null : stopkg.trim();
    }

    public Integer getStandard() {
        return standard;
    }

    public void setStandard(Integer standard) {
        this.standard = standard;
    }

    public Short getVersionno() {
        return versionno;
    }

    public void setVersionno(Short versionno) {
        this.versionno = versionno;
    }

    public Integer getUpdateuserid() {
        return updateuserid;
    }

    public void setUpdateuserid(Integer updateuserid) {
        this.updateuserid = updateuserid;
    }

    public Date getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }

    public Boolean getHaspic() {
        return haspic;
    }

    public void setHaspic(Boolean haspic) {
        this.haspic = haspic;
    }

    public String getUpdatepicuser() {
        return updatepicuser;
    }

    public void setUpdatepicuser(String updatepicuser) {
        this.updatepicuser = updatepicuser == null ? null : updatepicuser.trim();
    }

    public Date getUpdatepicdate() {
        return updatepicdate;
    }

    public void setUpdatepicdate(Date updatepicdate) {
        this.updatepicdate = updatepicdate;
    }

    public String getDescSourc() {
        return descSourc;
    }

    public void setDescSourc(String descSourc) {
        this.descSourc = descSourc == null ? null : descSourc.trim();
    }

    public Date getLineStateDate() {
        return lineStateDate;
    }

    public void setLineStateDate(Date lineStateDate) {
        this.lineStateDate = lineStateDate;
    }

    public String getPurtitle() {
        return purtitle;
    }

    public void setPurtitle(String purtitle) {
        this.purtitle = purtitle == null ? null : purtitle.trim();
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public Integer getPurchaserId() {
        return purchaserId;
    }

    public void setPurchaserId(Integer purchaserId) {
        this.purchaserId = purchaserId;
    }

    public Short getProductLen() {
        return productLen;
    }

    public void setProductLen(Short productLen) {
        this.productLen = productLen;
    }

    public Short getProductWidth() {
        return productWidth;
    }

    public void setProductWidth(Short productWidth) {
        this.productWidth = productWidth;
    }

    public Short getProductHeight() {
        return productHeight;
    }

    public void setProductHeight(Short productHeight) {
        this.productHeight = productHeight;
    }

    public Short getProductWeight() {
        return productWeight;
    }

    public void setProductWeight(Short productWeight) {
        this.productWeight = productWeight;
    }

    public Short getProductVolweight() {
        return productVolweight;
    }

    public void setProductVolweight(Short productVolweight) {
        this.productVolweight = productVolweight;
    }

    public Integer getBattery() {
        return battery;
    }

    public void setBattery(Integer battery) {
        this.battery = battery;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
    }

    public Integer getPsid() {
        return psid;
    }

    public void setPsid(Integer psid) {
        this.psid = psid;
    }

    public Date getUpdatedate2() {
        return updatedate2;
    }

    public void setUpdatedate2(Date updatedate2) {
        this.updatedate2 = updatedate2;
    }

    public Integer getRmacategoryid() {
        return rmacategoryid;
    }

    public void setRmacategoryid(Integer rmacategoryid) {
        this.rmacategoryid = rmacategoryid;
    }

    public Integer getRegion() {
        return region;
    }

    public void setRegion(Integer region) {
        this.region = region;
    }

    public String getProFeatures() {
        return proFeatures;
    }

    public void setProFeatures(String proFeatures) {
        this.proFeatures = proFeatures == null ? null : proFeatures.trim();
    }

    public Integer getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Integer categoryid) {
        this.categoryid = categoryid;
    }

    public Integer getSubcategoryid() {
        return subcategoryid;
    }

    public void setSubcategoryid(Integer subcategoryid) {
        this.subcategoryid = subcategoryid;
    }

    public Integer getIsPackage() {
        return isPackage;
    }

    public void setIsPackage(Integer isPackage) {
        this.isPackage = isPackage;
    }

    public Integer getColor() {
        return color;
    }

    public void setColor(Integer color) {
        this.color = color;
    }

    public Integer getModelId() {
        return modelId;
    }

    public void setModelId(Integer modelId) {
        this.modelId = modelId;
    }
}