package com.summitexam.manager.service;

import java.util.List;

import com.summitexam.bean.QuestionOption;

public interface IQuestionOptionService {
	QuestionOption selectQuestionOptionById(int QuestionOptionId);
	List<QuestionOption> selectQuestionOptionsByIds(List<Integer> ids);
	int insertQuestionOption(QuestionOption QuestionOption);
	void updateQuestionOption(QuestionOption QuestionOption);
}
