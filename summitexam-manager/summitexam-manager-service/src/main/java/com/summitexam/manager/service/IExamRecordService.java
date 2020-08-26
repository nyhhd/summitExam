package com.summitexam.manager.service;

import java.util.List;

import com.summitexam.bean.ExamRecord;

public interface IExamRecordService {
	List<ExamRecord> getExamRecords(int userId);
	List<ExamRecord> getExamRecordsByLike(int userId, String examName);
	void insertExamRecords(ExamRecord examRecord);
	ExamRecord selectExamRecordById(int examRecordId);
	List<ExamRecord> getExamRecordsByExamId(int examId);
}
