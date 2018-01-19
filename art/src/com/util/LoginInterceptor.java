package com.util;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginInterceptor implements HandlerInterceptor{
	private List<String> allowedPath;//从mvc中注入allowedPath
	public List<String> getAllowedPath() {
		return allowedPath;
	}
	public void setAllowedPath(List<String> allowedPath) {
		this.allowedPath = allowedPath;
	}
	
	//1.如果已经登录过了，则返回true，则不再进行拦截
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object handler) throws Exception {
		Object user =request.getSession().getAttribute("existUserS");
		if(user!=null){
			return true;
		}
		
		//2.如果请求的路径是login.do，则返回true，不进行拦截
		String url=request.getRequestURL().toString();
		for(String temp:allowedPath){
			if(url.endsWith(temp)){
			return true;
		}
	}	
		
		//3.else，直接跳转到登录页面
		response.sendRedirect(request.getContextPath()+"/to_login.do");
		System.out.println("返回到登录界面");
		return false;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}


}
