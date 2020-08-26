package com.summitexam.manager.controller;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.multipart.MultipartFile;

import com.summitexam.bean.Question;
import com.summitexam.common.PageVo;
import com.summitexam.common.ResultVO;
import com.summitexam.manager.service.IQuestionService;

@Controller
@RequestMapping("/Question")
public class QuestionController {
	@Autowired
	private IQuestionService questionServiceImpl;
	
	@RequestMapping("/selectQuestionsByLike")
	@ResponseBody
	public ResultVO<PageVo> selectQuestionsByLike(@RequestBody Question question){
		ResultVO<PageVo> resultVO;
		try {
			PageVo<Question> pageVo = questionServiceImpl.selectQuestionsByLike(question);
			resultVO = new ResultVO<>(200, "获取问题列表成功", pageVo);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			resultVO = new ResultVO<>(500, e.getMessage(), null);
		}
		return resultVO;
	}
	
	@RequestMapping("/selectQuestionById/{Id}")
	@ResponseBody
	public ResultVO<Question> selectQuestionById(@PathVariable Integer Id){
		ResultVO<Question> resultVO;
		try {
			Question question = questionServiceImpl.selectQuestionById(Id);
			resultVO = new ResultVO<>(200, "获取问题列表成功", question);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			resultVO = new ResultVO<>(500, e.getMessage(), null);
		}
		return resultVO;
	}
	
	@RequestMapping("/deleteQuestionById/{Id}")
	@ResponseBody
	public String deleteQuestionById(@PathVariable Integer Id) {
		List<Integer> ids = new ArrayList<Integer>();
		try {
			ids.add(Id);
			questionServiceImpl.deleteQuestionByIds(ids);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return e.getMessage();
		}
		return "删除成功 ";
	}
	
	@RequestMapping("/updateQuestion")
	@ResponseBody
	public String updateQuestion(@RequestBody Question question) {
		try {
			questionServiceImpl.updateQuestion(question);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return e.getMessage();
		}
		return "更新成功";
	}
	

	//根据题目类型查询所有的单选题
	@RequestMapping("/selectQuestionsByTypeId")
	@ResponseBody
	public ResultVO<PageVo> selectQuestionsByTypeId(@RequestBody Question question){
		ResultVO<PageVo> resultVO;
		PageVo<Question> pageVo;
		try {
			List<Question> lists = questionServiceImpl.selectQuestionsByTypeId(question);
			pageVo = new PageVo<>(lists.size(),lists);
			resultVO = new ResultVO<>(200, "获取问题列表成功", pageVo);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			resultVO = new ResultVO<>(500, e.getMessage(), null);
		}
		return resultVO;
	}
	
	@RequestMapping("/insertQuestion")
	@ResponseBody
	public ResultVO<PageVo> insertQuestion(@RequestBody Question question){
		ResultVO<PageVo> resultVO;
		try {
			questionServiceImpl.insertQuestion(question);
			resultVO = new ResultVO<>(200, "新建题目成功", null);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			resultVO = new ResultVO<>(500, e.getMessage(), null);
		}
		return resultVO;
	}
	
	 /**
     * 图片上传
     */
    @RequestMapping(value = "/uploadImage",method = RequestMethod.POST)
    @ResponseBody
    public ResultVO<String> uploadImage(@RequestParam(value = "avatar") MultipartFile avatar,HttpServletRequest request, HttpServletResponse response){
    	String resultStr = "";
        Map<String,Object> map = new HashMap<>();
        if (avatar.isEmpty()) {
        	resultStr = "接收数据为空";
            return new ResultVO<>(500, resultStr, null);
        }else {
 
            //保存时的文件名
            DateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
            Calendar calendar = Calendar.getInstance();
            String dateName = df.format(calendar.getTime())+avatar.getOriginalFilename();
 
            //保存文件的绝对路径
            WebApplicationContext webApplicationContext = (WebApplicationContext) SpringContextUtils.applicationContext;
            ServletContext servletContext = webApplicationContext.getServletContext();
            String realPath = servletContext.getRealPath("/");
 
            String filePath = realPath + "WEB-INF"+File.separator + "classes" + File.separator +"static" + File.separator + "resource" + File.separator+dateName;//此路径是放在tomcat war包的绝对路径
            File newFile = new File(filePath);
            System.out.println("filePath=:"+filePath);
            //MultipartFile的方法直接写文件
            try {
 
                //上传文件
                avatar.transferTo(newFile);
 
                //数据库存储的相对路径
                String projectPath = servletContext.getContextPath();
                String contextpath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+projectPath;
                String url = contextpath + "/resource/"+dateName;//此路径是放在tomcat war包的相对路径
                //文件名与文件URL存入数据库表
                System.out.println("url=:"+url);
                map.put("imageUrl",url);//返回前台
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return new ResultVO<>(200, "上传成功", null);
    }  
}
