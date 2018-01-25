package com.hrms.xml.entity;

import java.io.Serializable;

public class Nav implements Serializable {
	private Long id;
	private String name;
	private String link;
	private boolean selected = false;
	
	public Nav() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Nav(Long id, String name, String link) {
		super();
		this.id = id;
		this.name = name;
		this.link = link;
	}
	public Nav(Long id, String name, String link,boolean selected) {
		super();
		this.id = id;
		this.name = name;
		this.link = link;
		this.selected = selected;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public boolean isSelected() {
		return selected;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	@Override
	public String toString() {
		return "Nav [id=" + id + ", name=" + name + ", link=" + link + "]";
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return new Nav(this.id, this.name, this.link, this.selected);
	}
	
	
}
