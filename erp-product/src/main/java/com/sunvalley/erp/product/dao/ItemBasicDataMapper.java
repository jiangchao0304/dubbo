package com.sunvalley.erp.product.dao;
import com.sunvalley.erp.product.model.ItemBasicData;
import com.sunvalley.erp.product.model.ItemBasicDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
* @Description: ItemBasicDataMapper
* @author
* @date 2017-09-25 01:09:28
*/
@Repository
public interface ItemBasicDataMapper {

    int countByExample(ItemBasicDataExample example);

    int deleteByExample(ItemBasicDataExample example);

    int deleteByPrimaryKey(java.lang.Integer id);

    int insert(ItemBasicData record);

    int insertSelective(ItemBasicData record);

    List<ItemBasicData> selectByExample(ItemBasicDataExample example);

    ItemBasicData selectByPrimaryKey(java.lang.Integer id);

    int updateByExampleSelective(@Param("record") ItemBasicData record, @Param("example") ItemBasicDataExample example);

    int updateByExample(@Param("record") ItemBasicData record, @Param("example") ItemBasicDataExample example);

    int updateByPrimaryKeySelective(ItemBasicData record);

    int updateByPrimaryKey(ItemBasicData record);

    List<ItemBasicData> selectPage(ItemBasicDataExample example);

    int insertBatch(List<ItemBasicData> list);



}
