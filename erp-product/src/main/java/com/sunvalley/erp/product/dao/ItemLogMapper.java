package com.sunvalley.erp.product.dao;
import com.sunvalley.erp.product.model.ItemLog;
import com.sunvalley.erp.product.model.ItemLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
* @Description: ItemLogMapper
* @author
* @date 2017-10-13 02:11:20
*/
@Repository
public interface ItemLogMapper {

    int countByExample(ItemLogExample example);

    int deleteByExample(ItemLogExample example);

    int deleteByPrimaryKey(java.lang.Integer id);

    int insert(ItemLog record);

    int insertSelective(ItemLog record);

    List<ItemLog> selectByExample(ItemLogExample example);

    ItemLog selectByPrimaryKey(java.lang.Integer id);

    int updateByExampleSelective(@Param("record") ItemLog record, @Param("example") ItemLogExample example);

    int updateByExample(@Param("record") ItemLog record, @Param("example") ItemLogExample example);

    int updateByPrimaryKeySelective(@Param("record") ItemLog record);

    int updateByPrimaryKey(ItemLog record);

    List<ItemLog> selectPage(ItemLogExample example);

    int insertBatch(List<ItemLog> list);



}
