package com.sunvalley.erp.dao.product;
import com.sunvalley.erp.model.product.PrepareSku;
import com.sunvalley.erp.model.product.PrepareSkuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* @Description: PrepareSkuMapper
* @author
* @date 2017-09-18 12:24:14
*/
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
