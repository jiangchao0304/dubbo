package com.sunvalley.erp.product.dao;
import com.sunvalley.erp.product.model.Organization;
import com.sunvalley.erp.product.model.OrganizationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
* @Description: OrganizationMapper
* @author
* @date 2017-10-12 04:26:09
*/
@Repository
public interface OrganizationMapper {

    int countByExample(OrganizationExample example);

    int deleteByExample(OrganizationExample example);

    int deleteByPrimaryKey(java.lang.Integer id);

    int insert(Organization record);

    int insertSelective(Organization record);

    List<Organization> selectByExample(OrganizationExample example);

    Organization selectByPrimaryKey(java.lang.Integer id);

    int updateByExampleSelective(@Param("record") Organization record, @Param("example") OrganizationExample example);

    int updateByExample(@Param("record") Organization record, @Param("example") OrganizationExample example);

    int updateByPrimaryKeySelective(Organization record);

    int updateByPrimaryKey(Organization record);

    List<Organization> selectPage(OrganizationExample example);

    int insertBatch(List<Organization> list);



}
