/*
* Copyright (c) 2017 sunvalley. All Rights Reserved.
*/
package com.sunvalley.erp.product.service;

import com.sunvalley.erp.common.exception.UniteException;
import com.sunvalley.erp.product.dao.BomMapper;
import com.sunvalley.erp.product.daoEX.BomExMapper;
import com.sunvalley.erp.product.daoEX.BomLogExMapper;
import com.sunvalley.erp.product.model.Bom;
import com.sunvalley.erp.product.model.BomExample;
import com.sunvalley.erp.to.product.BomTO;
import com.sunvalley.erp.to.product.SkuBaseInfoTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 类或方法的功能描述 :TODO
 *
 * @Author: douglas.jiang
 * @Date: 2017-09-26 15:32
 */
@Service
public class BomsService {

    @Autowired
    private BomMapper bomMapper;

    @Autowired
    private BomExMapper bomExMapper;

    @Autowired
    private BomLogExMapper bomLogExMapper;

    @Autowired
    private ItemService itemService;

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public boolean checkBom(Integer bomId,int skuId,String sku){


        BomExample bomExample = new BomExample();
        bomExample.createCriteria().andSkuidEqualTo(skuId);

        List<Bom>  bomList = bomMapper.selectByExample(bomExample);

        //校验bom skuid 是否存在
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("skuid", skuId);
        BomTO tempBom = bomExMapper.selectById(map);

        if(tempBom!=null && tempBom.getId()!=null && !tempBom.getId().equals(bomId)){
            throw new UniteException("sku的BOM信息存在！");
        }
        //判断sku 是否是最底层
        int totallevelChild=0;
        int totalLevelParent=0;
//        if(bomId!=null){
//            //校验当前sku 是否输入最高级别
//            totallevelChild = bomExMapper.selectTotalChild(skuId);//查询子级
//            totalLevelParent =bomExMapper.selectTotalParent(skuId);//查询父级
//
//            if(totallevelChild>0 && totalLevelParent>0){
//                totallevelChild-=1;
//            }
//            if((totallevelChild+totalLevelParent)>3){
//                throw new UniteException("SKU:"+sku+"总层大于3层！");
//            }
//            if(totalLevelParent==3 && bomEX.getBomOneSkuList()!=null && bomEX.getBomOneSkuList().size()>0){
//                throw new UniteException("SKU:"+sku+"总层大于3层！");
//            }
//
//            if(bomEX.getBomOneSkuList()!=null && bomEX.getBomOneSkuList().size()>0){
//                HashMap< String, Object> param = new HashMap<String, Object>();
//                for (BomEX tempBomEx  : bomEX.getBomOneSkuList()) {
//                    param.clear();
//                    List<Integer> skuIdList = new ArrayList<Integer>();
//                    skuIdList.add(tempBomEx.getSkuid());
//                    param.put("skuIdList", skuIdList);
//                    List<BomEX> oneSkuList =  bomExMapper.selectSkuInfoBySKuid(param);
//                    if(oneSkuList!=null && oneSkuList.size()>0){
//                        for (BomEX twoBom : oneSkuList) {
//                            if(twoBom.getSkuid().equals(bomEX.getSkuid())){
//                                throw new UniteException("SKU:"+tempBomEx.getSku()+"总层大于三层");
//                            }
//                        }
//                    }
//                    if(tempBomEx.getRowState() != Constants.RowStateType.DELETE){
//                        this.checkSkuLevel(tempBomEx.getSkuid(),tempBomEx.getSku(),3,totalLevelParent,bomEX.getSkuid());
//                    }
//                }
//            }
//
//
//        }else{
//            totallevelChild = bomExMapper.selectTotalChild(bomEX.getSkuid());//查询子级
//            if(totallevelChild<3){
//                if(bomEX.getBomOneSkuList()!=null && bomEX.getBomOneSkuList().size()>0){
//                    for (BomEX tempBomEx  : bomEX.getBomOneSkuList()) {
//                        if(tempBomEx.getRowState() != Constants.RowStateType.DELETE){
//                            this.checkSkuLevel(tempBomEx.getSkuid(),tempBomEx.getSku(),3,1,bomEX.getSkuid());
//                        }
//                    }
//                }
//            }else{
//                throw new UniteException("SKU:"+bomEX.getSku()+"总层大于3层！");
//            }
//        }
        return true;
    }


    public BomTO getBom(Integer bomId, Integer skuid){
        HashMap<String, Object> map = new HashMap<String, Object>();
        if(bomId!=null){
            map.put("id", bomId);
        }else{
            map.put("skuid", skuid);
        }
        BomTO bomEx = bomExMapper.selectById(map);
        if(bomEx!=null){
            List<Integer> skuIdList = new ArrayList<Integer>();
            skuIdList.add(bomEx.getSkuid());
            map.clear();
            map.put("skuIdList", skuIdList);
            bomEx.setBomOneSkuList(bomExMapper.selectSkuInfoBySKuid(map));
            bomEx.setBomTwoSkuList(this.getBomSkuList(bomEx.getBomOneSkuList()));
            HashMap<String, Object> param = new HashMap<String, Object>();
            param.put("id", bomEx.getId());
            bomEx.setBomSupplierList(bomExMapper.selectBomSupplier(param));
            param.put("skuid", bomEx.getSkuid());
            bomEx.setBomSkuInfoList(bomExMapper.selectSkuInfoList(param));
            param.put("offset", (bomEx.getPageNo()-1) * bomEx.getPageSize());
            param.put("pageSize",bomEx.getPageSize());
            bomEx.setBomLogExList(bomLogExMapper.selectLogList(param));
            bomEx.setRowCount(bomLogExMapper.selectLogCount(bomEx.getSkuid()));
        }
        if(bomEx==null && skuid!=null){
            SkuBaseInfoTO skuBaseInfoTO =  itemService.getSkuBaseInfo(skuid);
            bomEx = new BomTO();
            bomEx.setSku(skuBaseInfoTO.getSku());
            bomEx.setSkuid(skuid);
            bomEx.setPurdesc(skuBaseInfoTO.getPurDesc());
            bomEx.setPurspec(skuBaseInfoTO.getPurSpec());
        }
        return bomEx;
    }


    private List<BomTO> getBomSkuList(List<BomTO> bomExList){
        HashMap<String, Object> map = new HashMap<String, Object>();
        List<Integer> skuIdList = new ArrayList<Integer>();
        map.put("skuIdList", skuIdList);
        if(bomExList!=null && bomExList.size()>0){
            for (BomTO tempBom :bomExList) {
                skuIdList.add(tempBom.getSkuid());
            }
            return bomExMapper.selectSkuInfoBySKuid(map);
        }
        return null;

    }

}

