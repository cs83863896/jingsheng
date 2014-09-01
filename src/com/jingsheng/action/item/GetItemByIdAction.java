package com.jingsheng.action.item;

import com.jingsheng.bean.Item;
import com.jingsheng.service.ItemService;
import com.opensymphony.xwork2.ActionSupport;

public class GetItemByIdAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7273207211944187402L;
	private ItemService itemService;
	private Item item;
	public ItemService getItemService() {
		return itemService;
	}
	public void setItemService(ItemService itemService) {
		this.itemService = itemService;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	@Override
	public String execute() throws Exception {
		item = this.itemService.getItemById(item.getItemId());
		return SUCCESS;
	}	
}
