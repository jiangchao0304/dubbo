package com.sunvalley.erp.model.product;

import com.sunvalley.framework.base.BaseModel;
import java.math.BigDecimal;
import java.util.Date;

public class PrepareSku extends BaseModel {
    private String preSku;

    private String sku;

    private String model;

    private Integer modelId;

    private BigDecimal rmaRatio;

    private Integer skuid;

    private String purspec;

    private Integer status;

    private Integer saleQty;

    private Integer marketCapacity;

    private Date mpDate;

    private Integer color;

    private String productName;

    private Integer region;

    public String getPreSku() {
        return preSku;
    }

    public void setPreSku(String preSku) {
        this.preSku = preSku == null ? null : preSku.trim();
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku == null ? null : sku.trim();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
    }

    public Integer getModelId() {
        return modelId;
    }

    public void setModelId(Integer modelId) {
        this.modelId = modelId;
    }

    public BigDecimal getRmaRatio() {
        return rmaRatio;
    }

    public void setRmaRatio(BigDecimal rmaRatio) {
        this.rmaRatio = rmaRatio;
    }

    public Integer getSkuid() {
        return skuid;
    }

    public void setSkuid(Integer skuid) {
        this.skuid = skuid;
    }

    public String getPurspec() {
        return purspec;
    }

    public void setPurspec(String purspec) {
        this.purspec = purspec == null ? null : purspec.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getSaleQty() {
        return saleQty;
    }

    public void setSaleQty(Integer saleQty) {
        this.saleQty = saleQty;
    }

    public Integer getMarketCapacity() {
        return marketCapacity;
    }

    public void setMarketCapacity(Integer marketCapacity) {
        this.marketCapacity = marketCapacity;
    }

    public Date getMpDate() {
        return mpDate;
    }

    public void setMpDate(Date mpDate) {
        this.mpDate = mpDate;
    }

    public Integer getColor() {
        return color;
    }

    public void setColor(Integer color) {
        this.color = color;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public Integer getRegion() {
        return region;
    }

    public void setRegion(Integer region) {
        this.region = region;
    }
}