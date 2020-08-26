package com.summitexam.manager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.summitexam.bean.Exam;
import com.summitexam.bean.ExamRecord;
import com.summitexam.bean.Exams;
import com.summitexam.common.PageVo;
import com.summitexam.common.ResultVO;
import com.summitexam.manager.service.IExamRecordService;
import com.summitexam.manager.service.IExamService;

@Controller
@RequestMapping("/Exam")
public class ExamController {
	@Autowired
	private IExamService iexamService;
	
	@RequestMapping("/insertExam")
	@ResponseBody
	public ResultVO<String> insertExam(@RequestBody Exam exam){
		ResultVO<String> resultVO;
		try {
			iexamService.insertExam(exam);
			resultVO = new ResultVO<>(200, "发布考试成功","考试名称");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			resultVO = new ResultVO<>(500, e.getMessage(), null);
		}
		return resultVO;
	}
	
	@RequestMapping("/updateExam")
	@ResponseBody
	public ResultVO<String> updateExam(@RequestBody Exam exam){
		ResultVO<String> resultVO;
		try {
			iexamService.updateExam(exam);
			resultVO = new ResultVO<>(200, "发布考试成功","考试名称");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			resultVO = new ResultVO<>(500, e.getMessage(), null);
		}
		return resultVO;
	}
	
	@RequestMapping("/getExamByLike")
	@ResponseBody
	public ResultVO<PageVo> selectExamsByLike(@RequestBody Exam exam){
		ResultVO<PageVo> resultVO;
		try {
			PageVo<Exam> pageVo = iexamService.getExamByLike(exam);
			resultVO = new ResultVO<>(200, "获取考试列表成功", pageVo);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			resultVO = new ResultVO<>(500, e.getMessage(), null);
		}
		return resultVO;
	}
	
	@RequestMapping("/getExam/{userId}")
	@ResponseBody
	public ResultVO<List<Exam>> getExam(@PathVariable Integer userId){
		ResultVO<List<Exam>> resultVO;
		Exam exam = new Exam();
		exam.setUserId(userId);
		try {
			List<Exam> pageVo = iexamService.getExam(exam);
			resultVO = new ResultVO<>(200, "获取考试列表成功", pageVo);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			resultVO = new ResultVO<>(500, e.getMessage(), null);
		}
		return resultVO;
	}
	
	@RequestMapping("/getExamRecordsByExamId/{examId}")
	@ResponseBody
	public ResultVO<Exam> getExamRecordsByExamId(@PathVariable Integer examId){
		ResultVO<Exam> resultVO;
		try {
			Exam pageVo = iexamService.getExamRecordsByExamId(examId);
			resultVO = new ResultVO<>(200, "获取考试列表成功", pageVo);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			resultVO = new ResultVO<>(500, e.getMessage(), null);
		}
		return resultVO;
	}
}
