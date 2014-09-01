package com.jingsheng.action.item;

import com.jingsheng.bean.Category;
import com.jingsheng.service.ItemService;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteCategoryAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Category category;
	private ItemService itemService;
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public ItemService getItemService() {
		return itemService;
	}
	public void setItemService(ItemService itemService) {
		this.itemService = itemService;
	}
	@Override
	public String execute() throws Exception {
		this.getItemService()
		return super.execute();
	}
	
	
	

}
