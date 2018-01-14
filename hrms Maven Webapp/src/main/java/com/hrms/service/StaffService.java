package com.hrms.service;

import java.util.List;

import com.hrms.entity.Staff;

public interface StaffService {
	
	/**
	 * 员工登录
	 * @param staff
	 * @return boolean 
	 * 		true 登录成功 并将员工信息填充到staff中
	 * 		false 登录失败 
	 */
	boolean login(Staff staff);
	
	List<Staff> get();
}
