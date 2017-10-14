package com.sunvalley.erp.product.dao;
import com.sunvalley.erp.product.model.Sequence;
import com.sunvalley.erp.product.model.SequenceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
* @Description: SequenceMapper
* @author
* @date 2017-10-13 02:13:41
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

    int updateByPrimaryKeySelective(@Param("record") Sequence record);

    int updateByPrimaryKey(Sequence record);

    List<Sequence> selectPage(SequenceExample example);

    int insertBatch(List<Sequence> list);



}
