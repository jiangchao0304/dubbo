package com.sunvalley.erp.dao.product;
import com.sunvalley.erp.model.product.Item;
import com.sunvalley.erp.model.product.ItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* @Description: ItemMapper
* @author
* @date 2017-09-15 10:39:28
*/
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

    int updateByPrimaryKeySelective(Item record);

    int updateByPrimaryKey(Item record);

    List<Item> selectPage(ItemExample example);

    int insertBatch(List<Item> list);



}
