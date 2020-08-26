package com.summitexam.manager.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.summitexam.bean.Exam;
import com.summitexam.bean.ExamRecord;
import com.summitexam.bean.ExamRecordExample;
import com.summitexam.bean.ExamRecordExample.Criteria;
import com.summitexam.bean.Exams;
import com.summitexam.bean.User;
import com.summitexam.dao.ExamRecordMapper;
import com.summitexam.manager.service.IExamRecordService;
import com.summitexam.manager.service.IExamService;
import com.summitexam.manager.service.IExamsService;
import com.summitexam.manager.service.IQuestionService;
import com.summitexam.manager.service.IStaticDataService;
import com.summitexam.manager.service.IUserService;


@Service
public class ExamRecordServiceImpl implements IExamRecordService {
	@Autowired
	private ExamRecordExample examRecordExample;
	@Autowired
	private ExamRecordMapper examRecordMapper;
	@Autowired
	private IStaticDataService staticDataServiceImpl;
	@Autowired
	private IUserService userServiceImpl;
	@Autowired
	private IExamsService examsServiceImpl;
	@Autowired
	private IExamService examServiceImpl;
	
	@Override
	public List<ExamRecord> getExamRecords(int userId) {
		// TODO Auto-generated method stub
		Criteria criteria = examRecordExample.createCriteria();
		criteria.andExamJoinerIdEqualTo(userId);
		List<ExamRecord> examRecords = examRecordMapper.selectByExample(examRecordExample);
		examRecordExample.clear();
		return examRecords;
	}
	
	@Override
	public List<ExamRecord> getExamRecordsByLike(int userId, String examName) {
		// TODO Auto-generated method stub
		//需先查询当前用户的角色属别
		User currentUser = userServiceImpl.selectUser(userId);
		//需先新增元素
		Criteria criteria = examRecordExample.createCriteria();
		
		//当用户为老师时,查询回自己所制试卷的考试记录
		if(currentUser.getUserRoleId().equals("2")) {
//			List<Integer> ids = examsServiceImpl.getExams(userId);
//			criteria.andExamIdIn(ids);
		}else if(currentUser.getUserRoleId().equals("3")){
			criteria.andExamJoinerIdEqualTo(userId);
		}
		
		if(null != examName && examName != "") {
			examName = "%" + examName + "%";
			criteria.andExamsNameLike(examName);
		}
		examRecordExample.setOrderByClause("exam_join_date desc");;
		List<ExamRecord> examples = examRecordMapper.selectByExample(examRecordExample);
		
		//查询对应的用户登录名
		for(ExamRecord examRecord : examples) {
			User user = new User();
			User lastUser = new User();
			Exam exam = new Exam();
			Exams exams = new Exams();
			
			user.setUserId(examRecord.getExamJoinerId());
			List<User> users = userServiceImpl.getUsers(user);
			if(null != users && users.size() > 0) {
				lastUser = users.get(0);
			}
			if(lastUser.getUserUsername() != "") {
				examRecord.setExamJoinerName(lastUser.getUserUsername());
			}
			if(null != examRecord.getExamResultLevel()) {
				examRecord.setExamResultLevelDesc(staticDataServiceImpl.getStaticData("EXAM_RECORD_LEVEL", examRecord.getExamResultLevel()+""));
			}
			
			//放入试卷信息
			if(null != examRecord.getExamId()) {
				exam = new Exam();
				exams = new Exams();
				exam.setExamId(examRecord.getExamId());
				List<Exam> list = examServiceImpl.getExam(exam);
				if(list != null && list.size() > 0) {
					exam = list.get(0);
					exams = examsServiceImpl.getExamById(exam.getExamsId());
				}
			}
			examRecord.setExamSorce(exams.getExamsScore()+"");
		}
		
		examRecordExample.clear();
		return examples;
	}

	@Override
	public void insertExamRecords(ExamRecord examRecord) {
		Integer examId = examRecord.getExamId();
		Exam exam = new Exam();
		exam.setExamId(examId);
		if(null != examId) {
			List<Exam> exams = examServiceImpl.getExam(exam);
			if(exams.size() > 0) {
				exam = exams.get(0);
			}
		}
		
		int referenceNumber = 0;
		int failingNumber = 0;
		int passNumber = 0;
		int goodNumber = 0;
		
		if(exam.getReferenceNumber() != null) {
			referenceNumber = exam.getReferenceNumber();
		}
		if(exam.getFailingNumber() != null) {
			failingNumber = exam.getFailingNumber();
		}
		if(exam.getPassNumber() != null) {
			passNumber = exam.getPassNumber();
		}
		if(exam.getGoodNumber() != null) {
			goodNumber = exam.getGoodNumber();
		}
		exam.setReferenceNumber(referenceNumber + 1);

		if(examRecord.getExamResultLevel() == 5) {
			exam.setFailingNumber(failingNumber + 1);
		}else if(examRecord.getExamResultLevel() >= 4) {
			exam.setPassNumber(passNumber + 1);
		}else if(examRecord.getExamResultLevel() == 1) {
			exam.setGoodNumber(goodNumber + 1);
		}
		//向考试信息表中插入数据
		examServiceImpl.updateExam(exam);
		
		examRecordMapper.insert(examRecord);
		
	}
	
	//通过考试记录表id查询考试记录信息
	@Override
	public ExamRecord selectExamRecordById(int examRecordId) {
		// TODO Auto-generated method stub
		ExamRecord record = examRecordMapper.selectByPrimaryKey(examRecordId);
		User currentUser = userServiceImpl.selectUser(record.getExamJoinerId());
		
		//通过考试记录表中的考试信息id拿取试卷信息
		Exams exams = null;
		if(null != record.getExamId()) {
			Exam exam = new Exam();
			exam.setExamId(record.getExamId());
			List<Exam> list = examServiceImpl.getExam(exam);
			if(list != null && list.size() > 0) {
				exam = list.get(0);
				exams = examsServiceImpl.getExamById(exam.getExamsId());
			}
//			exams = examsServiceImpl.getExamById(record.getExamId());
		}
		record.setExams(exams);
		if(null != currentUser.getUserUsername()) {
			record.setExamJoinerName(currentUser.getUserUsername());
		}
		return record;
	}

	@Override
	public List<ExamRecord> getExamRecordsByExamId(int examId) {
		// TODO Auto-generated method stub
		Criteria criteria = examRecordExample.createCriteria();
		criteria.andExamIdEqualTo(examId);
		
		List<ExamRecord> list = examRecordMapper.selectByExample(examRecordExample);
		for(ExamRecord examRecord : list) {
			User user = new User();
			User lastUser = new User();
			user.setUserId(examRecord.getExamJoinerId());
			List<User> users = userServiceImpl.getUsers(user);
			if(null != users && users.size() > 0) {
				lastUser = users.get(0);
			}
			if(lastUser.getUserUsername() != "") {
				examRecord.setExamJoinerName(lastUser.getUserNickname());
			}
			if(null != examRecord.getExamResultLevel()) {
				examRecord.setExamResultLevelDesc(staticDataServiceImpl.getStaticData("EXAM_RECORD_LEVEL", examRecord.getExamResultLevel()+""));
			}
		}
		examRecordExample.clear();
		return list;
	}

}
