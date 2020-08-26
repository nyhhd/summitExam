package com.summitexam.manager.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.summitexam.bean.ExamRecord;
import com.summitexam.bean.Exams;
import com.summitexam.bean.ExamsExample;
import com.summitexam.bean.ExamsExample.Criteria;
import com.summitexam.common.PageVo;
import com.summitexam.dao.ExamsMapper;
import com.summitexam.manager.service.IExamRecordService;
import com.summitexam.manager.service.IExamsService;

@Service
public class ExamsServiceImpl implements IExamsService {
	@Autowired
	private	ExamsMapper examsMapper;
	@Autowired
	private ExamsExample examsExample;
	@Autowired
	private IExamRecordService iexamRecordService; 
	
	@Override
	public Exams getExamById(int id) {
		// TODO Auto-generated method stub
		Exams exams = examsMapper.selectByPrimaryKey(id);
		examsExample.clear();
		return exams;
	}
	
	private ArrayList<Integer> handleDiv(Integer id){
		//查询的排除当前用户已经参加过的
		List<ExamRecord> records = iexamRecordService.getExamRecords(id);
		ArrayList<Integer> examIds = null;
		if(null != records && records.size() != 0) {
			examIds = new ArrayList<>();
			for(ExamRecord record : records) {
				examIds.add(record.getExamId());
			}
			
			HashSet h = new HashSet(examIds);   
			examIds.clear();   
			examIds.addAll(h); 
			
		}
		return examIds;
	}
	
	//还要在exam表中新增用户使用名称字段
	@Override
	public PageVo<Exams> getExams(Exams exam) {
		// TODO Auto-generated method stub
		Page<Object> page;
		PageVo<Exams> pageVo;
		//为了or查询
		Criteria createCriteria = examsExample.createCriteria();
		Criteria createCriteria1 = examsExample.createCriteria();
		
		ArrayList<Integer> examIds = handleDiv(exam.getUserId());
		
		
		//根据当前用户的角色id来增加条件
		//出题者查看自己出的试卷,参考者查看对自己开放的和全部开放的
		if(null != exam.getUserRoleId() && exam.getUserRoleId() > 0) {
			//以及公开的,这两个条件没必要同时满足
			if(exam.getUserRoleId() == 2) {
				//查询出自己创建的
				createCriteria.andExamsCreatorIdEqualTo(exam.getUserId());
//				createCriteria1.andIsOpenEqualTo("1");
			}else if(exam.getUserRoleId() == 3) {
				if(null != examIds && examIds.size() != 0) {
					createCriteria.andExamsIdNotIn(examIds);
					createCriteria1.andExamsIdNotIn(examIds);
				}
				createCriteria.andExamineeIdsLike("%"+exam.getUserId()+"%");
				createCriteria.andIsOpenEqualTo("1");
			}
		}
		
		//使分页器不拦截上面查询时的内容,防止出现分页bug
		if(exam.getPageNum() != null && exam.getPageSize() != null) {
			page = PageHelper.startPage(exam.getPageNum(), exam.getPageSize());
		}else {
			page = PageHelper.startPage(1,10);
		}
		
		
		//模糊查询匹配试卷创建者
		if(null != exam.getExamsCreatorNickname() && "" != exam.getExamsCreatorNickname()) {
			String nickName = "%" + exam.getExamsCreatorNickname() + "%";
			createCriteria.andExamsCreatorNicknameLike(nickName);
			createCriteria1.andExamsCreatorNicknameLike(nickName);
		}
		
		//模糊匹配试卷名称
		if(null != exam.getExamsName() && "" != exam.getExamsName()) {
			String examName = "%" + exam.getExamsName() + "%";
			createCriteria.andExamsNameLike(examName);
			createCriteria1.andExamsNameLike(examName);
		}
		examsExample.setOrderByClause("create_time desc");
//		examsExample.or(createCriteria1);
		List<Exams> exams = examsMapper.selectByExample(examsExample);
		
		long total = page.getTotal();
		pageVo = new PageVo<>((int)total,exams);
		examsExample.clear();
		return pageVo;
	}

	@Override
	public boolean insertExam(Exams exam) {
		// TODO Auto-generated method stub
		String nowdateTemp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		exam.setCreateTime(nowdateTemp);
		exam.setUpdateTime(nowdateTemp);
		int checkScore = exam.getExamsScoreCheck() * (exam.getExamQuestionIdsCheck().split("-").length); 
		int radioScore = exam.getExamsScoreRadio() * (exam.getExamQuestionIdsRadio().split("-").length);
		int judgeScore = exam.getExamsScoreJudge() * (exam.getExamQuestionIdsJudge().split("-").length);
		int score = checkScore + radioScore + judgeScore;
		exam.setExamsScore(score);
		
		examsMapper.insert(exam);
		return true;
	}

	@Override
	public boolean deleteExamsByIds(List<Integer> ids) {
		// TODO Auto-generated method stub
		Criteria createCriteria = examsExample.createCriteria();
		createCriteria.andExamsIdIn(ids);
		int i = examsMapper.deleteByExample(examsExample);
		examsExample.clear();
		return true;
	}

	@Override
	public boolean updateExam(Exams exam) {
		// TODO Auto-generated method stub
		String nowdateTemp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		exam.setUpdateTime(nowdateTemp);
		int checkScore = exam.getExamsScoreCheck() * (exam.getExamQuestionIdsCheck().split("-").length); 
		int radioScore = exam.getExamsScoreRadio() * (exam.getExamQuestionIdsRadio().split("-").length);
		int judgeScore = exam.getExamsScoreJudge() * (exam.getExamQuestionIdsJudge().split("-").length);
		int score = checkScore + radioScore + judgeScore;
		exam.setExamsScore(score);
		examsMapper.updateByPrimaryKey(exam);
		return true;
	}

	@Override
	public List<Integer> getExams(int examsCreatorId) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		Criteria createCriteria = examsExample.createCriteria();
		createCriteria.andExamsCreatorIdEqualTo(examsCreatorId);
		List<Exams> exams = examsMapper.selectByExample(examsExample);
		if(null != exams && exams.size() > 0) {
			for(Exams exam : exams) {
				list.add(exam.getExamsId());
			}
		}
		
		examsExample.clear();
		return list;
	}

}
