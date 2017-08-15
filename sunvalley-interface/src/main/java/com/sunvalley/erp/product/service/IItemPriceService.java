package com.sunvalley.erp.product.service;

import java.util.List;
import java.util.Map;

import com.sunvalley.erp.framework.entity.Pager;
import com.sunvalley.erp.framework.service.IBaseService;
import com.sunvalley.erp.product.pojos.ItemPrice;
import com.sunvalley.erp.product.pojos.ItemPriceHistory;

/**
 * 产品价格控制层接口
 * @author Lufangzong
 * @version 1.0
 * @date 2010-04-21
 */

public interface IItemPriceService extends IBaseService<ItemPrice, ItemPrice> {
	
	/**
	 * 修改价格
	 * @param list
	 * @return
	 */
	public int updatePrice(List<ItemPrice> list, byte isdrop, int seller_id, int wh_id) throws Exception;
	public int updatePrice(ItemPrice itemPrice, byte isdrop, int seller_id, int wh_id) throws Exception;
	
	/**
	 * 保存价格
	 * @param itemPrice
	 * @return
	 */
	public int savePrice(ItemPrice itemPrice) throws Exception;
	
	/**
	 * shipment接收的时候没有的就插入，已经存在的不修改
	 * @param itemPrice
	 * @return
	 * @throws Exception
	 */
	public int shipmentInsertPrice(ItemPrice itemPrice) throws Exception;
	
	/**
	 * 保存价格
	 * @param list
	 * @return
	 */
	public void setDropPrice(String filterSql, String wh_id, double rate, double avgtp1from, double avgtp1to, String curno) throws Exception;
	
	/**
	 * 根据条件获取产品价格
	 * @param skuid
	 * @param wh_id
	 * @return
	 */
	public ItemPrice getItemPrice(int skuid, int seller_id, int wh_id);
	
	
	public ItemPrice getItemPrice(int skuid, int seller_id, int wh_id,String cur);
	
	/**
	 * 根据条件获取产品价格
	 * @param skuid
	 * @param regionid
	 * @param lang_id
	 * @return
	 */
	public ItemPrice getItemPrice(int skuid, int seller_id, int wh_id, int lang_id);
	
	
	
	
	/**
	 * 根据条件获取产品价格
	 * @param skus 以逗号隔开的sku字符串
	 * @param wh_id
	 * @return
	 */
	public String getItemPriceStr(String token, String skus, int wh_id);
	
	
	public String getItemPriceStr(String token, String skus, int wh_id,String cur);
	
	public Pager<ItemPrice> getDSSkuDetails(Map<String, Object> param, int page, int pageSize);
	
	/**
	 * 价格分页
	 */
	public Pager<ItemPrice> getPageList(Map<String, Object> param, int page, int pageSize, String ordersql);
	
	public List<ItemPrice> exportPageList(Map<String, Object> param, String ordersql); 
	
	public String getDropSKUExportList(List<ItemPrice> list) throws Exception;
	
	
	/**
	 * 获取价格历史记录
	 * @param filterSql
	 * @param page
	 * @param pageSize
	 * @return
	 */
	public Pager<ItemPriceHistory> getHistoryPageList(String filterSql, int page, int pageSize,String ordersql);
	
	/**
	 * 统计价格变列记录列表
	 * @int days 天数
	 * */
	public List<ItemPriceHistory> getChangeList(int days);
	
	public List<ItemPrice> getSkuChannelList(String filtersql) throws Exception;
	public Pager<ItemPriceHistory> getHistoryPageList(String filtersql, int pageNo, int pageSize, String ordersql, String changeRateSql);
	public List<ItemPrice> getSellerQtyList(int skuid, int wh_id);
	public List<ItemPrice> getSKUDropSList(int skuid) throws Exception;
	public void deleteSKUDropS(int skuid, int seller_id) throws Exception;
	public void saveSKUDropS(int skuid, int seller_id, int isdrop,
			int mainisdrop)throws Exception;
	public ItemPrice getItemSKUDropS(int skuid)throws Exception;
}
