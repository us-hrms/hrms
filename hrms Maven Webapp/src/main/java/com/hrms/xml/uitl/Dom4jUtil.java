package com.hrms.xml.uitl;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import com.hrms.xml.entity.Company;
import com.hrms.xml.entity.Item;
import com.hrms.xml.entity.ListGroup;
import com.hrms.xml.entity.Menu;

public class Dom4jUtil {
	
	/**
	 * 读取xml文件信息到Company对象
	 * @return
	 */
	public static Company readCompany(){
		Document doc;
		Company company = new Company();
		Class companyClass = company.getClass();
		try {
			//SAXReader 读取文件 返回Document对象  可能会有异常
			doc = new SAXReader().read(company.getFilepath());
			//获得根元素 即 company元素
			Element root = doc.getRootElement();
			//获得子元素 迭代器
			Iterator<Element> iterator = root.elementIterator();
			//循环取出子元素  即 property元素
			while(iterator.hasNext()){
				Element property = iterator.next();
				//获得listgroup相关属性
				Field compro = companyClass.getDeclaredField(property.attributeValue("name"));
				compro.setAccessible(true);//设置可访问性
				compro.set(company, property.attributeValue("value"));//设置属性值
			}
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return company;
	}
	
	/**
	 * 将company对象写入xml文件
	 * @param company
	 * @return
	 */
	public static boolean writeCompany(Company company){
		Document doc;
		Class companyClass = company.getClass();
		try {
			//SAXReader 读取文件 返回Document对象  可能会有异常
			doc = new SAXReader().read(company.getFilepath());
			//获得根元素 即 company元素
			Element root = doc.getRootElement();
			//获得子元素 迭代器
			Iterator<Element> iterator = root.elementIterator();
			//循环取出子元素  即 property元素
			while(iterator.hasNext()){
				Element property = iterator.next();
				//获得Company相关属性
				Field compro = companyClass.getDeclaredField(property.attributeValue("name"));
				compro.setAccessible(true);//设置可访问性
				property.attribute("value").setText(compro.get(company).toString());//保存
			}
			//将文件写入
			OutputFormat out = OutputFormat.createPrettyPrint();//获得输出流
			out.setEncoding("UTF-8");
			XMLWriter writer = new XMLWriter(new FileOutputStream(company.getFilepath()), out);//写入器
			writer.write(doc);
			writer.close();
			return true;
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public static Menu readMenu(){
		Document doc;
		Menu menu = new Menu();
		/*获得类*/
		Class menuClass = Menu.class;
		try {
			//SAXReader 读取文件 返回Document对象  可能会有异常
			doc = new SAXReader().read(menu.getFilePath());
			//获得根元素 即 company元素
			Element root = doc.getRootElement();
			//获得子元素 listgroup 迭代器
			Iterator<Element> lgs = root.elementIterator();
			ListGroup lg;
			//循环取出子元素  即 listgroup元素
			while(lgs.hasNext()){
				//获得元素
				Element lgElement = lgs.next();
				lg = new ListGroup();//初始化对象
				full(lgElement,lg);//将元素属性值写入lg对象
				//获得子元素 item 迭代器
				Iterator<Element> items = lgElement.elementIterator();
				Item item;
				//迭代listgroup 子元素
				while(items.hasNext()){
					//获得元素
					Element itemElement = items.next();
					item = new Item();//初始化对象
					full(itemElement,item);//将元素属性值写入item对象
					lg.addToItems(item);//添加到lg的items集合
				}
				menu.addToListGroups(lg);//添加到menu的listgroups集合
			}
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return menu;
	}
	
	/**
	 * 元素属性值填入方法
	 * 在对象属性名中找到与元素属性名相同的元素
	 * 并将元素属性值赋予该对象属性
	 * @param element
	 * @param entity
	 * @return
	 */
	private static <T> boolean full(Element element,T entity){
		Class entityClass = entity.getClass();
		//获得所有元素属性
		List<Attribute> attrs = element.attributes();
		try {
			//遍历属性
			for (Attribute attr : attrs) {
				//获取与元素属性相对应的对象属性
				Field entityPro = entityClass.getDeclaredField(attr.getName());
				entityPro.setAccessible(true);//设置可访问性
				if(entityPro.getType().equals(boolean.class))
					entityPro.set(entity, Boolean.valueOf(attr.getText()));//赋值
				else
					entityPro.set(entity, attr.getText());//赋值
			}
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
/*
	private boolean fullListGroup(Element element,ListGroup listGroup){
		//获得类
		Class lgClass = ListGroup.class;
		//获得所有元素属性
		List<Attribute> attrs = element.attributes();
		try {
			//遍历属性
			for (Attribute attr : attrs) {
				//获取与元素属性相对应的对象属性
				Field lgpro = lgClass.getDeclaredField(attr.getName());
				lgpro.setAccessible(true);//设置可访问性
				lgpro.set(listGroup, attr.getText());//赋值
			}
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	private boolean fullItem(Element element,Item item){
		Class itemClass = Item.class;
		//获得所有元素属性
		List<Attribute> attrs = element.attributes();
		try {
			//遍历属性
			for (Attribute attr : attrs) {
				//获取与元素属性相对应的对象属性
				Field itempro = itemClass.getDeclaredField(attr.getName());
				itempro.setAccessible(true);//设置可访问性
				itempro.set(item, attr.getText());//赋值
			}
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	*/
}
