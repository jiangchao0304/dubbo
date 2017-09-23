/*
* Copyright (c) 2017 sunvalley. All Rights Reserved.
*/
package com.sunvalley.erp.product.common;

import com.sunvalley.erp.to.common.FilterModelTO;

import java.util.ArrayList;
import java.util.List;

/**
 * 类或方法的功能描述 :TODO
 *
 * @Author: douglas.jiang
 * @Date: 2017-09-23 10:53
 */
public class BeanUtils {

    public static com.sunvalley.erp.common.component.filtersql.FilterModel copyFilterModel(FilterModelTO orig){

        com.sunvalley.erp.common.component.filtersql.FilterModel dest = new com.sunvalley.erp.common.component.filtersql.FilterModel();
        dest.setDatatype(orig.getDatatype());
        dest.setFiled(orig.getFiled());
        dest.setOper(orig.getOper());
        dest.setValue(orig.getValue());
        return  dest;
    }

    public static List<com.sunvalley.erp.common.component.filtersql.FilterModel> copyFilterModel(List<FilterModelTO> origs){

        List<com.sunvalley.erp.common.component.filtersql.FilterModel> dests = new ArrayList<>();

        if(origs==null || origs.size()==0)
            return dests;

        for (FilterModelTO orig : origs) {

            dests.add(copyFilterModel(orig));
        }
        return  dests;
    }
}

