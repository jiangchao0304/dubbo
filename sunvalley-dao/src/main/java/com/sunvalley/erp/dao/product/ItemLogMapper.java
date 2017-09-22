package com.sunvalley.erp.dao.product;
import com.sunvalley.erp.model.product.ItemLog;
import com.sunvalley.erp.model.product.ItemLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
* @Description: ItemLogMapper
* @author
* @date 2017-09-22 12:18:46
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

    int updateByPrimaryKeySelective(ItemLog record);

    int updateByPrimaryKey(ItemLog record);

    List<ItemLog> selectPage(ItemLogExample example);

    int insertBatch(List<ItemLog> list);



}
