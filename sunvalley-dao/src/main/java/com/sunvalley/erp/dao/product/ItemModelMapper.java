package com.sunvalley.erp.dao.product;
import com.sunvalley.erp.model.product.ItemModel;
import com.sunvalley.erp.model.product.ItemModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* @Description: ItemModelMapper
* @author
* @date 2017-09-16 11:22:46
*/
public interface ItemModelMapper {

    int countByExample(ItemModelExample example);

    int deleteByExample(ItemModelExample example);

    int deleteByPrimaryKey(java.lang.Integer modelId);

    int insert(ItemModel record);

    int insertSelective(ItemModel record);

    List<ItemModel> selectByExample(ItemModelExample example);

    ItemModel selectByPrimaryKey(java.lang.Integer modelId);

    int updateByExampleSelective(@Param("record") ItemModel record, @Param("example") ItemModelExample example);

    int updateByExample(@Param("record") ItemModel record, @Param("example") ItemModelExample example);

    int updateByPrimaryKeySelective(ItemModel record);

    int updateByPrimaryKey(ItemModel record);

    List<ItemModel> selectPage(ItemModelExample example);

    int insertBatch(List<ItemModel> list);



}