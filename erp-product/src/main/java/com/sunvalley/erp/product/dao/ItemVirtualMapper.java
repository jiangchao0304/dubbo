package com.sunvalley.erp.product.dao;
import com.sunvalley.erp.product.model.ItemVirtual;
import com.sunvalley.erp.product.model.ItemVirtualExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
* @Description: ItemVirtualMapper
* @author
* @date 2017-09-28 03:10:43
*/
@Repository
public interface ItemVirtualMapper {

    int countByExample(ItemVirtualExample example);

    int deleteByExample(ItemVirtualExample example);

    int deleteByPrimaryKey(java.lang.Integer virtualSkuid);

    int insert(ItemVirtual record);

    int insertSelective(ItemVirtual record);

    List<ItemVirtual> selectByExample(ItemVirtualExample example);

    ItemVirtual selectByPrimaryKey(java.lang.Integer virtualSkuid);

    int updateByExampleSelective(@Param("record") ItemVirtual record, @Param("example") ItemVirtualExample example);

    int updateByExample(@Param("record") ItemVirtual record, @Param("example") ItemVirtualExample example);

    int updateByPrimaryKeySelective(ItemVirtual record);

    int updateByPrimaryKey(ItemVirtual record);

    List<ItemVirtual> selectPage(ItemVirtualExample example);

    int insertBatch(List<ItemVirtual> list);



}
