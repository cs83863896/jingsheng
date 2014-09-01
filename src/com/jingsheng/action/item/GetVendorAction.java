package com.jingsheng.action.item;

import java.io.IOException;
import java.util.List;

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
	
	/**
	
	public String getProvince() {
		
		ProvinceDao provinceDao = new ProvinceDao();
		List<Province> provinceList = provinceDao.findAllProvince();
		JSONArray jsonArray = JSONArray.fromObject(provinceList);
		try {
			response.setContentType("text/html;charset=UTF-8");
			response.getWriter().print(jsonArray.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	**/
}
