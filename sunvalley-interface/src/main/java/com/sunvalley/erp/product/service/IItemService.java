package com.sunvalley.erp.product.service;

import java.io.OutputStream;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sunvalley.erp.framework.entity.FilterModel;
import com.sunvalley.erp.framework.entity.Pager;
import com.sunvalley.erp.framework.service.IBaseService;
import com.sunvalley.erp.model.restock.RestockBasePrice;
import com.sunvalley.erp.product.pojos.Item;
import com.sunvalley.erp.product.pojos.ItemAttrValue;
import com.sunvalley.erp.product.pojos.ItemBrand;
import com.sunvalley.erp.product.pojos.ItemExport;
import com.sunvalley.erp.product.pojos.ItemLocale;
import com.sunvalley.erp.product.pojos.ItemLocaleVirtual;
import com.sunvalley.erp.product.pojos.ItemWarehouse;
import com.sunvalley.scm.stockin.pojos.InvAdjustMode;

/**
 * 产品控制层接口
 * @author lufangzong
 * @version 1.0
 * @date 2010-03-23
 */

@SuppressWarnings("rawtypes")
public interface IItemService extends IBaseService<Item, Item>{
	
	
	public void beforeSaveItem(Item item) throws Exception; 
	public void saveItemAdapter(Item item) throws Exception;
	public void afterSaveItem(Item item) throws Exception;
	public void saveProductLine(int categoryid,int subCategoryId,int skuid) throws Exception;
	/**
	 * 判断sku是否存在
	 * @param sku
	 * @return
	 */
	public boolean isExist(String sku);
	
	/**
	 * 添加产品
	 * @param item 产品对象
	 * @return 是否插入成功
	 */
	public Item add(Item item) throws Exception;
	
	/**
	 * 导入sku数据
	 * @param entityMapList
	 * @param categoryid
	 * @param lang_id
	 * @throws Exception
	 */
	public int importSku1(List<Map<String,Object>> entityMapList, int categoryid, byte lang_id) throws Exception;
	
	/**
	 * 修改产品是否drop
	 * @param skuid
	 * @param isdrop
	 * @return
	 * @throws Exception 
	 */
	public int updateIsDrop(int skuid, byte isdrop) throws Exception;
	
	/**
	 * 修改产品状态
	 * @param skuid
	 * @param line_state
	 * @return
	 * @throws Exception 
	 */
	public int updateState(int skuid, byte line_state) throws Exception;
	
	/**
	 * 修改是否有图片
	 * @param sku
	 * @param line_state
	 * @return
	 */
	public int updateHasPic(String sku, byte haspic);
	
	/**
	 * 修改采购员id
	 * @param skuid
	 * @param purchaser_id
	 * @return
	 * @throws Exception 
	 */
	public int updatePurchaserId(int skuid, int purchaser_id) throws Exception;
	
	/**
	 * 修改图片修改记录
	 * @param sku
	 * @param line_state
	 * @return
	 */
	public int updatePicUpdate(String sku, String updatepicuser, Date updatepicdate);
	
	/**
	 * 根据编号删除产品
	 * @param skuid
	 * @return
	 */
	public void deleteSku(int skuid);
	
	/**
	 * 根据编号获取对象
	 * @param skuid
	 * @return
	 */
	public Item getItem(int skuid);
	
	/**
	 * 根据编号获取对象
	 * @param skuid
	 * @return
	 */
	public Item getItem(String sku);
	
	/**
	 * 编辑产品
	 * @param item
	 * @return 是否插入成功
	 * @throws Exception
	 */
	public Item edit(Item item) throws Exception;
	
	public Item getItemBySku(String sku);

	/**
	 * 保存产品多语言描述
	 * @param itemLocale
	 * @return
	 * @throws Exception
	 */
	public int saveLocale(ItemLocale itemLocale);
	
	/**
	 * 自动搜索sku编码
	 * @param sku
	 * @param langId
	 * @return
	 */
	public List<ItemLocale> searchSku(String sku, int langId,int limit);
	
	

	/**
	 * 自动搜索SKU带出报关型号
	 * @param sku
	 * @return
	 */
	public List<ItemLocale> searchCustomModel(String sku,int limit);
	
	/**
	 * 自动搜索盒子箱子sku编码
	 * @param sku
	 * @param langId
	 * @param category sku的类型为箱子盒子信封的
	 * @return
	 */
	public List<ItemLocale> searchBoxSku(String sku, int langId, int[] category);
	
	/**
	 * 通过sku获取sku的描述
	 * @param sku
	 * @param langId
	 * @return
	 */
	public ItemLocale getSkuBySku(String sku, int langId);
	
	/**
	 * 根据sku编号获得对象
	 * @param skuId
	 * @param langId
	 * @return
	 */
	public ItemLocale getSkuById(int skuid, int langId);
	
	/**
	 * 产品列表查询
	 * @param filterSql
	 * @param page
	 * @param pageSize
	 * @return
	 */
	public Pager<Item> getSkuPageList(Map<String, Object> param, int page, int pageSize, String ordersql);
	
	/**
	 * sku库存数据导出列表
	 * @param filterSql
	 * @param wh_id
	 * @param seller_id
	 * @param stock
	 * @return
	 */
	public List<Item> getSkuInvExportList(Map<String, Object> parameter);
	
	/**
	 * 获取item导出列表
	 * @param filterSql
	 * @param wh_id
	 * @param stock
	 * @param lang_id
	 * @param baseinfo 导出基本信息
	 * @param purchasinfo 导出采购信息
	 * @param bigproperty 导出大文本字段
	 * @param attrinfo 导出属性
	 * @return
	 */
	public List<ItemExport> getItemExportList(String filterSql, int wh_id, short stock,short onroad, byte lang_id, int baseinfo, int purchasinfo, int bigproperty, int attrinfo);
	
	/**
	 * 查询产品的物理信息，包括长宽高，重量及材积重等
	 * @author Cheng Liangwei on 2010-03-27
	 * @param int skuid 产品SKUID
	 * @param int wh_id,所在的仓库
	 * @return Item Sku的信息实体
	 * */
	public Item getSizeInfo(int skuid,int wh_id,String sku);
	
	/**
	 * @author simon.cheng 2011-08-10
	 * 批量查询产品的长宽高重量信息
	 * */
	public String getItemSizeInfo(String token, String skus, int wh_id);
	
	/**
	 * 判断是否是虚拟sku
	 * @param skuid
	 * @return
	 */
	public boolean isVirtual(int skuid);
	
	/**
	 * 修改产品品牌型号
	 * @param skuid
	 * @param lang_id
	 * @param laptop_model
	 * @return
	 */
	public int updateLaptopmodel(int skuid, int lang_id, String laptop_model);
	
	/**
	 * 获取产品属性值列表
	 * @param sku
	 * @param lang_id
	 * @return
	 */
	public List<ItemAttrValue> getItemAttrValueById(String sku, int lang_id, int category);
	
	/**
	 * 修改产品属性，比如：length width height weight
	 * @param param
	 * @return
	 */
	public int updateAttr(Map<String, Object> param);
	
	/**
	 * 查询当前语言状态下的SKU列表（包括skuid,description,sku三个信息）
	 * @author Cheng Liangwei
	 * @date 2010-04-18
	 * @version 1.0
	 * @return List<Item> 产品列表
	 * */
	public List<Item> getAllItemByLocale();
	
	/**
	 * 多语言翻译时查询多语言数据
	 * @param skuid
	 * @param lang_id
	 * @return
	 */
	public ItemLocaleVirtual getMultiLang(int skuid, byte lang_id);

	public ItemLocaleVirtual getSKUforPrOrder(String sku, int langId);
	
	
	/**
	 * @author hileen jiangzg on 2010-05-11
	 * @param Item
	 * @return 
	 * */
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public Item saveRequestitem(Item request) throws Exception;
	
	/**
	 * 获取sku修改图片的用户与日期
	 * @param sku
	 * @return
	 */
	public Map<String, Object> getUpatePicUserDate(String sku);
	
	/**
	 * 模糊搜索sku编码列表
	 * @param sku
	 * @return
	 */
	public List<String> getSkuCode(String filtersql);
	
	/**
	 * 模糊搜索filtersql编号列表
	 * @param filtersql
	 * @return
	 */
	public List<Integer> getSkuId(String filtersql);
	
	/**
	 * ebay ca数据
	 * @param param
	 * @return
	 */
	public List<Item> getCAList(Map<String, Object> parameter);
	
	/**
	 * 所有sku的skuid,sku
	 * @return
	 */
	public List<Item> getAllSku();
	
	/**
	 * 针对sku filter菜单，取出字段单独分析获取sql by wangweidong
	 */
	public String getValidFieldsSQL(List<FilterModel> list)throws Exception;
	
	public String getValidFilterSQL(List<FilterModel> list, String fields, int flag)throws Exception;
	
	/**
	 * filterSql的page查询
	 */
	public Pager<Map> getSkuAndCategoryPage(String filterSql,
			                                String filterItemLocale, 
			                                String filterItemTextLocale,
			                                String pageNo,
			                                String pageSize);
	public List<Map> setAttribute(List<Map> paramList,int whId,String path);
	/**
	 * skufilter导出
	 */
	public String getExportFile(String filtersql,
			                    String filterItemLocale, 
                                String filterItemTextLocale,
                                int whId,
                                String path) throws Exception;
	
	/**
	 * skufilter导出
	 * added by jerry on 2011.03.17
	 */
	public void getSkuFilterExportFile(OutputStream os,
			                             String filtersql,
			                    	     String filterItemLocale, 
                                         String filterItemTextLocale,
                                         int whId,
                                         String path,
                                         int flag) throws Exception;
	
	public Item getItemLikeSku(String sku);
	
	/**
	 * 保存产品跟仓库相关的属性
	 * @param itemWarehouse
	 * @return
	 * @throws Exception 
	 */
	public int saveItemWarehouse(ItemWarehouse itemWarehouse) throws Exception;
	
	public ItemWarehouse getItemWarehouse(int skuid, int wh_id);
	
	public Pager<ItemWarehouse> getItemWarehousePage(String filterSql, int page, int pageSize, Map<String, Object> param);
	
	public void getSkuDescription( Item item) throws Exception ;	
	
	/**
	 * 通过SKU查询产品的包装信息
	 * @author simon.cheng 2010.12.30
	 * @param sku(String)指定的SKU
	 * @return Map<String,Object> 返回的SKU包装信息
	 * */
	public Map<String,Object> getSkuPurInfo(String sku);
	
	/**
	 * 通过SKU查询SKU信息
	 */
	public Item getItemMoreBySku(String sku);

	public List<Item> searchRequestSku(String sku, int request_id);

	public List<Item> getSkuListQtyDetailList(Map<String, Object> param);

	public List<Item> getSkuListShipmentDetailList(Map<String, Object> param);

	public List<Item> getSkuListBookDetailList(Map<String, Object> param);
	
	
	public String itemsBatchPicture(String token,String sku,int seller_id);
	
	public String itemPicture(String token,String sku,int seller_id);
	/**
	 * 查询产品的供应商信息
	 * @Author Jack.Zhou  
	 * @Date 2011-12-29
	 */
	public void getSkuVendor(Item item);
	
	public List<InvAdjustMode> completeSKUInfo(Map<String, List<String>> param);
	public List<ItemBrand> getItemBrandList(Map<String, Object> param) throws Exception;
	public List<Item> findSkuFirstTwo();
	public List<RestockBasePrice> getBaseMcPrice(int sellerId,int skuid,int whid) throws Exception;
	public ItemLocale getSkuBySkuCategoryName(String sku, int langId);
	public List<ItemLocale> searchSkuCategoryName(String sku, int langId, int limit);
	public void saveItemMapping(int skuid, String attributeStr,String countryStr) throws ParseException, Exception;
	public Pager<Item> selectModelBySKU(Map<String, Object> param,int pageNo,int pageSize) ;
}
