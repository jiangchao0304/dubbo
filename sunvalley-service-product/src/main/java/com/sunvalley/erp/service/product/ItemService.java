/*
* Copyright (c) 2017 sunvalley. All Rights Reserved.
*/
package com.sunvalley.erp.service.product;

import com.sunvalley.common.constants.Constants;
import com.sunvalley.erp.dao.product.ItemMapper;
import com.sunvalley.erp.daoEX.product.ItemExMapper;
import com.sunvalley.erp.model.product.ItemLocale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 类或方法的功能描述 :TODO
 *
 * @Author: douglas.jiang
 * @Date: 2017-09-12 10:10
 */
@Service
public class ItemService {

    @Autowired
    private ItemMapper itemMapper;

    @Autowired
    private ItemExMapper itemExMapper;


    public List<ItemLocale> searchSkuCategoryName(String sku, int langId, int[] category,int limit,Integer companyid) {

        Map<String, Object> param = new HashMap<String, Object>();
        param.put("sku", sku + "%");
        param.put("limit", limit);
        String regex = "[\\d-]+"; // 数字中划线正则
        if(!sku.matches(regex)) { // 正则表达式判断搜索描述还是编码
            param.put("description", "%" + sku + "%");
        }
        param.put("lang_id", langId);
        if(category.length > 0) {
            List<Integer> list = new ArrayList<Integer>();
            for(int i : category) {
                list.add(i);
            }
            param.put("categoryid", list);
        }

        //如果公司不是sunvalley,则查看的是dropship授权的sku
        if(companyid!=null && companyid!= Constants.CompanyType.SUNVALLEY){
            param.put("isdrop", 1);
            param.put("seller_id", companyid);
        }

        return itemExMapper.searchSkuCategoryName(param);
    }
}

