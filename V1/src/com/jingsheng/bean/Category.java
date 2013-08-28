package com.jingsheng.bean;

import java.io.Serializable;

public class Category implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2852939426934117641L;
	
	private int categoryId;
	private String categoryName;
	private String categoryCreateUser;
	private String categoryCreateDate;
	private String categoryUpdUser;
	private String categoryUpdDate;
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getCategoryCreateUser() {
		return categoryCreateUser;
	}
	public void setCategoryCreateUser(String categoryCreateUser) {
		this.categoryCreateUser = categoryCreateUser;
	}
	public String getCategoryCreateDate() {
		return categoryCreateDate;
	}
	public void setCategoryCreateDate(String categoryCreateDate) {
		this.categoryCreateDate = categoryCreateDate;
	}
	public String getCategoryUpdUser() {
		return categoryUpdUser;
	}
	public void setCategoryUpdUser(String categoryUpdUser) {
		this.categoryUpdUser = categoryUpdUser;
	}
	public String getCategoryUpdDate() {
		return categoryUpdDate;
	}
	public void setCategoryUpdDate(String categoryUpdDate) {
		this.categoryUpdDate = categoryUpdDate;
	}
	

}
