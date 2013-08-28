package com.jingsheng.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import com.jingsheng.bean.User;
import com.jingsheng.dao.UserDAO;
import com.jingsheng.service.UserService;
import com.jingsheng.constants.UserConstants;
import com.opensymphony.xwork2.ActionContext;

public class UserServiceImpl implements UserService {
	private UserDAO userDAO;

	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@Override
	public String loginUserByName(User user) {
		User userDB = this.userDAO.loginUserByName(user.getUserName());
		if(null == userDB){
			return UserConstants.USER_LOGIN_ERROR;
		}else{
			if (user.getUserPwd().equalsIgnoreCase(userDB.getUserPwd())){
				ActionContext actionContext = ActionContext.getContext();   
				Map session = actionContext.getSession();   
				session.put("user", userDB);
				return UserConstants.USER_LOGIN_SUCCESS;
			}else{
				return UserConstants.USER_LOGIN_ERROR;
			}
		}
	}
	
	public String saveUser(User user){
		User userDB = this.userDAO.loginUserByName(user.getUserName());
		if(null == userDB){
			ActionContext actionContext = ActionContext.getContext();   
			Map session = actionContext.getSession();
			User users = (User)session.get("user");
			if("财务员".equals(user.getUserType())){
				user.setUserType("FIN");
			}else if("采购员".equals(user.getUserType())){
				user.setUserType("PUR");
			}else if("仓管员".equals(user.getUserType())){
				user.setUserType("STR");
			}else{
				user.setUserType("DFT");
			}
			user.setUserCreateUser(users.getUserName());
			SimpleDateFormat time=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
			user.setUserCreateDate(time.format(new Date()));
			user.setUserUpdUser(users.getUserName());
			user.setUserUpdDate(time.format(new Date()));
			this.userDAO.saveUser(user);
			Map request = (Map)actionContext.get("request");
			request.put("addSuccess", "添加用户成功，请退出以新用户登录！");
			return UserConstants.USER_ADD_SUCCESS;
		}else{
			return UserConstants.USER_ADD_ERROR;
		}
	}
	
	public void logoutUser(){
		ActionContext actionContext = ActionContext.getContext();   
		actionContext.getSession().clear();
		Map request = (Map)actionContext.get("request");
		request.put("logoutSuccess", "您已经成功登出！欢迎下次再登录！");
	}
}
