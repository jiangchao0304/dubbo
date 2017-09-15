package com.sunvalley.erp.dao.product;
import com.sunvalley.erp.model.product.ProductLine;
import com.sunvalley.erp.model.product.ProductLineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* @Description: ProductLineMapper
* @author
* @date 2017-09-15 10:14:07
*/
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
