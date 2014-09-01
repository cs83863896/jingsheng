package com.jingsheng.action.item;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.jingsheng.bean.Category;
import com.jingsheng.service.ItemService;
import com.opensymphony.xwork2.ActionSupport;

public class SaveCategoryAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8429866818439178194L;
	private ItemService itemService;
	private Category category;
	

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
		this.itemService.saveCategory(category);
		return SUCCESS;
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
