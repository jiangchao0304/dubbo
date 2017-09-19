/*
* Copyright (c) 2017 sunvalley. All Rights Reserved.
*/
package com.sunvalley.erp.service.product;
import com.sunvalley.common.constants.Constants;
import com.sunvalley.common.util.FilterOP;
import com.sunvalley.domain.FilterModel;
import com.sunvalley.domain.Pager;
import com.sunvalley.domain.erp.product.dto.ModelAndPreSkuDTO;
import com.sunvalley.domain.erp.product.dto.SkuListNewDTO;
import com.sunvalley.erp.dao.product.ItemMapper;
import com.sunvalley.erp.daoEX.product.ItemExMapper;
import com.sunvalley.erp.model.product.ItemLocale;
import com.sunvalley.face.exception.FaceException;
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



    public Pager<SkuListNewDTO> listskuListNew(List<FilterModel> filterModels, int offset, int pageSize) {
        String filtersql="";
        try {
             filtersql= new FilterOP().getFilterSQL(filterModels);
        }
        catch (Exception ex){
            throw  new FaceException(ex.getMessage());
        }
        HashMap<String,Object> map= new HashMap<String,Object>();
        map.put("filtersql", filtersql);
        map.put("offset", offset);
        map.put("limit", pageSize);
        Pager<SkuListNewDTO> pager=new Pager<SkuListNewDTO>();

        pager.setFilterSql(filtersql);
        pager.setPageNo(offset / pageSize+1);
        pager.setPageSize(pageSize);
        int rowCount= itemExMapper.countSkuListNew(map);
        pager.setRowCount(rowCount);
        if(rowCount>0){
            List<SkuListNewDTO> list = itemExMapper.listSkuListNew(map);
            pager.setList(list);
        }

        return pager;

    }
}

