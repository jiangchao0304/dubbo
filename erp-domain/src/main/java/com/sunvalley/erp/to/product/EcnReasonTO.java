/*
* Copyright (c) 2017 sunvalley. All Rights Reserved.
*/
package com.sunvalley.erp.to.product;

import java.io.Serializable;

/**
 * 类或方法的功能描述 :TODO
 *
 * @Author: douglas.jiang
 * @Date: 2017-08-17 18:22
 */
public class EcnReasonTO implements Serializable{
    private static final long serialVersionUID = 1L;

    private String reasonName;

    public String getReasonName() {
        return reasonName;
    }

    public void setReasonName(String reasonName) {
        this.reasonName = reasonName;
    }
}

