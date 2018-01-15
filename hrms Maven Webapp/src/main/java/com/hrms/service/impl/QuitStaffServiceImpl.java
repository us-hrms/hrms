package com.hrms.service.impl;

import java.util.List;

import com.hrms.dao.Dao;
import com.hrms.entity.QuitStaff;
import com.hrms.service.QuitStaffService;

public class QuitStaffServiceImpl implements QuitStaffService {
    
	private Dao dao;
	@Override
	public List<QuitStaff> getQuitStaffs(QuitStaff quitStaff) {
		// TODO Auto-generated method stub
		List<QuitStaff> list = dao.find(quitStaff);
		return list.size()>0 ? list : null;
	}
	
	public Dao getDao() {
		return dao;
	}
	public void setDao(Dao dao) {
		this.dao = dao;
	}
    
}
