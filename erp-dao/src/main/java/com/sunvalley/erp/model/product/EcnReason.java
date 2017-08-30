package com.sunvalley.erp.model.product;

public class EcnReason {
    private String reasonName;

    public String getReasonName() {
        return reasonName;
    }

    public void setReasonName(String reasonName) {
        this.reasonName = reasonName == null ? null : reasonName.trim();
    }
}