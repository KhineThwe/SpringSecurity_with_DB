package com.jp.security.SpringSecurityDB.service;

import com.jp.security.SpringSecurityDB.dto.UserDto;
import com.jp.security.SpringSecurityDB.model.User;

public interface UserService {
	void saveUser(UserDto userDto);

	User findUserByEmail(String email);
}
