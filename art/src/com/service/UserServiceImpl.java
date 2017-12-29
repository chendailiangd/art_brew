package com.service;

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
	HttpSession session;
	
	
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
		UUIDUtil uuid =new UUIDUtil();
		String code =uuid.getUUID();
		MailUtil.sendMail(email, code);
		return code;
	}
	
	
	
	
	
	
	
	
	
	
}

