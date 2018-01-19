package com.hrms.service.impl;

import java.util.List;

import com.hrms.dao.Dao;
import com.hrms.entity.CultivateStaff;
import com.hrms.service.CultivateStaffService;

public class CultivateStaffServiceImpl implements CultivateStaffService {
    
	private Dao dao;
	
	public List<CultivateStaff> getCultivateStaffs(CultivateStaff cultivateStaff) {
		// TODO Auto-generated method stub
		return dao.find(cultivateStaff);
	}
	
	public Dao getDao() {
		return dao;
	}
	public void setDao(Dao dao) {
		this.dao = dao;
	}
    
}
