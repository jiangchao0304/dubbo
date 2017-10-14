package com.sunvalley.erp.product.dao;
import com.sunvalley.erp.product.model.SalesPlanSum;
import com.sunvalley.erp.product.model.SalesPlanSumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
* @Description: SalesPlanSumMapper
* @author
* @date 2017-10-13 02:13:35
*/
@Repository
public interface SalesPlanSumMapper {

    int countByExample(SalesPlanSumExample example);

    int deleteByExample(SalesPlanSumExample example);

    int deleteByPrimaryKey(java.lang.Integer id);

    int insert(SalesPlanSum record);

    int insertSelective(SalesPlanSum record);

    List<SalesPlanSum> selectByExample(SalesPlanSumExample example);

    SalesPlanSum selectByPrimaryKey(java.lang.Integer id);

    int updateByExampleSelective(@Param("record") SalesPlanSum record, @Param("example") SalesPlanSumExample example);

    int updateByExample(@Param("record") SalesPlanSum record, @Param("example") SalesPlanSumExample example);

    int updateByPrimaryKeySelective(@Param("record") SalesPlanSum record);

    int updateByPrimaryKey(SalesPlanSum record);

    List<SalesPlanSum> selectPage(SalesPlanSumExample example);

    int insertBatch(List<SalesPlanSum> list);



}
