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
	 * ͨ���û�����ѯ
	 */
	public User findByUsername(String username) {
		User user =userMapper.findByUsername(username);
		return user;
	}
	
	/*
	 * �����У����ͨ���ʼ�����
	 */
	public String sendMail(String email) {
//		UUIDUtil uuid =new UUIDUtil();
//		String code =uuid.getUUID();//����ǵ���UUID����һ��ʶ���룬ͨ������֮�����ʹ��6λ������������
		int a =(int)(Math.random()*999999+100000); 
		String code =Integer.toString(a);
		MailUtil.sendMail(email, code);
		return code;
	}
	
	/*
	 * ������������Ϣ�������ݿ�
	 */
	public void saveUser(User user) {
		Date date =new Date();
		SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		user.setUsername(user.getUsername());
		user.setRegist_time(sdf.format(date));
		user.setUser_role("02");//02������ͨ�û�
		user.setUser_status("02");//02������״̬
		userMapper.saveRegistUser(user);
		
//		
//		(String username,String password,String email,String active_code,
//				String regist_time,String user_role,String user_status);//��user�������ݿ�
//		userMapper.saveRegistUser(user.getUsername(), user.getPassword(),user.getEmail(),
//				user.getCode(),user.getRegist_time(),user.getRole(),user.getStatus());
		
		
	}
	
	
	
	
	
	
	
	
}

