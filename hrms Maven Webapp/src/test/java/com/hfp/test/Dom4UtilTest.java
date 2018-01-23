package com.hfp.test;

import org.junit.Test;

import com.hrms.xml.entity.Company;
import com.hrms.xml.uitl.Dom4jUtil;

public class Dom4UtilTest {
	
	@Test
	public void getCompany(){
		Company com = Dom4jUtil.readCompany();
		System.out.println(com);
	}
}
