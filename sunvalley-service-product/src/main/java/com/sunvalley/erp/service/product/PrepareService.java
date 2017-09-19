/*
* Copyright (c) 2017 sunvalley. All Rights Reserved.
*/
package com.sunvalley.erp.service.product;
import com.sunvalley.common.constants.Constants;
import com.sunvalley.common.util.FilterOP;
import com.sunvalley.common.util.TimeUtil;
import com.sunvalley.domain.FilterModel;
import com.sunvalley.domain.Pager;
import com.sunvalley.domain.erp.product.dto.*;
import com.sunvalley.erp.dao.product.*;
import com.sunvalley.erp.daoEX.product.ItemExMapper;
import com.sunvalley.erp.daoEX.product.PrepareSkuExMapper;
import com.sunvalley.erp.model.product.*;
import com.sunvalley.face.exception.FaceException;
import org.apache.commons.beanutils.DynaBean;
import org.apache.commons.beanutils.PropertyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 类或方法的功能描述 :TODO
 *
 * @Author: douglas.jiang
 * @Date: 2017-09-13 12:26
 */
@Service
public class PrepareService {

    //#region Autowired
    @Autowired
    private PrepareSkuExMapper prepareSkuExMapper;

    @Autowired
    private ItemModelMapper itemModelMapper;

    @Autowired
    private ProductLineMapper productLineMapper;

    @Autowired
    private PrepareSkuMapper prepareSkuMapper;

    @Autowired
    private ItemMapper itemMapper;

    @Autowired
    private ItemExMapper itemExMapper;

    @Autowired
    private ItemBrandMapper itemBrandMapper;

    @Autowired
    private ItemPreCommomMapper itemPreCommomMapper;

    @Autowired
    private ItemLocaleMapper itemLocaleMapper;

    @Autowired
    private SequenceService sequenceService;
    //#endregion

    /**
     * getByModel .
     * @param modelName
     *         [modelName]
     * @param status
     *         [status]
     * @return com.sunvalley.domain.erp.product.dto.PreSkuDTO
     * @throws
     * @author: douglas.jiang
     * @date : 2017/9/14:16:23
     */

    public PreSkuDTO getByModel(String modelName, Integer status ){
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("model", modelName);
        if(status == 0){
            map.put("status", null);
        }else{
            map.put("status", status);
        }

        List<PreSkuDTO> list = prepareSkuExMapper.initByModel(map);
        if(list != null && list.size()>0){
            PreSkuDTO vo = list.get(0);
            map.put("model_id", vo.getModelId());
            List<PreSkuGridDTO> preSkuList =  prepareSkuExMapper.preSkuGrid(map);

            List<PreSkuGridDTO> preSkuVOList = new ArrayList<>(preSkuList.size());
            for (int i = 0; i < preSkuList.size(); i++) {
                PreSkuGridDTO preSkuGridVO = new PreSkuGridDTO();
                try {
                    PropertyUtils.copyProperties(preSkuGridVO, preSkuList.get(i));
                }catch (Exception ex){
                    throw  new FaceException(ex.getMessage());
                }

                preSkuVOList.add(preSkuGridVO);
            }

            List<PackageSkuDTO> packageSkuList = prepareSkuExMapper.packageSkuList(map);

            List<PackageSkuDTO> packageSkuVOList = new ArrayList<>(packageSkuList.size());
            for (int i = 0; i < packageSkuList.size(); i++) {
                PackageSkuDTO packageSkuVO = new PackageSkuDTO();
                try {
                PropertyUtils.copyProperties(packageSkuVO, packageSkuList.get(i));
                }catch (Exception ex){
                    throw  new FaceException(ex.getMessage());
                }
                packageSkuVOList.add(packageSkuVO);
            }
            vo.setPreSkuList(preSkuVOList);
            vo.setPackageSkuList(packageSkuVOList);
            return vo;
        }else{
            throw new FaceException("请输入系统存在的Model号！");
        }
    }



    /**
     * model&预备SKU列表查询.
     * @param filterModels
     * @return com.sunvalley.domain.Pager<com.sunvalley.erp.domain.product.dto.ModelAndPreSkuDTO>
     * @exception
     * @author:
     * @since : 2017-09-15:23:42
     */
    public Pager<ModelAndPreSkuDTO> listModelAndPreSku(List<FilterModel> filterModels, int offset, int pageSize) {
        HashMap<String,Object> map= new HashMap<String,Object>();
        String filtersql = "";
        String[] ListArray={};
        List<FilterModel> removeFileModelList = new ArrayList<FilterModel>();
        for(FilterModel filterModel: filterModels){
            if(filterModel.getFiled().equals("mapping.maping")){//安规适用国家
                removeFileModelList.add(filterModel);
                String modelList=filterModel.getValue();
                modelList = modelList.replace(" ",",").replace("，", ",").replace(";", ",").replace("；", ",").replace("\n", ",").replace("\t", ",").replace("\r\n", ",");
                ListArray=modelList.split(",");
                if(modelList!=null &&!modelList.equals("")&& ListArray.length!=0){
                    int count=0;
                    String filter="";
                    for(int j=0; j<ListArray.length;j++){
                        if(ListArray[j]!=null&& !ListArray[j].equals("")&&ListArray[j].length()!=0){
                            if(count==0){
                                filter= " and "+filterModel.getFiled()+" "+filterModel.getOper()+" "+"(" +"'"+ListArray[j]+"'";
                            }else{
                                filter=filter+","+"'"+ListArray[j]+"'";
                            }
                            count++;
                        }
                    }
                    filter=filter+")";
                    filtersql+=filter;
                    map.put("filsql", filter);

                }

            }
            if(filterModel.getFiled().equals("maping.maping")){//安规
                removeFileModelList.add(filterModel);
                String filter=" and "+filterModel.getFiled()+" "+filterModel.getOper()+"("+filterModel.getValue()+")";
                //String filter =new FilterOP().getFilterSQL(removeFileModelList);
                map.put("sql",filter);
                filtersql+=filter;
            }
        }
        for(FilterModel filter :removeFileModelList){
            filterModels.remove(filter);
        }
        try {
            filtersql= new FilterOP().getFilterSQL(filterModels);
        }catch (Exception ex){
            throw  new FaceException(ex.getMessage());
        }

        map.put("filtersql", filtersql);
        map.put("offset", offset);
        map.put("pageSize", pageSize);
        Pager<ModelAndPreSkuDTO> pager=new Pager<ModelAndPreSkuDTO>();
        pager.setFilterSql(filtersql);
        pager.setPageNo(offset / pageSize+1);
        pager.setPageSize(pageSize);
        int rowCount= prepareSkuExMapper.countModelAndPreSku(map);
        pager.setRowCount(rowCount);
        List<ModelAndPreSkuDTO> list=prepareSkuExMapper.listModelAndPreSku(map);
        pager.setList(list);
        return pager;
    }


    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public PreSkuDTO saveModel(PreSkuDTO prepareSkuEx){

        ItemModel model = new ItemModel();
        model.setBrandId(prepareSkuEx.getBrandId());
        model.setMainCategoryId(prepareSkuEx.getMainCategoryId());
        model.setSubCategoryId(prepareSkuEx.getSubCategoryId());
        model.setPmId(prepareSkuEx.getPmId());
        model.setCreateUser(prepareSkuEx.getSessionId());
        model.setCreateDate(TimeUtil.BeiJingTimeNow());
        model.setRemark(prepareSkuEx.getRemark());
        model.setBattery(prepareSkuEx.getBattery());
        model.setWarranty(prepareSkuEx.getWarranty());
        model.setRmacategoryid(prepareSkuEx.getRmacategoryid());
        model.setMagnetic(prepareSkuEx.getMagnetic());
        model.setUpdateDate(TimeUtil.BeiJingTimeNow());
        model.setUpdateUser(prepareSkuEx.getSessionId());
        if(!"".equals(prepareSkuEx.getModelId()) && null != prepareSkuEx.getModelId()){
            model.setModelId(prepareSkuEx.getModelId());
            model.setModelName(prepareSkuEx.getModel());
            ItemModel itemModel = itemModelMapper.selectByPrimaryKey(prepareSkuEx.getModelId());
            if(!prepareSkuEx.getMainCategoryId().equals(itemModel.getMainCategoryId()) ||
                    !prepareSkuEx.getSubCategoryId().equals(itemModel.getSubCategoryId())){
                String modelName = this.generationNo(prepareSkuEx.getMainCategoryId(),prepareSkuEx.getSubCategoryId(), prepareSkuEx.getBrandId(), Constants.skuCodeType.modeCode, null, null);
                model.setModelName(modelName);
            }
            itemModelMapper.updateByPrimaryKey(model);
        }else{
            String modelName = this.generationNo(prepareSkuEx.getMainCategoryId(),prepareSkuEx.getSubCategoryId(), prepareSkuEx.getBrandId(), Constants.skuCodeType.modeCode, null, null);
            model.setModelName(modelName);
            itemModelMapper.insert(model);
            //todo:自动分配组织架构
           // adapteModelOrg(model);

            prepareSkuEx.setModelId(model.getModelId());
            prepareSkuEx.setModel(modelName);
        }
        savePreSkuAttr(prepareSkuEx);

        return  prepareSkuEx;

    }

    public SkuBaseInfoDTO getSkuBaseInfo(int skuId){

        Map<String,Object> param = new HashMap<>();
        param.put("skuId",skuId);

        SkuBaseInfoDTO skuBaseInfoDTO =  itemExMapper.getSkuBaseInfo(param);
        if(skuBaseInfoDTO!=null){
            List<ItemLocaleDTO> itemLocaleDTOList =listItemLocale(skuBaseInfoDTO.getSkuId());
            skuBaseInfoDTO.setItemLocaleDTOList(itemLocaleDTOList);
        }
        return skuBaseInfoDTO;

    }

    public SkuBaseInfoDTO getSkuBaseInfo(String sku){
        Map<String,Object> param = new HashMap<>();
        param.put("sku",sku);
        SkuBaseInfoDTO skuBaseInfoDTO =  itemExMapper.getSkuBaseInfo(param);

        if(skuBaseInfoDTO!=null){
            List<ItemLocaleDTO> itemLocaleDTOList =listItemLocale(skuBaseInfoDTO.getSkuId());
            skuBaseInfoDTO.setItemLocaleDTOList(itemLocaleDTOList);

        }
        return skuBaseInfoDTO;

    }

    /**
     * updateSkuBaseInfo .更新sku基本信息
     * @param dto
     *         [dto]
     * @return boolean
     * @throws
     * @author: douglas.jiang
     * @date : 2017/9/18:17:02
     */
    public boolean updateSkuBaseInfo(UpdateSkuBaseInfoDTO dto){

        //更新磁性字段

        Item item = new Item();
        item.setSkuid(dto.getSkuId());
        item.setMagnetic(dto.getMagnetic());

        ItemExample itemExample = new ItemExample();
        itemExample.createCriteria().andSkuidEqualTo(dto.getSkuId());
        return  itemMapper.updateByExampleSelective(item,itemExample)>0;

    }

    public  List<ItemLocaleDTO> listItemLocale(int skuid){

        List<ItemLocaleDTO> result = new ArrayList<>();
        ItemLocaleExample  itemLocaleExample = new ItemLocaleExample();
        itemLocaleExample.createCriteria().andSkuidEqualTo(skuid);
        List<ItemLocale>  itemLocaleList =  itemLocaleMapper.selectByExample(itemLocaleExample);

        if(itemLocaleList==null || itemLocaleList.size()==0)
            return result;


        for (ItemLocale itemLocale : itemLocaleList) {

            ItemLocaleDTO dto = new ItemLocaleDTO();
            try {
                PropertyUtils.copyProperties(dto, itemLocale);
                result.add(dto);
            }catch (Exception ex){
                throw  new FaceException(ex.getMessage());
            }

        }

        return result;

    }


    /**
     *  保存预备sku的属性 （尺寸标准值、重量等）
     * @param
     */
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public void savePreSkuAttr(PreSkuDTO prepareSkuEx){
        ItemPreCommomExample preCommon = new ItemPreCommomExample();
        preCommon.createCriteria().andModelIdEqualTo(prepareSkuEx.getModelId());
        List<ItemPreCommom> list = itemPreCommomMapper.selectByExample(preCommon);
        //存在则更新，不存在则插入
        ItemPreCommom itemCommon = new ItemPreCommom();
        itemCommon.setModelId(prepareSkuEx.getModelId());
        //itemCommon.setCustomName(prepareSkuEx.getCustomName());
        itemCommon.setSaleDept(prepareSkuEx.getSaleDept());
        itemCommon.setStandardSize(prepareSkuEx.getStandardSize());
        itemCommon.setWeight(new BigDecimal(prepareSkuEx.getWeight()));
        itemCommon.setShippingType(Integer.parseInt(prepareSkuEx.getShippingType()));
        itemCommon.setMc(prepareSkuEx.getMc());
        itemCommon.setSalePrice(prepareSkuEx.getSalePrice());
        itemCommon.setSetupDate(prepareSkuEx.getSetupDate());
        if(list != null && list.size()>0){
            itemCommon.setId(list.get(0).getId());
            itemCommon.setUpdateDate(TimeUtil.BeiJingTimeNow());
            itemCommon.setUpdateUserId(prepareSkuEx.getSessionId());
            itemPreCommomMapper.updateByPrimaryKey(itemCommon);
        }else{
            itemCommon.setCreateUserId(prepareSkuEx.getSessionId());
            itemCommon.setCreateDate(TimeUtil.BeiJingTimeNow());
            itemPreCommomMapper.insert(itemCommon);
        }
    };



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
        if(type==Constants.skuCodeType.skuCode){//sku生产规则
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

