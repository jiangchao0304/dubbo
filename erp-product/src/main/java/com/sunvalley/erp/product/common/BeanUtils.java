/*
* Copyright (c) 2017 sunvalley. All Rights Reserved.
*/
package com.sunvalley.erp.product.common;

import com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleGotoStatement;
import com.sunvalley.erp.domain.common.dto.FilterModel;
import org.springframework.expression.spel.ast.NullLiteral;

import java.util.ArrayList;
import java.util.List;

/**
 * 类或方法的功能描述 :TODO
 *
 * @Author: douglas.jiang
 * @Date: 2017-09-23 10:53
 */
public class BeanUtils {

    public static com.sunvalley.erp.common.util.FilterModel copyFilterModel(com.sunvalley.erp.domain.common.dto.FilterModel orig){

        com.sunvalley.erp.common.util.FilterModel dest = new com.sunvalley.erp.common.util.FilterModel();
        dest.setDatatype(orig.getDatatype());
        dest.setFiled(orig.getFiled());
        dest.setOper(orig.getOper());
        dest.setValue(orig.getValue());
        return  dest;
    }

    public static List<com.sunvalley.erp.common.util.FilterModel> copyFilterModel(List<com.sunvalley.erp.domain.common.dto.FilterModel> origs){

        List<com.sunvalley.erp.common.util.FilterModel> dests = new ArrayList<>();

        if(origs==null || origs.size()==0)
            return null;

        for (FilterModel orig : origs) {

            dests.add(copyFilterModel(orig));
        }
        return  dests;
    }
}

