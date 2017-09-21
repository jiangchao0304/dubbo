package com.sunvalley.erp.dao.product;
import com.sunvalley.erp.model.product.Sequence;
import com.sunvalley.erp.model.product.SequenceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
* @Description: SequenceMapper
* @author
* @date 2017-09-15 04:45:44
*/
@Repository
public interface SequenceMapper {

    int countByExample(SequenceExample example);

    int deleteByExample(SequenceExample example);

    int deleteByPrimaryKey(java.lang.String name);

    int insert(Sequence record);

    int insertSelective(Sequence record);

    List<Sequence> selectByExample(SequenceExample example);

    Sequence selectByPrimaryKey(java.lang.String name);

    int updateByExampleSelective(@Param("record") Sequence record, @Param("example") SequenceExample example);

    int updateByExample(@Param("record") Sequence record, @Param("example") SequenceExample example);

    int updateByPrimaryKeySelective(Sequence record);

    int updateByPrimaryKey(Sequence record);

    List<Sequence> selectPage(SequenceExample example);

    int insertBatch(List<Sequence> list);



}
