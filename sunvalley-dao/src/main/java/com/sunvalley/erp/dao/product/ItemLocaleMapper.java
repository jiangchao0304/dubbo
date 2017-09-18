package com.sunvalley.erp.dao.product;
import com.sunvalley.erp.model.product.ItemLocale;
import com.sunvalley.erp.model.product.ItemLocaleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* @Description: ItemLocaleMapper
* @author
* @date 2017-09-18 12:27:33
*/
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
