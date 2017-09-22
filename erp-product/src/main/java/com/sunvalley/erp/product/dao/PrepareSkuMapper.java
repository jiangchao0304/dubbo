package com.sunvalley.erp.product.dao;
import com.sunvalley.erp.product.model.PrepareSku;
import com.sunvalley.erp.product.model.PrepareSkuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
* @Description: PrepareSkuMapper
* @author
* @date 2017-09-18 12:26:10
*/
@Repository
public interface PrepareSkuMapper {

    int countByExample(PrepareSkuExample example);

    int deleteByExample(PrepareSkuExample example);

    int deleteByPrimaryKey(java.lang.Integer id);

    int insert(PrepareSku record);

    int insertSelective(PrepareSku record);

    List<PrepareSku> selectByExample(PrepareSkuExample example);

    PrepareSku selectByPrimaryKey(java.lang.Integer id);

    int updateByExampleSelective(@Param("record") PrepareSku record, @Param("example") PrepareSkuExample example);

    int updateByExample(@Param("record") PrepareSku record, @Param("example") PrepareSkuExample example);

    int updateByPrimaryKeySelective(PrepareSku record);

    int updateByPrimaryKey(PrepareSku record);

    List<PrepareSku> selectPage(PrepareSkuExample example);

    int insertBatch(List<PrepareSku> list);



}
