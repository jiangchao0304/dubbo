package com.sunvalley.erp.product.dao;
import com.sunvalley.erp.product.model.ItemCustom;
import com.sunvalley.erp.product.model.ItemCustomExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
* @Description: ItemCustomMapper
* @author
* @date 2017-09-29 10:46:10
*/
@Repository
public interface ItemCustomMapper {

    int countByExample(ItemCustomExample example);

    int deleteByExample(ItemCustomExample example);

    int deleteByPrimaryKey(java.lang.Integer id);

    int insert(ItemCustom record);

    int insertSelective(ItemCustom record);

    List<ItemCustom> selectByExample(ItemCustomExample example);

    ItemCustom selectByPrimaryKey(java.lang.Integer id);

    int updateByExampleSelective(@Param("record") ItemCustom record, @Param("example") ItemCustomExample example);

    int updateByExample(@Param("record") ItemCustom record, @Param("example") ItemCustomExample example);

    int updateByPrimaryKeySelective(ItemCustom record);

    int updateByPrimaryKey(ItemCustom record);

    List<ItemCustom> selectPage(ItemCustomExample example);

    int insertBatch(List<ItemCustom> list);



}
