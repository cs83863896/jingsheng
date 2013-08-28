package com.jingsheng.action.item;

import com.jingsheng.service.ItemService;
import com.opensymphony.xwork2.ActionSupport;

public class GetVendorAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6500836257813667295L;
	private ItemService itemService;
	public ItemService getItemService() {
		return itemService;
	}
	public void setItemService(ItemService itemService) {
		this.itemService = itemService;
	}
	@Override
	public String execute() throws Exception {
		this.itemService.getVendor();
		return SUCCESS;
	}
	
}
