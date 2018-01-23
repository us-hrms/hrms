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
	
	
}