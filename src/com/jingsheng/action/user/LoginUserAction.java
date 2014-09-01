package com.jingsheng.action.user;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.jingsheng.bean.User;
import com.jingsheng.constants.UserConstants;
import com.jingsheng.service.UserService;

import com.opensymphony.xwork2.ActionSupport;


public class LoginUserAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2667391651375408415L;
	private UserService userService;
	private User user;
	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String execute() throws Exception {
		String result = this.userService.loginUserByName(this.user);
		if(result.equalsIgnoreCase(UserConstants.USER_LOGIN_SUCCESS)){
			return SUCCESS;
		}else{
			this.addFieldError("user.userPwd", "密码错误，请重新输入！");
			return INPUT;
		}
	}
	
	@Override
	public void validate() {
		Map map=this.getFieldErrors();
		Set set=map.keySet();
		for(Iterator iter=set.iterator();iter.hasNext();){
			System.out.println(map.get(iter.next()));
		}
		
	}
}
