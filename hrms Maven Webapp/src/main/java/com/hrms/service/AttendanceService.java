package com.hrms.service;

import java.util.List;

import com.hrms.entity.Attendance;

public interface AttendanceService {
	
	/**
	 * 查询全部数据或根据条件查
	 * @return
	 */
	List<Attendance> getAttendances(Attendance attendance);
}
