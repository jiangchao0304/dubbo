/*
* Copyright (c) 2017 sunvalley. All Rights Reserved.
*/
package com.sunvalley.erp.product.service;
import com.sunvalley.erp.common.constants.Constants;
import com.sunvalley.erp.common.util.TimeUtil;
import com.sunvalley.erp.domain.product.dto.ProductLineMappingDTO;
import com.sunvalley.erp.product.dao.*;
import com.sunvalley.erp.product.daoEX.ProductLineMappingExMapper;
import com.sunvalley.erp.product.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * 类或方法的功能描述 :TODO
 *
 * @Author: douglas.jiang
 * @Date: 2017-09-22 16:19
 */
@Service
public class ProductLineService {

    @Autowired
    private ProductLineMappingMapper productLineMappingMapper;

    @Autowired
    private ProductLineMappingExMapper productLineMappingExMapper;

    @Autowired
    private ProductLineMapper productLineMapper;

    @Autowired
    private ItemMapper itemMapper;

    @Autowired
    private ProductTypeMapper productTypeMapper;

    @Autowired
    private SupplierLogMapper supplierLogMapper;


    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public void saveProductLine(int categoryid,int subCategoryId,int skuid,int sessionId)throws Exception{
        //查询skuid与大类的关系是否存在
        ProductLineMappingExample productMappingExample = new ProductLineMappingExample();

        productMappingExample.createCriteria().andMappingIdEqualTo(skuid).andTypeEqualTo(Constants.ProductLineMappingType.skutype);
        HashMap<String, Object> param = new HashMap<String, Object>();
        param.put("filtersql", " and line.product_type = 2 AND m.type = 1");

        List<ProductLineMappingDTO> productMappingExList = productLineMappingExMapper.getProductLineMappingList(param);
        if(productMappingExList!=null && productMappingExList.size()>0){
            List<Integer> idList = new ArrayList<Integer>();
            for (ProductLineMappingDTO productMappingEx : productMappingExList) {
                idList.add(productMappingEx.getId());
            }
            productMappingExample.createCriteria().andIdIn(idList);
        }
        productLineMappingMapper.deleteByExample(productMappingExample);

        Item item = itemMapper.selectByPrimaryKey(skuid);

        //保存skuid 正式sku）与大类产品的关系
        ProductLineMapping productMappingd = new ProductLineMapping();
        productMappingd.setProductLineId(categoryid);
        productMappingd.setMappingId(skuid);
        productMappingd.setCreateDate(TimeUtil.BeiJingTimeNow());
        productMappingd.setCreateUserId(sessionId);
        productMappingd.setType(1);
        productLineMappingMapper.insert(productMappingd);

        int opTyped=16; //更新
        addLog(categoryid, opTyped,item.getSku(),"",1, "",sessionId);


        //保存skuid 正式sku）与小类产品的关系
        ProductLineMapping productMappingx = new ProductLineMapping();
        productMappingx.setProductLineId(subCategoryId);
        productMappingx.setMappingId(skuid);
        productMappingx.setCreateDate(TimeUtil.BeiJingTimeNow());
        productMappingx.setCreateUserId(sessionId);
        productMappingx.setType(1);
        productLineMappingMapper.insert(productMappingx);
        int opTypex=16; //更新
        addLog(subCategoryId, opTypex,item.getSku(),"",1,"",sessionId);
    }


    //增加日志
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public void addLog(int id,int opType,String productLineName,String uName, int type,String modelNo,int sessionId){
        ProductLine productLine = new ProductLine();
        if(id>0){
            productLine=productLineMapper.selectByPrimaryKey(id);//新数据
        }

        ProductType productType=productTypeMapper.selectByPrimaryKey(productLine.getUseType());//使用类别

        SupplierLog supplierLog= new SupplierLog();

        supplierLog.setSupplierid(productLine.getId());
        supplierLog.setOperationUserId(sessionId);
        supplierLog.setOperationDate(new Date());
        supplierLog.setOperationType(opType);
        if(opType== Constants.ProductLineLog.add){//新增
            if(productLine.getProductType()== Constants.ProductLineType.Normal){
                supplierLog.setNote("新增Normal产品线，使用类别为:"+productType.getName());

            }else if(productLine.getProductType()== Constants.ProductLineType.BigCateory){
                supplierLog.setNote("新增大类产品线,编码为:"+productLine.getProductCode());
            }else{
                supplierLog.setNote("新增小类产品线,编码为:"+productLine.getProductCode()+",型号为"+productLine.getModelNo());
            }
            supplierLog.setBelongsType(3);
            supplierLogMapper.insert(supplierLog);
        }else if(opType== Constants.ProductLineLog.update){//更新
            if(type== Constants.ProductLineMappingType.skutype || type== Constants.ProductLineMappingType.category || type== Constants.ProductLineMappingType.editps || type== Constants.ProductLineMappingType.viewps){
                if(type == Constants.ProductLineMappingType.skutype){
                    supplierLog.setNote("关联SKU:"+productLineName);
                }else if(type == Constants.ProductLineMappingType.editps){
                    supplierLog.setNote("分配编辑权限:"+productLineName);
                }else if(type == Constants.ProductLineMappingType.viewps){
                    supplierLog.setNote("分配数据权限:"+productLineName);
                }else if(type == Constants.ProductLineMappingType.category){
                    supplierLog.setNote("关联大类:"+productLineName);
                }
                supplierLog.setBelongsType(3);
                supplierLogMapper.insert(supplierLog);
            }else{
                String Log="";
                if(productLine.getProductType()!=null){
                    if(!productLineName.equals(productLine.getProductLineName())){
                        Log="产品线名由“"+productLineName+"”变更为“"+productLine.getProductLineName()+"”";
                    }
                    if(productLine.getProductType()== Constants.ProductLineType.Normal){
                        if(!uName.equals(productType.getName())){
                            Log=Log+"使用类别由“"+uName+"”变更为“"+productType.getName()+"”";
                        }
                    }else if(productLine.getProductType()== Constants.ProductLineType.BigCateory){
                        if(!uName.equals(productLine.getProductCode())){
                            Log=Log+"编码由“"+uName+"”变更为“"+productLine.getProductCode()+"”";
                        }
                    }else if(productLine.getProductType()== Constants.ProductLineType.SmallCateory){
                        if(!uName.equals(productLine.getProductCode())){
                            Log=Log+"编码由“"+uName+"”变更为“"+productLine.getProductCode()+"”";
                        }
                        if(!modelNo.equals(productLine.getModelNo())){
                            Log=Log+"型号由“"+modelNo+"”变更为“"+productLine.getModelNo()+"”";
                        }
                    }
                    if(!Log.equals("")){
                        supplierLog.setNote(Log);
                        supplierLog.setBelongsType(3);
                        supplierLogMapper.insert(supplierLog);
                    }
                }
            }
        }else if(opType == Constants.ProductLineLog.delete){//删除
            if(type == 0){
                supplierLog.setNote("删除产品线！");
            }else if(type == 1){
                supplierLog.setNote("删除关联SKU关系:"+productLineName);
            }else if(type == 5){
                supplierLog.setNote("删除关联大类关系："+productLineName);
            }else if(type == 6){
                supplierLog.setNote("删除关联小类关系："+productLineName);
            }else if(type == 2){
                supplierLog.setNote("删除编辑权限："+productLineName);
            }else if(type == 4){
                supplierLog.setNote("删除数据权限："+productLineName);
            }
            supplierLog.setBelongsType(3);
            supplierLogMapper.insert(supplierLog);
        }
    }
}

