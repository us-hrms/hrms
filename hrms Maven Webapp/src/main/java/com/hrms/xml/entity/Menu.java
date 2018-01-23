package com.hrms.xml.entity;

import java.util.ArrayList;
import java.util.List;


public class Menu {
	
	private String filePath = "src\\main\\resources\\com\\hrms\\xml\\entity\\menu.xml";//menu.xml文件路径
	private List<ListGroup> listGroups;

	public Menu() {
		this.listGroups = new ArrayList<ListGroup>();
	}

	public Menu(List<ListGroup> listGroups) {
		super();
		this.listGroups = listGroups;
	}
	
	/**
	 * 添加到listGroups集合
	 * @param listGroup
	 * @return
	 */
	public boolean addToListGroups(ListGroup listGroup){
		return listGroups.add(listGroup);
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	
	

	public List<ListGroup> getListGroups() {
		return listGroups;
	}

	public void setListGroups(List<ListGroup> listGroups) {
		this.listGroups = listGroups;
	}

	@Override
	public String toString() {
		return "Menu [filePath=" + filePath + ", listGroups=" + listGroups.size()
				+ "]";
	}
	
	/**
	 * 设置选中的菜单
	 * @param id
	 * @return
	 */
	public boolean setSelected(String id){
		List<Item> items;
		//循环对比
		for (ListGroup listGroup : listGroups) {
			items = listGroup.getItems();
			boolean result,hasId = false;
			for (Item item : items) {
				result = false;
				if(item.getId().equals(id)){
					result = true;
					hasId = true;
				}
				item.setSelected(result);
			}
			listGroup.setSelected(hasId);
		}
		return false;
	}
	
	
	
}