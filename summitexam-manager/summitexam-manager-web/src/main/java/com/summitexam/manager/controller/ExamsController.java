package com.summitexam.manager.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.summitexam.bean.Exams;
import com.summitexam.bean.Question;
import com.summitexam.common.PageVo;
import com.summitexam.common.ResultVO;
import com.summitexam.manager.service.IExamsService;

@RequestMapping("/Exams")
@Controller
public class ExamsController {
	@Autowired
	private IExamsService iexamsService;

	
	@RequestMapping("/{Id}")
	@ResponseBody
	public Exams getExamsById(@PathVariable Integer Id) {
		Exams exams = iexamsService.getExamById(Id);
		return exams;
	}
	
	@RequestMapping("/deleteExamById/{id}")
	@ResponseBody
	public String deleteExamById(@PathVariable Integer id) {
		List<Integer> ids = new ArrayList<Integer>();
		ids.add(id);
		try {
			iexamsService.deleteExamsByIds(ids);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return e.getMessage();
		}
		return "删除考试成功";
	}
	
	@RequestMapping("/getExamsByLike")
	@ResponseBody
	public ResultVO<PageVo> selectExamsByLike(@RequestBody Exams exams){
		ResultVO<PageVo> resultVO;
		try {
			PageVo<Exams> pageVo = iexamsService.getExams(exams);
			resultVO = new ResultVO<>(200, "获取问题列表成功", pageVo);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			resultVO = new ResultVO<>(500, e.getMessage(), null);
		}
		return resultVO;
	}
	
	@RequestMapping("/insertExam")
	@ResponseBody
	public ResultVO<PageVo> insertExam(@RequestBody Exams exams){
		ResultVO<PageVo> resultVO;
		PageVo<Exams> pageVo;
		try {
			iexamsService.insertExam(exams);
			resultVO = new ResultVO<>(200, "创建试卷成功", null);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			resultVO = new ResultVO<>(500, e.getMessage(), null);
		}
		return resultVO;
	}
	
	@RequestMapping("/updateExam")
	@ResponseBody
	public ResultVO<PageVo> updateExam(@RequestBody Exams exams){
		ResultVO<PageVo> resultVO;
		PageVo<Exams> pageVo;
		try {
			iexamsService.updateExam(exams);
			resultVO = new ResultVO<>(200, "更新试卷成功", null);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			resultVO = new ResultVO<>(500, e.getMessage(), null);
		}
		return resultVO;
	}
	
	
}
