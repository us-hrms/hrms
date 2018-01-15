package com.hrms.service.impl;

import java.util.List;

import com.hrms.dao.Dao;
import com.hrms.entity.Staff;
import com.hrms.service.StaffService;

public class StaffServiceImpl implements StaffService {
    
	private Dao dao;
	@Override
	public boolean login(Staff staff) {
		// TODO Auto-generated method stub
		String hql = "from Staff where no =: no and password =: password";
		List<Staff> list = dao.find(hql, staff);
		if(list.size()>0){
			return true;
		}
		return false;
	}

	@Override
	public List<Staff> getStaffs() {
		// TODO Auto-generated method stub
		String hql = "from Staff";
		List<Staff> list  = dao.find(hql);
		return list.size()>0?list:null;
	}

	@Override
	public List<Staff> getStaffs(Staff staff) {
		// TODO Auto-generated method stub
		List<Staff> list = dao.find(staff);
		return list.size()>0?list:null;
	}
	
	public Dao getDao() {
		return dao;
	}

	public void setDao(Dao dao) {
		this.dao = dao;
	}
	

}
