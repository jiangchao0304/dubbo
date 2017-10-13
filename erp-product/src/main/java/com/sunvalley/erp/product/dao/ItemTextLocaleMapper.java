package com.sunvalley.erp.product.dao;
import com.sunvalley.erp.product.model.ItemTextLocale;
import com.sunvalley.erp.product.model.ItemTextLocaleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
* @Description: ItemTextLocaleMapper
* @author
* @date 2017-10-13 02:12:07
*/
@Repository
public interface ItemTextLocaleMapper {

    int countByExample(ItemTextLocaleExample example);

    int deleteByExample(ItemTextLocaleExample example);

    int deleteByPrimaryKey(java.lang.Integer skuid);

    int insert(ItemTextLocale record);

    int insertSelective(ItemTextLocale record);

    List<ItemTextLocale> selectByExample(ItemTextLocaleExample example);

    ItemTextLocale selectByPrimaryKey(java.lang.Integer skuid);

    int updateByExampleSelective(@Param("record") ItemTextLocale record, @Param("example") ItemTextLocaleExample example);

    int updateByExample(@Param("record") ItemTextLocale record, @Param("example") ItemTextLocaleExample example);

    int updateByPrimaryKeySelective(@Param("record") ItemTextLocale record);

    int updateByPrimaryKey(ItemTextLocale record);

    List<ItemTextLocale> selectPage(ItemTextLocaleExample example);

    int insertBatch(List<ItemTextLocale> list);



}
