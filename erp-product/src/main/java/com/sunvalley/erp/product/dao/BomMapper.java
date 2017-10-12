package com.sunvalley.erp.product.dao;
import com.sunvalley.erp.product.model.Bom;
import com.sunvalley.erp.product.model.BomExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
* @Description: BomMapper
* @author
* @date 2017-10-12 04:21:57
*/
@Repository
public interface BomMapper {

    int countByExample(BomExample example);

    int deleteByExample(BomExample example);

    int deleteByPrimaryKey(java.lang.Integer id);

    int insert(Bom record);

    int insertSelective(Bom record);

    List<Bom> selectByExample(BomExample example);

    Bom selectByPrimaryKey(java.lang.Integer id);

    int updateByExampleSelective(@Param("record") Bom record, @Param("example") BomExample example);

    int updateByExample(@Param("record") Bom record, @Param("example") BomExample example);

    int updateByPrimaryKeySelective(Bom record);

    int updateByPrimaryKey(Bom record);

    List<Bom> selectPage(BomExample example);

    int insertBatch(List<Bom> list);



}
