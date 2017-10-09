package com.sunvalley.erp.product.dao;
import com.sunvalley.erp.product.model.Video;
import com.sunvalley.erp.product.model.VideoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
* @Description: VideoMapper
* @author
* @date 2017-10-10 06:12:35
*/
@Repository
public interface VideoMapper {

    int countByExample(VideoExample example);

    int deleteByExample(VideoExample example);

    int deleteByPrimaryKey(java.lang.Integer videoId);

    int insert(Video record);

    int insertSelective(Video record);

    List<Video> selectByExample(VideoExample example);

    Video selectByPrimaryKey(java.lang.Integer videoId);

    int updateByExampleSelective(@Param("record") Video record, @Param("example") VideoExample example);

    int updateByExample(@Param("record") Video record, @Param("example") VideoExample example);

    int updateByPrimaryKeySelective(Video record);

    int updateByPrimaryKey(Video record);

    List<Video> selectPage(VideoExample example);

    int insertBatch(List<Video> list);



}
