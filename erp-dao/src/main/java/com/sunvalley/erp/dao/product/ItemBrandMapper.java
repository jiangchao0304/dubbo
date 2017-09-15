package com.sunvalley.erp.dao.product;
import com.sunvalley.erp.model.product.ItemBrand;
import com.sunvalley.erp.model.product.ItemBrandExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* @Description: ItemBrandMapper
* @author
* @date 2017-09-15 04:24:56
*/
public interface ItemBrandMapper {

    int countByExample(ItemBrandExample example);

    int deleteByExample(ItemBrandExample example);

    int deleteByPrimaryKey(java.lang.Integer brandId);

    int insert(ItemBrand record);

    int insertSelective(ItemBrand record);

    List<ItemBrand> selectByExample(ItemBrandExample example);

    ItemBrand selectByPrimaryKey(java.lang.Integer brandId);

    int updateByExampleSelective(@Param("record") ItemBrand record, @Param("example") ItemBrandExample example);

    int updateByExample(@Param("record") ItemBrand record, @Param("example") ItemBrandExample example);

    int updateByPrimaryKeySelective(ItemBrand record);

    int updateByPrimaryKey(ItemBrand record);

    List<ItemBrand> selectPage(ItemBrandExample example);

    int insertBatch(List<ItemBrand> list);



}