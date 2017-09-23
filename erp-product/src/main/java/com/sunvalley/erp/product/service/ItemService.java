/*
* Copyright (c) 2017 sunvalley. All Rights Reserved.
*/
package com.sunvalley.erp.product.service;
import com.sunvalley.erp.common.component.filtersql.FilterOP;
import com.sunvalley.erp.common.component.filtersql.FilterModel;
import com.sunvalley.erp.common.constants.Constants;
import com.sunvalley.erp.to.common.FilterModelTO;
import com.sunvalley.erp.to.common.PagerTO;
import com.sunvalley.erp.to.*;
import com.sunvalley.erp.to.product.ItemLocaleTO;
import com.sunvalley.erp.to.product.SkuBaseInfoTO;

import com.sunvalley.erp.face.exception.FaceException;
import com.sunvalley.erp.product.dao.ItemLocaleMapper;
import com.sunvalley.erp.product.daoEX.ItemExMapper;
import com.sunvalley.erp.product.model.ItemLocale;
import com.sunvalley.erp.product.model.ItemLocaleExample;
import com.sunvalley.erp.to.product.SkuListNewTO;
import org.apache.commons.beanutils.PropertyUtils;
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
    private ItemLocaleMapper itemLocaleMapper;

    @Autowired
    private ItemExMapper itemExMapper;


    public SkuBaseInfoTO getSkuBaseInfo(int skuId){

        Map<String,Object> param = new HashMap<>();
        param.put("skuId",skuId);

        SkuBaseInfoTO skuBaseInfoDTO =  itemExMapper.getSkuBaseInfo(param);
        if(skuBaseInfoDTO!=null){
            List<ItemLocaleTO> itemLocaleTOList =listItemLocale(skuBaseInfoDTO.getSkuId());
            skuBaseInfoDTO.setItemLocaleTOList(itemLocaleTOList);
        }
        return skuBaseInfoDTO;

    }

    public  List<ItemLocaleTO> listItemLocale(int skuid){

        List<ItemLocaleTO> result = new ArrayList<>();
        ItemLocaleExample itemLocaleExample = new ItemLocaleExample();
        itemLocaleExample.createCriteria().andSkuidEqualTo(skuid);
        List<ItemLocale>  itemLocaleList =  itemLocaleMapper.selectByExample(itemLocaleExample);

        if(itemLocaleList==null || itemLocaleList.size()==0)
            return result;


        for (ItemLocale itemLocale : itemLocaleList) {

            ItemLocaleTO dto = new ItemLocaleTO();
            try {
                PropertyUtils.copyProperties(dto, itemLocale);
                result.add(dto);
            }catch (Exception ex){
                throw  new FaceException(ex.getMessage());
            }

        }

        return result;

    }


    public SkuBaseInfoTO getSkuBaseInfo(String sku){
        Map<String,Object> param = new HashMap<>();
        param.put("sku",sku);
        SkuBaseInfoTO skuBaseInfoDTO =  itemExMapper.getSkuBaseInfo(param);

        if(skuBaseInfoDTO!=null){
            List<ItemLocaleTO> itemLocaleDTOList =listItemLocale(skuBaseInfoDTO.getSkuId());
            skuBaseInfoDTO.setItemLocaleTOList(itemLocaleDTOList);

        }
        return skuBaseInfoDTO;

    }


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



    public PagerTO<SkuListNewTO> listskuListNew(List<FilterModelTO> filterModels, int offset, int pageSize) {
        String filtersql="";
        try {
            List<FilterModel> origFilterModels =  com.sunvalley.erp.product.common.BeanUtils.copyFilterModel(filterModels);

            filtersql= new FilterOP().getFilterSQL(origFilterModels);
        }
        catch (Exception ex){
            throw  new FaceException(ex.getMessage());
        }
        HashMap<String,Object> map= new HashMap<String,Object>();
        map.put("filtersql", filtersql);
        map.put("offset", offset);
        map.put("limit", pageSize);
        PagerTO<SkuListNewTO> pager=new PagerTO<SkuListNewTO>();

        pager.setFilterSql(filtersql);
        pager.setPageNo(offset / pageSize+1);
        pager.setPageSize(pageSize);
        int rowCount= itemExMapper.countSkuListNew(map);
        pager.setRowCount(rowCount);
        if(rowCount>0){
            List<SkuListNewTO> list = itemExMapper.listSkuListNew(map);
            pager.setList(list);
        }

        return pager;

    }
}

