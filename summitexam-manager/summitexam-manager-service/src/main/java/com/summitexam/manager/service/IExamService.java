package com.summitexam.manager.service;

import java.util.List;

import com.summitexam.bean.Exam;
import com.summitexam.bean.Exams;
import com.summitexam.common.PageVo;

public interface IExamService {
	boolean insertExam(Exam exam);
	PageVo<Exam> getExamByLike(Exam exam);
	List<Exam> getExam(Exam exam);
	boolean deleteExamsByIds(List<Integer> ids);
	boolean updateExam(Exam exam);
	List<Integer> getExams(int examsCreatorId);
	Exam  getExamRecordsByExamId(int examId);
}
