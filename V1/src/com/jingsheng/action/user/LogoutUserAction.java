package com.jingsheng.action.user;

import com.jingsheng.service.UserService;
import com.opensymphony.xwork2.ActionSupport;



public class LogoutUserAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8947238425303989917L;
	private UserService userService;

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@Override
	public String execute() throws Exception {
		this.userService.logoutUser();
		return SUCCESS;
	}

}
