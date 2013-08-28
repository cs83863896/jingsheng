package com.jingsheng.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.jingsheng.bean.Category;
import com.jingsheng.bean.Item;
import com.jingsheng.bean.Vendor;
import com.jingsheng.dao.ItemDAO;

public class ItemDAOImpl extends HibernateDaoSupport implements ItemDAO {
	
	public void saveCategory(Category category){
		this.getHibernateTemplate().save(category);
	}
	
	public void saveVendor(Vendor vendor){
		this.getHibernateTemplate().save(vendor);
	}
	
	public void saveItem(Item item){
		this.getHibernateTemplate().save(item);
	}

	@Override
	public Map<String, String> getAllCategory() {
		String hql="from Category";
		List<Category> list=(List<Category>)this.getHibernateTemplate().find(hql);
		Map<String, String> map=new HashMap();
		for(int i=0; i<list.size(); i++){
			map.put(list.get(i).getCategoryName(), list.get(i).getCategoryName());
		}
		return map;
	}

	@Override
	public Map<String, List<String>> getVendor() {
		String hql="from Vendor";
		List<Vendor> listDB=(List<Vendor>)this.getHibernateTemplate().find(hql);
		Map<String, List<String>> map=new HashMap();
		for(int i=0; i<listDB.size(); i++){
			String category=listDB.get(i).getVendorCategory();
			String hqlClause="from Vendor v where v.vendorCategory like '"+category+"'";
			List<Vendor> listVendor=(List<Vendor>)this.getHibernateTemplate().find(hqlClause);
			List<String> listV=new ArrayList<String>();
			for(int j=0; j<listVendor.size(); j++){
				listV.add(listVendor.get(j).getVendorName());
			}
			map.put(category, listV);
		}
		return map;
	}
	
	public List<Item> findAllItems() {
		String hql="from Item item order by item.itemId asc";
		return (List<Item>)this.getHibernateTemplate().find(hql);
	}
	
	public void deleteItem(Item item){
		this.getHibernateTemplate().delete(item);
	}
	
	public void updateItem(Item item){
		this.getHibernateTemplate().update(item);
	}

	@Override
	public Item getItemById(int itemId) {
		String hql="from Item item where item.itemId ="+itemId;
		List<Item> list=this.getHibernateTemplate().find(hql);
		Item item = (Item)list.get(0);
		return item;
	}
}
