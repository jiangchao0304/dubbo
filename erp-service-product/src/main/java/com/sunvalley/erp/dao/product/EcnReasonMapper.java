package com.sunvalley.erp.dao.product;

import com.sunvalley.erp.model.product.EcnReason;
import com.sunvalley.erp.model.product.EcnReasonExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface EcnReasonMapper {
    int countByExample(EcnReasonExample example);

    int deleteByExample(EcnReasonExample example);

    @Delete({
        "delete from bs_ecn_reason",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into bs_ecn_reason (reason_name, remark, ",
        "create_date, create_user_id, ",
        "update_date, update_user_id)",
        "values (#{reasonName,jdbcType=VARCHAR}, #{remark,jdbcType=VARCHAR}, ",
        "#{createDate,jdbcType=TIMESTAMP}, #{createUserId,jdbcType=INTEGER}, ",
        "#{updateDate,jdbcType=TIMESTAMP}, #{updateUserId,jdbcType=INTEGER})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(EcnReason record);

    int insertSelective(EcnReason record);

    List<EcnReason> selectByExample(EcnReasonExample example);

    @Select({
        "select",
        "id, reason_name, remark, create_date, create_user_id, update_date, update_user_id",
        "from bs_ecn_reason",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    EcnReason selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EcnReason record, @Param("example") EcnReasonExample example);

    int updateByExample(@Param("record") EcnReason record, @Param("example") EcnReasonExample example);

    int updateByPrimaryKeySelective(EcnReason record);

    @Update({
        "update bs_ecn_reason",
        "set reason_name = #{reasonName,jdbcType=VARCHAR},",
          "remark = #{remark,jdbcType=VARCHAR},",
          "create_date = #{createDate,jdbcType=TIMESTAMP},",
          "create_user_id = #{createUserId,jdbcType=INTEGER},",
          "update_date = #{updateDate,jdbcType=TIMESTAMP},",
          "update_user_id = #{updateUserId,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(EcnReason record);

    List<EcnReason> selectPage(EcnReasonExample example);
}