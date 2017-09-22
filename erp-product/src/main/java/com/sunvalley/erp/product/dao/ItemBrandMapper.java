package com.sunvalley.erp.product.dao;
import com.sunvalley.erp.product.model.ItemBrand;
import com.sunvalley.erp.product.model.ItemBrandExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
* @Description: ItemBrandMapper
* @author
* @date 2017-09-16 11:22:31
*/
@Repository
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
