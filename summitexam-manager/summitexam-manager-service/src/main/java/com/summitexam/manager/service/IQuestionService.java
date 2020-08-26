package com.summitexam.manager.service;

import java.util.List;

import com.summitexam.bean.Question;
import com.summitexam.common.PageVo;

public interface IQuestionService {
	Question selectQuestionById(int questionId);
	int selectQuestionCount();
	PageVo<Question> selectQuestionsByLike(Question question);
	void insertQuestion(Question question);
	void updateQuestion(Question question);
	void deleteQuestionByIds(List<Integer> ids);
	List<Question> selectQuestionsByTypeId(Question question);
}
