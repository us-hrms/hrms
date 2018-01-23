package com.hfp.test;

import org.junit.Assert;
import org.junit.Test;

import com.hrms.xml.entity.Company;
import com.hrms.xml.uitl.Dom4jUtil;

public class Dom4UtilTest {

	public void getCompany(){
		Company com = Dom4jUtil.readCompany();
		System.out.println(com);
	}

	public void writeCompany(){
		Company com = Dom4jUtil.readCompany();
		System.out.println(com);
		com.setEmail("hesmailbox@163.com");
		System.out.println(com);
		boolean result = Dom4jUtil.writeCompany(com);
		com = Dom4jUtil.readCompany();
		System.out.println(com);
		Assert.assertEquals(true, result);
	}
}
