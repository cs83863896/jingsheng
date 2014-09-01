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
	public Map<Integer, String> getAllCategory() {
		String hql="from Category";
		List<Category> list=(List<Category>)this.getHibernateTemplate().find(hql);
		Map<Integer, String> map=new HashMap();
		for(int i=0; i<list.size(); i++){
			map.put(list.get(i).getCategoryId(), list.get(i).getCategoryName());
		}
		return map;
	}
	
	public Map<Integer, String> getVendorByCategoryId(String categoryId){
		String hql = "from Vendor v where v.vendorCategoryId = " + categoryId;
		Map<Integer, String> map = new HashMap();
		List<Vendor> list = (List<Vendor>)this.getHibernateTemplate().find(hql);
		for(int i=0; i<list.size(); i++){
			map.put(list.get(i).getVendorId(), list.get(i).getVendorName());
		}
		return map;
	}
	

	@Override
	public Map<Integer, List<String>> getVendor() {
		String hql="from Vendor";
		List<Vendor> listDB=(List<Vendor>)this.getHibernateTemplate().find(hql);
		Map<Integer, List<String>> map=new HashMap();
		for(int i=0; i<listDB.size(); i++){
			int categoryId=listDB.get(i).getVendorCategoryId();
			String hqlClause="from Vendor v where v.vendorCategoryId = "+categoryId;
			List<Vendor> listVendor=(List<Vendor>)this.getHibernateTemplate().find(hqlClause);
			List<String> listV=new ArrayList<String>();
			for(int j=0; j<listVendor.size(); j++){
				listV.add(listVendor.get(j).getVendorName());
			}
			map.put(categoryId, listV);
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
	
	public String deleteCategory(Category category){
		String hql1 = "from Item item where item.itemCategoryId ="+category.getCategoryId();
		String hql2 = "from Vendor vendor where vendor.vendorCategoryId ="+category.getCategoryId()
		List<Item> list1 = this.getHibernateTemplate().find(hql1);
		List<Vendor> list2 = this.getHibernateTemplate().find(hql2);
		if(0==list1.size() && 0==list2.size()){
			this.getHibernateTemplate().delete(category);
			return "Delete Successfully";
		}
		
	}
	
}
