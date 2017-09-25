package com.sunvalley.erp.product.dao;
import com.sunvalley.erp.product.model.SalesPlanCost;
import com.sunvalley.erp.product.model.SalesPlanCostExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
* @Description: SalesPlanCostMapper
* @author
* @date 2017-09-25 03:10:40
*/
@Repository
public interface SalesPlanCostMapper {

    int countByExample(SalesPlanCostExample example);

    int deleteByExample(SalesPlanCostExample example);

    int deleteByPrimaryKey(java.lang.Integer id);

    int insert(SalesPlanCost record);

    int insertSelective(SalesPlanCost record);

    List<SalesPlanCost> selectByExample(SalesPlanCostExample example);

    SalesPlanCost selectByPrimaryKey(java.lang.Integer id);

    int updateByExampleSelective(@Param("record") SalesPlanCost record, @Param("example") SalesPlanCostExample example);

    int updateByExample(@Param("record") SalesPlanCost record, @Param("example") SalesPlanCostExample example);

    int updateByPrimaryKeySelective(SalesPlanCost record);

    int updateByPrimaryKey(SalesPlanCost record);

    List<SalesPlanCost> selectPage(SalesPlanCostExample example);

    int insertBatch(List<SalesPlanCost> list);



}
