package com.sunvalley.erp;

import java.util.List;

import com.sunvalley.erp.IBaseEntity;
import com.sunvalley.erp.Pager;

/**
 * @author Cheng Liangwei
 * @version 1.0
 * @date 2010-03-23
 * @see 基本的服务接口类，包括增删改查，及分面查询的功能
 * */
public interface IBaseService<T extends IBaseEntity,PT extends IBaseEntity> {
	
	public IBaseDao<T,PT> getDaoClass();
	
	/**
	 * 判断对象是否存在
	 * @param t
	 * @return
	 */
	public boolean exist(T t);
	
	/**
	 * @param 所要保存的实体
	 * @see 实体的保存操作,包括基本的增删改
	 * */
	public int save(T t)throws Exception;
	
	/**
	 * @param T:传入的实体  PT:关联的父表头
	 * @see 相关实体的保存操作
	 * @return 返回的影响行数
	 * @throws Exception
	 * */
	public int save(T t, PT pt) throws Exception;
	
	/**
	 * @param 所要保存的列表
	 * @see 列表的保存操作，包括基本的增删改
	 * */
	public int saveList(List<T> list,PT pt)throws Exception;
	
	/**
	 * @param 所要添加的实体
	 * @see 实体的添加操作
	 * */
	public int insert(T t)throws Exception;
	
	/**
	 * @param T:传入的实体  PT:关联的父表头
	 * @see 有相关表的插入操作
	 * @throws Exception
	 * */
	public int insert(T t, PT pt) throws Exception;
	
	/**
	 * @param 所要修改的实体
	 * @see 实体的修改操作
	 * */
	public int update(T t)throws Exception;
	
	/**
	 * @param 需要删除的表的主键ID
	 * @see 删除一条记录
	 * */
	public int DeleteByID(Object o)throws Exception;
	
	/**
	 * @param 需要取的实体的ID
	 * @see 取实体列表
	 * */
	public List<T> getList(Object o);
	

	/**
	 * @param 需要取的实体的主键ID
	 * @see 取实体
	 * */
	public T getByID(Object o);
	
	/**
	 * @param filterSql:查询的条件的字符串 page:页的编号，默认是0 pageSize:页的大小，默认是20
	 * @return 分页的一些实体信息
	 * */
	public Pager<T> getPageList(String filterSql, int page, int pageSize,String ordersql);

	/**
	 * @see 查询插入时数据库生成的主键
	 * @return 返回主键值
	 * */
	public int getPKID();
	
	/**
	 * @see 查询所有的实体列表
	 * @return 返回实体的列表
	 * */
	public List<T> getAll();
	
	/**
	 * @param 执行删除操作所需的参数，默认是实体相关父表实体的主键值
	 * @see 通过条件，进行实体的删除操作
	 * @return 返回影响的行数
	 * */
	public int DeleteByParentID(Object o);
	/**
	 * 批量插入by wangweidong
	 * */
	@SuppressWarnings("rawtypes")
	public int batchInsert(List list);
	/**
	 * 批量更新by wangweidong
	 * */
	@SuppressWarnings("rawtypes")
	public int batchUpdate(List list);	
}
