package com.hrms.xml.entity;

import java.util.ArrayList;
import java.util.List;


public class Menu {
	
	private String filePath = "src\\main\\resources\\com\\hrms\\xml\\entity\\menu.xml";//menu.xml�ļ�·��
	private List<ListGroup> listGroups;

	public Menu() {
		this.listGroups = new ArrayList<ListGroup>();
	}

	public Menu(List<ListGroup> listGroups) {
		super();
		this.listGroups = listGroups;
	}
	
	/**
	 * ��ӵ�listGroups����
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
	 * ����ѡ�еĲ˵�
	 * @param id
	 * @return
	 */
	public boolean setSelected(String id){
		List<Item> items;
		//ѭ���Ա�
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