package com.sunvalley.erp.product.dao;
import com.sunvalley.erp.product.model.ItemFile;
import com.sunvalley.erp.product.model.ItemFileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
* @Description: ItemFileMapper
* @author
* @date 2017-10-10 06:03:04
*/
@Repository
public interface ItemFileMapper {

    int countByExample(ItemFileExample example);

    int deleteByExample(ItemFileExample example);

    int deleteByPrimaryKey(java.lang.Integer itemFileId);

    int insert(ItemFile record);

    int insertSelective(ItemFile record);

    List<ItemFile> selectByExample(ItemFileExample example);

    ItemFile selectByPrimaryKey(java.lang.Integer itemFileId);

    int updateByExampleSelective(@Param("record") ItemFile record, @Param("example") ItemFileExample example);

    int updateByExample(@Param("record") ItemFile record, @Param("example") ItemFileExample example);

    int updateByPrimaryKeySelective(ItemFile record);

    int updateByPrimaryKey(ItemFile record);

    List<ItemFile> selectPage(ItemFileExample example);

    int insertBatch(List<ItemFile> list);



}
