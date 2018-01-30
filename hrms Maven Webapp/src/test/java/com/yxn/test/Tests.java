package com.yxn.test;

import java.util.List;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hrms.entity.DataDictionary;
import com.hrms.service.DataDictionaryService;

public class Tests {
	static DataDictionaryService cs;
	@BeforeClass
	public static void inital(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		cs = context.getBean(DataDictionaryService.class);
	}
    @Test
	public void getCertificates(){
		DataDictionary dataDictionary = new DataDictionary();
		dataDictionary.setTableColumn("ATTENDANCE_TYPE");;
		List<DataDictionary> list = cs.getDataDictionarys(dataDictionary);
		for (DataDictionary dataDictionarys : list) {
			System.out.println(dataDictionarys.getValue());
		}
		Assert.assertEquals(true, list.size()>0);
	}
}
