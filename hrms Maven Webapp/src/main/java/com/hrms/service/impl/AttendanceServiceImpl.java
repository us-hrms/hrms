package com.hrms.service.impl;

import java.util.List;

import com.hrms.dao.Dao;
import com.hrms.entity.Attendance;
import com.hrms.service.AttendanceService;

public class AttendanceServiceImpl implements AttendanceService {
    
	private Dao dao;
	@Override
	public List<Attendance> getAttendances(Attendance attendance) {
		// TODO Auto-generated method stub
		return dao.find(attendance);
	}
	
	public Dao getDao() {
		return dao;
	}
	public void setDao(Dao dao) {
		this.dao = dao;
	}
	
	
}
