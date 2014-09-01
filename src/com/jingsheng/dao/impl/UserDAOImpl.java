package com.jingsheng.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.jingsheng.bean.User;

import com.jingsheng.dao.UserDAO;

public class UserDAOImpl extends HibernateDaoSupport implements UserDAO{

	public User loginUserByName(String userName) {
		String hql = "from User user where user.userName = '" + userName +"'";
		@SuppressWarnings("unchecked")
		List<User> list = this.getHibernateTemplate().find(hql);
		return list.isEmpty() ? null : (User)list.get(0);
	}
	
	public void saveUser(User user){
		this.getHibernateTemplate().save(user);
	}
	
	
}
