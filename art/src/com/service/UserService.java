package com.service;
import com.vo.User;

	public interface UserService {
		User findByUsername(String username);
		String sendMail(String email);
		
		
	}
