package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
	 * �û���¼ģ���
	 */
	@Autowired
	private UserService userService;
	@RequestMapping("login.do")
	public ModelAndView login(HttpServletRequest req,HttpServletResponse resp,User user) 
			throws Exception{
		 	ModelAndView mv= new ModelAndView();
		 	
		 	User existUser = userService.findByUsername(user.getUsername());
		 	if(existUser==null){
		 		mv.addObject("umsg", "��ɵ�����û������ǲ�ס��");
			 	mv.setViewName("login");
			 	return mv;
		 	} else if(!user.getPassword().equals(existUser.getPassword())){
		 		mv.addObject("pmsg", "��ɵ�������붼�ǲ�ס��");
			 	mv.setViewName("login");
			 	return mv;
		 	} else if(!existUser.getStatus().equals("01")){//01�����Ѽ�����û�
		 		mv.addObject("smsg", "�㻹δ���");
			 	mv.setViewName("login");
			 	return mv;
		 	}else if(existUser.getRole().equals("02")){//01�������Ա�ʺţ�02������ͨ�û�
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
	 * �û�ע��
	 */
	@RequestMapping("exit.do")
	public ModelAndView exit(){
		ModelAndView mv=new ModelAndView();
		mv.setViewName("index");
		return  mv;
		
	}

	/*
	 * ��ת���û�ע��ҳ��
	 */
	@RequestMapping("toRegist")//���Բ�д.do
	public ModelAndView toRegist(){
		ModelAndView mv =new ModelAndView();
		mv.setViewName("regist");
		return mv;
	}

	/*
	 * ����û����Ƿ����
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
	 *ͨ���ʼ����ͼ�����
	 */
	@RequestMapping("sendMail")
	public void sendMail(String email,HttpServletRequest req){
		System.out.println(email);
		String code =userService.sendMail(email);
		System.out.println(code);
		req.getSession().setAttribute("code", code);
	}

	/*
	 * ע�ᣬ�����ύ���������ݲ������ݿ�
	 */
	@RequestMapping("regist")
	public void regist(User user,HttpServletRequest req){
		String code=req.getSession().getAttribute("code").toString();
		System.out.println("111"+code);
		
	}




}