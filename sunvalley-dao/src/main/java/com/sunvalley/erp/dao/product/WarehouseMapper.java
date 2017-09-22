package com.sunvalley.erp.dao.product;
import com.sunvalley.erp.model.product.Warehouse;
import com.sunvalley.erp.model.product.WarehouseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
* @Description: WarehouseMapper
* @author
* @date 2017-09-22 12:25:29
*/
@Repository
public interface WarehouseMapper {

    int countByExample(WarehouseExample example);

    int deleteByExample(WarehouseExample example);

    int deleteByPrimaryKey(java.lang.Integer whId);

    int insert(Warehouse record);

    int insertSelective(Warehouse record);

    List<Warehouse> selectByExample(WarehouseExample example);

    Warehouse selectByPrimaryKey(java.lang.Integer whId);

    int updateByExampleSelective(@Param("record") Warehouse record, @Param("example") WarehouseExample example);

    int updateByExample(@Param("record") Warehouse record, @Param("example") WarehouseExample example);

    int updateByPrimaryKeySelective(Warehouse record);

    int updateByPrimaryKey(Warehouse record);

    List<Warehouse> selectPage(WarehouseExample example);

    int insertBatch(List<Warehouse> list);



}
