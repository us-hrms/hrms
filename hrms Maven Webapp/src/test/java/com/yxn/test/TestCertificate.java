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
	
	/*@Test
	public void getCertificates(){
		
		Staff staff = new Staff();
		staff.setName("ÔÀÐ¤éª");
		List<Staff> staffs = css.getStaffs(staff);
		
		
	
		Set<Attendance> sttendancess=staffs.get(0).getAttendances();
		
		Iterator<Attendance> iterator=sttendancess.iterator();
		//System.out.println(sttendancess.size());
		Object[] a=sttendancess.toArray();
		for (int i = 0; i < a.length; i++) {
			Attendance attendance=(Attendance) a[i];
			System.out.println(attendance.getStaff().getName()+"---"+attendance.getTime());
		}
//		while (iterator.hasNext()) {
//			Attendance attendance = (Attendance) iterator.next();
//			System.out.println(attendance.getStaff().getName()+"---"+attendance.getTime());
//		}
		
		
		
//		for (Iterator iterator2 = sttendancess.iterator(); iterator2.hasNext();) {
//			Attendance attendance = (Attendance) iterator2.next();
//			
//		}
			
		
		//Assert.assertEquals(true, list.size()>0);
	}*/
	@Test
	public void Show(){
		Page page = new Page();
		Staff staff = new Staff();
		staff.setName("ÔÀÐ¤éª");
		List<Staff> staffs = css.getStaffs(staff);
		Attendance attendance = new Attendance();
		attendance.setStaff(staffs.get(0));
		List<Attendance> attendances = cs.getAttendances(attendance, page);
		page.setPageCountBySize(attendances.size());
		for (Attendance lsits : attendances) {
			System.err.println(lsits.getStaff().getName()+"----"+lsits.getTime());
		}
	}
}
