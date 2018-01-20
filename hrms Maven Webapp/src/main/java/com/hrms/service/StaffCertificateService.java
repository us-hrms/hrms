package com.hrms.service;

import java.util.List;

import com.hrms.entity.StaffCertificate;

public interface StaffCertificateService {

	/**
	 * 保存
	 * @param staffCertificate
	 * @return
	 */
	boolean saveStaffCertificate(StaffCertificate staffCertificate);
	/**
	 * 更新
	 * @param staffCertificate
	 * @return
	 */
	boolean updateStaffCertificate(StaffCertificate staffCertificate);
	/**
	 * 删除
	 * @param staffCertificate
	 * @return
	 */
	boolean deleteStaffCertificate(StaffCertificate staffCertificate);
	/**
	 * 获得所有的对象
	 * @return
	 */
	List<StaffCertificate> getStaffCertificates();
	/**
	 * 根据条件查询
	 * @param staffCertificate
	 * @return
	 */
	List<StaffCertificate> getStaffCertificates(StaffCertificate staffCertificate);
	/**
	 * 根据id获得单个对象
	 * @param id
	 * @return
	 */
	StaffCertificate getStaffCertificate(StaffCertificate id);
	

} 
