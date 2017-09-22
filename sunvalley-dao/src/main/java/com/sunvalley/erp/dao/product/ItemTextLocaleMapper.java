package com.sunvalley.erp.dao.product;
import com.sunvalley.erp.model.product.ItemTextLocale;
import com.sunvalley.erp.model.product.ItemTextLocaleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
* @Description: ItemTextLocaleMapper
* @author
* @date 2017-09-22 11:33:48
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

    int updateByPrimaryKeySelective(ItemTextLocale record);

    int updateByPrimaryKey(ItemTextLocale record);

    List<ItemTextLocale> selectPage(ItemTextLocaleExample example);

    int insertBatch(List<ItemTextLocale> list);



}
