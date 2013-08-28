package com.jingsheng.action.item;

import com.jingsheng.bean.Item;
import com.jingsheng.service.ItemService;
import com.opensymphony.xwork2.ActionSupport;

public class SaveItemAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7093780907428005879L;
	private ItemService itemService;
	private Item item;
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public ItemService getItemService() {
		return itemService;
	}
	public void setItemService(ItemService itemService) {
		this.itemService = itemService;
	}
	@Override
	public String execute() throws Exception {
		this.itemService.saveItem(item);
		return SUCCESS;
	}
	
}
