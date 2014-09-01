package com.jingsheng.action.user;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.jingsheng.bean.User;
import com.jingsheng.constants.UserConstants;
import com.jingsheng.service.UserService;
import com.opensymphony.xwork2.ActionSupport;


public class SaveUserAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private UserService userService;
	private User user;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@Override
	public String execute() throws Exception {
		if(UserConstants.USER_ADD_SUCCESS.equalsIgnoreCase(this.userService.saveUser(user))){
			return SUCCESS;
		}
		this.addFieldError("user.userName", "用户名已存在，请用别的用户名！");
		return INPUT;
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
