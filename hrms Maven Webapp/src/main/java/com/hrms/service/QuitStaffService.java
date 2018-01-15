package com.hrms.service;

import java.util.List;

import com.hrms.entity.QuitStaff;

public interface QuitStaffService {
       /**
        * 查询所有离职人员
        */
	    List<QuitStaff> getQuitStaffs(QuitStaff quitStaff);
}
