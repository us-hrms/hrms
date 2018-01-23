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
			//SAXReader ��ȡ�ļ� ����Document����  ���ܻ����쳣
			doc = new SAXReader().read("src\\main\\resources\\company.xml");
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
}
