package com.jingsheng.bean;

import java.io.Serializable;
import java.math.BigDecimal;

public class Item implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5317930209154013256L;
	private int itemId;
	private String itemNo;
	private String itemName;
	private int itemCategoryId;
	private int itemVendorId;
	private int itemNum;
	private BigDecimal itemPrice;
	private String itemModel;
	private String itemCreateUser;
	private String itemCreateDate;
	private String itemUpdUser;
	private String itemUpdDate;
	public int getItemNum() {
		return itemNum;
	}
	public void setItemNum(int itemNum) {
		this.itemNum = itemNum;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemNo() {
		return itemNo;
	}
	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	
	public int getItemCategoryId() {
		return itemCategoryId;
	}
	public void setItemCategoryId(int itemCategoryId) {
		this.itemCategoryId = itemCategoryId;
	}
	public int getItemVendorId() {
		return itemVendorId;
	}
	public void setItemVendorId(int itemVendorId) {
		this.itemVendorId = itemVendorId;
	}
	public BigDecimal getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(BigDecimal itemPrice) {
		this.itemPrice = itemPrice;
	}
	public String getItemModel() {
		return itemModel;
	}
	public void setItemModel(String itemModel) {
		this.itemModel = itemModel;
	}
	public String getItemCreateUser() {
		return itemCreateUser;
	}
	public void setItemCreateUser(String itemCreateUser) {
		this.itemCreateUser = itemCreateUser;
	}
	public String getItemCreateDate() {
		return itemCreateDate;
	}
	public void setItemCreateDate(String itemCreateDate) {
		this.itemCreateDate = itemCreateDate;
	}
	public String getItemUpdUser() {
		return itemUpdUser;
	}
	public void setItemUpdUser(String itemUpdUser) {
		this.itemUpdUser = itemUpdUser;
	}
	public String getItemUpdDate() {
		return itemUpdDate;
	}
	public void setItemUpdDate(String itemUpdDate) {
		this.itemUpdDate = itemUpdDate;
	}
	
}
