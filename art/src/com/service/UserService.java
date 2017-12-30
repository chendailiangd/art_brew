package com.service;
import com.vo.User;

	public interface UserService {
		User findByUsername(String username);
		String sendMail(String email);
		void saveUser(User user);//将注册的表单信息插入数据库
		
		
	}
