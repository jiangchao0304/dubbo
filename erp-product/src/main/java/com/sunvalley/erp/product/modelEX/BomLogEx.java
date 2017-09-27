package com.sunvalley.erp.product.modelEX;


import com.sunvalley.erp.product.model.BomLog;

public class BomLogEx extends BomLog {
	private String createUserName;
	private String purchasePropertyStr;
	private String purDesc;
	private String purspec;
	
	
	public String getPurDesc() {
		return purDesc;
	}
	public void setPurDesc(String purDesc) {
		this.purDesc = purDesc;
	}
	public String getPurspec() {
		return purspec;
	}
	public void setPurspec(String purspec) {
		this.purspec = purspec;
	}
	public String getPurchasePropertyStr() {
		return purchasePropertyStr;
	}
	public void setPurchasePropertyStr(String purchasePropertyStr) {
		this.purchasePropertyStr = purchasePropertyStr;
	}
	public String getCreateUserName() {
		return createUserName;
	}
	public void setCreateUserName(String createUserName) {
		this.createUserName = createUserName;
	}
	

}
