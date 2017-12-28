package com.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mapper.UserMapper;
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
	

}

