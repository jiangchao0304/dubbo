package com.sunvalley.erp.product.dao;
import com.sunvalley.erp.product.model.ItemPreCommom;
import com.sunvalley.erp.product.model.ItemPreCommomExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
* @Description: ItemPreCommomMapper
* @author
* @date 2017-10-13 02:11:54
*/
@Repository
public interface ItemPreCommomMapper {

    int countByExample(ItemPreCommomExample example);

    int deleteByExample(ItemPreCommomExample example);

    int deleteByPrimaryKey(java.lang.Integer id);

    int insert(ItemPreCommom record);

    int insertSelective(ItemPreCommom record);

    List<ItemPreCommom> selectByExample(ItemPreCommomExample example);

    ItemPreCommom selectByPrimaryKey(java.lang.Integer id);

    int updateByExampleSelective(@Param("record") ItemPreCommom record, @Param("example") ItemPreCommomExample example);

    int updateByExample(@Param("record") ItemPreCommom record, @Param("example") ItemPreCommomExample example);

    int updateByPrimaryKeySelective(@Param("record") ItemPreCommom record);

    int updateByPrimaryKey(ItemPreCommom record);

    List<ItemPreCommom> selectPage(ItemPreCommomExample example);

    int insertBatch(List<ItemPreCommom> list);



}
