package com.sunvalley.erp.product.dao;
import com.sunvalley.erp.product.model.ItemPackage;
import com.sunvalley.erp.product.model.ItemPackageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
* @Description: ItemPackageMapper
* @author
* @date 2017-10-13 02:11:48
*/
@Repository
public interface ItemPackageMapper {

    int countByExample(ItemPackageExample example);

    int deleteByExample(ItemPackageExample example);

    int deleteByPrimaryKey(java.lang.Integer id);

    int insert(ItemPackage record);

    int insertSelective(ItemPackage record);

    List<ItemPackage> selectByExample(ItemPackageExample example);

    ItemPackage selectByPrimaryKey(java.lang.Integer id);

    int updateByExampleSelective(@Param("record") ItemPackage record, @Param("example") ItemPackageExample example);

    int updateByExample(@Param("record") ItemPackage record, @Param("example") ItemPackageExample example);

    int updateByPrimaryKeySelective(@Param("record") ItemPackage record);

    int updateByPrimaryKey(ItemPackage record);

    List<ItemPackage> selectPage(ItemPackageExample example);

    int insertBatch(List<ItemPackage> list);



}
