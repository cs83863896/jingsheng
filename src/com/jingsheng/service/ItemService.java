package com.jingsheng.service;

import java.util.List;

import com.jingsheng.bean.Category;
import com.jingsheng.bean.Item;
import com.jingsheng.bean.Vendor;

public interface ItemService {
	public void saveCategory(Category category);
	public void saveVendor(Vendor vendor);
	public void getAllCategory();
	public void getVendor();
	public void saveItem(Item item);
	public List<Item> findAllItems();
	public void deleteItem(Item item);
	public Item getItemById(int itemId);
	public void updateItem(Item item);
	public String deleteCategory(Category category);
}
