package com.sunvalley.erp.product.dao;
import com.sunvalley.erp.product.model.ItemMapping;
import com.sunvalley.erp.product.model.ItemMappingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
* @Description: ItemMappingMapper
* @author
* @date 2017-09-25 01:05:44
*/
@Repository
public interface ItemMappingMapper {

    int countByExample(ItemMappingExample example);

    int deleteByExample(ItemMappingExample example);

    int deleteByPrimaryKey(java.lang.Integer id);

    int insert(ItemMapping record);

    int insertSelective(ItemMapping record);

    List<ItemMapping> selectByExample(ItemMappingExample example);

    ItemMapping selectByPrimaryKey(java.lang.Integer id);

    int updateByExampleSelective(@Param("record") ItemMapping record, @Param("example") ItemMappingExample example);

    int updateByExample(@Param("record") ItemMapping record, @Param("example") ItemMappingExample example);

    int updateByPrimaryKeySelective(ItemMapping record);

    int updateByPrimaryKey(ItemMapping record);

    List<ItemMapping> selectPage(ItemMappingExample example);

    int insertBatch(List<ItemMapping> list);



}
