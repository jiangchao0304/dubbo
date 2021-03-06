package com.sunvalley.erp.product.dao;
import com.sunvalley.erp.product.model.SalesPlan;
import com.sunvalley.erp.product.model.SalesPlanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
* @Description: SalesPlanMapper
* @author
* @date 2017-10-13 02:13:29
*/
@Repository
public interface SalesPlanMapper {

    int countByExample(SalesPlanExample example);

    int deleteByExample(SalesPlanExample example);

    int deleteByPrimaryKey(java.lang.Integer id);

    int insert(SalesPlan record);

    int insertSelective(SalesPlan record);

    List<SalesPlan> selectByExample(SalesPlanExample example);

    SalesPlan selectByPrimaryKey(java.lang.Integer id);

    int updateByExampleSelective(@Param("record") SalesPlan record, @Param("example") SalesPlanExample example);

    int updateByExample(@Param("record") SalesPlan record, @Param("example") SalesPlanExample example);

    int updateByPrimaryKeySelective(@Param("record") SalesPlan record);

    int updateByPrimaryKey(SalesPlan record);

    List<SalesPlan> selectPage(SalesPlanExample example);

    int insertBatch(List<SalesPlan> list);



}
