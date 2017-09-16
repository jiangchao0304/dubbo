package com.sunvalley.erp.dao.product;
import com.sunvalley.erp.model.product.ItemPreCommom;
import com.sunvalley.erp.model.product.ItemPreCommomExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* @Description: ItemPreCommomMapper
* @author
* @date 2017-09-16 11:23:54
*/
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

    int updateByPrimaryKeySelective(ItemPreCommom record);

    int updateByPrimaryKey(ItemPreCommom record);

    List<ItemPreCommom> selectPage(ItemPreCommomExample example);

    int insertBatch(List<ItemPreCommom> list);



}
