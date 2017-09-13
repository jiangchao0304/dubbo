package com.sunvalley.erp.daoEX.salesplan;

import java.util.HashMap;
import java.util.List;

import com.sunvalley.erp.modelEX.product.PrepareSkuEx;
import com.sunvalley.erp.product.pojos.Item;
import com.sunvalley.erp.system.pojos.SysEmailReceiver;

public interface PrepareSkuExMapper {

	public int queryGridCount(HashMap<String, Object> map);
	public List<PrepareSkuEx> queryGrid(HashMap<String, Object> map);
	
	/**
	 * 查询状态
	 * @param map
	 * @return
	 */
	public List<PrepareSkuEx> querySkuStatus(HashMap<String, Object> map);
	//获取邮件发送人信息
	public List<SysEmailReceiver>  getSysEmailReceiverList(HashMap<String, Object> map);
	//更新SKU状态
	public  int updatePreSkuStatus(HashMap<String, Object> map);
	
	public List<PrepareSkuEx> getPreSkuById(HashMap<String, Object> map);
	
	/**
	 * 初始化预备SKU中的  运费表格
	 * @param map
	 * @return
	 */
	public List<PrepareSkuEx> initShipping(HashMap<String, Object> map);
	
	
	public List<PrepareSkuEx> viewSku(HashMap<String, Object> map);
	public List<PrepareSkuEx> selectmodelAndPreSku(HashMap<String, Object> map);
	public int selectmodelAndPreSkuCount(HashMap<String, Object> map);
	
	public List<PrepareSkuEx> initByModel(HashMap<String, Object> map);
	
	/**
	 * model&sku页面表格
	 * @param map
	 * @return
	 */
	public List<PrepareSkuEx> preSkuGrid(HashMap<String, Object> map);
	public List<PrepareSkuEx> isExistSku(HashMap<String, Object> map);
	
	public List<Item> selectItemInfo(HashMap<String, Object> map);
	
	public List<PrepareSkuEx> packageSkuList(HashMap<String, Object> map);
	public List<PrepareSkuEx> getPreSkuByModelColorAnrule(HashMap<String, Object> map);
}
