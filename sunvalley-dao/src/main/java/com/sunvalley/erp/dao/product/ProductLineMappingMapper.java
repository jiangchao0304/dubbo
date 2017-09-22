package com.sunvalley.erp.dao.product;
import com.sunvalley.erp.model.product.ProductLineMapping;
import com.sunvalley.erp.model.product.ProductLineMappingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
* @Description: ProductLineMappingMapper
* @author
* @date 2017-09-22 04:18:09
*/
@Repository
public interface ProductLineMappingMapper {

    int countByExample(ProductLineMappingExample example);

    int deleteByExample(ProductLineMappingExample example);

    int deleteByPrimaryKey(java.lang.Integer id);

    int insert(ProductLineMapping record);

    int insertSelective(ProductLineMapping record);

    List<ProductLineMapping> selectByExample(ProductLineMappingExample example);

    ProductLineMapping selectByPrimaryKey(java.lang.Integer id);

    int updateByExampleSelective(@Param("record") ProductLineMapping record, @Param("example") ProductLineMappingExample example);

    int updateByExample(@Param("record") ProductLineMapping record, @Param("example") ProductLineMappingExample example);

    int updateByPrimaryKeySelective(ProductLineMapping record);

    int updateByPrimaryKey(ProductLineMapping record);

    List<ProductLineMapping> selectPage(ProductLineMappingExample example);

    int insertBatch(List<ProductLineMapping> list);



}
