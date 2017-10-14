package com.sunvalley.erp.product.dao;
import com.sunvalley.erp.product.model.SupplierLog;
import com.sunvalley.erp.product.model.SupplierLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
* @Description: SupplierLogMapper
* @author
* @date 2017-10-13 02:13:53
*/
@Repository
public interface SupplierLogMapper {

    int countByExample(SupplierLogExample example);

    int deleteByExample(SupplierLogExample example);

    int deleteByPrimaryKey(java.lang.Integer supplierlogid);

    int insert(SupplierLog record);

    int insertSelective(SupplierLog record);

    List<SupplierLog> selectByExample(SupplierLogExample example);

    SupplierLog selectByPrimaryKey(java.lang.Integer supplierlogid);

    int updateByExampleSelective(@Param("record") SupplierLog record, @Param("example") SupplierLogExample example);

    int updateByExample(@Param("record") SupplierLog record, @Param("example") SupplierLogExample example);

    int updateByPrimaryKeySelective(@Param("record") SupplierLog record);

    int updateByPrimaryKey(SupplierLog record);

    List<SupplierLog> selectPage(SupplierLogExample example);

    int insertBatch(List<SupplierLog> list);



}
