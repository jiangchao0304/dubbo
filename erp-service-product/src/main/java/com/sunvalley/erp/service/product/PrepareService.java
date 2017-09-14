/*
* Copyright (c) 2017 sunvalley. All Rights Reserved.
*/
package com.sunvalley.erp.service.product;

import com.sunvalley.erp.common.constants.Constants;
import com.sunvalley.erp.daoEX.product.PrepareSkuExMapper;
import com.sunvalley.erp.domain.product.dto.PackageSkuDTO;
import com.sunvalley.erp.domain.product.dto.PreSkuGridDTO;
import com.sunvalley.erp.domain.product.vo.PackageSkuVO;
import com.sunvalley.erp.domain.product.vo.PreSkuGridVO;
import com.sunvalley.erp.domain.product.vo.PreSkuSaveVO;
import com.sunvalley.erp.domain.product.vo.PreSkuVO;
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
     * getByModel .
     * @param modelName
     *         [modelName]
     * @param status
     *         [status]
     * @return com.sunvalley.erp.domain.product.vo.PreSkuVO
     * @throws
     * @author: douglas.jiang
     * @date : 2017/9/14:16:23
     */

    public PreSkuVO getByModel(String modelName, Integer status ) throws Exception{


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
            PreSkuVO vo = new PreSkuVO();
            PropertyUtils.copyProperties(vo, prepareSkuEx);
            vo.setModelRemark(prepareSkuEx.getModel_remark());

            map.put("model_id", prepareSkuEx.getModelId());
            List<PreSkuGridDTO> preSkuList = prepareSkuExMapper.preSkuGrid(map);

            List<PreSkuGridVO> preSkuVOList = new ArrayList<>(preSkuList.size());
            for (int i = 0; i < preSkuList.size(); i++) {
                PreSkuGridVO preSkuGridVO = new PreSkuGridVO();
                PropertyUtils.copyProperties(preSkuGridVO, preSkuList.get(i));
                preSkuVOList.add(preSkuGridVO);
            }


            List<PackageSkuDTO> packageSkuList = prepareSkuExMapper.packageSkuList(map);

            List<PackageSkuVO> packageSkuVOList = new ArrayList<>(packageSkuList.size());
            for (int i = 0; i < packageSkuList.size(); i++) {
                PackageSkuVO packageSkuVO = new PackageSkuVO();
                PropertyUtils.copyProperties(packageSkuVO, packageSkuList.get(i));
                packageSkuVOList.add(packageSkuVO);
            }



            vo.setPreSkuList(preSkuVOList);
            vo.setPackageSkuList(packageSkuVOList);

            return vo;
        }else{
            throw new UniteException("请输入系统存在的Model号！");
        }
    }


    public void save(PreSkuSaveVO vo){


//        ItemModel model = new ItemModel();
//        model.setBrandId(prepareSkuEx.getBrandId());
//        model.setMainCategoryId(prepareSkuEx.getMainCategoryId());
//        model.setSubCategoryId(prepareSkuEx.getSubCategoryId());
//        model.setPmId(prepareSkuEx.getPmId());
//        model.setCreateUser(SessionManager.getSysSession().getUserId());
//        model.setCreateDate(TimeUtil.BeiJingTimeNow());
//        model.setRemark(prepareSkuEx.getModel_remark());
//        if(!"".equals(prepareSkuEx.getModelId()) && null != prepareSkuEx.getModelId()){
//            model.setModelId(prepareSkuEx.getModelId());
//            model.setModelName(prepareSkuEx.getModel());
//            ItemModel itemModel = itemModelMapper.selectByPrimaryKey(prepareSkuEx.getModelId());
//            if(!prepareSkuEx.getMainCategoryId().equals(itemModel.getMainCategoryId()) ||
//                    !prepareSkuEx.getSubCategoryId().equals(itemModel.getSubCategoryId())){
//                String modelName = this.generationNo(prepareSkuEx.getMainCategoryId(),prepareSkuEx.getSubCategoryId(), prepareSkuEx.getBrandId(), Constants.skuCodeType.modeCode, null, null);
//                model.setModelName(modelName);
//            }
//            itemModelMapper.updateByPrimaryKey(model);
//        }else{
//            //model 的编码规则？
//            String modelName = this.generationNo(prepareSkuEx.getMainCategoryId(),prepareSkuEx.getSubCategoryId(), prepareSkuEx.getBrandId(), Constants.skuCodeType.modeCode, null, null);
//            model.setModelName(modelName);
//            itemModelMapper.insert(model);
//            //自动分配组织架构
//            adapteModelOrg(model);
//
//            prepareSkuEx.setModelId(model.getModelId());
//            prepareSkuEx.setModel(modelName);
//        }
//        savePreSkuAttr(prepareSkuEx);

    }
}

