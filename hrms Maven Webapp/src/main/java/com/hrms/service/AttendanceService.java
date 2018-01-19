package com.hrms.service;

import java.io.Serializable;
import java.util.List;

import com.hrms.entity.Attendance;

public interface AttendanceService {
	
	/**
	 * ����
	 * @param attendance
	 * @return
	 */
	boolean  saveAttendance(Attendance attendance);
	
	/**
	 * ����
	 * @param attendance
	 * @return
	 */
	boolean updateAttendance(Attendance attendance);
	
	/**
	 * ɾ��
	 * @return
	 */
	boolean deleteAttendance(Attendance attendance);

	/**
	 * ������еĶ���
	 * @return
	 */
	List<Attendance> getAttendances();
	
	/**
	 * ����������
	 * @return
	 */
	List<Attendance> getAttendances(Attendance attendance);
	
	/**
	 * ����id��õ�������
	 * @param id
	 * @return
	 */
	Attendance getAttendance(Serializable id);
	
}
