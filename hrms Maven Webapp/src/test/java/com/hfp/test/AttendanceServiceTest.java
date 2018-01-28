package com.hfp.test;

import java.util.List;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hrms.entity.Attendance;
import com.hrms.entity.Staff;
import com.hrms.service.AttendanceService;

public class AttendanceServiceTest {
	
	static AttendanceService as;
	//@BeforeClass
	public static void inital(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		as = context.getBean(AttendanceService.class);
	}
	//@Test
	public void get(){
		List<Attendance> list = as.getAttendances();
		for (Attendance attendance : list) {
			System.out.println(attendance.getStaff().getName());
		}
		Assert.assertEquals(true, list.size()>0);
	}
	
	//@Test
	public void get2(){
		Attendance atte = new Attendance();
		Staff staff = new Staff();
		staff.setId(2l);
		atte.setStaff(staff);
		List<Attendance> list = as.getAttendances(atte);
		for (Attendance attendance : list) {
			System.out.println("depart:"+attendance.getStaff().getDepartment().getId()+"\tstaffid:"+attendance.getStaff().getId());
		}
	}
}
