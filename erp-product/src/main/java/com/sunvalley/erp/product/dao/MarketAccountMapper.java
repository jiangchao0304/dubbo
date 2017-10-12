package com.sunvalley.erp.product.dao;
import com.sunvalley.erp.product.model.MarketAccount;
import com.sunvalley.erp.product.model.MarketAccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
* @Description: MarketAccountMapper
* @author
* @date 2017-10-12 11:31:39
*/
@Repository
public interface MarketAccountMapper {

    int countByExample(MarketAccountExample example);

    int deleteByExample(MarketAccountExample example);

    int deleteByPrimaryKey(java.lang.Integer maid);

    int insert(MarketAccount record);

    int insertSelective(MarketAccount record);

    List<MarketAccount> selectByExample(MarketAccountExample example);

    MarketAccount selectByPrimaryKey(java.lang.Integer maid);

    int updateByExampleSelective(@Param("record") MarketAccount record, @Param("example") MarketAccountExample example);

    int updateByExample(@Param("record") MarketAccount record, @Param("example") MarketAccountExample example);

    int updateByPrimaryKeySelective(MarketAccount record);

    int updateByPrimaryKey(MarketAccount record);

    List<MarketAccount> selectPage(MarketAccountExample example);

    int insertBatch(List<MarketAccount> list);



}
