package com.hrms.service;

import java.util.List;

import com.hrms.entity.Staff;

public interface StaffService {
	
	/**
	 * Ա����¼
	 * @param staff
	 * @return boolean 
	 * 		true ��¼�ɹ� ����Ա����Ϣ��䵽staff��
	 * 		false ��¼ʧ�� 
	 */
	boolean login(Staff staff);
	
	List<Staff> get();
}
