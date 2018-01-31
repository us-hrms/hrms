package com.yxn.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hrms.entity.Attendance;
import com.hrms.entity.Certificate;
import com.hrms.entity.DataDictionary;
import com.hrms.entity.Staff;
import com.hrms.page.Page;
import com.hrms.service.AttendanceService;
import com.hrms.service.CertificateService;
import com.hrms.service.DataDictionaryService;
import com.hrms.service.StaffService;

public class TestCertificate {
	
	static AttendanceService cs;
	static StaffService css;
	
	@BeforeClass
	public static void inital(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		cs = context.getBean(AttendanceService.class);
		css = context.getBean(StaffService.class);	
	}
	@Test
	public void Show(){
		Staff staff = new Staff();
		List<Staff> staffs = css.getStaffs(staff);
		for (Staff lsits : staffs) {
			System.err.println(lsits.getName());
		}
	}
}
