package com.jingsheng.bean;

import java.io.Serializable;

public class Vendor implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2002863038581922868L;
	private int vendorId;
	private String vendorName;
	private String vendorCreateUser;
	private String vendorCreateDate;
	private String vendorUpdUser;
	private String vendorUpdDate;
	private String vendorCategory;
	public int getVendorId() {
		return vendorId;
	}
	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public String getVendorCreateUser() {
		return vendorCreateUser;
	}
	public void setVendorCreateUser(String vendorCreateUser) {
		this.vendorCreateUser = vendorCreateUser;
	}
	public String getVendorCreateDate() {
		return vendorCreateDate;
	}
	public void setVendorCreateDate(String vendorCreateDate) {
		this.vendorCreateDate = vendorCreateDate;
	}
	public String getVendorUpdUser() {
		return vendorUpdUser;
	}
	public void setVendorUpdUser(String vendorUpdUser) {
		this.vendorUpdUser = vendorUpdUser;
	}
	public String getVendorUpdDate() {
		return vendorUpdDate;
	}
	public void setVendorUpdDate(String vendorUpdDate) {
		this.vendorUpdDate = vendorUpdDate;
	}
	public String getVendorCategory() {
		return vendorCategory;
	}
	public void setVendorCategory(String vendorCategory) {
		this.vendorCategory = vendorCategory;
	}
	
}
