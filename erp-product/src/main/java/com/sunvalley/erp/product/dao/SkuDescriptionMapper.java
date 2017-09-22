package com.sunvalley.erp.product.dao;
import com.sunvalley.erp.product.model.SkuDescription;
import com.sunvalley.erp.product.model.SkuDescriptionExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
* @Description: SkuDescriptionMapper
* @author
* @date 2017-09-22 11:06:39
*/
@Repository
public interface SkuDescriptionMapper {

    int countByExample(SkuDescriptionExample example);

    int deleteByExample(SkuDescriptionExample example);

    int deleteByPrimaryKey(java.lang.Integer id);

    int insert(SkuDescription record);

    int insertSelective(SkuDescription record);

    List<SkuDescription> selectByExample(SkuDescriptionExample example);

    SkuDescription selectByPrimaryKey(java.lang.Integer id);

    int updateByExampleSelective(@Param("record") SkuDescription record, @Param("example") SkuDescriptionExample example);

    int updateByExample(@Param("record") SkuDescription record, @Param("example") SkuDescriptionExample example);

    int updateByPrimaryKeySelective(SkuDescription record);

    int updateByPrimaryKey(SkuDescription record);

    List<SkuDescription> selectPage(SkuDescriptionExample example);

    int insertBatch(List<SkuDescription> list);



}
