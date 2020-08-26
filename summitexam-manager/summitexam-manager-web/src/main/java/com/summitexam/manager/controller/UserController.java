package com.summitexam.manager.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.summitexam.bean.ExamRecord;
import com.summitexam.bean.User;
import com.summitexam.common.CookieUtils;
import com.summitexam.common.PageVo;
import com.summitexam.common.ResultVO;
import com.summitexam.manager.listener.SessionCounter;
import com.summitexam.manager.service.IUserService;

@Controller
@RequestMapping("/User")
public class UserController {
	@Autowired
	private IUserService iuserService;
	@Value("${TOKEN_KEY}")
	private String TOKEN_KEY;

	private static final AtomicInteger OnlineCount = new AtomicInteger(0);

	@RequestMapping("/getonlineNumber")
	@ResponseBody
	public int getonlineNumber() {
        return OnlineCount.get();
    }
	
	//根据登录后生成token,并将其user和token保存在redis缓存数据库中
	@RequestMapping("/login")
	@ResponseBody
	public ResultVO logining(@RequestBody User user,
			HttpServletRequest request, HttpServletResponse response) {
		HttpServletRequest req = (HttpServletRequest)request;
//		System.out.println("進入全局过滤器。。。。");
		
		ResultVO resultVO = null;
		if(null != user.getUserUsername()) {
			resultVO = iuserService.login(user.getUserUsername(), user.getUserPassword());
			//登录成功后创建唯一的session,后期可以将session监听器配合一个静态的hashmap进行管理。
			if(resultVO.getCode() == 200) {
				OnlineCount.incrementAndGet();
			}
		}
		CookieUtils.setCookie(request, response, "TT_TOKEN", resultVO.getToken().toString());
		return resultVO;
	}
	
	@RequestMapping("/logout")
	@ResponseBody
	public void logout() {
		if(OnlineCount.get() > 0) {
			OnlineCount.decrementAndGet();
		}
	}
	
	@RequestMapping("/updateUser")
	@ResponseBody
	public ResultVO updateUser(@RequestBody User user) {
		boolean flag = iuserService.updateUser(user);
		if(flag) {
			return new ResultVO(200, "更新用户信息成功");
		}else {
			return new ResultVO(300, "更新用户信息失败");
		}
	}
	
	@RequestMapping("/selectUsers")
	@ResponseBody
	public ResultVO SelectUsers(@RequestBody User user) {
		ResultVO<PageVo> resultVO;
		PageVo<User> pageVo;
		try {
			List<User> users = iuserService.getUsers(user);
			pageVo = new PageVo<>(users.size(),users);
			resultVO = new ResultVO<>(200, "获取用户信息成功", pageVo);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			resultVO = new ResultVO<>(500, e.getMessage(), null);
		}
		return resultVO;
	}
	
	@RequestMapping("/deleteUserById/{Id}")
	@ResponseBody
	public String deleteUserById(@PathVariable Integer Id) {
		try {
			iuserService.deleteUser(Id);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return e.getMessage();
		}
		return "删除成功 ";
	}
	
	//根据token拿取user信息
	@RequestMapping("/token/{token}")
	@ResponseBody
	Object getUserByToken(@PathVariable String token,String callback) {
		ResultVO result = iuserService.checkUser(token);
		//正常调用
		if (StringUtils.isBlank(callback)) {
			return result;
		} else {
			//call不为空jsop调用
			//return "callback(result);"
			MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(result);
			mappingJacksonValue.setJsonpFunction(callback);
			return mappingJacksonValue;
		}
	}
	
	@RequestMapping("/check/{param}/{type}")
	@ResponseBody
	public ResultVO dataCheck(@PathVariable String param, @PathVariable Integer type) {
		ResultVO result = iuserService.dataCheck(param, type);
		return result;
	}
	
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	@ResponseBody
	public ResultVO register(@RequestBody User user) {
		user.setUserRoleId("1");
		ResultVO result = iuserService.register(user);
		return result;
	}
}
