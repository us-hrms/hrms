package com.hfp.test;

import java.util.List;

import org.junit.Test;

import com.hrms.xml.entity.Item;
import com.hrms.xml.entity.ListGroup;
import com.hrms.xml.entity.Menu;
import com.hrms.xml.uitl.Dom4jUtil;

public class MenuTest {

	@Test
	public void menu(){
		Menu menu = Dom4jUtil.readMenu();
		List<ListGroup> lglist = menu.getListGroups();
		List<Item> items;
		for (ListGroup listGroup : lglist) {
			System.out.println(listGroup);
			items = listGroup.getItems();
			for (Item item : items) {
				System.out.println(item);
			}
		}
		menu.setSelected("20");
		System.out.println("==========¸ü¸Äºó==============");
		for (ListGroup listGroup : lglist) {
			System.out.println(listGroup);
			items = listGroup.getItems();
			for (Item item : items) {
				System.out.println(item);
			}
		}
	}
}
