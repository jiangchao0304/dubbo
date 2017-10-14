package com.sunvalley.erp.product.dao;
import com.sunvalley.erp.product.model.ItemCustomDetail;
import com.sunvalley.erp.product.model.ItemCustomDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
* @Description: ItemCustomDetailMapper
* @author
* @date 2017-10-13 02:10:53
*/
@Repository
public interface ItemCustomDetailMapper {

    int countByExample(ItemCustomDetailExample example);

    int deleteByExample(ItemCustomDetailExample example);

    int deleteByPrimaryKey(java.lang.Integer id);

    int insert(ItemCustomDetail record);

    int insertSelective(ItemCustomDetail record);

    List<ItemCustomDetail> selectByExample(ItemCustomDetailExample example);

    ItemCustomDetail selectByPrimaryKey(java.lang.Integer id);

    int updateByExampleSelective(@Param("record") ItemCustomDetail record, @Param("example") ItemCustomDetailExample example);

    int updateByExample(@Param("record") ItemCustomDetail record, @Param("example") ItemCustomDetailExample example);

    int updateByPrimaryKeySelective(@Param("record") ItemCustomDetail record);

    int updateByPrimaryKey(ItemCustomDetail record);

    List<ItemCustomDetail> selectPage(ItemCustomDetailExample example);

    int insertBatch(List<ItemCustomDetail> list);



}
