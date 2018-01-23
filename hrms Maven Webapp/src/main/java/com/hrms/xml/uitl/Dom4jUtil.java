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
	 * ��ȡxml�ļ���Ϣ��Company����
	 * @return
	 */
	public static Company readCompany(){
		Document doc;
		Company company = new Company();
		Class companyClass = company.getClass();
		try {
			//SAXReader ��ȡ�ļ� ����Document����  ���ܻ����쳣
			doc = new SAXReader().read(company.getFilepath());
			//��ø�Ԫ�� �� companyԪ��
			Element root = doc.getRootElement();
			//�����Ԫ�� ������
			Iterator<Element> iterator = root.elementIterator();
			//ѭ��ȡ����Ԫ��  �� propertyԪ��
			while(iterator.hasNext()){
				Element property = iterator.next();
				//���listgroup�������
				Field compro = companyClass.getDeclaredField(property.attributeValue("name"));
				compro.setAccessible(true);//���ÿɷ�����
				compro.set(company, property.attributeValue("value"));//��������ֵ
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
	 * ��company����д��xml�ļ�
	 * @param company
	 * @return
	 */
	public static boolean writeCompany(Company company){
		Document doc;
		Class companyClass = company.getClass();
		try {
			//SAXReader ��ȡ�ļ� ����Document����  ���ܻ����쳣
			doc = new SAXReader().read(company.getFilepath());
			//��ø�Ԫ�� �� companyԪ��
			Element root = doc.getRootElement();
			//�����Ԫ�� ������
			Iterator<Element> iterator = root.elementIterator();
			//ѭ��ȡ����Ԫ��  �� propertyԪ��
			while(iterator.hasNext()){
				Element property = iterator.next();
				//���Company�������
				Field compro = companyClass.getDeclaredField(property.attributeValue("name"));
				compro.setAccessible(true);//���ÿɷ�����
				property.attribute("value").setText(compro.get(company).toString());//����
			}
			//���ļ�д��
			OutputFormat out = OutputFormat.createPrettyPrint();//��������
			out.setEncoding("UTF-8");
			XMLWriter writer = new XMLWriter(new FileOutputStream(company.getFilepath()), out);//д����
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
		/*�����*/
		Class menuClass = Menu.class;
		try {
			//SAXReader ��ȡ�ļ� ����Document����  ���ܻ����쳣
			doc = new SAXReader().read(menu.getFilePath());
			//��ø�Ԫ�� �� companyԪ��
			Element root = doc.getRootElement();
			//�����Ԫ�� listgroup ������
			Iterator<Element> lgs = root.elementIterator();
			ListGroup lg;
			//ѭ��ȡ����Ԫ��  �� listgroupԪ��
			while(lgs.hasNext()){
				//���Ԫ��
				Element lgElement = lgs.next();
				lg = new ListGroup();//��ʼ������
				full(lgElement,lg);//��Ԫ������ֵд��lg����
				//�����Ԫ�� item ������
				Iterator<Element> items = lgElement.elementIterator();
				Item item;
				//����listgroup ��Ԫ��
				while(items.hasNext()){
					//���Ԫ��
					Element itemElement = items.next();
					item = new Item();//��ʼ������
					full(itemElement,item);//��Ԫ������ֵд��item����
					lg.addToItems(item);//��ӵ�lg��items����
				}
				menu.addToListGroups(lg);//��ӵ�menu��listgroups����
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
	 * Ԫ������ֵ���뷽��
	 * �ڶ������������ҵ���Ԫ����������ͬ��Ԫ��
	 * ����Ԫ������ֵ����ö�������
	 * @param element
	 * @param entity
	 * @return
	 */
	private static <T> boolean full(Element element,T entity){
		Class entityClass = entity.getClass();
		//�������Ԫ������
		List<Attribute> attrs = element.attributes();
		try {
			//��������
			for (Attribute attr : attrs) {
				//��ȡ��Ԫ���������Ӧ�Ķ�������
				Field entityPro = entityClass.getDeclaredField(attr.getName());
				entityPro.setAccessible(true);//���ÿɷ�����
				if(entityPro.getType().equals(boolean.class))
					entityPro.set(entity, Boolean.valueOf(attr.getText()));//��ֵ
				else
					entityPro.set(entity, attr.getText());//��ֵ
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
		//�����
		Class lgClass = ListGroup.class;
		//�������Ԫ������
		List<Attribute> attrs = element.attributes();
		try {
			//��������
			for (Attribute attr : attrs) {
				//��ȡ��Ԫ���������Ӧ�Ķ�������
				Field lgpro = lgClass.getDeclaredField(attr.getName());
				lgpro.setAccessible(true);//���ÿɷ�����
				lgpro.set(listGroup, attr.getText());//��ֵ
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
		//�������Ԫ������
		List<Attribute> attrs = element.attributes();
		try {
			//��������
			for (Attribute attr : attrs) {
				//��ȡ��Ԫ���������Ӧ�Ķ�������
				Field itempro = itemClass.getDeclaredField(attr.getName());
				itempro.setAccessible(true);//���ÿɷ�����
				itempro.set(item, attr.getText());//��ֵ
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
