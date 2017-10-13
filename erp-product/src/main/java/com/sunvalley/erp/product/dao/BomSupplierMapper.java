package com.sunvalley.erp.product.dao;
import com.sunvalley.erp.product.model.BomSupplier;
import com.sunvalley.erp.product.model.BomSupplierExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
* @Description: BomSupplierMapper
* @author
* @date 2017-10-13 02:10:23
*/
@Repository
public interface BomSupplierMapper {

    int countByExample(BomSupplierExample example);

    int deleteByExample(BomSupplierExample example);

    int deleteByPrimaryKey(java.lang.Integer id);

    int insert(BomSupplier record);

    int insertSelective(BomSupplier record);

    List<BomSupplier> selectByExample(BomSupplierExample example);

    BomSupplier selectByPrimaryKey(java.lang.Integer id);

    int updateByExampleSelective(@Param("record") BomSupplier record, @Param("example") BomSupplierExample example);

    int updateByExample(@Param("record") BomSupplier record, @Param("example") BomSupplierExample example);

    int updateByPrimaryKeySelective(@Param("record") BomSupplier record);

    int updateByPrimaryKey(BomSupplier record);

    List<BomSupplier> selectPage(BomSupplierExample example);

    int insertBatch(List<BomSupplier> list);



}
