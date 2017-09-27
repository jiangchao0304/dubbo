package com.sunvalley.erp.product.modelEX;


import com.sunvalley.erp.product.model.BomSupplier;

public class BomSupplierEX extends BomSupplier {

	private java.lang.Integer id;//
	private java.lang.Integer bomId;//
	private java.lang.Integer skuid;//
	private java.lang.Integer purchaseProperty;//采购属性（特殊）
	private java.lang.Integer supplierId;//供应商id
    private Integer supplierid;
    private String name;
	private Integer purProperty;
	private int purchaserid;
	private String purchaserName;
	private String purPropertyStr;

	@Override
	public Integer getId() {
		return id;
	}

	@Override
	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public Integer getBomId() {
		return bomId;
	}

	@Override
	public void setBomId(Integer bomId) {
		this.bomId = bomId;
	}

	@Override
	public Integer getSkuid() {
		return skuid;
	}

	@Override
	public void setSkuid(Integer skuid) {
		this.skuid = skuid;
	}

	@Override
	public Integer getPurchaseProperty() {
		return purchaseProperty;
	}

	@Override
	public void setPurchaseProperty(Integer purchaseProperty) {
		this.purchaseProperty = purchaseProperty;
	}

	@Override
	public Integer getSupplierId() {
		return supplierId;
	}

	@Override
	public void setSupplierId(Integer supplierId) {
		this.supplierId = supplierId;
	}

	public Integer getSupplierid() {
		return supplierid;
	}

	public void setSupplierid(Integer supplierid) {
		this.supplierid = supplierid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPurProperty() {
		return purProperty;
	}

	public void setPurProperty(Integer purProperty) {
		this.purProperty = purProperty;
	}

	public int getPurchaserid() {
		return purchaserid;
	}

	public void setPurchaserid(int purchaserid) {
		this.purchaserid = purchaserid;
	}

	public String getPurchaserName() {
		return purchaserName;
	}

	public void setPurchaserName(String purchaserName) {
		this.purchaserName = purchaserName;
	}

	public String getPurPropertyStr() {
		return purPropertyStr;
	}

	public void setPurPropertyStr(String purPropertyStr) {
		this.purPropertyStr = purPropertyStr;
	}
}