/*
* Copyright (c) 2017 sunvalley. All Rights Reserved.
*/
package com.sunvalley.erp.product.service;

import com.sunvalley.erp.common.constants.Constants;
import com.sunvalley.erp.common.exception.BusinessException;
import com.sunvalley.erp.common.exception.UniteException;
import com.sunvalley.erp.product.dao.BomMapper;
import com.sunvalley.erp.product.dao.ItemVirtualMapper;
import com.sunvalley.erp.product.daoEX.BomExMapper;
import com.sunvalley.erp.product.daoEX.BomLogExMapper;
import com.sunvalley.erp.product.model.Bom;
import com.sunvalley.erp.product.model.BomExample;
import com.sunvalley.erp.product.model.ItemVirtual;
import com.sunvalley.erp.product.model.ItemVirtualExample;
import com.sunvalley.erp.product.modelEX.BomEX;
import com.sunvalley.erp.to.common.SysSessionTO;
import com.sunvalley.erp.to.product.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Base64;
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

    @Autowired
    private PrepareService prepareService;

    @Autowired
    private ItemVirtualMapper itemVirtualMapper;

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
        if(bomId!=null){
            //校验当前sku 是否输入最高级别
            totallevelChild = bomExMapper.selectTotalChild(skuId);//查询子级
            totalLevelParent =bomExMapper.selectTotalParent(skuId);//查询父级

            if(totallevelChild>0 && totalLevelParent>0){
                totallevelChild-=1;
            }
            if((totallevelChild+totalLevelParent)>3){
                throw new UniteException("SKU:"+sku+"总层大于3层！");
            }
            if(totalLevelParent==3 && bomEX.getBomOneSkuList()!=null && bomEX.getBomOneSkuList().size()>0){
                throw new UniteException("SKU:"+sku+"总层大于3层！");
            }

            if(bomEX.getBomOneSkuList()!=null && bomEX.getBomOneSkuList().size()>0){
                HashMap< String, Object> param = new HashMap<String, Object>();
                for (BomEX tempBomEx  : bomEX.getBomOneSkuList()) {
                    param.clear();
                    List<Integer> skuIdList = new ArrayList<Integer>();
                    skuIdList.add(tempBomEx.getSkuid());
                    param.put("skuIdList", skuIdList);
                    List<BomEX> oneSkuList =  bomExMapper.selectSkuInfoBySKuid(param);
                    if(oneSkuList!=null && oneSkuList.size()>0){
                        for (BomEX twoBom : oneSkuList) {
                            if(twoBom.getSkuid().equals(bomEX.getSkuid())){
                                throw new UniteException("SKU:"+tempBomEx.getSku()+"总层大于三层");
                            }
                        }
                    }
                    if(tempBomEx.getRowState() != Constants.RowStateType.DELETE){
                        this.checkSkuLevel(tempBomEx.getSkuid(),tempBomEx.getSku(),3,totalLevelParent,bomEX.getSkuid());
                    }
                }
            }


        }else{
            totallevelChild = bomExMapper.selectTotalChild(bomEX.getSkuid());//查询子级
            if(totallevelChild<3){
                if(bomEX.getBomOneSkuList()!=null && bomEX.getBomOneSkuList().size()>0){
                    for (BomEX tempBomEx  : bomEX.getBomOneSkuList()) {
                        if(tempBomEx.getRowState() != Constants.RowStateType.DELETE){
                            this.checkSkuLevel(tempBomEx.getSkuid(),tempBomEx.getSku(),3,1,bomEX.getSkuid());
                        }
                    }
                }
            }else{
                throw new UniteException("SKU:"+bomEX.getSku()+"总层大于3层！");
            }
        }
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


            List<BomTO> bomOneSkuList = bomExMapper.selectSkuInfoBySKuid(map);

            bomEx.setBomOneSkuList(bomOneSkuList==null?new ArrayList<>() : bomOneSkuList);

            bomEx.setBomTwoSkuList(this.getBomSkuList(bomEx.getBomOneSkuList()));

            HashMap<String, Object> param = new HashMap<String, Object>();
            param.put("id", bomEx.getId());
            List<BomSupplierTO> bomSupplierTOList = bomExMapper.selectBomSupplier(param);

            bomEx.setBomSupplierList(bomSupplierTOList==null?new ArrayList<>():bomSupplierTOList);

            param.put("skuid", bomEx.getSkuid());
            List<BomTO> bomSkuInfoList = bomExMapper.selectSkuInfoList(param);

            bomEx.setBomSkuInfoList(bomSkuInfoList==null? new ArrayList<>() : bomSkuInfoList);

            param.put("offset", (bomEx.getPageNo()-1) * bomEx.getPageSize());
            param.put("pageSize",bomEx.getPageSize());
            List<BomLogTO> bomLogExList = bomLogExMapper.selectLogList(param);
            bomEx.setBomLogExList(bomLogExList);

            bomEx.setRowCount(bomLogExMapper.selectLogCount(bomEx.getSkuid()));
        }
        if(bomEx==null && skuid!=null){
            SkuBaseInfoTO skuBaseInfoTO =  itemService.getSkuBaseInfo(skuid);
            bomEx = new BomTO();
            bomEx.setSku(skuBaseInfoTO.getSku());
            bomEx.setSkuid(skuid);
            bomEx.setPurdesc(skuBaseInfoTO.getPurDesc());
            bomEx.setPurspec(skuBaseInfoTO.getPurSpec());
            bomEx.setBomOneSkuList(new ArrayList<>());
            bomEx.setBomTwoSkuList(new ArrayList<>());
            bomEx.setBomSupplierList(new ArrayList<>());
            bomEx.setBomSkuInfoList(new ArrayList<>());
        }
        return bomEx;
    }


    private List<BomTO> getBomSkuList(List<BomTO> bomExList){
        List<BomTO> result = new ArrayList<BomTO>();
        HashMap<String, Object> map = new HashMap<String, Object>();
        List<Integer> skuIdList = new ArrayList<Integer>();
        map.put("skuIdList", skuIdList);
        if(bomExList!=null && bomExList.size()>0){
            for (BomTO tempBom :bomExList) {
                skuIdList.add(tempBom.getSkuid());
            }
            result =  bomExMapper.selectSkuInfoBySKuid(map);
        }
        return result;

    }

    /**
     * 根据主sku批量生成包材
     * @remark savePackageList 方法的详细说明第一行
     * <p>savePackageList 方法的详细说明第二行</p>
     * @param skuId
     *         [skuId]
     * @param packageTOList
     *         [packageTOList]
     * @return void
     * @throws
     * @author: douglas.jiang
     * @date : 2017/9/28:14:38
     */
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public boolean savePackageList(int skuId, List<ImportPackageTO> packageTOList, SysSessionTO sessionTO){
        //查询sku信息
        SkuBaseInfoTO skuBaseInfoTO = itemService.getSkuBaseInfo(skuId);

        for (ImportPackageTO item : packageTOList) {
            skuBaseInfoTO.setPurSpec(item.getPurSpec());
            skuBaseInfoTO.setPurDesc(item.getPurDesc());
            skuBaseInfoTO.setSkuType(item.getSkuType());
            skuBaseInfoTO.setPurchaseProperty(item.getPurchaseProperty());
            skuBaseInfoTO.setBomDesc(item.getRemark());
            skuBaseInfoTO.setIsPackage(Constants.IsPackageSku.isPackage);
            skuBaseInfoTO.setSku("");
            skuBaseInfoTO.setPreSku("");
            skuBaseInfoTO.setSkuId(0);
            skuBaseInfoTO.setSessionTO(sessionTO);
            //插入新的sku信息
            PreSkuRelationTO relationTO =  prepareService.saveSkuBaseInfo(skuBaseInfoTO,false);
            //添加生成的包材和当前bom的关系
            ItemVirtual itemVirtual = new ItemVirtual();
            itemVirtual.setVirtualSkuid(skuId);
            itemVirtual.setActualSkuid(relationTO.getSkuId());
            itemVirtual.setQty((short) item.getQty());
            itemVirtualMapper.insert(itemVirtual);

        }
        return true;

    }


    /**
     * saveBomOneSkuList .保存第二层bom信息
     * @param skuId
     *         [skuId]
     * @param bomOneSkuTOList
     *         [bomOneSkuTOList]
     * @return boolean
     * @throws
     * @author: douglas.jiang
     * @date : 2017/10/13:16:05
     */
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public int saveBomOneSkuList(int skuId,List<BomOneSkuTO> bomOneSkuTOList){

         //验证是否超过三层
        ItemVirtualExample itemVirtualExample = new ItemVirtualExample();
        itemVirtualExample.createCriteria().andVirtualSkuidEqualTo(skuId);
        itemVirtualMapper.deleteByExample(itemVirtualExample);
        int result = 0;
        if(bomOneSkuTOList==null || bomOneSkuTOList.size()==0)
            return 0;
        for (BomOneSkuTO bomOneSkuTO : bomOneSkuTOList) {
            if(bomOneSkuTO.getRowState()==4)
                continue;
            ItemVirtual model = new ItemVirtual();
            model.setQty((short) bomOneSkuTO.getQty());
            model.setVirtualSkuid(skuId);
            model.setActualSkuid(bomOneSkuTO.getSkuid());
            itemVirtualMapper.insert(model);
            result++;
        }
        return  result;
    }


    /**
     * 方法的功能描述:TODO
     * @param [skuId ,目标skuId, bomOneSkuTOList]
     * @return boolean
     * @exception
     * @author: PXMWJCH
     * @since : 2017-10-17:23:59
     */
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public boolean checkBom(int skuId,String sku ,Integer bomId,List<BomOneSkuTO> bomOneSkuTOList){

        //校验bom skuid 是否存在
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("skuid", skuId);
        BomTO tempBom = bomExMapper.selectById(map);
        if(tempBom!=null && tempBom.getId()!=null && !tempBom.getId().equals(bomId)){
            throw new BusinessException("sku的BOM信息存在！");
        }
        //判断sku 是否是最底层
        int totallevelChild=0;
        int totalLevelParent=0;
        if(bomId!=null){
            //校验当前sku 是否输入最高级别
            totallevelChild = bomExMapper.selectTotalChild(skuId);//查询子级
            totalLevelParent =bomExMapper.selectTotalParent(skuId);//查询父级
            if(totallevelChild>0 && totalLevelParent>0){
                totallevelChild-=1;
            }
            if((totallevelChild+totalLevelParent)>3){
                throw new BusinessException("SKU:"+sku+"总层大于3层！");
            }
            if(totalLevelParent==3 && bomOneSkuTOList!=null && bomOneSkuTOList.size()>0){
                throw new BusinessException("SKU:"+sku+"总层大于3层！");
            }

            if(bomOneSkuTOList!=null && bomOneSkuTOList.size()>0){
                HashMap< String, Object> param = new HashMap<String, Object>();
                for (BomOneSkuTO tempBomEx  : bomOneSkuTOList) {
                    param.clear();
                    List<Integer> skuIdList = new ArrayList<Integer>();
                    skuIdList.add(tempBomEx.getSkuid());
                    param.put("skuIdList", skuIdList);
                    List<BomTO> oneSkuList =  bomExMapper.selectSkuInfoBySKuid(param);
                    if(oneSkuList!=null && oneSkuList.size()>0){
                        for (BomTO twoBom : oneSkuList) {
                            if(twoBom.getSkuid().equals(skuId)){
                                throw new BusinessException("SKU:"+tempBomEx.getSku()+"总层大于三层");
                            }
                        }
                    }
                    if(tempBomEx.getRowState() != Constants.RowStateType.DELETE){
                        this.checkSkuLevel(tempBomEx.getSkuid(),tempBomEx.getSku(),3,totalLevelParent,skuId);
                    }
                }
            }


        }else{
            totallevelChild = bomExMapper.selectTotalChild(skuId);//查询子级
            if(totallevelChild<3){
                if(bomOneSkuTOList!=null && bomOneSkuTOList.size()>0){
                    for (BomOneSkuTO tempBomEx  : bomOneSkuTOList) {
                        if(tempBomEx.getRowState() != Constants.RowStateType.DELETE){
                            this.checkSkuLevel(tempBomEx.getSkuid(),tempBomEx.getSku(),3,1,skuId);
                        }
                    }
                }
            }else{
                throw new BusinessException("SKU:"+sku+"总层大于3层！");
            }
        }
        return true;
    }

    /**
     *
     * @param skuid
     * @param sku
     * @param 'level不能超过层数'
     * @param 'hearLevel 主sku属于第几层'
     * @param 'isExRelation 是否与主sku存在关联'
     */
    public void checkSkuLevel(int skuid,String sku,int level,int headLevel,int parentSkuid){
        int totallevelChild = bomExMapper.selectTotalChild(skuid);//查询子级
        int totalLevelParent =bomExMapper.selectTotalParent(skuid);//查询父级

        if(totallevelChild>0&&totalLevelParent>0){
            totallevelChild-=1;
        }
        if(totallevelChild == 3 && totalLevelParent == 0 && headLevel == 0){//表示子sku 已经有三级并且没有父级。表示没有和当前的主sku 建立关系
            throw new UniteException("BOM二层SKU:"+sku+"大于二层！");
        }
        int totlLevel = totallevelChild +totalLevelParent;
        if(totallevelChild +totalLevelParent>level){
            throw new UniteException("BOM二层SKU:"+sku+"大于二层！");
        }
        if(totallevelChild>0){
            if(totlLevel==level &&headLevel==1){
                //查询父sku
                HashMap<String, Object> map = new HashMap<String, Object>();
                List<Integer> skuIdList = new ArrayList<Integer>();
                skuIdList.add(skuid);
                map.put("actualSkuList",skuIdList);
                List<BomTO> list =  bomExMapper.selectSkuInfoBySKuid(map);
                for (BomTO bomEX : list) {
                    if(bomEX.getVirtualSkuid() == parentSkuid ){
                        if(headLevel+totlLevel>level){
                            throw new UniteException("BOM二层SKU:"+sku+"大于二层！");
                        }
                    }
                }
            }else{
                if(headLevel+totlLevel>level){
                    throw new UniteException("BOM二层SKU:"+sku+"大于二层！");
                }
            }

        }
    }


}

