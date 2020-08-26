package com.summitexam.manager.controller;

import java.lang.reflect.Method;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.summitexam.common.ResultVO;
import com.summitexam.manager.filter.BodyReaderHttpServletRequestWrapper;
import com.summitexam.manager.service.IUserService;

@Component
public class TokenHandleInterceptor implements HandlerInterceptor{
	@Autowired
	private IUserService useServiceImpl;
	
	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse response, Object o) throws Exception {
		//如果不是映射到方法，直接通过
	    if (!(o instanceof HandlerMethod)) {
	        return true;
	    }
	    
	    //直接放过login和register操作
	    
	    String requestURI = httpServletRequest.getRequestURI();
	    if(requestURI.indexOf("login") != -1 || requestURI.indexOf("register") != -1 || requestURI.indexOf("check") != -1 || requestURI.indexOf("logout") != -1 || requestURI.indexOf("upload") != -1) {
	    	return true;
	    }
	    
	    //然后分get请求和post请求用不同的方式拿取参数
	    String token = "";
	    String method = httpServletRequest.getMethod();
        String header = httpServletRequest.getHeader("Content-Type");
        if("GET".equals(method) || "multipart/form-data".equals(header.split(";")[0])) {
            token = httpServletRequest.getParameter("authToken");
        }else if("POST".equals(method)) {
        	BodyReaderHttpServletRequestWrapper requestWrapper = new BodyReaderHttpServletRequestWrapper(httpServletRequest);
            String body = requestWrapper.getBody();
            ObjectMapper mapper = new ObjectMapper();
            Map readValue = mapper.readValue(body, Map.class);
            token = (String) readValue.get("authToken");
        }
        	    
	    ResultVO vo = useServiceImpl.checkUser(token);
        ObjectMapper mapper = new ObjectMapper();
	    if(null != vo.getCode() && vo.getCode() == 201) {
	    	mapper.writeValue(response.getOutputStream(),vo);
	    	return false;
	    }else {
	    	return true;
	    }
	}

}
