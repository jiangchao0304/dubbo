package com.sunvalley.erp.product.dao;
import com.sunvalley.erp.product.model.BomLog;
import com.sunvalley.erp.product.model.BomLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
* @Description: BomLogMapper
* @author
* @date 2017-09-26 06:55:53
*/
@Repository
public interface BomLogMapper {

    int countByExample(BomLogExample example);

    int deleteByExample(BomLogExample example);

    int deleteByPrimaryKey(java.lang.Integer id);

    int insert(BomLog record);

    int insertSelective(BomLog record);

    List<BomLog> selectByExample(BomLogExample example);

    BomLog selectByPrimaryKey(java.lang.Integer id);

    int updateByExampleSelective(@Param("record") BomLog record, @Param("example") BomLogExample example);

    int updateByExample(@Param("record") BomLog record, @Param("example") BomLogExample example);

    int updateByPrimaryKeySelective(BomLog record);

    int updateByPrimaryKey(BomLog record);

    List<BomLog> selectPage(BomLogExample example);

    int insertBatch(List<BomLog> list);



}
