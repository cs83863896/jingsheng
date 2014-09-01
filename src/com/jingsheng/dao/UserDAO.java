package com.jingsheng.dao;

import com.jingsheng.bean.User;

public interface UserDAO {
	public User loginUserByName(String userName);
	public void saveUser(User user);
}
