package com.test.swingdemo.service;

import com.test.swingdemo.model.User;

public interface UserService {
	boolean login(User user);

	User signup(String un, String psw);

}
