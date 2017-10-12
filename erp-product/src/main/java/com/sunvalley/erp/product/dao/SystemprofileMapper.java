package com.sunvalley.erp.product.dao;
import com.sunvalley.erp.product.model.Systemprofile;
import com.sunvalley.erp.product.model.SystemprofileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
* @Description: SystemprofileMapper
* @author
* @date 2017-10-12 04:28:14
*/
@Repository
public interface SystemprofileMapper {

    int countByExample(SystemprofileExample example);

    int deleteByExample(SystemprofileExample example);

    int deleteByPrimaryKey(java.lang.Integer companyid);

    int insert(Systemprofile record);

    int insertSelective(Systemprofile record);

    List<Systemprofile> selectByExample(SystemprofileExample example);

    Systemprofile selectByPrimaryKey(java.lang.Integer companyid);

    int updateByExampleSelective(@Param("record") Systemprofile record, @Param("example") SystemprofileExample example);

    int updateByExample(@Param("record") Systemprofile record, @Param("example") SystemprofileExample example);

    int updateByPrimaryKeySelective(Systemprofile record);

    int updateByPrimaryKey(Systemprofile record);

    List<Systemprofile> selectPage(SystemprofileExample example);

    int insertBatch(List<Systemprofile> list);



}
