package com.hrms.service;

import java.util.List;

import com.hrms.entity.StaffMobilization;

public interface StaffMobilizationService {
	/**
	 * ����
	 * @param staffMobilization
	 * @return
	 */
	boolean  saveStaffMobilization(StaffMobilization staffMobilization);
	
	/**
	 * ����
	 * @param staffMobilization
	 * @return
	 */
	boolean updateStaffMobilization(StaffMobilization staffMobilization);
	
	/**
	 * ɾ��
	 * @return
	 */
	boolean deleteStaffMobilization(StaffMobilization staffMobilization);

	/**
	 * ������еĶ���
	 * @return
	 */
	List<StaffMobilization> getStaffMobilizations();
	
	/**
	 * ����������
	 * @return
	 */
	List<StaffMobilization> getStaffMobilizations(StaffMobilization staffMobilization);
	
	/**
	 * ����id��õ�������
	 * @param id
	 * @return
	 */
	StaffMobilization getStaffMobilization(StaffMobilization id);
}
