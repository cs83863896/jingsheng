package com.jingsheng.action.item;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.jingsheng.bean.Vendor;
import com.jingsheng.service.ItemService;
import com.opensymphony.xwork2.ActionSupport;

public class SaveVendorAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8067911614392939228L;
	private ItemService itemService;
	private Vendor vendor;
	public ItemService getItemService() {
		return itemService;
	}
	public void setItemService(ItemService itemService) {
		this.itemService = itemService;
	}
	
	public Vendor getVendor() {
		return vendor;
	}
	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}
	@Override
	public String execute() throws Exception {
		this.itemService.saveVendor(vendor);
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
