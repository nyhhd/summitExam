package com.summitexam.dao;

import com.summitexam.bean.StaticData;
import com.summitexam.bean.StaticDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StaticDataMapper {
    int countByExample(StaticDataExample example);

    int deleteByExample(StaticDataExample example);

    int insert(StaticData record);

    int insertSelective(StaticData record);

    List<StaticData> selectByExample(StaticDataExample example);

    int updateByExampleSelective(@Param("record") StaticData record, @Param("example") StaticDataExample example);

    int updateByExample(@Param("record") StaticData record, @Param("example") StaticDataExample example);
}