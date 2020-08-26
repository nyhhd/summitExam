package com.summitexam.manager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.summitexam.bean.Question;
import com.summitexam.bean.StaticData;
import com.summitexam.common.PageVo;
import com.summitexam.common.ResultVO;
import com.summitexam.manager.service.IQuestionService;
import com.summitexam.manager.service.IStaticDataService;

@Controller
public class StaticDataController {
	@Autowired
	private IStaticDataService staticDataServiceImpl;
	
	@RequestMapping("/getStaticDatas/{codeType}")
	@ResponseBody
	public ResultVO<PageVo> getStaticDatas(@PathVariable String codeType){
		ResultVO<PageVo> resultVO;
		PageVo<StaticData> pageVo;
		try {
			List<StaticData> lists = staticDataServiceImpl.getStaticDatas(codeType);
			pageVo = new PageVo<>(lists.size(),lists);
			resultVO = new ResultVO<>(200, "获取静态数据成功", pageVo);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			resultVO = new ResultVO<>(500, e.getMessage(), null);
		}
		return resultVO;
	}
}
