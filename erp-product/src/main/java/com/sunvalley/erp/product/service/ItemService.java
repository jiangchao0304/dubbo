/*
* Copyright (c) 2017 sunvalley. All Rights Reserved.
*/
package com.sunvalley.erp.product.service;
import com.sunvalley.erp.common.component.filtersql.FilterOP;
import com.sunvalley.erp.common.component.filtersql.FilterModel;
import com.sunvalley.erp.common.constants.Constants;
import com.sunvalley.erp.common.exception.BusinessException;
import com.sunvalley.erp.common.exception.ParameterException;
import com.sunvalley.erp.common.exception.UniteException;
import com.sunvalley.erp.common.util.TimeUtil;
import com.sunvalley.erp.product.dao.*;
import com.sunvalley.erp.product.daoEX.ItemCustomExMapper;
import com.sunvalley.erp.product.model.*;
import com.sunvalley.erp.product.modelEX.PreSkuRelation;
import com.sunvalley.erp.to.common.PagerTO;
import com.sunvalley.erp.to.product.*;
import com.sunvalley.erp.product.daoEX.ItemExMapper;
import org.apache.commons.beanutils.PropertyUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

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

    @Autowired
    private ItemMappingMapper itemMappingMapper;

    @Autowired
    private OrganizationMapper organizationMapper;

    @Autowired
    private OrganizationDetailMapper organizationDetailMapper;

    @Autowired
    private SalesPlanMapper salesPlanMapper;

    @Autowired
    private  SalesPlanSumMapper salesPlanSumMapper;

    @Autowired
    private  SalesPlanLockedDataMapper salesPlanLockedDataMapper;

    @Autowired
    private  SalesPlanCostMapper salesPlanCostMapper;

    @Autowired
    private ItemCustomExMapper itemCustomExMapper;

    @Autowired
    private ItemTextLocaleMapper itemTextLocaleMapper;

    @Autowired
    private  ItemRequirementsMapper itemRequirementsMapper;

    private static Logger logger = LoggerFactory.getLogger(PrepareService.class);


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

    public SkuSimpleInfoTO getSkuSimpleInfo(String sku,int langId,int companyId){

        Map<String, Object> param = new HashMap<String, Object>();
        param.put("sku", sku);
        param.put("langId", langId);

        if(companyId!= Constants.CompanyType.SUNVALLEY){
            //如果公司不是sunvalley,则查看的是dropship授权的sku
            param.put("isdrop", 1);
            param.put("sellerId", companyId);
        }

        return  itemExMapper.getSkuSimpleInfo(param);

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
                throw  new BusinessException(ex.getMessage());
            }

        }

        return result;

    }


    /**
     * saveSkuMarketInfo .更新review字段
     * @param SkuMarketInfoTO
     *         [itemLocaleReviewTOList]
     * @return void
     * @author: douglas.jiang
     * @date : 2017/10/10:16:24
     */
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public boolean saveSkuMarketInfo(SkuMarketInfoTO dto){

        if(dto.getSkuId()==null || dto.getSkuId()==0)
            throw  new  ParameterException("skuId不能为空!");

        int skuId = dto.getSkuId();
        for (ItemLocaleReviewTO localeTO : dto.getItemLocaleReviews()) {
            ItemTextLocaleExample itemTextLocaleExample = new ItemTextLocaleExample();
            itemTextLocaleExample.createCriteria().andLangIdEqualTo(localeTO.getLangId()).andSkuidEqualTo(skuId);
            List<ItemTextLocale> list = itemTextLocaleMapper.selectByExample(itemTextLocaleExample);
            if(list!=null && list.size()>0){
                ItemTextLocale itemTextLocale = list.get(0);
                itemTextLocale.setReview(localeTO.getReview());
                itemTextLocaleMapper.updateByExampleSelective(itemTextLocale,itemTextLocaleExample);
            }else {
                ItemTextLocale itemTextLocale = new ItemTextLocale();
                itemTextLocale.setSkuid(skuId);
                itemTextLocale.setLangId(localeTO.getLangId());
                itemTextLocale.setReview(localeTO.getReview());
                itemTextLocale.setFlag(false);
                itemTextLocale.setLaptopModel("");
                itemTextLocale.setMetadesc("");
                itemTextLocale.setMetakeyword("");
                itemTextLocale.setMetatile("");
                itemTextLocale.setPackagedesc("");
                itemTextLocale.setPartNumber("");
                itemTextLocale.setSpecification("");
                itemTextLocaleMapper.insert(itemTextLocale);
            }
        }


        for (ItemRequirementsTO item : dto.getItemRequirements()) {

             ItemRequirementsExample itemRequirementsExample = new ItemRequirementsExample();
             itemRequirementsExample.createCriteria().andSkuidEqualTo(skuId).andTypeIdEqualTo(item.getTypeId());
             List<ItemRequirements> list =  itemRequirementsMapper.selectByExample(itemRequirementsExample);
             if(list!=null && list.size()>0){
                 ItemRequirements model = list.get(0);
                 model.setProductReq(item.getProductReq());
                 model.setPurchaseReq(item.getPurchaseReq());
                 itemRequirementsMapper.updateByPrimaryKey(model);
             }else {
                 ItemRequirements model =  new ItemRequirements();
                 model.setCreateuserid(item.getCreateuserid());
                 model.setCreateDate(TimeUtil.BeiJingTimeNow());
                 model.setSkuid(skuId);
                 model.setNote(item.getNote());
                 model.setPurchaseReq(item.getPurchaseReq());
                 model.setProductReq(item.getProductReq());
                 model.setWarehouseReq(item.getWarehouseReq());
                 model.setTypeId(item.getTypeId());
                 itemRequirementsMapper.insert(model);
             }
        }

        return true;


    }

    /**
     * getSkuMarketInfo .查询sku市场资料
     * @param skuId
     *         [skuId]
     * @return com.sunvalley.erp.to.product.SkuMarketInfoTO
     * @throws
     * @author: douglas.jiang
     * @date : 2017/10/10:17:12
     */
    public SkuMarketInfoTO getSkuMarketInfo(int skuId){


        ItemTextLocaleExample itemTextLocaleExample = new ItemTextLocaleExample();
        itemTextLocaleExample.createCriteria().andSkuidEqualTo(skuId);
        List<ItemTextLocale> itemTextLocaleList = itemTextLocaleMapper.selectByExample(itemTextLocaleExample);
        ItemRequirementsExample itemRequirementsExample = new ItemRequirementsExample();
        itemRequirementsExample.createCriteria().andSkuidEqualTo(skuId);
        List<ItemRequirements> itemRequirementsList = itemRequirementsMapper.selectByExample(itemRequirementsExample);

        SkuMarketInfoTO result = new SkuMarketInfoTO();
        result.setSkuId(skuId);
         List<ItemLocaleReviewTO> itemLocaleReviews = new ArrayList<>();
         List<ItemRequirementsTO> itemRequirements = new ArrayList<>();

        for (ItemTextLocale item : itemTextLocaleList) {
            ItemLocaleReviewTO dto = new ItemLocaleReviewTO();
            dto.setLangId(item.getLangId());
            dto.setReview(item.getReview());
            itemLocaleReviews.add(dto);
        }

        for (ItemRequirements item : itemRequirementsList) {
            ItemRequirementsTO to = new ItemRequirementsTO();
            to.setCreateDate(item.getCreateDate());
            to.setCreateuserid(item.getCreateuserid());
            to.setId(item.getId());
            to.setTypeId(item.getTypeId());
            to.setNote(item.getNote());
            to.setProductReq(item.getProductReq());
            to.setWarehouseReq(item.getWarehouseReq());
            to.setSkuid(item.getSkuid());
            to.setPurchaseReq(item.getPurchaseReq());
            itemRequirements.add(to);
        }

        result.setItemLocaleReviews(itemLocaleReviews);
        result.setItemRequirements(itemRequirements);
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



    public PagerTO<SkuListNewTO> listskuListNew(List<FilterModel> filterModels, int langId,int offset, int pageSize) {
        String filtersql="";
        try {
            filtersql= new FilterOP().getFilterSQL(filterModels);
        }
        catch (Exception ex){
            throw  new ParameterException(ex.getMessage());
        }
        HashMap<String,Object> map= new HashMap<String,Object>();
        map.put("filtersql", filtersql);
        map.put("offset", offset);
        map.put("limit", pageSize);
        map.put("langId", langId);
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



    //添加SKU 与安规、安规国家信息
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public void saveItemMapping(int skuid, String attributeStr, String countryStr,int sessionId){
        HashMap<String, Object> map = new HashMap<String, Object>();
        ItemMappingExample itemMappingExample = new ItemMappingExample();
        itemMappingExample.createCriteria().andSkuidEqualTo(skuid).andDataOriginEqualTo(Constants.ItemMappingOrigin.sku);
        List<ItemMapping> lists = itemMappingMapper.selectByExample(itemMappingExample);//查询Maping表是否存在SKU
        PreSkuRelation preAndSkuEx= itemExMapper.getPreSkuRelation(skuid);
        //删除对应sku的安规和国家的关系
        itemMappingMapper.deleteByExample(itemMappingExample);
        //如果预备skuid 大于0，删除预备sku的安规和国家
        if(preAndSkuEx!=null && preAndSkuEx.getPreSkuId()>0){
            ItemMappingExample itemMappingExamples = new ItemMappingExample();
            itemMappingExamples.createCriteria().andSkuidEqualTo(preAndSkuEx.getPreSkuId()).andDataOriginEqualTo(Constants.ItemMappingOrigin.presku);
            itemMappingMapper.deleteByExample(itemMappingExamples);
        }
        //插入安规
        String[] attributeArray = attributeStr.split(",");
        ItemMapping itemMapping = null;
        ItemMapping preItemMapping = null;
        ItemBasicDataExample itemBasicDataExample = null;
        for (String attrubuteIdStr : attributeArray) {
            itemMapping = new ItemMapping();
            itemMapping.setSkuid(skuid);
            itemMapping.setMaping(attrubuteIdStr);
            itemMapping.setDataType(Constants.ItemMappingType.anrule);
            itemMapping.setDataOrigin(Constants.ItemMappingOrigin.sku);
            itemMapping.setCreateDate(new Date());
            itemMapping.setCreateUserId(sessionId);
            itemMappingMapper.insert(itemMapping);

            preItemMapping= new ItemMapping();
            preItemMapping.setSkuid(preAndSkuEx.getPreSkuId());
            preItemMapping.setMaping(attrubuteIdStr);
            preItemMapping.setDataType(Constants.ItemMappingType.anrule);
            preItemMapping.setDataOrigin(Constants.ItemMappingOrigin.presku);
            preItemMapping.setCreateDate(new Date());
            preItemMapping.setCreateUserId(sessionId);

            itemMappingMapper.insert(preItemMapping);
        }
        //插入国家
        String[] countryArray = countryStr.split(",");
        for (String countryCode : countryArray) {
            itemMapping = new ItemMapping();
            itemMapping.setSkuid(skuid);
            itemMapping.setMaping(countryCode);
            itemMapping.setDataType(Constants.ItemMappingType.country);
            itemMapping.setDataOrigin(Constants.ItemMappingOrigin.sku);
            itemMapping.setCreateDate(new Date());
            itemMapping.setCreateUserId(sessionId);
            itemMappingMapper.insert(itemMapping);

            preItemMapping= new ItemMapping();
            preItemMapping.setSkuid(preAndSkuEx.getPreSkuId());
            preItemMapping.setMaping(countryCode);
            preItemMapping.setDataType(Constants.ItemMappingType.country);
            preItemMapping.setDataOrigin(Constants.ItemMappingOrigin.presku);
            preItemMapping.setCreateDate(new Date());
            preItemMapping.setCreateUserId(sessionId);
            itemMappingMapper.insert(preItemMapping);
            updateOrgPresku(preAndSkuEx.getPreSku(),preAndSkuEx.getSku(),skuid, countryCode, 1,sessionId);
        }
        if(countryArray.length==0){//因为历史数据没有countryCode 所以代码要兼容
            updateOrgPresku(preAndSkuEx.getPreSku(),preAndSkuEx.getSku(),skuid, "", 2,sessionId);
        }
        updateSalesPlanSku(preAndSkuEx.getPreSku(),preAndSkuEx.getSku());
        updateLockAndBasic(preAndSkuEx.getPreSku(),preAndSkuEx.getSkuId(),preAndSkuEx.getSku());
    }



    /**
     * 更新组织架构中的预备sku为正式sku   增加组织架构备注  由XXX预备SKU转正为XXX   包括组织架构详情表
     * @param preSku
     */
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public void updateOrgPresku(String preSku,String sku, int skuId, String countryStr, int type,int sessionId){
        try {
            OrganizationExample orgEx = new OrganizationExample();
            List<Organization> list = null;
            if(preSku!=null){
                orgEx.createCriteria().andSkuEqualTo(preSku).andLevelIdEqualTo(5).andCountryCodeEqualTo(countryStr);
                list = organizationMapper.selectByExample(orgEx);
            }
            Organization organizations = null;
            if(list !=null && list.size()>0){
                organizations = list.get(0);
                organizations.setOrganizationName(sku+"_"+organizations.getCountryCode());
                organizations.setSku(sku);
                organizations.setStructureType(1);
                organizations.setRemark("由预备SKU【"+preSku+"】转正为【"+sku+"】");
                organizations.setSkuid(skuId);
                organizations.setSkuType(Constants.SkuType.SKU);   //设置sku为正式SKU
                organizationMapper.updateByPrimaryKey(organizations);

                OrganizationDetailExample orgDetailExample = new OrganizationDetailExample();
                orgDetailExample.createCriteria().andSkuEqualTo(preSku).andLevelIdEqualTo(5);
                List<OrganizationDetail> listDetails = organizationDetailMapper.selectByExample(orgDetailExample);
                if(listDetails != null && listDetails.size()>0){
                    for(OrganizationDetail orgDetail : listDetails){
                        orgDetail.setSku(sku);
                        orgDetail.setSkuid(skuId);

                        orgDetail.setSkuType(Constants.SkuType.SKU);
                        organizationDetailMapper.updateByPrimaryKey(orgDetail);
                    }
                }
            }else{
                //SKU与此国家没有组织架构关系就添加
                if(countryStr!="" && countryStr!=null){
                    orgEx.clear();
                    orgEx.createCriteria().andSkuEqualTo(sku).andLevelIdEqualTo(5).andCountryCodeEqualTo(countryStr);
                    list = organizationMapper.selectByExample(orgEx);
                    if(list==null || list.size()==0){
                        organizations = new Organization();
                        organizations.setOrganizationName(sku+"_"+countryStr);
                        organizations.setLevelId(5);
                        organizations.setCountryCode(countryStr);
                        organizations.setCreateDate(new Date());
                        organizations.setCreateUserId(sessionId);
                        organizations.setSku(sku);
                        organizations.setSkuid(skuId);
                        organizations.setSkuType(1);
                        organizationMapper.insert(organizations);
                    }
                }
            }

        } catch (Exception e) {
            logger.error("更新组织架构SKU["+preSku+"]出错！ "+e.getMessage());
            throw new UniteException("更新组织架构SKU["+preSku+"]出错！ "+e.getMessage());
        }
    }


    /**
     * 更新年度计划中BOTTOMUP的预备sku为正式sku
     * @param preSku
     */
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public void updateSalesPlanSku(String preSku,String sku){
        try {
            if(preSku!=null){
                SalesPlanExample salesplanEx = new SalesPlanExample();
                salesplanEx.createCriteria().andSkuEqualTo(preSku).andPlanTypeEqualTo(2);
                List<SalesPlan> list = salesPlanMapper.selectByExample(salesplanEx);
                if(list != null && list.size()>0){
                    for(SalesPlan sp : list){
                        sp.setSku(sku);
                        sp.setRemark("由预备SKU"+preSku+"转正为"+sku);
                        salesPlanMapper.updateByPrimaryKey(sp);
                    }
                }
                //更新销售目标计划sum表
                SalesPlanSumExample salesplansumEx = new SalesPlanSumExample();
                salesplansumEx.createCriteria().andSkuEqualTo(preSku);
                List<SalesPlanSum> listsum = salesPlanSumMapper.selectByExample(salesplansumEx);
                if(listsum != null && listsum.size()>0){
                    for(SalesPlanSum spsPlanSum : listsum){
                        spsPlanSum.setSku(sku);
                        salesPlanSumMapper.updateByPrimaryKey(spsPlanSum);
                    }
                }
            }
        } catch (Exception e) {
            throw new UniteException("更新年度目标计划BOTTON UP中SKU["+preSku+"]出错！");
        }
    }


    /**
     * 更新年度计划中的锁定数据  和基础数据    的sku    其中锁定数据直接更新    基础数据重新insert一条新SKU
     * @param preSku
     */
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public void updateLockAndBasic(String preSku,int skuId,String sku){
        if(preSku!=null){
            try {
                SalesPlanLockedDataExample spldEx = new SalesPlanLockedDataExample();

                spldEx.createCriteria().andSkuEqualTo(preSku);
                List<SalesPlanLockedData> list = salesPlanLockedDataMapper.selectByExample(spldEx);
                if(list != null && list.size()>0){
                    SalesPlanLockedData spld = new SalesPlanLockedData();
                    spld.setSku(sku);
                    salesPlanLockedDataMapper.updateByExampleSelective(spld, spldEx);
                }
            } catch (Exception e) {
                throw new UniteException("更新年度目标计划锁定数据SKU["+preSku+"]出错！");
            }


            try {
                SalesPlanCostExample spcEx = new SalesPlanCostExample();
                spcEx.createCriteria().andSkuEqualTo(preSku);
                List<SalesPlanCost> list = salesPlanCostMapper.selectByExample(spcEx);
                if(list !=null && list.size()>0){
                    SalesPlanCost spc = new SalesPlanCost();
                    spc.setSkuType(Constants.SkuType.SKU);
                    spc.setSku(sku);
                    spc.setSkuid(skuId);
                    salesPlanCostMapper.updateByExampleSelective(spc, spcEx);
                }
            } catch (Exception e) {
                throw new UniteException("更新年度目标计划基础数据SKU["+preSku+"]出错！");
            }
        }
    }


    /**
     * getCustomsInfo .按sku查询报关信息.
     * @remark getCustomsInfo 方法的详细说明第一行
     * <p>getCustomsInfo 方法的详细说明第二行</p>
     * @param skuId
     *         [sku]
     * @return com.sunvalley.erp.to.product.CustomsInfoTO
     * @throws
     * @author: douglas.jiang
     * @date : 2017/9/30:9:46
     */
    public CustomsInfoTO getCustomsInfo(int skuId){

        Map<String,Object> param = new HashMap<>();
        param.put("skuId",skuId);

        CustomsInfoTO result =  itemCustomExMapper.getCustomsInfo(param);

        return  result;

    }


    /**
     * listBySameModel 查询model相同的sku
     * @param skuId
     *         [skuId]
     * @return java.util.List<com.sunvalley.erp.to.product.SkuDescTO>
     * @throws
     * @author: douglas.jiang
     * @date : 2017/10/9:17:42
     */
    public List<SkuDescTO> listBySameModel(int skuId){

        return itemExMapper.listBySameModel(skuId);
    }

    /**
     * copyVirtualFromSku .复制bom属性
     * @param sourceSku
     *         [sourceSku]
     * @param targetSkuId
     *         [targetSkuId]
     * @return int
     * @throws
     * @author: douglas.jiang
     * @date : 2017/10/9:17:41
     */

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public int copyVirtualFromSku(String sourceSku,int targetSkuId) {

        Map<String, Object> param = new HashMap<>();
        param.put("sku", sourceSku);
        param.put("skuid", targetSkuId);
        return itemExMapper.copyVirtualFromSku(param);
    }

    public List<SkuDescTO> listBySameModel(String sku){
        return itemExMapper.listBySameModel(sku);

    }

}

