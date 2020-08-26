package com.summitexam.manager.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.summitexam.bean.QuestionOption;
import com.summitexam.bean.QuestionOptionExample;
import com.summitexam.bean.QuestionOptionExample.Criteria;
import com.summitexam.dao.QuestionOptionMapper;
import com.summitexam.manager.service.IQuestionOptionService;

@Service
public class QuestionOptionServiceImpl implements IQuestionOptionService {
	@Autowired
	private QuestionOptionMapper questionOptionMapper;
	@Autowired
	private QuestionOptionExample questionOptionExample;
	
	@Override
	public QuestionOption selectQuestionOptionById(int QuestionOptionId) {
		// TODO Auto-generated method stub
		QuestionOption questionOptions = questionOptionMapper.selectByPrimaryKey(QuestionOptionId);
		return questionOptions;
	}
	
	
	//插入题目选项时,先判重
	@Override
	public int insertQuestionOption(QuestionOption QuestionOption) {
		// TODO Auto-generated method stub
		Criteria criteria = questionOptionExample.createCriteria();
		if(null != QuestionOption.getQuestionOptionContent()) {
			criteria.andQuestionOptionContentEqualTo(QuestionOption.getQuestionOptionContent());
		}
		List<QuestionOption> lists = questionOptionMapper.selectByExample(questionOptionExample);
		questionOptionExample.clear();
		if(null != lists && lists.size() > 0) {
			return lists.get(0).getQuestionOptionId();
		}
		questionOptionMapper.insert(QuestionOption);
		return QuestionOption.getQuestionOptionId();
	}

	@Override
	public void updateQuestionOption(QuestionOption QuestionOption) {
		// TODO Auto-generated method stub
		questionOptionMapper.updateByPrimaryKey(QuestionOption);
	}

	@Override
	public List<QuestionOption> selectQuestionOptionsByIds(List<Integer> ids) {
		// TODO Auto-generated method stub
		Criteria criteria = questionOptionExample.createCriteria();
		criteria.andQuestionOptionIdIn(ids);
		List<QuestionOption> list = questionOptionMapper.selectByExample(questionOptionExample);
		questionOptionExample.clear();
		return list;
	}


}
