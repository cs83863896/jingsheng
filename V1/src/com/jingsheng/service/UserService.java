package com.jingsheng.service;

import com.jingsheng.bean.User;

public interface UserService {
	public String loginUserByName(User user);
	public String saveUser(User user);
	public void logoutUser();
}
