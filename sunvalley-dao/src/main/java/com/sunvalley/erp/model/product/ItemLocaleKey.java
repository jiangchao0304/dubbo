package com.sunvalley.erp.model.product;

import com.sunvalley.framework.base.BaseModel;

public class ItemLocaleKey extends BaseModel {
    private Byte langId;

    private Integer skuid;

    public Byte getLangId() {
        return langId;
    }

    public void setLangId(Byte langId) {
        this.langId = langId;
    }

    public Integer getSkuid() {
        return skuid;
    }

    public void setSkuid(Integer skuid) {
        this.skuid = skuid;
    }
}