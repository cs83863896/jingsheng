package com.jingsheng.action.item;

import com.jingsheng.bean.Category;
import com.jingsheng.service.ItemService;
import com.opensymphony.xwork2.ActionSupport;

public class GetAllCategoryForVendorAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -683880835139449931L;
	private ItemService itemService; 
	private Category category;
	public ItemService getItemService() {
		return itemService;
	}
	public void setItemService(ItemService itemService) {
		this.itemService = itemService;
	}
	
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	@Override
	public String execute() throws Exception {
		this.itemService.getAllCategory();
		return SUCCESS;
	}

}
