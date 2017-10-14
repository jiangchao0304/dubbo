package com.sunvalley.erp.product.dao;
import com.sunvalley.erp.product.model.ProductType;
import com.sunvalley.erp.product.model.ProductTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
* @Description: ProductTypeMapper
* @author
* @date 2017-10-13 02:13:11
*/
@Repository
public interface ProductTypeMapper {

    int countByExample(ProductTypeExample example);

    int deleteByExample(ProductTypeExample example);

    int deleteByPrimaryKey(java.lang.Integer id);

    int insert(ProductType record);

    int insertSelective(ProductType record);

    List<ProductType> selectByExample(ProductTypeExample example);

    ProductType selectByPrimaryKey(java.lang.Integer id);

    int updateByExampleSelective(@Param("record") ProductType record, @Param("example") ProductTypeExample example);

    int updateByExample(@Param("record") ProductType record, @Param("example") ProductTypeExample example);

    int updateByPrimaryKeySelective(@Param("record") ProductType record);

    int updateByPrimaryKey(ProductType record);

    List<ProductType> selectPage(ProductTypeExample example);

    int insertBatch(List<ProductType> list);



}
