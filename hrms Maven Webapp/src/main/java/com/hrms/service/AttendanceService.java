package com.hrms.service;

import java.util.List;

import com.hrms.entity.Attendance;

public interface AttendanceService {
	
	/**
	 * ��ѯȫ�����ݻ����������
	 * @return
	 */
	List<Attendance> getAttendances(Attendance attendance);
}
