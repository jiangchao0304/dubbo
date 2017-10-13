package com.sunvalley.erp.product.dao;
import com.sunvalley.erp.product.model.Item;
import com.sunvalley.erp.product.model.ItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
* @Description: ItemMapper
* @author
* @date 2017-10-13 02:11:30
*/
@Repository
public interface ItemMapper {

    int countByExample(ItemExample example);

    int deleteByExample(ItemExample example);

    int deleteByPrimaryKey(java.lang.Integer skuid);

    int insert(Item record);

    int insertSelective(Item record);

    List<Item> selectByExample(ItemExample example);

    Item selectByPrimaryKey(java.lang.Integer skuid);

    int updateByExampleSelective(@Param("record") Item record, @Param("example") ItemExample example);

    int updateByExample(@Param("record") Item record, @Param("example") ItemExample example);

    int updateByPrimaryKeySelective(@Param("record") Item record);

    int updateByPrimaryKey(Item record);

    List<Item> selectPage(ItemExample example);

    int insertBatch(List<Item> list);



}
