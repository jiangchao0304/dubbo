package com.sunvalley.erp.dao.product;

import com.sunvalley.erp.model.product.Item;
import com.sunvalley.erp.model.product.ItemExample;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface ItemMapper {
    int countByExample(ItemExample example);

    int deleteByExample(ItemExample example);

    @Delete({
        "delete from bs_item",
        "where skuid = #{skuid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer skuid);

    @Insert({
        "insert into bs_item (sku, len, ",
        "width, height, ",
        "weight, volweight, ",
        "create_date, active, ",
        "isdrop, drop_def, isvirtual, ",
        "line_state, remark, ",
        "issale, zero_stock, zero_whid, ",
        "zero_qty, boxtype, ",
        "pmid, peid, isoriginal, ",
        "purdesc, purspec, ",
        "leadtime, skulable, ",
        "innersku_id, outersku_id, ",
        "pkgweight, pkgrate, ",
        "purpkg, stopkg, ",
        "standard, versionno, ",
        "updateuserid, updatedate, ",
        "haspic, updatepicuser, ",
        "updatepicdate, desc_sourc, ",
        "line_state_date, purtitle, ",
        "brand_id, purchaser_id, ",
        "product_len, product_width, ",
        "product_height, product_weight, ",
        "product_volweight, battery, ",
        "model, psid, updatedate2, ",
        "rmacategoryid, region, ",
        "create_user_id, pro_features, ",
        "categoryid, subcategoryid, ",
        "is_package, color, ",
        "model_id)",
        "values (#{sku,jdbcType=VARCHAR}, #{len,jdbcType=SMALLINT}, ",
        "#{width,jdbcType=SMALLINT}, #{height,jdbcType=SMALLINT}, ",
        "#{weight,jdbcType=SMALLINT}, #{volweight,jdbcType=SMALLINT}, ",
        "#{createDate,jdbcType=TIMESTAMP}, #{active,jdbcType=SMALLINT}, ",
        "#{isdrop,jdbcType=BIT}, #{dropDef,jdbcType=BIT}, #{isvirtual,jdbcType=TINYINT}, ",
        "#{lineState,jdbcType=TINYINT}, #{remark,jdbcType=VARCHAR}, ",
        "#{issale,jdbcType=BIT}, #{zeroStock,jdbcType=BIT}, #{zeroWhid,jdbcType=SMALLINT}, ",
        "#{zeroQty,jdbcType=SMALLINT}, #{boxtype,jdbcType=TINYINT}, ",
        "#{pmid,jdbcType=INTEGER}, #{peid,jdbcType=INTEGER}, #{isoriginal,jdbcType=BIT}, ",
        "#{purdesc,jdbcType=VARCHAR}, #{purspec,jdbcType=VARCHAR}, ",
        "#{leadtime,jdbcType=TINYINT}, #{skulable,jdbcType=VARCHAR}, ",
        "#{innerskuId,jdbcType=INTEGER}, #{outerskuId,jdbcType=INTEGER}, ",
        "#{pkgweight,jdbcType=SMALLINT}, #{pkgrate,jdbcType=SMALLINT}, ",
        "#{purpkg,jdbcType=VARCHAR}, #{stopkg,jdbcType=VARCHAR}, ",
        "#{standard,jdbcType=INTEGER}, #{versionno,jdbcType=SMALLINT}, ",
        "#{updateuserid,jdbcType=INTEGER}, #{updatedate,jdbcType=TIMESTAMP}, ",
        "#{haspic,jdbcType=BIT}, #{updatepicuser,jdbcType=VARCHAR}, ",
        "#{updatepicdate,jdbcType=TIMESTAMP}, #{descSourc,jdbcType=VARCHAR}, ",
        "#{lineStateDate,jdbcType=TIMESTAMP}, #{purtitle,jdbcType=VARCHAR}, ",
        "#{brandId,jdbcType=INTEGER}, #{purchaserId,jdbcType=INTEGER}, ",
        "#{productLen,jdbcType=SMALLINT}, #{productWidth,jdbcType=SMALLINT}, ",
        "#{productHeight,jdbcType=SMALLINT}, #{productWeight,jdbcType=SMALLINT}, ",
        "#{productVolweight,jdbcType=SMALLINT}, #{battery,jdbcType=INTEGER}, ",
        "#{model,jdbcType=VARCHAR}, #{psid,jdbcType=INTEGER}, #{updatedate2,jdbcType=TIMESTAMP}, ",
        "#{rmacategoryid,jdbcType=INTEGER}, #{region,jdbcType=INTEGER}, ",
        "#{createUserId,jdbcType=INTEGER}, #{proFeatures,jdbcType=VARCHAR}, ",
        "#{categoryid,jdbcType=INTEGER}, #{subcategoryid,jdbcType=INTEGER}, ",
        "#{isPackage,jdbcType=INTEGER}, #{color,jdbcType=INTEGER}, ",
        "#{modelId,jdbcType=INTEGER})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="skuid", before=false, resultType=Integer.class)
    int insert(Item record);

    int insertSelective(Item record);

    List<Item> selectByExample(ItemExample example);

    @Select({
        "select",
        "skuid, sku, len, width, height, weight, volweight, create_date, active, isdrop, ",
        "drop_def, isvirtual, line_state, remark, issale, zero_stock, zero_whid, zero_qty, ",
        "boxtype, pmid, peid, isoriginal, purdesc, purspec, leadtime, skulable, innersku_id, ",
        "outersku_id, pkgweight, pkgrate, purpkg, stopkg, standard, versionno, updateuserid, ",
        "updatedate, haspic, updatepicuser, updatepicdate, desc_sourc, line_state_date, ",
        "purtitle, brand_id, purchaser_id, product_len, product_width, product_height, ",
        "product_weight, product_volweight, battery, model, psid, updatedate2, rmacategoryid, ",
        "region, create_user_id, pro_features, categoryid, subcategoryid, is_package, ",
        "color, model_id",
        "from bs_item",
        "where skuid = #{skuid,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    Item selectByPrimaryKey(Integer skuid);

    int updateByExampleSelective(@Param("record") Item record, @Param("example") ItemExample example);

    int updateByExample(@Param("record") Item record, @Param("example") ItemExample example);

    int updateByPrimaryKeySelective(Item record);

    @Update({
        "update bs_item",
        "set sku = #{sku,jdbcType=VARCHAR},",
          "len = #{len,jdbcType=SMALLINT},",
          "width = #{width,jdbcType=SMALLINT},",
          "height = #{height,jdbcType=SMALLINT},",
          "weight = #{weight,jdbcType=SMALLINT},",
          "volweight = #{volweight,jdbcType=SMALLINT},",
          "create_date = #{createDate,jdbcType=TIMESTAMP},",
          "active = #{active,jdbcType=SMALLINT},",
          "isdrop = #{isdrop,jdbcType=BIT},",
          "drop_def = #{dropDef,jdbcType=BIT},",
          "isvirtual = #{isvirtual,jdbcType=TINYINT},",
          "line_state = #{lineState,jdbcType=TINYINT},",
          "remark = #{remark,jdbcType=VARCHAR},",
          "issale = #{issale,jdbcType=BIT},",
          "zero_stock = #{zeroStock,jdbcType=BIT},",
          "zero_whid = #{zeroWhid,jdbcType=SMALLINT},",
          "zero_qty = #{zeroQty,jdbcType=SMALLINT},",
          "boxtype = #{boxtype,jdbcType=TINYINT},",
          "pmid = #{pmid,jdbcType=INTEGER},",
          "peid = #{peid,jdbcType=INTEGER},",
          "isoriginal = #{isoriginal,jdbcType=BIT},",
          "purdesc = #{purdesc,jdbcType=VARCHAR},",
          "purspec = #{purspec,jdbcType=VARCHAR},",
          "leadtime = #{leadtime,jdbcType=TINYINT},",
          "skulable = #{skulable,jdbcType=VARCHAR},",
          "innersku_id = #{innerskuId,jdbcType=INTEGER},",
          "outersku_id = #{outerskuId,jdbcType=INTEGER},",
          "pkgweight = #{pkgweight,jdbcType=SMALLINT},",
          "pkgrate = #{pkgrate,jdbcType=SMALLINT},",
          "purpkg = #{purpkg,jdbcType=VARCHAR},",
          "stopkg = #{stopkg,jdbcType=VARCHAR},",
          "standard = #{standard,jdbcType=INTEGER},",
          "versionno = #{versionno,jdbcType=SMALLINT},",
          "updateuserid = #{updateuserid,jdbcType=INTEGER},",
          "updatedate = #{updatedate,jdbcType=TIMESTAMP},",
          "haspic = #{haspic,jdbcType=BIT},",
          "updatepicuser = #{updatepicuser,jdbcType=VARCHAR},",
          "updatepicdate = #{updatepicdate,jdbcType=TIMESTAMP},",
          "desc_sourc = #{descSourc,jdbcType=VARCHAR},",
          "line_state_date = #{lineStateDate,jdbcType=TIMESTAMP},",
          "purtitle = #{purtitle,jdbcType=VARCHAR},",
          "brand_id = #{brandId,jdbcType=INTEGER},",
          "purchaser_id = #{purchaserId,jdbcType=INTEGER},",
          "product_len = #{productLen,jdbcType=SMALLINT},",
          "product_width = #{productWidth,jdbcType=SMALLINT},",
          "product_height = #{productHeight,jdbcType=SMALLINT},",
          "product_weight = #{productWeight,jdbcType=SMALLINT},",
          "product_volweight = #{productVolweight,jdbcType=SMALLINT},",
          "battery = #{battery,jdbcType=INTEGER},",
          "model = #{model,jdbcType=VARCHAR},",
          "psid = #{psid,jdbcType=INTEGER},",
          "updatedate2 = #{updatedate2,jdbcType=TIMESTAMP},",
          "rmacategoryid = #{rmacategoryid,jdbcType=INTEGER},",
          "region = #{region,jdbcType=INTEGER},",
          "create_user_id = #{createUserId,jdbcType=INTEGER},",
          "pro_features = #{proFeatures,jdbcType=VARCHAR},",
          "categoryid = #{categoryid,jdbcType=INTEGER},",
          "subcategoryid = #{subcategoryid,jdbcType=INTEGER},",
          "is_package = #{isPackage,jdbcType=INTEGER},",
          "color = #{color,jdbcType=INTEGER},",
          "model_id = #{modelId,jdbcType=INTEGER}",
        "where skuid = #{skuid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Item record);

    List<Item> selectPage(ItemExample example);

    int insertBatch(List<Item> list);
}