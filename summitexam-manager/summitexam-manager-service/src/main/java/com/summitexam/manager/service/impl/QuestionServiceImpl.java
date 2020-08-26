package com.summitexam.manager.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.summitexam.bean.Question;
import com.summitexam.bean.QuestionExample;
import com.summitexam.bean.QuestionExample.Criteria;
import com.summitexam.common.PageVo;
import com.summitexam.bean.QuestionOption;
import com.summitexam.bean.User;
import com.summitexam.dao.QuestionMapper;
import com.summitexam.manager.service.IQuestionOptionService;
import com.summitexam.manager.service.IQuestionService;
import com.summitexam.manager.service.IStaticDataService;
import com.summitexam.manager.service.IUserService;
@Service
public class QuestionServiceImpl implements IQuestionService{
	@Autowired
	private QuestionMapper questionMapper;
	@Autowired
	private QuestionExample questionExample;
	@Autowired
	private IStaticDataService staticDataServiceImpl;
	@Autowired
	private IQuestionOptionService questionOptionServiceImpl;
	@Autowired
	private IUserService userServiceImpl;
	
	@Override
	public Question selectQuestionById(int questionId) {
		// TODO Auto-generated method stub
		Question question = questionMapper.selectByPrimaryKey(questionId);
		List<Question> lists = new ArrayList<Question>();
		lists.add(question);
		manageQuestions(lists);
		return lists.get(0);
	}

	@Override
	public PageVo<Question> selectQuestionsByLike(Question question) {
		// TODO Auto-generated method stub
		//题目的名字,题目的难易级别,题目类型,题目科目分类需支持模糊查询
		PageVo<Question> pageVo;
		Page page = null;
		if(question.getPageNum() != null && question.getPageSize() != null) {
			page = PageHelper.startPage(question.getPageNum(), question.getPageSize());
		}else {
			page = PageHelper.startPage(1,10);
		}
		Criteria criteria = questionExample.createCriteria();
		Criteria criteria1 = questionExample.createCriteria();
		if(null != question.getQuestionName() && "" != question.getQuestionName()  ) {
			String questionName = "%" + question.getQuestionName() + "%";
			criteria.andQuestionNameLike(questionName);
			criteria1.andQuestionNameLike(questionName);
		}
		if(null != question.getQuestionLevelId() && !question.getQuestionLevelId().equals("0") && !question.getQuestionLevelId().equals("")) {
			criteria.andQuestionLevelIdEqualTo(question.getQuestionLevelId());
			criteria1.andQuestionLevelIdEqualTo(question.getQuestionLevelId());
		}
		if(null != question.getQuestionTypeId() && !question.getQuestionTypeId().equals("0") && !question.getQuestionTypeId().equals("")) {
			criteria.andQuestionTypeIdEqualTo(question.getQuestionTypeId());
			criteria1.andQuestionTypeIdEqualTo(question.getQuestionTypeId());
		}
		if(null != question.getQuestionCategoryId() && !question.getQuestionCategoryId().equals("0") && !question.getQuestionCategoryId().equals("")) {
			criteria.andQuestionCategoryIdEqualTo(question.getQuestionCategoryId());
			criteria1.andQuestionCategoryIdEqualTo(question.getQuestionCategoryId());
		}
		
		//为出题者时，则只查回自己创建的和开放的
		if(null != question.getUserRoleId() && question.getUserRoleId() == 2) {
			criteria.andQuestionCreatorIdEqualTo(question.getUserId());
			criteria1.andIsOpenEqualTo("1");
		}
		criteria.andQuestionCategoryIdNotEqualTo("2");
		criteria1.andQuestionCategoryIdNotEqualTo("2");
		questionExample.setOrderByClause("create_time desc");
		questionExample.or(criteria1);
		List<Question> examples = questionMapper.selectByExample(questionExample);
		if(examples != null && examples.size() > 0) {
			for(Question que : examples) {
				User user = userServiceImpl.selectUser(que.getQuestionCreatorId());
				que.setQuestionCreatorNickname(user.getUserNickname());
			}
		}
		long total = page.getTotal();
		
		
		manageQuestions(examples);
		pageVo = new PageVo<>((int)total,examples);

		questionExample.clear();
		return pageVo;
	}
	
	//将查询出的数据进行封装
	private void manageQuestions(List<Question> examples) {
		if(null != examples) {
			List<Integer> lists;
			for(Question ques : examples) {
				String questionLevelDesc = staticDataServiceImpl.getStaticData("QUESTION_LEVEL", ques.getQuestionLevelId());
				if(null != questionLevelDesc) {
					ques.setQuestionLevelDesc(questionLevelDesc);
				}
				String questionCategory = staticDataServiceImpl.getStaticData("QUESTION_CATEGORY", ques.getQuestionCategoryId());
				if(null != questionCategory) {
					ques.setQuestionCategoryDesc(questionCategory);
				}
				String questionTypeDesc = staticDataServiceImpl.getStaticData("QUESTION_TYPE", ques.getQuestionTypeId());
				if(null != questionTypeDesc) {
					ques.setQuestionTypeDesc(questionTypeDesc);
				}
				if(null != ques.getQuestionOptionIds()) {
					lists = new ArrayList<>();
					String ids = ques.getQuestionOptionIds();
					String[] split = ids.split("-");
					for(String s : split) {
						Integer  i = Integer.parseInt(s);
						lists.add(i);
					}
					List<QuestionOption> QuestionOptions = questionOptionServiceImpl.selectQuestionOptionsByIds(lists);
					ques.setQuestionOptionList(QuestionOptions);
				}
			}
		}
	}
	
	//因为前台传的单选题的选项还没创建,所以还需做处理
	@Override
	public void insertQuestion(Question question) {
		// TODO Auto-generated method stub
		//如果为单选或者多选题则还需进行处理创建题目选项
		if(null != question.getQuestionTypeId() && !question.getQuestionTypeId().equals("3")) {
			String optionStr = question.getQuestionOptionIds();
			String answerStr = question.getQuestionAnswerOptionIds();
			String[] optionStrings = optionStr.split("-");
			String[] answerStrings = answerStr.split("-");
			String questionOptionIds = "";
			String questionAnswerOptionIds = "";
			for(String str : optionStrings) {
				boolean flag = false;
				QuestionOption option = new QuestionOption();
				option.setQuestionOptionContent(str);
				option.setQuestionOptionDescription(str);
				//当选项同时是答案时
				for(String str1 : answerStrings) {
					if(str1.equals(str)) {
						flag = true;
						break;
					}
				}
				int optionid = questionOptionServiceImpl.insertQuestionOption(option);
				questionOptionIds += "-" + optionid;
				if(flag) {
					questionAnswerOptionIds += "-" + optionid;
				}
			}
			questionOptionIds = questionOptionIds.substring(1,questionOptionIds.length());
			questionAnswerOptionIds = questionAnswerOptionIds.substring(1,questionAnswerOptionIds.length());
			question.setQuestionAnswerOptionIds(questionAnswerOptionIds);
			question.setQuestionOptionIds(questionOptionIds);
			
		}
		question.setCreateTime(new Date());
		question.setUpdateTime(new Date());
		questionMapper.insert(question);
	}

	@Override
	public void updateQuestion(Question question) {
		// TODO Auto-generated method stub
		Question BeforeQuestion = null;
		if(null != question.getQuestionId()) {
			BeforeQuestion = questionMapper.selectByPrimaryKey(question.getQuestionId());
		}
		
		//更新题目选项表中的内容
		if(null != question.getQuestionOptionList() || question.getQuestionOptionList().size() > 0) {
			List<QuestionOption> optionList = question.getQuestionOptionList();
			for(QuestionOption questionOption : optionList) {
				questionOptionServiceImpl.updateQuestionOption(questionOption);
			}
		}
		
		//更新答案
		if(null != BeforeQuestion && BeforeQuestion.getQuestionAnswerOptionIds() != null) {
			BeforeQuestion.setQuestionName(question.getQuestionName());
			BeforeQuestion.setQuestionAnswerOptionIds(question.getQuestionAnswerOptionIds());
			BeforeQuestion.setQuestionCategoryId(question.getQuestionCategoryId());
			BeforeQuestion.setQuestionLevelId(question.getQuestionLevelId());
			BeforeQuestion.setQuestionDescription(question.getQuestionDescription());
			BeforeQuestion.setUpdateTime(new Date());
			questionMapper.updateByPrimaryKey(BeforeQuestion);
		}
	
	}

	@Override
	public void deleteQuestionByIds(List<Integer> ids) {
		// TODO Auto-generated method stub
		Criteria criteria = questionExample.createCriteria();
		criteria.andQuestionIdIn(ids);
		questionMapper.deleteByExample(questionExample);
		questionExample.clear();
	}

	@Override
	public int selectQuestionCount() {
		// TODO Auto-generated method stub
		return questionMapper.selectByExample(questionExample).size();
	}

	@Override
	public List<Question> selectQuestionsByTypeId(Question question) {
		// TODO Auto-generated method stub
		Criteria criteria = questionExample.createCriteria();
		Criteria criteria1 = questionExample.createCriteria();
		criteria.andQuestionTypeIdEqualTo(question.getTypeId()+"");
		criteria1.andQuestionTypeIdEqualTo(question.getTypeId()+"");
		
		criteria.andQuestionCreatorIdEqualTo(question.getUserId());
		criteria1.andIsOpenEqualTo("1");
		
		//排除驾考的试题
		criteria.andQuestionCategoryIdNotEqualTo("2");
		criteria1.andQuestionCategoryIdNotEqualTo("2");
		questionExample.or(criteria1);
		List<Question> list = questionMapper.selectByExample(questionExample);
		questionExample.clear();
		return list;
	}

}
