package com.jingsheng.dao;


import java.util.List;
import java.util.Map;

import com.jingsheng.bean.Category;
import com.jingsheng.bean.Item;
import com.jingsheng.bean.Vendor;

public interface ItemDAO {
	public void saveCategory(Category category);
	public void saveVendor(Vendor vendor);
	public void saveItem(Item item);
	public Map<String, String> getAllCategory();
	public Map<String, List<String>> getVendor();
	public List<Item> findAllItems();
	public void deleteItem(Item item);
	public void updateItem(Item item);
	public Item getItemById(int itemId);
}
