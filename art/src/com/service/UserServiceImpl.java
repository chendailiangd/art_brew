package com.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mapper.UserMapper;
import com.util.MailUtil;
import com.util.UUIDUtil;
import com.vo.User;

@Service
@Transactional
public class UserServiceImpl implements UserService{
	@Resource
    public UserMapper userMapper;
	
	
	/**
	 * 通过用户名查询
	 */
	public User findByUsername(String username) {
		User user =userMapper.findByUsername(username);
		return user;
	}
	
	/*
	 * 将随机校验码通过邮件发送
	 */
	public String sendMail(String email) {
//		UUIDUtil uuid =new UUIDUtil();
//		String code =uuid.getUUID();//这个是调用UUID生成一组识别码，通过考虑之后觉得使用6位数随机码更合适
		int a =(int)(Math.random()*999999+100000); 
		String code =Integer.toString(a);
		MailUtil.sendMail(email, code);
		return code;
	}
	
	/*
	 * 将传过来的信息插入数据库
	 */
	public void saveUser(User user) {
		Date date =new Date();
		SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		user.setUsername(user.getUsername());
		user.setRegist_time(sdf.format(date));
		user.setUser_role("02");//02代表普通用户
		user.setUser_status("02");//02代表激活状态
		userMapper.saveRegistUser(user);
		
//		
//		(String username,String password,String email,String active_code,
//				String regist_time,String user_role,String user_status);//将user存入数据库
//		userMapper.saveRegistUser(user.getUsername(), user.getPassword(),user.getEmail(),
//				user.getCode(),user.getRegist_time(),user.getRole(),user.getStatus());
		
		
	}
	
	
	
	
	
	
	
	
}

