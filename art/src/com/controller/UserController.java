package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.service.UserService;
import com.sun.mail.iap.Response;
import com.vo.User;
@Controller
public class UserController {
	@RequestMapping("to_login.do")
	public String toLogin(){
		return "login";
	}
	
	/*
	 * 用户登录模块儿
	 */
	@Autowired
	private UserService userService;
	@RequestMapping("login.do")
	public ModelAndView login(HttpServletRequest req,HttpServletResponse resp,User user) 
			throws Exception{
		 	ModelAndView mv= new ModelAndView();
		 	
		 	User existUser = userService.findByUsername(user.getUsername());
		 	if(existUser==null){
		 		mv.addObject("umsg", "你傻啊，用户名都记不住！");
			 	mv.setViewName("login");
			 	return mv;
		 	} else if(!user.getPassword().equals(existUser.getPassword())){
		 		mv.addObject("pmsg", "你傻啊，密码都记不住！");
			 	mv.setViewName("login");
			 	return mv;
		 	} else if(!existUser.getStatus().equals("01")){//01代表已激活的用户
		 		mv.addObject("smsg", "你还未激活！");
			 	mv.setViewName("login");
			 	return mv;
		 	}else if(existUser.getRole().equals("02")){//01代表管理员帐号，02代表普通用户
		 		mv.addObject("existUser", existUser);
		 		mv.setViewName("index");
		 		return mv;
		 	}
		 	else{
		 		mv.addObject("existUser", existUser);
		 		req.setAttribute("existUserHttp", existUser);
		 		mv.setViewName("admin");
		 		return mv;
		 	}
	}
	
	/*
	 * 用户注销
	 */
	@RequestMapping("exit.do")
	public ModelAndView exit(){
		ModelAndView mv=new ModelAndView();
		mv.setViewName("index");
		return  mv;
		
	}

	/*
	 * 跳转至用户注册页面
	 */
	@RequestMapping("toRegist")//可以不写.do
	public ModelAndView toRegist(){
		ModelAndView mv =new ModelAndView();
		mv.setViewName("regist");
		return mv;
	}

	/*
	 * 实现用户注册功能
	 * 1.先校验用户名是否存在
	 * 2.填写邮件验证码
	 * 3.将注册信息插入数据库
	 */
	@RequestMapping("checkUsername")
	@ResponseBody
	public String checkUsername(String username,HttpServletResponse resp){
		User user=userService.findByUsername(username);
		if(user==null){
			return "yes";
		}else{
			return "no";
		}
		
	}
	
	/*
	 * 实现用户注册功能
	 */
	@RequestMapping("regist")
	public String regist(User user){
		System.out.println(user.getEmail());
		
		return "qqq";
	}










}