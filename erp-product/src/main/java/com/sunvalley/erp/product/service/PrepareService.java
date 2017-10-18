/*
* Copyright (c) 2017 sunvalley. All Rights Reserved.
*/
package com.sunvalley.erp.product.service;
import com.google.common.base.Strings;
import com.sunvalley.erp.common.component.filtersql.FilterModel;
import com.sunvalley.erp.common.constants.Constants;
import com.sunvalley.erp.common.component.filtersql.FilterOP;
import com.sunvalley.erp.common.exception.BusinessException;
import com.sunvalley.erp.common.exception.ParameterException;
import com.sunvalley.erp.common.util.TimeUtil;
import com.sunvalley.erp.product.daoEX.BomExMapper;
import com.sunvalley.erp.to.common.PagerTO;
import com.sunvalley.erp.to.product.*;
import com.sunvalley.erp.product.dao.*;
import com.sunvalley.erp.product.daoEX.ItemExMapper;
import com.sunvalley.erp.product.daoEX.PrepareSkuExMapper;
import com.sunvalley.erp.product.model.*;
import org.apache.commons.beanutils.PropertyUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import java.math.BigDecimal;
import java.util.*;

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
    private ItemTextLocaleMapper itemTextLocaleMapper;

    @Autowired
    private SequenceService sequenceService;

    @Autowired
    private BomMapper bomMapper;

    @Autowired
    private SkuDescriptionMapper skuDescriptionMapper;

    @Autowired
    private ItemLogService itemLogService;

    @Autowired
    private ItemAttrValueLocaleMapper itemAttrValueLocaleMapper;

    @Autowired
    private ItemService itemService;

    private static Logger logger = LoggerFactory.getLogger(PrepareService.class);


    //#endregion

    /**
     * getByModel .
     * @param modelName
     *         [modelName]
     * @param status
     *         [status]
     * @return com.sunvalley.to.erp.product.dto.PreSkuTO
     * @throws
     * @author: douglas.jiang
     * @date : 2017/9/14:16:23
     */

    public PreSkuTO getByModel(Integer modelId,String modelName, Integer status ){
        HashMap<String, Object> map = new HashMap<String, Object>();
        if(!Strings.isNullOrEmpty(modelName))
            map.put("model", modelName);

        if(modelId!=null && modelId>0)
            map.put("modelId", modelId);

        if(status == 0){
            map.put("status", null);
        }else{
            map.put("status", status);
        }

        List<PreSkuTO> list = prepareSkuExMapper.initByModel(map);
        if(list != null && list.size()>0){
            PreSkuTO vo = list.get(0);
            map.put("model_id", vo.getModelId());
            map.put("model",vo.getModel());
            List<PreSkuGridTO> preSkuList =  prepareSkuExMapper.preSkuGrid(map);

            List<PreSkuGridTO> preSkuVOList = new ArrayList<>(preSkuList.size());
            for (int i = 0; i < preSkuList.size(); i++) {
                PreSkuGridTO preSkuGridVO = new PreSkuGridTO();
                try {
                    PropertyUtils.copyProperties(preSkuGridVO, preSkuList.get(i));
                }catch (Exception ex){
                    throw  new BusinessException(ex.getMessage());
                }

                preSkuVOList.add(preSkuGridVO);
            }

            List<PackageSkuTO> packageSkuList = prepareSkuExMapper.packageSkuList(map);

            List<PackageSkuTO> packageSkuVOList = new ArrayList<>(packageSkuList.size());
            for (int i = 0; i < packageSkuList.size(); i++) {
                PackageSkuTO packageSkuVO = new PackageSkuTO();
                try {
                PropertyUtils.copyProperties(packageSkuVO, packageSkuList.get(i));
                }catch (Exception ex){
                    throw  new BusinessException(ex.getMessage());
                }
                packageSkuVOList.add(packageSkuVO);
            }
            vo.setPreSkuList(preSkuVOList);
            vo.setPackageSkuList(packageSkuVOList);
            return vo;
        }else{
            throw new BusinessException("请输入系统存在的Model号！");
        }
    }


    public SkuBaseInfoTO getPreSkuBaseInfo(Integer preSkuId, Integer modelId,Integer type){
        Map<String,Object> param = new HashMap<>();
        if(preSkuId>0){
            param.put("preskuId",preSkuId);
        }
       if(modelId>0){
           param.put("modelId",modelId);
       }
        SkuBaseInfoTO skuBaseInfoTO =  itemExMapper.getPreSkuBaseInfo(param);
        if(skuBaseInfoTO==null)
            return skuBaseInfoTO;

        if(type == Constants.IsPackageSku.isPackage){
            skuBaseInfoTO.setIsPackage(Constants.IsPackageSku.isPackage);
        }else{
            skuBaseInfoTO.setIsPackage(Constants.IsPackageSku.noPackage);
        }

        //默认为产品名称
        skuBaseInfoTO.setPurDesc(skuBaseInfoTO.getProductName());
        skuBaseInfoTO.setPurSpec(skuBaseInfoTO.getBrandDesc()+" " + skuBaseInfoTO.getModel()+" "+skuBaseInfoTO.getProductName());

        String colorStr ="";
        switch (skuBaseInfoTO.getColor()){
            case "1":
                colorStr="白色";
                break;
            case "2":
                colorStr="银色";
                break;
            case "3":
                colorStr="金色";
                break;
            case "4":
                colorStr="红色";
                break;
            case "5":
                colorStr="黄色";
                break;
            case "6":
                colorStr="蓝色";
                break;
            case "7":
                colorStr="紫色";
                break;
            case "8":
                colorStr="灰色";
                break;
            case "9":
                colorStr="其他";
                break;
                default:
                    colorStr="";
        }

        List<ItemLocaleTO> itemLocaleTOList  = new ArrayList<>();
        for (int i=1;i<=7;i++){
            ItemLocaleTO itemLocaleTO = new ItemLocaleTO();
            itemLocaleTO.setLangId(i);
            itemLocaleTO.setSku("");
            itemLocaleTO.setSkuid(0);
            itemLocaleTO.setUnitName("");
            String des= String.format("%s %s %s %s %s",skuBaseInfoTO.getBrandDesc(),skuBaseInfoTO.getModel(),
                    skuBaseInfoTO.getProductName(),skuBaseInfoTO.getAnruleStr(),colorStr);
            itemLocaleTO.setDescription(des);
            itemLocaleTOList.add(itemLocaleTO);
        }
      skuBaseInfoTO.setItemLocaleTOList(itemLocaleTOList);

        return skuBaseInfoTO;
    }



    /**
     * model&预备SKU列表查询.
     * @param filterModels
     * @return com.sunvalley.to.PagerTO<com.sunvalley.erp.to.product.ModelAndPreSkuTO>
     * @exception
     * @author:
     * @since : 2017-09-15:23:42
     */
    public PagerTO<ModelAndPreSkuTO> listModelAndPreSku(List<FilterModel> filterModels, int offset, int pageSize) {

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
            throw  new ParameterException(ex.getMessage());
        }

        map.put("filtersql", filtersql);
        map.put("offset", offset);
        map.put("pageSize", pageSize);
        PagerTO<ModelAndPreSkuTO> pager=new PagerTO<ModelAndPreSkuTO>();
        pager.setFilterSql(filtersql);
        pager.setPageNo(offset / pageSize+1);
        pager.setPageSize(pageSize);
        int rowCount= prepareSkuExMapper.countModelAndPreSku(map);
        pager.setRowCount(rowCount);
        List<ModelAndPreSkuTO> list=prepareSkuExMapper.listModelAndPreSku(map);
        pager.setList(list);
        return pager;
    }


    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public PreSkuTO saveModel(PreSkuTO prepareSkuEx){

        ItemModel model = new ItemModel();
        model.setBrandId(prepareSkuEx.getBrandId());
        model.setMainCategoryId(prepareSkuEx.getMainCategoryId());
        model.setSubCategoryId(prepareSkuEx.getSubCategoryId());
        model.setPmId(prepareSkuEx.getPmId());

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
                String modelName = sequenceService.generationNo(prepareSkuEx.getMainCategoryId(),prepareSkuEx.getSubCategoryId(), prepareSkuEx.getBrandId(), Constants.skuCodeType.modeCode, null, null);
                model.setModelName(modelName);
            }
            itemModelMapper.updateByPrimaryKeySelective(model);
        }else{
            String modelName = sequenceService.generationNo(prepareSkuEx.getMainCategoryId(),prepareSkuEx.getSubCategoryId(), prepareSkuEx.getBrandId(), Constants.skuCodeType.modeCode, null, null);
            model.setModelName(modelName);
            model.setCreateUser(prepareSkuEx.getSessionId());
            model.setCreateDate(TimeUtil.BeiJingTimeNow());
            itemModelMapper.insert(model);
            //todo:自动分配组织架构
           // adapteModelOrg(model);

            prepareSkuEx.setModelId(model.getModelId());
            prepareSkuEx.setModel(modelName);
        }
        savePreSkuAttr(prepareSkuEx);

        return  prepareSkuEx;

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
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public boolean updateSkuBaseInfo(SkuBaseInfoTO dto){

        beforeSaveItem(dto);

        //更新bs_item
        Item item = new Item();
        item.setSkuid(dto.getSkuId());
        item.setLen(dto.getLen());
        item.setWeight(dto.getWeight());
        item.setWidth(dto.getWidth());
        item.setHeight(dto.getHeight());
        item.setProductHeight(dto.getProductHeight());
        item.setProductLen(dto.getProductLen());
        item.setProductWeight(dto.getProductWeight());
        item.setProductWidth(dto.getProductWidth());
        item.setPurdesc(dto.getPurDesc());
        item.setPurspec(dto.getPurSpec());
        item.setLineState(dto.getLineState());
        item.setMagnetic(dto.getMagnetic());
        item.setCombineUnit(dto.getCombineUnit());
        item.setPurchaseProperty(dto.getPurchaseProperty());
        itemMapper.updateByPrimaryKeySelective(item);

        BomExample bomExample = new BomExample();
        bomExample.createCriteria().andSkuidEqualTo(dto.getSkuId());
        List<Bom> bomList =  bomMapper.selectByExample(bomExample);

        //如果没有bom信息，初始化bom信息
        if(bomList==null || bomList.size()==0){
            Bom bom = new Bom();
            bom.setBomDesc(dto.getBomDesc());
            bom.setCombineUnit(dto.getCombineUnit());
            bom.setCreateDate(TimeUtil.BeiJingTimeNow());
            bom.setCreateUserId(dto.getSessionTO().getUserId());
            bom.setPurchaseProperty(dto.getPurchaseProperty());
            bom.setSkuid(item.getSkuid());
            bom.setUpdateDate(TimeUtil.BeiJingTimeNow());
            bom.setUpdateUserId(dto.getSessionTO().getUserId());
            bomMapper.insert(bom);
        }else {
            Bom bom = new Bom();
            bom.setBomDesc(dto.getBomDesc());
            bom.setCombineUnit(dto.getCombineUnit());
            bom.setPurchaseProperty(dto.getPurchaseProperty());
            bomExample.createCriteria().andSkuidEqualTo(dto.getSkuId());
            bomMapper.updateByExampleSelective(bom,bomExample);
        }

        //更新bs_item_locale
        saveItemLocale(dto.getItemLocaleTOList());
        return true;
    }


    /**
     * updateSkuBaseInfo .sku转正.
     * @param dto
     *         [dto]
     * @return boolean
     * @throws
     * @author: douglas.jiang
     * @date : 2017/9/18:17:02
     */
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public PreSkuRelationTO saveSkuBaseInfo(SkuBaseInfoTO dto,boolean checkPreSku){

        if(checkPreSku){
            if(Strings.isNullOrEmpty(dto.getPreSku()))
                throw new ParameterException( "preSku不能为空！");

            //查询状态是否已转正
            Integer status =  prepareSkuExMapper.getStatusByPreSku(dto.getPreSku());

            if(status == null)
                throw new ParameterException( String.format("preSku %s 不存在！",dto.getPreSku()));

            if(status == 2)
                throw new ParameterException( String.format("preSku %s 已转正！",dto.getPreSku()));
        }


        PreSkuRelationTO result = new PreSkuRelationTO();
        beforeSaveItem(dto);
        // 在sku编码没有输入的情况下,系统根据类别自动产生编码
        if(Strings.isNullOrEmpty(dto.getSku())){
            String sku= sequenceService.generationNo(dto.getCategoryId(),dto.getSubCategortId(),null,
                    Constants.skuCodeType.skuCode,dto.getIsPackage(),null);
            dto.setSku(sku);
        }

        //更新bs_item
        Item item = new Item();
        item.setSku(dto.getSku());
        item.setLineState(dto.getLineState());
        item.setCategoryid(dto.getCategoryId());
        item.setSubcategoryid(dto.getSubCategortId());

        item.setModelId(dto.getModelId());
        item.setModel(dto.getModel());
        item.setBrandId(dto.getBrandId());

        item.setPmid(dto.getPmId());
        item.setBattery(dto.getBattery());

        item.setRmacategoryid(dto.getRmacategoryid());
        item.setRegion(dto.getRegion());


        item.setLen(dto.getLen());
        item.setWeight(dto.getWeight());
        item.setWidth(dto.getWidth());
        item.setHeight(dto.getHeight());
        item.setProductHeight(dto.getProductHeight());
        item.setProductLen(dto.getProductLen());
        item.setProductWeight(dto.getProductWeight());
        item.setProductWidth(dto.getProductWidth());

        item.setPurdesc(dto.getPurDesc());
        item.setPurspec(dto.getPurSpec());


        item.setMagnetic(dto.getMagnetic());

        item.setCreateUserId(dto.getSessionTO().getUserId());

        item.setSkuType((short)dto.getSkuType());

        item.setCreateDate(TimeUtil.BeiJingTimeNow());
        item.setUpdatedate(TimeUtil.BeiJingTimeNow());
        item.setIsPackage(dto.getIsPackage());
        item.setRemark(dto.getBomDesc());
        item.setPurchaseProperty(dto.getPurchaseProperty());
        item.setCombineUnit(dto.getCombineUnit());
        item.setColor(Strings.isNullOrEmpty(dto.getColor())?0:Integer.parseInt(dto.getColor()));

        //其他默认值
        item.setActive((short)1);
        item.setVolweight((short)-1);
        item.setIsdrop(false);
        item.setDropDef(false);
        item.setIsvirtual(0);
        item.setIssale(false);
        item.setZeroStock(false);
        item.setZeroWhid((short)0);
        item.setZeroQty((short)0);
        item.setBoxtype(0);
        item.setPeid(0);
        item.setIsoriginal(false);
        item.setSkulable("");
        item.setInnerskuId(0);
        item.setOuterskuId(0);
        item.setPkgrate((short)0);
        item.setPkgweight((short)0);
        item.setStandard(0);
        item.setVersionno((short)0);
        item.setUpdateuserid(dto.getSessionTO().getUserId());
        item.setHaspic(false);
        item.setPsid(0);
        item.setLeadtime(0);
        item.setPurpkg("");
        item.setStopkg("");
        item.setProFeatures("");
        item.setDescSourc("");
        item.setProductVolweight((short)-1);
        item.setPurchaserId(dto.getPurchaseProperty());
        itemMapper.insert(item);
        if(item.getSkuid()>0){
            dto.setSkuId(item.getSkuid());
            SkuDescription  description = new SkuDescription();
            description.setAction("create");
            description.setSkuid(item.getSkuid());
            description.setDescSourc(item.getDescSourc());
            description.setUpdatepicuser( dto.getSessionTO().getFirstName()+" "+ dto.getSessionTO().getLastName());
            description.setUpdatepicdate(new Date());
            skuDescriptionMapper.insert(description);


            for (ItemLocaleTO localeTO : dto.getItemLocaleTOList()) {
                localeTO.setSku(dto.getSku());
                localeTO.setSkuid(item.getSkuid());
            }

            saveItemLocale(dto.getItemLocaleTOList());  //多语言
            saveItemTextLocale(dto.getWarranty(),dto.getItemLocaleTOList()); //产品说明
            saveItemAttrValue(dto.getItemLocaleTOList()); // 保存属性


            if(item.getIsPackage() == 1){
                updatePreSkuStatus(item.getSkuid(),item.getSku(),dto.getPreSku()); //更新预备SKU信息

                if(!Strings.isNullOrEmpty(dto.getAnrule()) && !Strings.isNullOrEmpty(dto.getCountry())){
                    itemService.saveItemMapping(item.getSkuid(), dto.getAnrule(), dto.getCountry(),dto.getSessionTO().getUserId());
                }
               //添加SKU与安规、安国国家关系
            }

            //初始化bom记录
            Bom bom = new Bom();
            bom.setBomDesc(dto.getBomDesc());
            bom.setCombineUnit(dto.getCombineUnit());
            bom.setCreateDate(TimeUtil.BeiJingTimeNow());
            bom.setCreateUserId(dto.getSessionTO().getUserId());
            bom.setPurchaseProperty(dto.getPurchaseProperty());
            bom.setSkuid(item.getSkuid());
            bom.setUpdateDate(TimeUtil.BeiJingTimeNow());
            bom.setUpdateUserId(dto.getSessionTO().getUserId());
            bomMapper.insert(bom);

            result.setPreSku(dto.getPreSku());
            result.setPreSkuId(0);
            result.setSku(item.getSku());
            result.setSkuId(item.getSkuid());
        }

        return result;
    }

    public PreSkuRelationTO saveSkuBaseInfo(SkuBaseInfoTO dto){
        return saveSkuBaseInfo(dto,true);

    }



    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public void updatePreSkuStatus(int skuId,String sku,String preSku){
        //更新状态
        HashMap<String, Object> param = new HashMap<String, Object>();
        param.put("skuid", skuId);
        param.put("sku", sku);
        param.put("filtersql", " AND pre_sku = '"+preSku+"'");
        prepareSkuExMapper.updatePreSkuStatus(param);
    }

    private void beforeSaveItem(SkuBaseInfoTO item){
        if(item.getLen()==null)
            throw new ParameterException("PackeagedLen can not be empty!");
        if(item.getLen()<0||item.getLen()>32767)
            throw new ParameterException("PackeagedLen is out of range!");

        if(item.getWidth()==null)
            throw new ParameterException("PackeagedWidth can not be empty!");
        if(item.getWidth()<0||item.getWidth()>32767)
            throw new ParameterException("PackeagedWidth is out of range!");

        if(item.getHeight()==null)
            throw new ParameterException("PackeagedHeight can not be empty!");
        if(item.getHeight()==null || item.getHeight()<0||item.getHeight()>32767)
            throw new ParameterException("PackeagedHeight is out of range!");

        if(item.getWeight()==null)
            throw new ParameterException("PackeagedWeight can not be empty!");
        if( item.getWeight()<0||item.getWeight()>32767)
            throw new ParameterException("PackeagedWeight is out of range!");

        if(item.getProductLen()==null)
            throw new ParameterException("ProductLen can not be empty!");
        if(item.getProductLen()==null || item.getProductLen()<=0||item.getProductLen()>32767)
            throw new ParameterException("ProductLen is out of range!");

        if(item.getProductWidth()==null)
            throw new ParameterException("ProductWidth can not be empty!");
        if(item.getProductWidth()==null || item.getProductWidth()<=0||item.getProductWidth()>32767)
            throw new ParameterException("ProductWidth is out of range!");

        if(item.getProductHeight()==null)
            throw new ParameterException("ProductHeight can not be empty!");
        if(item.getProductHeight()<=0||item.getProductHeight()>32767)
            throw new ParameterException("ProductHeight is out of range!");

        if(item.getProductWeight()==null)
            throw new ParameterException("ProductWeight  can not be empty!");
        if(item.getProductWeight()<=0||item.getProductWeight()>32767)
            throw new ParameterException("ProductWeight is out of range!");
        // 判断内包装sku是否存在
//        if (item.getInnersku() != null && !item.getInnersku().trim().equals("")) {
//            Item innerItem = getByID(item.getInnersku());
//            if (innerItem == null) {
//                throw new FaceException("", "sku.noexistinnersku");
//            }
//            item.setInnersku_id(innerItem.getSkuid());
//        }
//        // 判断外包装sku是否存在
//        if (item.getOutersku() != null && !item.getOutersku().trim().equals("")) {
//            Item outerItem = getByID(item.getOutersku());
//            if (outerItem == null) {
//                throw new FaceException("", "sku.noexistoutsku");
//            }
//            item.setOutersku_id(outerItem.getSkuid());
//        }
    }



    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public void  saveSkuDescription(int skuId,String descSource,String cuser,String action){
        SkuDescription  description = new SkuDescription();
        description.setAction("create");
        description.setSkuid(skuId);
        description.setDescSourc(descSource);
        description.setUpdatepicuser(cuser);
        description.setUpdatepicdate(new Date());
        skuDescriptionMapper.insert(description);
    }


    /**
     * saveItemLocale .根据语言保存(更新)产品描述
     * @remark 存在则更新，不存在则插入
     * @param itemLocaleTOList
     *         [itemLocaleTOList]
     * @return void
     * @throws
     * @author: douglas.jiang
     * @date : 2017/9/22:11:25
     */
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public void saveItemLocale(List<ItemLocaleTO> itemLocaleTOList) {

        String desc_En = "";
        String unitName_En = "";
        for (ItemLocaleTO localeTO : itemLocaleTOList) {
            ItemLocale itemLocale = new ItemLocale();

            if(localeTO.getLangId() == Constants.Language.ENGLISH) {
                desc_En = localeTO.getDescription();
                unitName_En = localeTO.getUnitName();
            } else {
                if(Strings.isNullOrEmpty(localeTO.getDescription())) {
                    localeTO.setDescription(desc_En);
                }
                if(Strings.isNullOrEmpty(localeTO.getUnitName())) {
                    localeTO.setUnitName(unitName_En);
                }
            }

            itemLocale.setSkuid(localeTO.getSkuid());
            itemLocale.setLangId(localeTO.getLangId());
            itemLocale.setDescription(localeTO.getDescription());
            itemLocale.setUnitName(localeTO.getUnitName());

            ItemLocaleExample itemLocaleExample = new ItemLocaleExample();
            itemLocaleExample.createCriteria().andLangIdEqualTo(localeTO.getLangId()).andSkuidEqualTo(localeTO.getSkuid());
            List<ItemLocale> list = itemLocaleMapper.selectByExample(itemLocaleExample);
            if(list!=null && list.size()>0){
                itemLocaleMapper.updateByExampleSelective(itemLocale,itemLocaleExample);
            }else {
                itemLocale.setSku(localeTO.getSku());
                itemLocaleMapper.insert(itemLocale);
            }

        }
    }


    /**
     * saveItemTextLocale .根据语言保存(更新)产品说明
     * @remark 存在则更新，不存在则插入
     * @param warranty
     *         [warranty]
     * @param itemLocaleTOList
     *         [itemLocaleTOList]
     * @return void
     * @throws
     * @author: douglas.jiang
     * @date : 2017/9/22:11:43
     */
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public void  saveItemTextLocale(int warranty, List<ItemLocaleTO> itemLocaleTOList){

        for (ItemLocaleTO localeTO : itemLocaleTOList) {
            ItemTextLocale itemTextLocale = new ItemTextLocale();
            itemTextLocale.setLangId(localeTO.getLangId());
            itemTextLocale.setMetatile("");
            itemTextLocale.setMetakeyword("");
            itemTextLocale.setMetadesc("");
            itemTextLocale.setPartNumber("");
            itemTextLocale.setLaptopModel("");
            itemTextLocale.setSpecification("");
            itemTextLocale.setReview("");
            itemTextLocale.setPackagedesc("");
            itemTextLocale.setWarranty(String.valueOf(warranty));
            itemTextLocale.setSkuid(localeTO.getSkuid());
            itemTextLocale.setLangId(localeTO.getLangId());
            itemTextLocale.setFlag(false);


            ItemTextLocaleExample itemTextLocaleExample = new ItemTextLocaleExample();
            itemTextLocaleExample.createCriteria().andLangIdEqualTo(localeTO.getLangId()).andSkuidEqualTo(localeTO.getSkuid());
            List<ItemTextLocale> list = itemTextLocaleMapper.selectByExample(itemTextLocaleExample);
            if(list!=null && list.size()>0){
                itemTextLocaleMapper.updateByExampleSelective(itemTextLocale,itemTextLocaleExample);
            }else {
                itemTextLocaleMapper.insert(itemTextLocale);
            }
        }

    }




    /**
     * todo:保存产品多语言属性
     */
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public void saveItemAttrValue(List<ItemLocaleTO> itemLocaleTOList) {
//        for (ItemLocaleTO  item : itemLocaleTOList) { // 循环处理前端打包产品构造的虚拟对象用来保存产品多语言信息
//            List<ItemAttrValueLocale> list = itemLocaleVirtual.getAttrList();
//            for(ItemAttrValueLocale itemAttrValueLocale : list) { // 循环保存产品属性
//                itemAttrValueLocale.setSkuid(item.getSkuid());
//                itemAttrValueLocale  (itemLocaleVirtual.getLangId());
//
//                itemAttrValueLocaleMapper.insert()
//                itemAttrService.saveItemAttrValueLocale(itemAttrValueLocale);
//            }
//        }
    }


    /**
     *  保存预备sku的属性 （尺寸标准值、重量等）
     * @param
     */
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public void savePreSkuAttr(PreSkuTO prepareSkuEx){
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


}

