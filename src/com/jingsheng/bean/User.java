package com.jingsheng.bean;

import java.io.Serializable;

public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8231722386002925636L;
	private int userId;
	private String userName;
	private String userPwd;
	private String userPwd2;
	private String userType;
	private String userCreateUser;
	private String userCreateDate;
	private String userUpdUser;
	private String userUpdDate;
	
	
	public String getUserUpdUser() {
		return userUpdUser;
	}
	public void setUserUpdUser(String userUpdUser) {
		this.userUpdUser = userUpdUser;
	}
	
	public String getUserCreateUser() {
		return userCreateUser;
	}
	public String getUserCreateDate() {
		return userCreateDate;
	}
	public void setUserCreateDate(String userCreateDate) {
		this.userCreateDate = userCreateDate;
	}
	public String getUserUpdDate() {
		return userUpdDate;
	}
	public void setUserUpdDate(String userUpdDate) {
		this.userUpdDate = userUpdDate;
	}
	public void setUserCreateUser(String userCreateUser) {
		this.userCreateUser = userCreateUser;
	}
	
	public String getUserPwd2() {
		return userPwd2;
	}
	public void setUserPwd2(String userPwd2) {
		this.userPwd2 = userPwd2;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
}
