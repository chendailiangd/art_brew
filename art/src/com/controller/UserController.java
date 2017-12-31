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
		 	} else if(!existUser.getUser_status().equals("02")){//01代表已激活的用户
		 		mv.addObject("smsg", "你还未激活！");
			 	mv.setViewName("login");
			 	return mv;
		 	}else if(existUser.getUser_role().equals("02")){//01代表管理员帐号，02代表普通用户
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
	 * 检查用户名是否存在
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
	 *通过邮件发送检验码
	 */
	@RequestMapping("sendMail")
	public void sendMail(String email,HttpServletRequest req){
		System.out.println(email);
		String code =userService.sendMail(email);
		System.out.println(code);
		req.getSession().setAttribute("code", code);
	}

	/*
	 * 注册，将表单提交过来的数据插入数据库
	 * 1.首先判断用户输入的code是否等于系统生成的code
	 * 2.如果等于则往数据库插入信息，跳转至注册成功页面
	 * 3.如果不相等，等提示用户验证码输入错误
	 */
	@RequestMapping("regist")
	public String regist(User user,HttpServletRequest req,ModelMap model){
		//这个code是由系统生生的code
		String systemCode=req.getSession().getAttribute("code").toString();
		if(user.getActive_code().equals(systemCode)){
			//从表单提交过来的数据包括username,code,email,password
			userService.saveUser(user);
			return "regist_success";
		}else{
			model.addAttribute("msg", "验证码输入错误！");
			return "regist";//填写注册信息的页面叫regist.jsp
		}
		
	}




}