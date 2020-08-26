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
import com.summitexam.bean.Exam;
import com.summitexam.bean.ExamExample;
import com.summitexam.bean.ExamRecord;
import com.summitexam.bean.ExamExample.Criteria;
import com.summitexam.bean.Exams;
import com.summitexam.bean.ExamsExample;
import com.summitexam.common.PageVo;
import com.summitexam.dao.ExamMapper;
import com.summitexam.dao.ExamsMapper;
import com.summitexam.manager.service.IExamRecordService;
import com.summitexam.manager.service.IExamService;

@Service
public class ExamServiceImpl implements IExamService{
	@Autowired
	private	ExamMapper examMapper;
	@Autowired
	private ExamExample examExample;
	@Autowired
	private IExamRecordService iexamRecordService; 
	
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
	
	@Override
	public boolean insertExam(Exam exam) {
		// TODO Auto-generated method stub
		String nowdateTemp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		exam.setCreateTime(nowdateTemp);
		exam.setUpdateTime(nowdateTemp);
		
		examMapper.insert(exam);
		return true;
	}
	
	@Override
	public PageVo<Exam> getExamByLike(Exam exam) {
		// TODO Auto-generated method stub
		Page<Object> page;
		PageVo<Exam> pageVo;
		//为了or查询
		Criteria createCriteria = examExample.createCriteria();
		if(exam.getUserRoleId() != null && exam.getUserRoleId() == 3) {
			//查询回已经参与过的考试记录信息,返回的是考试信息表的ids
			ArrayList<Integer> examIds = handleDiv(exam.getUserId());
			if(examIds != null && examIds.size() > 0) {
				createCriteria.andExamIdNotIn(examIds);
			}
			createCriteria.andExamineeIdsLike("%"+exam.getUserId()+"%");
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
		}
		
		//模糊查询匹配试卷创建者
		if(null != exam.getExamName() && "" != exam.getExamName()) {
			String nickName = "%" + exam.getExamName() + "%";
			createCriteria.andExamNameLike(nickName);
		}
		
		examExample.setOrderByClause("create_time desc");
		List<Exam> exams = examMapper.selectByExample(examExample);
		
		long total = page.getTotal();
		pageVo = new PageVo<>((int)total,exams);
		examExample.clear();
		return pageVo;
	}

	@Override
	public boolean deleteExamsByIds(List<Integer> ids) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateExam(Exam exam) {
		// TODO Auto-generated method stub
		String nowdateTemp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		exam.setUpdateTime(nowdateTemp);
		examMapper.updateByPrimaryKey(exam);
		return true;
	}

	@Override
	public List<Integer> getExams(int examsCreatorId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Exam> getExam(Exam exam) {
		// TODO Auto-generated method stub\
		Criteria createCriteria = examExample.createCriteria();
		if(null != exam.getUserId() && exam.getUserId() != 0) {
			String nickName = "%" + exam.getUserId()+ "%";
			createCriteria.andExamineeIdsLike(nickName);
		}
		if(null != exam.getExamId() && exam.getExamId() != 0) {
			createCriteria.andExamIdEqualTo(exam.getExamId());
		}
		List<Exam> exams = examMapper.selectByExample(examExample);
		examExample.clear();
		return exams;
	}

	@Override
	public Exam getExamRecordsByExamId(int examId) {
		// TODO Auto-generated method stub
		List<ExamRecord> examRecords = iexamRecordService.getExamRecordsByExamId(examId);
		
		Exam exam = examMapper.selectByPrimaryKey(examId);
		
		exam.setExamRecords(examRecords);
		return exam;
	}
	
}
