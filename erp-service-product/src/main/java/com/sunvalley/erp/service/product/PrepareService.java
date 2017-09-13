/*
* Copyright (c) 2017 sunvalley. All Rights Reserved.
*/
package com.sunvalley.erp.service.product;

import com.sunvalley.erp.daoEX.product.PrepareSkuExMapper;
import com.sunvalley.erp.domain.product.vo.PrepareSkuBaseInfoVO;
import com.sunvalley.erp.modelEX.product.PrepareSkuEx;
import com.sunvalley.erp.util.exception.UniteException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.apache.commons.beanutils.PropertyUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 类或方法的功能描述 :TODO
 *
 * @Author: douglas.jiang
 * @Date: 2017-09-13 12:26
 */
@Service
public class PrepareService {

    @Autowired
    private PrepareSkuExMapper prepareSkuExMapper;

    /**
     * 同行model初始化数据
     * @return
     */
    public PrepareSkuBaseInfoVO getByModel(String modelName, Integer status ) throws Exception{

        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("model", modelName);
        if(status == 0){
            map.put("status", null);
        }else{
            map.put("status", status);
        }

        List<PrepareSkuEx> list = prepareSkuExMapper.initByModel(map);
        if(list != null && list.size()>0){
            PrepareSkuEx prepareSkuEx = list.get(0);
            PrepareSkuBaseInfoVO vo = new PrepareSkuBaseInfoVO();
            PropertyUtils.copyProperties(vo, prepareSkuEx);
            vo.setModelRemark(prepareSkuEx.getModel_remark());
            map.put("model_id", prepareSkuEx.getModelId());
            List<PrepareSkuEx> preSkuList = prepareSkuExMapper.preSkuGrid(map);

            List<PrepareSkuBaseInfoVO> preSkuVOList = new ArrayList<>();
            PropertyUtils.copyProperties(preSkuVOList, preSkuList);


            List<PrepareSkuEx> packageSkuList = prepareSkuExMapper.packageSkuList(map);
            List<PrepareSkuBaseInfoVO> packageSkuVOList = new ArrayList<>();
            PropertyUtils.copyProperties(packageSkuVOList, packageSkuList);


            vo.setPreSkuList(preSkuVOList);
            vo.setPackageSkuList(packageSkuVOList);

            return vo;
        }else{
            throw new UniteException("请输入系统存在的Model号！");
        }
    }
}

