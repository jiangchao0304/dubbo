package com.sunvalley.erp.product.service;

import com.sunvalley.erp.framework.entity.Pager;
import com.sunvalley.erp.framework.service.IBaseService;
import com.sunvalley.erp.product.pojos.ItemVirtual;

public interface IItemVirtualService extends IBaseService<ItemVirtual, ItemVirtual> {
	
	/**
	 * 添加虚拟产品
	 * @param itemVirtual
	 * @return
	 */
	public int saveItemVirtual(ItemVirtual itemVirtual) throws Exception;
	
	/**
	 * 根据产品编号获取虚拟产品对象
	 * @param virtual_skuid
	 * @return
	 */
	public ItemVirtual getItemVirtual(int virtual_skuid);
	
	/**
	 * 分页查询列表
	 * @param actualsku
	 * @param filterSql
	 * @param page
	 * @param pageSize
	 * @return
	 */
	public Pager<ItemVirtual> getPageList(String actualsku, String filterSql, int page, int pageSize);
}
