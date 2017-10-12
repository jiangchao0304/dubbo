package com.sunvalley.erp.product.dao;
import com.sunvalley.erp.product.model.ItemRequirements;
import com.sunvalley.erp.product.model.ItemRequirementsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
* @Description: ItemRequirementsMapper
* @author
* @date 2017-10-12 04:25:19
*/
@Repository
public interface ItemRequirementsMapper {

    int countByExample(ItemRequirementsExample example);

    int deleteByExample(ItemRequirementsExample example);

    int deleteByPrimaryKey(java.lang.Integer id);

    int insert(ItemRequirements record);

    int insertSelective(ItemRequirements record);

    List<ItemRequirements> selectByExample(ItemRequirementsExample example);

    ItemRequirements selectByPrimaryKey(java.lang.Integer id);

    int updateByExampleSelective(@Param("record") ItemRequirements record, @Param("example") ItemRequirementsExample example);

    int updateByExample(@Param("record") ItemRequirements record, @Param("example") ItemRequirementsExample example);

    int updateByPrimaryKeySelective(ItemRequirements record);

    int updateByPrimaryKey(ItemRequirements record);

    List<ItemRequirements> selectPage(ItemRequirementsExample example);

    int insertBatch(List<ItemRequirements> list);



}
