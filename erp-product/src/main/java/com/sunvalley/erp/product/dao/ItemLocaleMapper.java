package com.sunvalley.erp.product.dao;
import com.sunvalley.erp.product.model.ItemLocale;
import com.sunvalley.erp.product.model.ItemLocaleExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
* @Description: ItemLocaleMapper
* @author
* @date 2017-09-20 04:30:45
*/
@Repository
public interface ItemLocaleMapper {

    int countByExample(ItemLocaleExample example);

    int deleteByExample(ItemLocaleExample example);

    int deleteByPrimaryKey(java.lang.Integer skuid);

    int insert(ItemLocale record);

    int insertSelective(ItemLocale record);

    List<ItemLocale> selectByExample(ItemLocaleExample example);

    ItemLocale selectByPrimaryKey(java.lang.Integer skuid);

    int updateByExampleSelective(@Param("record") ItemLocale record, @Param("example") ItemLocaleExample example);

    int updateByExample(@Param("record") ItemLocale record, @Param("example") ItemLocaleExample example);

    int updateByPrimaryKeySelective(ItemLocale record);

    int updateByPrimaryKey(ItemLocale record);

    List<ItemLocale> selectPage(ItemLocaleExample example);

    int insertBatch(List<ItemLocale> list);



}
