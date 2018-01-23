package com.hrms.xml.uitl;

import java.lang.reflect.Field;
import java.util.Iterator;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.QName;
import org.dom4j.io.SAXReader;

import com.hrms.xml.entity.Company;

public class Dom4jUtil {
	
	public static Company readCompany(){
		Document doc;
		Company company = new Company();
		Class companyClass = company.getClass();
		try {
			//SAXReader 读取文件 返回Document对象  可能会有异常
			doc = new SAXReader().read("src\\main\\resources\\company.xml");
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
}
