package com.sunvalley.erp.product.dao;
import com.sunvalley.erp.product.model.OrganizationDetail;
import com.sunvalley.erp.product.model.OrganizationDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
* @Description: OrganizationDetailMapper
* @author
* @date 2017-09-25 03:10:30
*/
@Repository
public interface OrganizationDetailMapper {

    int countByExample(OrganizationDetailExample example);

    int deleteByExample(OrganizationDetailExample example);

    int deleteByPrimaryKey(java.lang.Integer id);

    int insert(OrganizationDetail record);

    int insertSelective(OrganizationDetail record);

    List<OrganizationDetail> selectByExample(OrganizationDetailExample example);

    OrganizationDetail selectByPrimaryKey(java.lang.Integer id);

    int updateByExampleSelective(@Param("record") OrganizationDetail record, @Param("example") OrganizationDetailExample example);

    int updateByExample(@Param("record") OrganizationDetail record, @Param("example") OrganizationDetailExample example);

    int updateByPrimaryKeySelective(OrganizationDetail record);

    int updateByPrimaryKey(OrganizationDetail record);

    List<OrganizationDetail> selectPage(OrganizationDetailExample example);

    int insertBatch(List<OrganizationDetail> list);



}
