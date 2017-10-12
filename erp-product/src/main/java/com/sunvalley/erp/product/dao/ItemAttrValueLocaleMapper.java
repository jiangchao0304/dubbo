package com.sunvalley.erp.product.dao;
import com.sunvalley.erp.product.model.ItemAttrValueLocale;
import com.sunvalley.erp.product.model.ItemAttrValueLocaleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
* @Description: ItemAttrValueLocaleMapper
* @author
* @date 2017-10-12 04:22:22
*/
@Repository
public interface ItemAttrValueLocaleMapper {

    int countByExample(ItemAttrValueLocaleExample example);

    int deleteByExample(ItemAttrValueLocaleExample example);

    int deleteByPrimaryKey(java.lang.Integer skuid);

    int insert(ItemAttrValueLocale record);

    int insertSelective(ItemAttrValueLocale record);

    List<ItemAttrValueLocale> selectByExample(ItemAttrValueLocaleExample example);

    ItemAttrValueLocale selectByPrimaryKey(java.lang.Integer skuid);

    int updateByExampleSelective(@Param("record") ItemAttrValueLocale record, @Param("example") ItemAttrValueLocaleExample example);

    int updateByExample(@Param("record") ItemAttrValueLocale record, @Param("example") ItemAttrValueLocaleExample example);

    int updateByPrimaryKeySelective(ItemAttrValueLocale record);

    int updateByPrimaryKey(ItemAttrValueLocale record);

    List<ItemAttrValueLocale> selectPage(ItemAttrValueLocaleExample example);

    int insertBatch(List<ItemAttrValueLocale> list);



}
