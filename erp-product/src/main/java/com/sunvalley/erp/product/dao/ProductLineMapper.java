package com.sunvalley.erp.product.dao;
import com.sunvalley.erp.product.model.ProductLine;
import com.sunvalley.erp.product.model.ProductLineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
* @Description: ProductLineMapper
* @author
* @date 2017-09-22 04:55:21
*/
@Repository
public interface ProductLineMapper {

    int countByExample(ProductLineExample example);

    int deleteByExample(ProductLineExample example);

    int deleteByPrimaryKey(java.lang.Integer id);

    int insert(ProductLine record);

    int insertSelective(ProductLine record);

    List<ProductLine> selectByExample(ProductLineExample example);

    ProductLine selectByPrimaryKey(java.lang.Integer id);

    int updateByExampleSelective(@Param("record") ProductLine record, @Param("example") ProductLineExample example);

    int updateByExample(@Param("record") ProductLine record, @Param("example") ProductLineExample example);

    int updateByPrimaryKeySelective(ProductLine record);

    int updateByPrimaryKey(ProductLine record);

    List<ProductLine> selectPage(ProductLineExample example);

    int insertBatch(List<ProductLine> list);



}
