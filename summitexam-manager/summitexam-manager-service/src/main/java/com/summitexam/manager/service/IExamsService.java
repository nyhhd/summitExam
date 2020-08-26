package com.summitexam.manager.service;

import java.util.List;

import com.summitexam.bean.Exams;
import com.summitexam.common.PageVo;

public interface IExamsService {
	//根据考试信息表的主键查考试信息
	Exams getExamById(int id);
	PageVo<Exams> getExams(Exams exam);
	boolean insertExam(Exams exam);
	boolean deleteExamsByIds(List<Integer> ids);
	boolean updateExam(Exams exam);
	List<Integer> getExams(int examsCreatorId);
}
