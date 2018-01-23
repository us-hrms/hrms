package com.hrms.xml.entity;

import java.util.ArrayList;
import java.util.List;

public class ListGroup {

	private String name;
	private boolean selected;
	private List<Item> items;
	
	public ListGroup() {
		items = new ArrayList<Item>();
	}
	
	public boolean addToItems(Item item){
		return items.add(item);
	}
	
	
}
