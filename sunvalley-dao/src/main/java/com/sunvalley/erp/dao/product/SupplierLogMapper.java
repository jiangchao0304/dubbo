package com.sunvalley.erp.dao.product;
import com.sunvalley.erp.model.product.SupplierLog;
import com.sunvalley.erp.model.product.SupplierLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
* @Description: SupplierLogMapper
* @author
* @date 2017-09-22 04:58:57
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

    int updateByPrimaryKeySelective(SupplierLog record);

    int updateByPrimaryKey(SupplierLog record);

    List<SupplierLog> selectPage(SupplierLogExample example);

    int insertBatch(List<SupplierLog> list);



}
