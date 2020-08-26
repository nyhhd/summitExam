package com.summitexam.dao;

import com.summitexam.bean.Exams;
import com.summitexam.bean.ExamsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExamsMapper {
    int countByExample(ExamsExample example);

    int deleteByExample(ExamsExample example);

    int deleteByPrimaryKey(Integer examsId);

    int insert(Exams record);

    int insertSelective(Exams record);

    List<Exams> selectByExample(ExamsExample example);

    Exams selectByPrimaryKey(Integer examsId);

    int updateByExampleSelective(@Param("record") Exams record, @Param("example") ExamsExample example);

    int updateByExample(@Param("record") Exams record, @Param("example") ExamsExample example);

    int updateByPrimaryKeySelective(Exams record);

    int updateByPrimaryKey(Exams record);
}