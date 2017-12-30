package com.mapper;

import com.vo.User;

	public interface UserMapper {
		User findByUsername(String username);

		void saveRegistUser(User user);
		
	}
