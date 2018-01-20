package com.hrms.service;

import java.util.List;

import com.hrms.entity.StaffCertificate;

public interface StaffCertificateService {

	/**
	 * ����
	 * @param staffCertificate
	 * @return
	 */
	boolean saveStaffCertificate(StaffCertificate staffCertificate);
	/**
	 * ����
	 * @param staffCertificate
	 * @return
	 */
	boolean updateStaffCertificate(StaffCertificate staffCertificate);
	/**
	 * ɾ��
	 * @param staffCertificate
	 * @return
	 */
	boolean deleteStaffCertificate(StaffCertificate staffCertificate);
	/**
	 * ������еĶ���
	 * @return
	 */
	List<StaffCertificate> getStaffCertificates();
	/**
	 * ����������ѯ
	 * @param staffCertificate
	 * @return
	 */
	List<StaffCertificate> getStaffCertificates(StaffCertificate staffCertificate);
	/**
	 * ����id��õ�������
	 * @param id
	 * @return
	 */
	StaffCertificate getStaffCertificate(StaffCertificate id);
	

} 
