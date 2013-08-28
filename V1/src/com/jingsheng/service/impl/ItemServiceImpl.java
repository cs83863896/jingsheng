package com.jingsheng.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.jingsheng.bean.Category;
import com.jingsheng.bean.Item;
import com.jingsheng.bean.User;
import com.jingsheng.bean.Vendor;
import com.jingsheng.dao.ItemDAO;
import com.jingsheng.service.ItemService;
import com.opensymphony.xwork2.ActionContext;

public class ItemServiceImpl implements ItemService {
	private ItemDAO itemDAO;

	public ItemDAO getItemDAO() {
		return itemDAO;
	}

	public void setItemDAO(ItemDAO itemDAO) {
		this.itemDAO = itemDAO;
	}
	
	public void saveCategory(Category category){
		ActionContext actionContext = ActionContext.getContext();
		Map session = actionContext.getSession();
		User users = (User)session.get("user");
		category.setCategoryCreateUser(users.getUserName());
		SimpleDateFormat time=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
		category.setCategoryCreateDate(time.format(new Date()));
		category.setCategoryUpdUser(users.getUserName());
		category.setCategoryUpdDate(time.format(new Date()));
		this.itemDAO.saveCategory(category);
		session.put("saveSuccess", "货品类别保存成功！");
	}
	
	public void saveVendor(Vendor vendor){
		ActionContext actionContext = ActionContext.getContext();   
		Map session = actionContext.getSession();
		User users = (User)session.get("user");
		vendor.setVendorCreateUser(users.getUserName());
		SimpleDateFormat time=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
		vendor.setVendorCreateDate(time.format(new Date()));
		vendor.setVendorUpdUser(users.getUserName());
		vendor.setVendorUpdDate(time.format(new Date()));
		this.itemDAO.saveVendor(vendor);
		session.put("saveSuccess", "供应商保存成功！");
	}
	
	public void saveItem(Item item){
		ActionContext actionContext = ActionContext.getContext();   
		Map session = actionContext.getSession();
		User users = (User)session.get("user");
		item.setItemCreateUser(users.getUserName());
		SimpleDateFormat time=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
		item.setItemCreateDate(time.format(new Date()));
		item.setItemUpdUser(users.getUserName());
		item.setItemUpdDate(time.format(new Date()));
		this.itemDAO.saveItem(item);
		session.put("saveSuccess", "货品保存成功！");
	}
	
	public void getAllCategory(){
		ActionContext actionContext = ActionContext.getContext(); 
		Map request = (Map)actionContext.get("request");
		Map<String, String> map =this.itemDAO.getAllCategory();
		request.put("category", map);
	}
	
	public void getVendor(){
		ActionContext actionContext = ActionContext.getContext(); 
		Map request = (Map)actionContext.get("request");
		Map<String, List<String>> map=this.itemDAO.getVendor();
		request.put("vendor", map);
	}
	
	public List<Item> findAllItems(){
		return (List<Item>)this.itemDAO.findAllItems();
	}
	
	public void deleteItem(Item item){
		ActionContext actionContext = ActionContext.getContext();   
		Map session = actionContext.getSession();
		this.itemDAO.deleteItem(item);
		session.remove("updateSuccess");
		session.put("deleteSuccess", "删除货品成功！");
	}

	@Override
	public Item getItemById(int itemId) {
		ActionContext actionContext = ActionContext.getContext(); 
		Map request = (Map)actionContext.get("request");
		Map<String, List<String>> map=this.itemDAO.getVendor();
		request.put("vendor", map);
		return this.itemDAO.getItemById(itemId);
	}

	@Override
	public void updateItem(Item item) {
		ActionContext actionContext = ActionContext.getContext();   
		Map session = actionContext.getSession();
		User users = (User)session.get("user");
		SimpleDateFormat time=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
		item.setItemUpdUser(users.getUserName());
		item.setItemUpdDate(time.format(new Date()));
		this.itemDAO.updateItem(item);
		session.put("updateSuccess", "更新货品成功！");
		session.remove("deleteSuccess");
	}

}
