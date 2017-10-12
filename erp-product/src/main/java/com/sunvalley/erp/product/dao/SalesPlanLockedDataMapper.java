package com.sunvalley.erp.product.dao;
import com.sunvalley.erp.product.model.SalesPlanLockedData;
import com.sunvalley.erp.product.model.SalesPlanLockedDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
* @Description: SalesPlanLockedDataMapper
* @author
* @date 2017-10-12 04:27:10
*/
@Repository
public interface SalesPlanLockedDataMapper {

    int countByExample(SalesPlanLockedDataExample example);

    int deleteByExample(SalesPlanLockedDataExample example);

    int deleteByPrimaryKey(java.lang.Integer id);

    int insert(SalesPlanLockedData record);

    int insertSelective(SalesPlanLockedData record);

    List<SalesPlanLockedData> selectByExample(SalesPlanLockedDataExample example);

    SalesPlanLockedData selectByPrimaryKey(java.lang.Integer id);

    int updateByExampleSelective(@Param("record") SalesPlanLockedData record, @Param("example") SalesPlanLockedDataExample example);

    int updateByExample(@Param("record") SalesPlanLockedData record, @Param("example") SalesPlanLockedDataExample example);

    int updateByPrimaryKeySelective(SalesPlanLockedData record);

    int updateByPrimaryKey(SalesPlanLockedData record);

    List<SalesPlanLockedData> selectPage(SalesPlanLockedDataExample example);

    int insertBatch(List<SalesPlanLockedData> list);



}
