/*
* Copyright (c) 2017 sunvalley. All Rights Reserved.
*/
package com.sunvalley.erp.service.product;

import com.sunvalley.common.constants.Constants;
import com.sunvalley.erp.dao.product.*;
import com.sunvalley.erp.daoEX.product.ItemExMapper;
import com.sunvalley.erp.daoEX.product.PrepareSkuExMapper;
import com.sunvalley.erp.daoEX.product.SequenceExMapper;
import com.sunvalley.erp.model.product.*;
import com.sunvalley.face.exception.FaceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * 类或方法的功能描述 :TODO
 *
 * @Author: douglas.jiang
 * @Date: 2017-09-15 16:07
 */
@Service
public class SequenceService {

    //#region Autowired

    @Autowired
    private ItemModelMapper itemModelMapper;

    @Autowired
    private ProductLineMapper productLineMapper;

    @Autowired
    private PrepareSkuMapper prepareSkuMapper;

    @Autowired
    private ItemMapper itemMapper;

    @Autowired
    private ItemBrandMapper itemBrandMapper;

    @Autowired
    private SequenceService sequenceService;

    @Autowired
    private  SequenceExMapper sequenceExMapper;
    //#endregion


    public static final short STEP=1;
    public static final int VALUE=1;
    public static final int START=1;

    public synchronized String getNextIdSkuCodeY6(String name){
        if (name==null || "".equals(name)) return "";
//        DataSourceTransactionManager transactionManager = (DataSourceTransactionManager) Env
//                .getBean("transactionManager");
//        DefaultTransactionDefinition td = new DefaultTransactionDefinition(
//                TransactionDefinition.PROPAGATION_REQUIRES_NEW); // 鏂板紑涓�釜浜嬪姟
//        TransactionStatus status = transactionManager.getTransaction(td);
        Sequence seq = sequenceExMapper.select(name);
        if (seq == null) {
            seq = new Sequence();
            seq.setStep(STEP);
            seq.setStart(START);
            seq.setValue(VALUE);
            sequenceExMapper.insert(seq);
        }
        sequenceExMapper.update( name);
        //transactionManager.commit(status);
        String suffixCode =  String.format("%06d", seq.getValue());
        String skuCode = name+suffixCode.substring(0, 3)+"-"+suffixCode.substring(3, suffixCode.length());
        return skuCode;
    }


    public synchronized String getNextIdSkuCodeY3(String name){
        if (name==null || "".equals(name)) return "";
//        DataSourceTransactionManager transactionManager = (DataSourceTransactionManager) Env
//                .getBean("transactionManager");
//        DefaultTransactionDefinition td = new DefaultTransactionDefinition(
//                TransactionDefinition.PROPAGATION_REQUIRES_NEW); // 鏂板紑涓�釜浜嬪姟
//        TransactionStatus status = transactionManager.getTransaction(td);
        Sequence seq = (Sequence) sequenceExMapper.select( name);
        if (seq == null) {
            seq = new Sequence();
            seq.setStep(STEP);
            seq.setStart(START);
            seq.setValue(VALUE);
            sequenceExMapper.insert(seq);
        }
        sequenceExMapper.update( name);

        //transactionManager.commit(status);
        String suffixCode =  String.format("%03d", seq.getValue());
        String skuCode = name+suffixCode;
        return skuCode;
    }



    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public String generationNo(Integer mainCategoryId,Integer subCategoryId,Integer brandId,int type,Integer isPackage,Integer modelId){
        //查询大小类的编码
        ProductLineExample lineExample = new ProductLineExample();
        List<Integer> idList = new ArrayList<Integer>();
        idList.add(mainCategoryId);
        idList.add(subCategoryId);
        lineExample.createCriteria().andIdIn(idList);
        String skuCode ="";
        boolean bl = false;
        if(type== Constants.skuCodeType.skuCode){//sku生产规则
            List<ProductLine> productLineList = productLineMapper.selectByExample(lineExample);
            if(productLineList!=null && productLineList.size()==2){
                String mainCategoryCode = "";
                String subCategoryCode ="";
                for (ProductLine productLine : productLineList) {
                    if(productLine.getId().equals(mainCategoryId)){
                        mainCategoryCode = productLine.getProductCode();
                    }
                    if(productLine.getId().equals(subCategoryId)){
                        subCategoryCode = productLine.getProductCode();
                    }
                }
                if(isPackage== Constants.IsPackageSku.isPackage){
                    mainCategoryCode ="85-"+mainCategoryCode;
                }else{
                    mainCategoryCode = mainCategoryCode+"-"+subCategoryCode;
                }
                do {
                    skuCode = sequenceService.getNextIdSkuCodeY6(mainCategoryCode);
                    //校验sku是否存在
                    ItemExample itemExample = new ItemExample();
                    itemExample.createCriteria().andSkuEqualTo(skuCode);
                    List<Item> items =  itemMapper.selectByExample(itemExample);
                    if(items==null || items.size()==0){
                        bl = false;
                    }else{
                        bl = true;
                    }
                }while(!bl);

            }
        }else if(type==Constants.skuCodeType.preskuCode){//预备sku规则
            //查询model编码 预备sku规则 :model编码-三位流水号
            ItemModel itemModel = itemModelMapper.selectByPrimaryKey(modelId);
            if(itemModel==null){
                throw new FaceException("Model不存在，请检查数据！");
            }
            do {
                skuCode = sequenceService.getNextIdSkuCodeY3(itemModel.getModelName()+"-");
                //校验sku是否存在
                PrepareSkuExample prepareSkuExample = new PrepareSkuExample();
                prepareSkuExample.createCriteria().andPreSkuEqualTo(skuCode);
                List<PrepareSku> prepareSkuList = prepareSkuMapper.selectByExample(prepareSkuExample);
                if(prepareSkuList==null || prepareSkuList.size()==0){
                    bl = true;
                }else{
                    bl = false;
                }
            }while(!bl);

        }else{//model 生产规则
//		model 的编码规则：品牌简称-小类型号-三位流水号
            ItemBrand itemBrand = itemBrandMapper.selectByPrimaryKey(brandId);
            //小类型号
            ProductLine productLine = productLineMapper.selectByPrimaryKey(subCategoryId);
            if(itemBrand==null){
                throw new FaceException("品牌信息不存在，请检查数据！");
            }
            if(productLine==null){
                throw new FaceException("小类产品线不存在，请检查数据！");
            }
            do {
                skuCode = itemBrand.getBrandCode()+"-"+productLine.getModelNo();
                skuCode = sequenceService.getNextIdSkuCodeY3(skuCode);
                ItemModelExample itemmodelExample = new ItemModelExample();
                itemmodelExample.createCriteria().andModelNameEqualTo(skuCode);
                List<ItemModel> itemModelList = itemModelMapper.selectByExample(itemmodelExample);
                if(itemModelList==null || itemModelList.size() == 0){
                    bl = true;
                }else{
                    bl = false;
                }
            }while(!bl);
        }

        return skuCode;
    }
}

