package com.sunvalley.erp.dao.product;
import com.sunvalley.erp.model.product.Bom;
import com.sunvalley.erp.model.product.BomExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
* @Description: BomMapper
* @author
* @date 2017-09-20 04:29:23
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
