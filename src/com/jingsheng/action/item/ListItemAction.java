package com.jingsheng.action.item;

import java.util.Map;

import com.jingsheng.bean.Item;
import com.jingsheng.service.ItemService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ListItemAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8087079521399147268L;
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
		Map request=(Map)ActionContext.getContext().get("request");
		request.put("list", this.itemService.findAllItems());
		return SUCCESS;
	}
	

}
