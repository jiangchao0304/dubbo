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

    @Select({
        "select",
        "id, reason_name, remark, create_date, create_user_id, update_date, update_user_id",
        "from bs_ecn_reason",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    EcnReason selectByPrimaryKey(Integer id);

}