package com.summitexam.manager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.summitexam.bean.ExamRecord;
import com.summitexam.bean.Question;
import com.summitexam.common.PageVo;
import com.summitexam.common.ResultVO;
import com.summitexam.manager.service.IExamRecordService;

@Controller
@RequestMapping("/ExamRecord")
public class ExamRecordController {
	@Autowired
	private IExamRecordService iexamsRecordService;
	
	@RequestMapping("/selectExamRecordsByLike")
	@ResponseBody
	public ResultVO<PageVo> selectExamRecordsByLike(@RequestBody ExamRecord examRecord){
		ResultVO<PageVo> resultVO;
		PageVo<ExamRecord> pageVo;
		try {
			List<ExamRecord> lists = iexamsRecordService.getExamRecordsByLike(examRecord.getExamJoinerId(),examRecord.getExamsName());
			pageVo = new PageVo<>(lists.size(),lists);
			resultVO = new ResultVO<>(200, "获取考试记录表成功", pageVo);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			resultVO = new ResultVO<>(500, e.getMessage(), null);
		}
		return resultVO;
	}
	
	@RequestMapping("/insertExamRecord")
	@ResponseBody
	public ResultVO<String> insertExamRecord(@RequestBody ExamRecord examRecord){
		ResultVO<String> resultVO;
		try {
			iexamsRecordService.insertExamRecords(examRecord);
			resultVO = new ResultVO<>(200, "获取考试记录表成功","考试名称");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			resultVO = new ResultVO<>(500, e.getMessage(), null);
		}
		return resultVO;
	}
	
	@RequestMapping("/selectExamRecordById/{Id}")
	@ResponseBody
	public ResultVO<ExamRecord> selectExamRecordById(@PathVariable Integer Id){
		ResultVO<ExamRecord> resultVO;
		try {
			ExamRecord lists = iexamsRecordService.selectExamRecordById(Id);
			resultVO = new ResultVO<>(200, "获取考试记录表成功", lists);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			resultVO = new ResultVO<>(500, e.getMessage(), null);
		}
		return resultVO;
	}
}
